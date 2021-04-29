package GiggleFist;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Storybeats {
    static String rivi = "";

    public static void JourneyBeginning() throws FileNotFoundException, InterruptedException {
        try {
            final Scanner t1luk = new Scanner(new File("./textfiles/storybeat1.txt"));
            while (t1luk.hasNext()) {
                rivi = t1luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t1luk.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred" + e);
        }
    }

    public static void TaleOfTavern() throws FileNotFoundException, InterruptedException {
        try {
            final Scanner t2luk = new Scanner(new File("./textfiles/gloomytavern.txt"));
            while (t2luk.hasNext()) {
                rivi = t2luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t2luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred" +e);
        }
    }

    public static void QuestInfo() throws FileNotFoundException, InterruptedException {
        try {
            final Scanner t4luk = new Scanner(new File("./textfiles/quest1.txt"));
            while (t4luk.hasNext()) {
                rivi = t4luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t4luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred " + e);
        }
    }

    public static void Ending() throws FileNotFoundException, InterruptedException {
        try {
            final Scanner t9luk = new Scanner(new File("./textfiles/storybeat4.txt"));
            while (t9luk.hasNext()) {
                rivi = t9luk.nextLine();
                TimeUnit.SECONDS.sleep(1);
                System.out.println(rivi);
            }
            t9luk.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred " + e);
        }
    }

}
