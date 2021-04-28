package GiggleFist;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Combat {
    static Random random = new Random();
    private final static Scanner yes = new Scanner(System.in);

    static String rivi = "";

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        C1();
    }
    private static void C1() throws FileNotFoundException, InterruptedException{
        try {
            final Scanner t3luk = new Scanner(new File("../../pictures/combat1.txt"));
            while (t3luk.hasNext()) {
                rivi = t3luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t3luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred!!!" + e);
        }
        while (Stats.DrunkPatronHP > 0) {
            System.out.println("Press a to attack or any other character to wait");
            char Hit = yes.next().trim().charAt(0);
            int HitChance = random.nextInt(4);

            switch(Hit) {
                case 'a':
                    if (HitChance == 0) {
                        System.out.println("Your Attack missed!");
                        System.out.println("");
                    }
                    else if (HitChance > 0) {
                        System.out.println("Your Attack hit!");
                        Stats.DrunkPatronHP = Stats.DrunkPatronHP - Stats.PlayerATK;
                        System.out.println("Drunk Patron's HP:" + Stats.DrunkPatronHP);
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("You chose not to attack..");
            }
            if (Stats.DrunkPatronHP > 0) {
                System.out.println("The Drunk Patron throws a Punch");
                int DoesItHitB = random.nextInt(2);

                if (DoesItHitB == 0) {
                    System.out.println("You dodged");
                    System.out.println("");
                }

                else if (DoesItHitB == 1) {
                    System.out.println("The Drunk Patron hits you square in the face!");
                    Stats.PlayerHP = Stats.PlayerHP - Stats.DrunkPatronATK;
                    System.out.println("You have " + Stats.PlayerHP + "HP left");
                    System.out.println("");
                }
            }

            if (Stats.DrunkPatronHP >= 0) {
                System.out.println("You knocked out the Drunk Patron!");
                System.out.println("");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bob sighs woefully");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("");
                Stats.PlayerATK++;
            }

            if (Stats.PlayerHP == 0) {
                System.out.println("You got knocked out and robbed!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Thanks for playing. Get rekt NOOB");
                Death.Death = true;
                break;
            }
        }
    }
}
