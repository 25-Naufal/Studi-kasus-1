/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;

/**
 *
 * @author ASUS X450JN
 */
public class Studikasus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "aisyah anaya umami";
       
       // di dalam st'ring ada fungsi .length() untuk mendapatkan panjang string
       int panjangNama = nama.length();
       int counter = 0;
       char huruf = 'a';
       // dan fungsi .indexOf(i) untuk mendapatkan karakter di index ke i
       for (int i = 0; i < panjangNama; i++) {
           /*lakukan pengecekan nama.indexOf(i) apakah sama dengan huruf yang
            di inginkan.*/ 
        if (nama.charAt(i)==huruf){
            counter++;
              System.out.println('a');
        }
           
       }
     
       System.out.println("Hasil Aisyah anaya umami : "+counter);
       
    }
}
