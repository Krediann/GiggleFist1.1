package GiggleFist;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Questions {
    public final static Scanner yes = new Scanner(System.in);
    static Random random = new Random();
    public static void WhatName() throws InterruptedException {
        boolean oikeanimi = false;
        String RealName = "GiggleFist";
        String vastaus=yes.nextLine();

        if (vastaus.equalsIgnoreCase(RealName)) {
            System.out.println("");
            System.out.println("Bob: GiggleFist huh... ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Bob: So, I know you're an adventurer...");
            oikeanimi = true;
        }
        while (oikeanimi == false) {
            System.out.println("Didn't your mama tell you to be polite GiggleFist. What is your real name?");
            vastaus=yes.nextLine();

            if (vastaus.equalsIgnoreCase(RealName)) {
                System.out.println("Bob: GiggleFist huh..");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bob: So, I know you're an adventurer...");
                break;
            }
        }
    }

    public static void InsultOrHelp () throws FileNotFoundException, InterruptedException{
        String IorH = yes.nextLine();

        while (!"i".equalsIgnoreCase(IorH) && !"h".equalsIgnoreCase(IorH)) {
            System.out.println("You wrote a wrong character... Try again...");
            IorH = yes.nextLine();
        }
        if (IorH.equalsIgnoreCase("i") || IorH.equalsIgnoreCase("h")) {
            if (IorH.equalsIgnoreCase("i")) {
                Combat.C1();
            }
            else if (IorH.equalsIgnoreCase("h")) {
                System.out.println("You decided to help Bob");
            }
        }
    }

    public static void ArtisteAccept() {
        System.out.println("You feel yourself getting lighter.");
        System.out.println("Artiste:There you go darling, now be quick or be dead, time is of the essence.");
        System.out.println("");
        Stats.PlayerATK = Stats.PlayerATK + 10;
    }

    public static void DevilsDuelAccept() {
        System.out.println("You brace yourself in your confidence and you say:");
        System.out.println("My name is GiggleFist and it might be a sin, but I'll take your bet, you're gonna regret 'cause I'm the best there's ever been");
        System.out.println("");

        int DevilDuel = random.nextInt(2);
        if (DevilDuel == 0) {
            System.out.println("Devil laughs a jovial laughter.");
            System.out.println("");
            System.out.println("Devil: Good show, good show, but you know how this song and dance has to end.");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("YOUR SOUL IS MINE!");
            Death.Death();
        }
        else if (DevilDuel == 1) {
            System.out.println("Devil: How could this be?! Oh well, I am a devil of my word, god forbid I break a deal.");
            Items.EnchantedFiddle = true;
        }
    }


}
