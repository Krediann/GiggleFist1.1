package GiggleFist;

import java.util.concurrent.TimeUnit;
public class Items {

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
            System.out.println("Tapahtui virhe" +e);
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
            System.out.println("Tapahtui virhe" +e);
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
            System.out.println("Tapahtui virhe" +e);
        }
        System.out.println("The Merchant congratulates you on your purchase. You scurry off to the Northern road.");
        System.out.println("");
        Fiddle = true;
    }
}
