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
import java.io.*;
 
class temukanJumlah
{
    static int findSum(int n, int a, int b)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
 
            if (i % a == 0 || i % b == 0)
                sum += i;
 
        return sum;
    }

    public static void main(String[] args)
    {
        int n = 1000, a = 3, b = 5;
        System.out.println(findSum(n, a, b));
    }
}
