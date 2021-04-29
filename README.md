# osrs_nmz_timer

## INTRO

### what's the point?
The Nightmare Zone minigame in Old School RuneScape basically requires you to keep your [combat]prayer active to stay alive. (If you're not using absorbtions).  Since NMZ is afk-able, it's easy to forget to refill your prayer points with prayer potions, to which you die earlier than you wanted to.  
This timer is designed to remind you to dose up, allows a 3 second grace time as you do so, and then start counting down again automatically, and continuously.  It will send out an audio alert as well as display a message that will tell you it's time to refill your points.  It could also be applied for other minigames and activities that involve protection prayers.

the window is set to "always on top", so it hovers over your game window.

### Screenshots

![alt tag](https://github.com/reprise5/osrs_nmz_timer/blob/master/Screenshot.png)

### I'm not a programmer, I just want to use it

All you need to do is click the Green [Clone or Download] button to download all the files in this repository.  Then open the zip folder, go to the `dist` folder, and run `NmzTimer.jar`.

## CODE REFERENCES

### Prayer Points Table  [ppointsTable]

| Index | Pray LVL| Boost | Index | Pray LVL| Boost |
| :---: |:-------:| :---: | :---: | :-----: | :---: |
| 0     | 36-39   | +16   | 8     | 68-71   | +24   |
| 1     | 40-43   | +17   | 9     | 72-75   | +25   |
| 2     | 44-47   | +18   | 10    | 76-79   | +26   |
| 3     | 48-51   | +19   | 11    | 80-83   | +27   |
| 4     | 52-55   | +20   | 12    | 84-87   | +28   |
| 5     | 56-59   | +21   | 13    | 88-91   | +29   |
| 6     | 60-63   | +22   | 14    | 92-95   | +30   |
| 7     | 64-67   | +23   | 15    | 96-99   | +31   |

### How this table is used in the code
In timer.java, there's a single dimensional array `ppointsTable` declared with boost values in it.  The `lvlComboBox` index corresponds directly with the index in this array.  This table shows how the two line up.  **For Example:** When a user picks Level 40-43, it's index is 1.  Doing a lookup in the `ppointsTable` array with index 1 gives a boost of +17 points.

### Finding correct seconds based on Level
```java
//One Dose of Potion
seconds = (int)(PPointsTable[lvlComboBox.getSelectedIndex()] * DEPLETION_CONST);

//Two Dose of Potion
seconds = (int)((PPointsTable[lvlComboBox.getSelectedIndex()] * DEPLETION_CONST) * 2);
```
Performing a lookup in the `ppointsTable` array using the selected index of `lvlComboBox`.  Save the value to seconds,
Then multiply the seconds by the drainage constant, and cast to an int. (since the drainage constant is a double.) If there are TWO doses of potion being used, the procedure is the same, only perform the calculation with the constant first,
then multiply it by 2.

### Drainage Constant

The drainage constant is the average amount of seconds it takes for one point of prayer to be drained with current boots.  Since drainage is influenced by certain gear players wear (which offer prayer bonus), this does change the amount of time points are drained.  The constant used in this program is calculated using the following equation:

```
NewRate = RawRate * (1 + ( bonus / 30 ) )
```
This Program is specifically designed to count down for Protection Prayers only [melee, Magic, Missiles].  The raw drainage constant with no items is 3: it takes 3 seconds to drain 1 point, and each point of prayer bonus slows the drainage rate by 3.33%.

**For example** , if the player's items gave them prayer bonus of +15, their drainage rate is slowed by 0.5 seconds. 

```
3 × (1 + (15/30) ) = newRate
3 × (1 + 0.5) = 4.5
```
the new constant would be 4.5, or one point drained every 4.5 seconds.

This program can use 3.45 as a default constant if the equation is not being used.  It is commented out.

### Bonus Tab
In this tab, the user simply adds the prayer bonus number seen on the character equipment screen in-game. Ticking the "use this Bonus" checkbox checks the value's range and calculates a new constant and factor it into the new amount of seconds to count down for.  It will automatically switch tabs back to the main tab and reset the clock. if the box is unchecked at any point, it assumes a prayer bonus of 0, and will switch back to the main tab, use 3 as a drainage constant, and reset the clock.

Currently after 3 runs with a stopwatch and the program side by side:

| P Bonus | Const | Program secs | Actual | 
| :-----: |:-----:| :----------: | :----: |
| +0      |3.47   | 79           | 80     |
| +20     |3.57833| 115          | 117    |
| +31     |6.1    | 140          | 143    |

"P Bonus" is prayer bonus from items, "Const" is how many seconds it takes to drain one point, "Program secs" is how long the program thinks it will take to drain one dose, and "actual" is how long it actually took to drain one dose. The program is slightly off, perhaps there's a rounding issue.


