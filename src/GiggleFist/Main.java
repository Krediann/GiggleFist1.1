package GiggleFist;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        Start();
        if (Death.Death == true) {
            Death.Death();
        }
    }

    public static void Start() throws FileNotFoundException, InterruptedException{
        //The first story beat
        Storybeats.JourneyBeginning();
        //Asking the player who is he, answer must be GiggleFist
        Questions.WhatName();
        // More story beat and option to insult or help
        Storybeats.TaleOfTavern();
        //Checking the answer to I/H
        Questions.InsultOrHelp();
    }


}
