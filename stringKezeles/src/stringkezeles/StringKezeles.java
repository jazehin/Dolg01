/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringkezeles;

/**
 *
 * @author kiss.bence2
 */
public class StringKezeles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Explicit hívással
        String s1 = new String();
        String s2 = new String("Ez " + 1 + " string!");
        //Implicit konstruktor hívással:
        String s11 = "NYME FMK";
        String s21 = s11 + " INF. INT. " + 2004;
        //Karaktertömbből:
        char[] karaktertomb = {'S', 'o', 'p', 'r', 'o', 'n'};
        String s3 = new String(karaktertomb);       // "Sopron"
        String s4 = new String(karaktertomb, 2, 3); // "pro"
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s11);
        System.out.println(s21);
        System.out.println(s3);
        System.out.println(s4);
        //Egy karakter elérése: charAt metódus
        char ch = s3.charAt(2);        // ch = 'p' (s3="Sopron")
        char ch2 = "Sopron".charAt(0); // ch2 = 'S'
        System.out.println(ch);
        System.out.println(ch2);
        //String osztály konverziók
        boolean log = false;
        char ch1 = 'X';
        double pi = 3.14;
        String s5 = String.valueOf(log) + String.valueOf(ch1) + String.valueOf(pi);  // s5 = "falseX3.14"
        System.out.println(ch1);
        System.out.println(s5);
        //Két string összehasonlítása: equals, equalsIgnoreCase metódus
        boolean b1 = "alma".equals("ALMA");            // false
        boolean b2 = "alma".equalsIgnoreCase("ALMA");  // true
        System.out.println(b1);
        System.out.println(b2);
        //Az == a referenciákat hasonlítja össze, nem a tartalmat!!!
        //Karakter vagy string keresése: indexOf metódus
        int index1 = "kukuriku".indexOf('u');         // 1
        int index2 = "kukuriku".indexOf('u', 2);      // 3
        // a 2. indexű elemtől indul a keresés
        int index3 = "kukuriku".indexOf("ku");        // 0
        int index4 = "kukuriku".indexOf("ka");        // -1
        //Keresés hátulról: lastIndexOf metódus
        int index5 = "kukuriku".lastIndexOf("ku");    // 6
        //Így kezdődik-e a string: startsWith metódus
        boolean start = "file.java".startsWith("fi"); // true
        //Így végződik-e a string: endsWith metódus
        boolean vege = "file.java".endsWith(".jav"); 
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        System.out.println(start);
        System.out.println(vege);
        //A string hossza: length metódus
        int len = "Sopron".length();  // len = 6
        //Kis-, nagybetű váltás: toLowerCase, toUpperCase metódus
        String vegyes = "Kicsi És nAgYbEtŰk Vegyesen";
        String kicsi = vegyes.toLowerCase();
        String nagy = vegyes.toUpperCase();
        //Betűcsere: replace metódus
        //Részstring: substring metódus (tól, ig, az ig. karakter már nem lesz benne)
        String kacsa = kicsi.substring(0, 5).replace('i', 'a');
        //Vezető és záró white space-ek eltávolítása: trim metódus
        String s = "    abcd    ";
        String lenyeg = s.trim();  // lenyeg = "abcd"
        System.out.println(vegyes);
        System.out.println(kicsi);
        System.out.println(nagy);
        System.out.println(kacsa);
        System.out.println(s);
        System.out.println(lenyeg);
        //StringBuffer (dinamikus string) objektum létrehozása, különböző konstruktorokkal:
        StringBuffer sb1= new StringBuffer();   // L:0  C:16
        System.out.println(sb1.length()+ " " + sb1.capacity());
        StringBuffer sb2= new StringBuffer(10); // L:0  C:10
        System.out.println(sb2.length()+ " " + sb2.capacity());
        String varos = "Sopron";
        StringBuffer sb3= new StringBuffer(s);
        System.out.println(sb3.length()+ " " + sb3.capacity());
        //A kiinduló string ezekkel a metódusokkal sem változik meg!
        //Bővítés: StrinBuffer append(<Type> value)
        StringBuffer szov = new StringBuffer("Szám=");
        float f=34.6f;
        szov.append(f);
        szov.append("*");
        System.out.println(szov);
        //insert
        StringBuffer szovi = new StringBuffer("Osszesen  Ft");
        float f2=34.6f;
        szovi.insert(9,f2);
        System.out.println(szovi);
        //törlés
        StringBuffer szovt = new StringBuffer("Fradika");
        szovt.delete(2, 4);
        System.out.println(szovt);
        szovt.deleteCharAt(1);
        System.out.println(szovt);
        
        //egyéb
        StringBuffer szoveg = new StringBuffer("bolha");
        szoveg.delete(2,4);
        System.out.println(szoveg);
    }
    
}
