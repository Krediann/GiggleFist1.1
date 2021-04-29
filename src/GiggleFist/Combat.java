package GiggleFist;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Combat {
    static Random random = new Random();
    public final static Scanner yes = new Scanner(System.in);

    static String rivi = "";

    //Bar fight combat
    public static void C1() throws FileNotFoundException, InterruptedException{
        //Reading the text file for starting the combat
        try {
            final Scanner t3luk = new Scanner(new File("./textfiles/combat1.txt"));
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
        // While Drunk Patron has hp left the combat will continue
        while (Stats.DrunkPatronHP > 0) {
            System.out.println("Press a to attack or any other character to wait");
            String Hit = yes.nextLine();

            //Making the hit chance 75% chance to hit
            int HitChance = random.nextInt(4);
            if(Hit.equalsIgnoreCase("a")) {
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
            }
            // If player doesn't press a, chooses not to attack
            else {
                System.out.println("You chose not to attack..");
            }
            // If Drunk Patron has HP left, he will attack
            if (Stats.DrunkPatronHP > 0) {
                System.out.println("The Drunk Patron throws a Punch");

                //Making Drunk Patron hit chance 50%
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
            //Winning the fight, get +1 to ATK
            if (Stats.DrunkPatronHP == 0) {
                System.out.println("You knocked out the Drunk Patron!");
                System.out.println("");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bob sighs woefully");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("");
                Stats.PlayerATK++;
            }
            //Losing the fight, dies
            if (Stats.PlayerHP == 0) {
                System.out.println("You got knocked out and robbed!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Thanks for playing. Get rekt NOOB");
                Death.Death = true;
                break;
            }
        }
    }

    public static void AmbushCombat() throws InterruptedException {
        while (Stats.BrigandHP > 0) {
            System.out.println("Press a to attack or any other character to wait");
            String Hit = yes.nextLine();
            int HitChance = random.nextInt(4);
            if (Stats.BrigandHP > 0) {
                System.out.println("The brigand swings his axe.");
                int DoesItHit = random.nextInt(10);
                if (DoesItHit > 2) {
                    System.out.println("You dodged");
                    System.out.println("");
                }
                else if (DoesItHit < 3) {
                    System.out.println("The brigand slices you with his axe!");
                    Stats.PlayerHP = Stats.PlayerHP - Stats.PlayerATK;
                    System.out.println("You have " + Stats.PlayerHP + "HP left");
                    System.out.println("");
                }
            }
           if (Hit.equalsIgnoreCase("a")) {
               if (HitChance == 0) {
                   System.out.println("Your Attack missed!");
                   System.out.println("");
                    }

               else if (HitChance > 0) {
                   System.out.println("Your Attack hit!");
                   Stats.BrigandHP = Stats.BrigandHP - Stats.PlayerATK;
                   System.out.println("Brigand's HP:" + Stats.BrigandHP);
                   System.out.println("");
                    }
            }
           else {
               System.out.println("You chose not to attack..");
           }
            if (Stats.BrigandHP <= 0) {
                System.out.println("You knock the brigand out and decide to spare him, leaving him in the ditch by the roadside.");
                System.out.println("");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("His friends will help him when they come check on him, or you have just put him out of his misery.");
                TimeUnit.SECONDS.sleep(1);
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
