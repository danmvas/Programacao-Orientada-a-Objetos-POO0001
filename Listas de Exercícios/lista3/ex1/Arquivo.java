package ex1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {{

    Scanner sc;

    try {
        sc = new Scanner(new File("input.txt"));
    }
    catch (FileNotFoundException e){
        sc = new Scanner(System.in);
    }
    
   
    sc.nextInt();
    
    System.out.println("");

}}