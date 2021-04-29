package GiggleFist;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Questions {
    public final static Scanner yes = new Scanner(System.in);

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
}
