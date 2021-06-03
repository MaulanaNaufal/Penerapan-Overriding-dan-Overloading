/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
/**
 *
 * @author MOKLET-1
 */
class PerTambahanSameedd {

    public void tambah1() {
        int a = 91, b = 100;
        System.out.println("Hasil Penjumlahan dari method tambah1 ke 1 yaitu = " + (a + b));
    }

    public void tambah1(int x, int y) {
        System.out.println("Hasil Penjumlahan dari method tambah1 ke 2 yaitu = " + (x + y));
    }

    public static void main(String[] args) {
        PerTambahanSameedd pp;
        pp = new PerTambahanSameedd();
        pp.tambah1();
        pp.tambah1(8, 17);
    }
}