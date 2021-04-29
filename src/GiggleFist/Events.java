package GiggleFist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Events {
    public final static Scanner yes = new Scanner(System.in);

    public static void ambush() throws FileNotFoundException, InterruptedException {
        String rivi = "";
        try {
            final Scanner t5luk = new Scanner(new File("./textfiles/ambush.txt"));
            while (t5luk.hasNext()) {
                rivi = t5luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t5luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Tapahtui virhe!!!" + e);
        }
        Combat.AmbushCombat();
    }

    public static void Merchant2() throws InterruptedException {
        String purchase = yes.nextLine();
        while (!"a".equalsIgnoreCase(purchase) && !"b".equalsIgnoreCase(purchase) && !"c".equalsIgnoreCase(purchase) && !"d".equalsIgnoreCase(purchase)) {
            System.out.println("You wrote a wrong character... Try again...");
            purchase = yes.nextLine();
        }
        if (purchase.equalsIgnoreCase("a") || purchase.equalsIgnoreCase("b") || purchase.equalsIgnoreCase("c") || purchase.equalsIgnoreCase("d")) {
            if (purchase.equalsIgnoreCase("a")) {
                teddybear();
            }
            else if (purchase.equalsIgnoreCase("b")) {
                potion();
            }
            else if (purchase.equalsIgnoreCase("c")) {
                shroom();
            }
            else if (purchase.equalsIgnoreCase("d")) {
                hearthstone();
            }
        }
    }


}
