package GiggleFist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
            System.out.println("An error occurred" + e);
        }
        Combat.AmbushCombat();
    }

    public static void Artiste() throws FileNotFoundException, InterruptedException {
        String rivi = "";
        try {
            final Scanner t7luk = new Scanner(new File("./textfiles/artiste.txt"));
            while (t7luk.hasNext()) {
                rivi = t7luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t7luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Tapahtui virhe!!!" + e);
        }
        String AorD = yes.nextLine();

        while (!"a".equalsIgnoreCase(AorD) && !"d".equalsIgnoreCase(AorD)) {
            System.out.println("You wrote a wrong character... Try again...");
            AorD = yes.nextLine();
        }
        if (AorD.equalsIgnoreCase("a") || AorD.equalsIgnoreCase("d")) {
            if (AorD.equalsIgnoreCase("a")) {
                Questions.ArtisteAccept();
            }
            else if (AorD.equalsIgnoreCase("d")) {
                System.out.println("Have it yourway, now be quick or be dead, time is of the essence.");
            }
        }
    }

    public static void God() throws FileNotFoundException, InterruptedException {
        String rivi = "";
        System.out.println("Hello there, I am your creator, the great Krediann.");
        TimeUnit.SECONDS.sleep(1);
        try {
            PrintWriter Writer = new PrintWriter("./textfiles/god.txt");
            System.out.println("What do you wish to tell me?");
            rivi = yes.nextLine();
            Writer.println(rivi);
            Writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Tapahtui virhe" + e);
        }
        System.out.println("Is that a thing to say to your creator?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You feel your sins crawling on your back...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You snap back to reality, you're fairly certain you just insulted your creator in a dreamstate.");
        Items.Insult = true;
    }

    public static void DevilsDuel() throws FileNotFoundException, InterruptedException {
        String rivi = "";
        try {
            final Scanner t8luk = new Scanner(new File("./textfiles/devil.txt"));
            while (t8luk.hasNext()) {
                rivi = t8luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t8luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred" + e);
        }
        String choice = yes.nextLine();

        if (Items.Fiddle == true) {

            while (!"a".equalsIgnoreCase(choice) && !"d".equalsIgnoreCase(choice)) {
                System.out.println("You wrote a wrong character... Try again...");
                choice = yes.nextLine();
            }
            if (choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("d")) {
                if (choice.equalsIgnoreCase("a")) {
                    Questions.DevilsDuelAccept();
                }
                else if (choice.equalsIgnoreCase("d")) {
                    System.out.println("Devil: Suit yourself then boy. We'll meet another time!");
                }
            }
            //jos ei viulua devil kertoo tän
            else {
                System.out.println("You don't seem to have a fiddle, boy? If so, then move along, out of my sight!");
            }
        }
    }




}
