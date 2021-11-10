/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasipl;

import java.util.Scanner;

/**
 *
 * @author Hana Nazla Humaira
 * NIM 3411191050
 * Kelas DSE-B
 */
public class Obat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan umur: ");
        int umur = scan.nextInt();
        System.out.print("Masukkan berat badan: ");
        int bb = scan.nextInt();
        System.out.print("Jenis kelamin (L/P): " );
        String jk = scan.next();
        
        if(jk.equals("L") && bb>150){
            System.out.println("Obat 1");
        }else if(jk.equals("P") && umur < 21 && bb<150){
            System.out.println("Obat 1");
        }else if(jk.equals("L") && umur > 21 && bb >150 ){
            System.out.println("Obat 2");
        }else if(jk.equals("L") && umur < 21 && bb > 150){
            System.out.println("Obat 2");
        }else if(jk.equals("L") && umur < 21 && bb < 150){
            System.out.println("Obat 3");
        }else if(jk.equals("P") && bb<150){
            System.out.println("Obat 3");
        }else{
            System.out.println("maaf, tidak mendapatkan obat");
        }
    }
    
}
