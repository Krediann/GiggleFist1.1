package GiggleFist;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Journey {
    static Random random = new Random();
    public final static Scanner yes = new Scanner(System.in);

    public static void Journey() throws FileNotFoundException, InterruptedException {
        int mitatapahtuu = random.nextInt(6);
        //Ambush event
        if (mitatapahtuu == 0) {
            Events.ambush();
        }
        //Second merchant interaction
        else if (mitatapahtuu == 1) {
            Events.Merchant2();
        }
        // Nothing happens
        else if (mitatapahtuu == 2) {
            System.out.println("You hear a twig snapping behind you, swiveling around you notice a hare skip away. There goes dinner. Hah.");
        }
        // Meeting the Artiste
        else if (mitatapahtuu == 3) {
            artiste();
        }
        //Talking to the God
        else if (mitatapahtuu == 4) {
            god();
        }
        //Dueling a devil with a fiddle
        else if (mitatapahtuu == 5) {
            devilsduel();
        }
    }

}
