package GiggleFist;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Merchant {
    public final static Scanner yes = new Scanner(System.in);

    public static void FirstMerchant() throws InterruptedException {
        String ostos = yes.nextLine();
        if ((!"a".equalsIgnoreCase(ostos) && !"b".equalsIgnoreCase(ostos) && !"c".equalsIgnoreCase(ostos) && !"n".equalsIgnoreCase(ostos))) {
            while (!"a".equalsIgnoreCase(ostos) && !"b".equalsIgnoreCase(ostos) && !"c".equalsIgnoreCase(ostos) && !"n".equalsIgnoreCase(ostos)) {
                System.out.println("You wrote a wrong character... Try again...");
                ostos = yes.nextLine();
            }

            if (ostos.equalsIgnoreCase("a") || ostos.equalsIgnoreCase("b") || ostos.equalsIgnoreCase("c") || ostos.equalsIgnoreCase("n")) {
                if (ostos.equalsIgnoreCase("a")) {
                    Items.ClawWeapon();
                } else if (ostos.equalsIgnoreCase("b")) {
                    Items.Herbs();
                } else if (ostos.equalsIgnoreCase("c")) {
                    Items.Fiddle();
                } else if (ostos.equalsIgnoreCase("n")) {
                    System.out.println("That's a shame..");
                    System.out.println("The Merchant seems to look a little less happy, but none the less wishes you well. You scurry off to the Northern road.");
                    System.out.println("");
                }
            }
        }
    }

    public static void Merchant2() throws FileNotFoundException, InterruptedException {
        String purchase = yes.nextLine();
        while (!"a".equalsIgnoreCase(purchase) && !"b".equalsIgnoreCase(purchase) && !"c".equalsIgnoreCase(purchase) && !"d".equalsIgnoreCase(purchase)) {
            System.out.println("You wrote a wrong character... Try again...");
            purchase = yes.nextLine();
        }
        if (purchase.equalsIgnoreCase("a") || purchase.equalsIgnoreCase("b") || purchase.equalsIgnoreCase("c") || purchase.equalsIgnoreCase("d")) {
            if (purchase.equalsIgnoreCase("a")) {
                Items.teddybear();
            }
            else if (purchase.equalsIgnoreCase("b")) {
                Items.StrengthPotion();
            }
            else if (purchase.equalsIgnoreCase("c")) {
                Items.HealingShroom();
            }
            else if (purchase.equalsIgnoreCase("d")) {
                Items.HearthStone();
            }
        }
    }
}
