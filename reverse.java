/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Hana Nazla Humaira
 * NIM 3411191050
 * Kelas DSE-B
 */
import java.util.*;
public class reverse {
  public static void main(String args[]) {
    String huruf, hasil = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan sebuah string: ");
    huruf = scanner.nextLine();
    int jumlah = huruf.length();
    int jumlahHuruf = jumlah - 1;
    for (int i = 0; i < jumlah; i++) {
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
    }
    System.out.println("Hasil reverse string: " + hasil);
  }
}
