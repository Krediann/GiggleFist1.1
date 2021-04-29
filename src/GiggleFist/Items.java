package GiggleFist;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Items {
    public final static Scanner yes = new Scanner(System.in);
    //Does the player have the item
    public static boolean Fiddle = false;
    public static boolean EnchantedFiddle = false;
    public static boolean TeddyBear = false;
    public static boolean Hearthstone = false;
    public static boolean Insult = false;

    //Claw weapon given to player +3 ATK
    public static void ClawWeapon() throws InterruptedException {
        System.out.println("A fine choice, with these you can rip your enemies asunder with every punch");
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e) {
            System.out.println("An error occurred" +e);
        }
        System.out.println("The Merchant congratulates you on your purchase. You scurry off to the Northern road.");
        System.out.println("");
        Stats.PlayerATK = Stats.PlayerATK +3;
    }
    // Herbs given to player +5 HP
    public static void Herbs() throws InterruptedException{
        System.out.println("A fine choice, these herbs are told to give a boost in fortitude for even the greatest of warriors");
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e) {
            System.out.println("An error occurred" +e);
        }
        System.out.println("The Merchant congratulates you on your purchase. You scurry off to the Northern road.");
        System.out.println("");
        Stats.PlayerHP = Stats.PlayerHP + 5;
    }
    //Fiddle given to player
    public static void Fiddle() {
        System.out.println("A fine choice, this beautiful hand-crafted instrument sounds wonderful for even an amateur, but in the hands of a master it breathes life to the dullest rooms.");
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e) {
            System.out.println("An error occurred" +e);
        }
        System.out.println("The Merchant congratulates you on your purchase. You scurry off to the Northern road.");
        System.out.println("");
        Fiddle = true;
    }

    public static void teddybear() throws FileNotFoundException, InterruptedException {
        String rivi = "";
        System.out.println("A fine choice, do you want to name it?");
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e) {
            System.out.println("An error occurred" +e);
        }
        try {
            PrintWriter Writer = new PrintWriter("./textfiles/nalle.txt");
            System.out.println("Give a name to the teddybear!:");
            rivi = yes.nextLine();
            Writer.println(rivi);
            Writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred" + e);
        }
        System.out.println("You feel a bit better!");
        System.out.println("");
        TeddyBear = true;
    }

    public static void StrengthPotion() {
        System.out.println("You don't feel that different!");
        Stats.PlayerATK++;
    }

    public static void HealingShroom() {
        System.out.println("You are fairly sure that's just psychedelics, but guess it toughens up your mind!");
        Stats.PlayerHP = Stats.PlayerHP + 2;
    }

    public static void HearthStone() {
        System.out.println("Merchant: This will take you back to Bob very quickly");
        Hearthstone = true;
    }
}
