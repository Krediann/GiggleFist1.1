package GiggleFist;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        Combat.C1();
        if (Death.Death == true) {
            Death.Death();
        }
    }
}
