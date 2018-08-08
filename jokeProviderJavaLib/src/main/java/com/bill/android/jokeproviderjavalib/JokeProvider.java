package com.bill.android.jokeproviderjavalib;

import java.util.Random;

public class JokeProvider {
    private String[] mJokes;
    private Random mRandom;

    private JokeProvider(){
        mJokes = new String[10];
        mJokes[0] = "Did you hear about the actor who fell through the floorboards?" +
                "\n He was just going through a stage";
        mJokes[1] = "Did you hear about the claustrophobic astronaut?" +
                "\n He just needed a little space.";
        mJokes[2] = "Why don’t scientists trust atoms?" +
                "\n Because they make up everything.";
        mJokes[3] = "Why did the chicken go to the séance?" +
                "\n To get to the other side.";
        mJokes[4] = "What sits at the bottom of the sea and twitches?" +
                "\n A nervous wreck.";
        mJokes[5] = "How do you keep a bagel from getting away?" +
                "\n Put lox on it. ";
        mJokes[6] = "What kind of exercise do lazy people do?" +
                "\n Diddly-squats.";
        mJokes[7] = "Why don’t Calculus majors throw house parties?" +
                "\n Because you should never drink and derive.";
        mJokes[8] = "What does Charles Dickens keep in his spice rack?" +
                "\n The best of thymes, the worst of thymes.";
        mJokes[9] = "What do you call a magic dog?" +
                "\n A labracadabrador.";

        mRandom = new Random();
    }

    public String getJoke() {
        return mJokes[mRandom.nextInt(mJokes.length)];
    }
}
