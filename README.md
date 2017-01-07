# osrs_nmz_timer

##Intro 
___________________________________________________________
###what's the point?
The Nightmare Zone minigame in Old School RuneScape basically requires you to keep your [combat]prayer active to stay alive.  Since NMZ is afk-able, it's easy to forget to refill your prayer points with prayer potions, to which you die earlier than you wanted to.  
This timer is designed to remind you to dose up, allows a 3 second grace time as you do so, and then start counting down again automatically, and continuously.  It will send out an audio alert as well as display a message that will tell you it's time to refill your points.

the window is set to "always on top", so it hovers over your game window.

###Screenshots

![alt tag] (https://github.com/reprise5/osrs_nmz_timer/blob/master/Screenshot.png)

###I'm not a programmer, I just want to use it

All you need to do is hit the Green [Clone or Download] button to download all the files in this repository.  Then open the zip folder, go to the `dist` folder, and run `NmzTimer.jar`.

##CODE REFERENCES
___________________________________________________________

###Prayer Points Table  [ppointsTable]

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

###How this table is used in the code
In timer.java, there's a single dimensional array `ppointsTable` declared with boost values in it.  `lvlComboBox` index corresponds directly with the index in that array.  This table shows how the two line up.  **For Example:** When a user picks a level, say 40-43, it's index is 1.  Doing a lookup in the `ppointsTable` array in index 1, gives a boost of +17 points.

###Finding correct seconds based on Level
```java
//One Dose of Potion
seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
seconds = (int)(seconds * DEPLETION_CONST);

//Two Dose of Potion
seconds = PPointsTable[lvlComboBox.getSelectedIndex()];
seconds = (int)((seconds * DEPLETION_CONST) * 2);
```
Do a lookup in the `ppointsTable` array using the index the `lvlComboBox` was set to.  save the value to seconds.
Then, multiply the seconds by the drainage constant, and cast to an int. (since the drainage constant is a double.)            If there are TWO doses of potion being used, the procedure is the same, only perform the calculation with the constant first,
then multiply it by 2.

###Drainage Constant

The drainage constant is the average amount of seconds it takes for one point of prayer to be drained.  Since drainage is influenced by certain gear players wear (which offer prayer bonus), this does change the amount of time points are drained.  The constant used in this program is simply an average.

This Program is specifically designed to count down for Protection Prayers only [melee, Magic, Missiles].  the raw drainage constant with no items is 3: it takes 3 seconds to drain 1 point.

Each point of Prayer bonus slows the drainage rate by 3.33%.  the equation is as follows:

```
NewRate = RawRate * (1 + ( bonus / 30 ) )
```
**For example** , if the player's items gave them prayer bonus of +15, their drainage rate is slowed by 0.5 seconds. 
```
3 × (1 + (15/30) ) = newRate
3 × (1 + 0.5) = 4.5`
```
the new constant would be 4.5, or one point drained every 4.5 seconds.

This program Uses 3.45 as the constant, and does not account for an exact prayer bonus from items yet.

###Bonus Tab
This tab is where those item bonuses WOULD be accounted for.  if you checked "Ardy Cloak 4" for example, the program would keep a tally of how many points are added up in total, and plug it into the above eqation.  Checking the ardy cloak checkbox would result in TotalBonus += 6.  This part of the program is under development.
