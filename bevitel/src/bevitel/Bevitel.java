/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bevitel;

import java.util.Scanner;

/**
 *
 * @author kiss.bence2
 */
public class Bevitel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        //s.nextBoolean();
        System.out.print("Adja meg nevét: ");
        String nev = scanner.nextLine();
        System.out.println("Üdvözlöm, " + nev + "!");
        
        System.out.print("Adja meg a kedvenc számát: ");
        int szam = scanner.nextInt();
        System.out.println("A 82-szerese: " + szam * 82);
        
        
        scanner.close();
    }
    
}
