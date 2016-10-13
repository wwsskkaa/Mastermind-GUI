
# Mastermind Game  

Copyright (c) | Fall 2016 | Shuang Wu | University of Waterloo 

Description:

This is the extension of my textdisplay mastermind game with AI in another repo. I am implementing the GUI version of this mastermind game, and there are two choices for the game
1) AI, the user is the one who come up with a sequence of colors and computer is guaranteed to make the correct guess in 5 steps.
2) The computer the the one who randomly generate the sequence of colors and user should try to make guesses in certain number of steps.

Included Files:
1) This README

2)SAMPLEOUTPUT.txt containing the sample output of this program.

3) mastermind.java:  The interface that will be implemented by algorithm.java

4) algorithm.java:  implements interface mastermind, and contains all the methods (main method) to run this game.

5) Main.java: main method to start everything

6) Model.java observable class which handles all the logic behind this game, gonna combine the code inside with algorithm.java

7) SplashScreen.java: handles the 6 second splash screen before the game starts

8) humanguessingGUI.java handles the 2nd mode of the game

9) GuessingPanel.java handles the 1st mode of the game


Compilation Instructions: 

Go to terminal

cd Desktop

javac *.java
java algorithm  

to run the text display

or 
java Main 

to run the GUI now.


DO NOT COPY OR USE OUR CODE. THANK YOU.


----------------------------
Sample Output:


Hello, My name is Bonnie and I am going to play Mastermind with you. 
What's your name?
Sabrina
Sabrina, How many colors do you want me to play with? 
Choose a integer between 2 and 6:
4
Sabrina, How many spots do you want?
choose a integer between 2 and 5
4
Color choices for you will be: 
Red Blue Yellow Green 
Sabrina's Choice: 4 colors and 4 spots.

I am not that smart so try not to give me wrong feedback! Thank you!

Wait....


Ready for one game?(input Y or y for yes): 
Y

My guess is:  Green Yellow Green Green 
Hints: Black for right position right color, White for right color wrong position. 
So,How many Black?
3
How many White?
0
0 whites and 3 blacks!

My guess is:  Green Yellow Green Red 
Hints: Black for right position right color, White for right color wrong position. 
So,How many Black?
2
How many White?
0
0 whites and 2 blacks!

My guess is:  Green Blue Green Green 
Hints: Black for right position right color, White for right color wrong position. 
So,How many Black?
3
How many White?
0
0 whites and 3 blacks!

My guess is:  Green Green Green Green 
Hints: Black for right position right color, White for right color wrong position. 
So,How many Black?
4
How many White?
0
I GOT ITTTTTT! YEAH!!!!!
I already won! so no more guesses!
Ready for one game?(input Y or y for yes): 
y

My guess is:  Blue Yellow Red Blue 
Hints: Black for right position right color, White for right color wrong position. 
So,How many Black?
4
How many White?
0
I GOT ITTTTTT! YEAH!!!!!
I already won! so no more guesses!
Ready for one game?(input Y or y for yes): 
n

OK, BYE, Sabrina !!!!

------------------------------