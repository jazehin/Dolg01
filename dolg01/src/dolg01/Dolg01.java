/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolg01;

/**
 *
 * @author kiss.bence2 <3
 */
public class Dolg01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tomb = {1, 6, 3, 9, 7, 3, 8, 0, -3};
        Kivalasztas(tomb);
        Kiir(tomb);
        Rendezes(tomb);
        Kiir(tomb);
    }
    
    public static void Kivalasztas(int[] tomb) {
        // "Kiválasztom" a tömbben a 9-es elemet
        int i = 0;
        int keresett = 9;
        while (i < tomb.length && tomb[i] != keresett) i++;
        System.out.println("A " + keresett + " a(z) " + (i+1) + ". helyen, avagy a(z) " + i + ". indexen található.");
    }
    
    public static void Rendezes(int[] tomb) {
        for (int i = tomb.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (tomb[i] < tomb[j]) Csere(tomb, i, j);
            }
        }
    }
    
    public static void Csere(int[] tomb, int i, int j) {
        int temp = tomb[i];
        tomb[i] = tomb[j];
        tomb[j] = temp;
    }
    
    public static void Kiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();
    }
    
}
