package GiggleFist;
import java.io.*;
import java.util.*;


public class Main {

    static Random random = new Random();
    static String rivi = "";
    private final static Scanner yes = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        StartStory();
        if (Death.Death == true){
            Death.Death();
        }
        // Jos pelaaja ei ole kuollut kutsutaan keski() metodi
        if (Death.Death == false) {
            MiddleStory();
            //Jos pelaaja kuolee tarinan keskivaiheille kutsutaan kuolema metodi
            if (Death.Death == true) {
                Death.Death();
            }
            //jos pelaaja on elossa keskivaiheen jälkeen kutsutaan loppu metodi, jossa loppu story
            if (Death.Death == false) {
                Ending();
            }
        }
    }
}
