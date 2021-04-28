package GiggleFist;
import java.io.*;
import java.util.*;


public class Main {
    // Creating the randomiser
    static Random random = new Random();

    //String muuttuja
    static String rivi = "";

    //Tehdään scanner, jolla katsotaan käyttäjän kirjottamat jutut
    private final static Scanner yes = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        // Kutsutaan alku metodia (pelin alkuvaihe)
        alku();
        //jos kuolee pelissä alun jälkeen kutsutaan kuolema() metodi
        if (kuolema == true){
            kuolema();
        }
        // Jos pelaaja ei ole kuollut kutsutaan keski() metodi
        if (kuolema == false) {
            keski();
            //Jos pelaaja kuolee tarinan keskivaiheille kutsutaan kuolema metodi
            if (kuolema == true) {
                kuolema();
            }
            //jos pelaaja on elossa keskivaiheen jälkeen kutsutaan loppu metodi, jossa loppu story
            if (kuolema == false) {
                loppu();
            }
        }
    }
}
