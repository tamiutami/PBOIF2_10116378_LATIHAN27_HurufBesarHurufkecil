/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufbesarhurufkecil;

import java.util.Scanner;

/**
 *
 * @author Sri Utami Ningsih
 * KELAS : PBO 2
 * NIM : 10116378
 * Deskripsi program: program ini berisi program untuk menampilkan 
 * Huruf besar dan kecil
 */
public class HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     * KELAS : PBO 2
     * NIM : 10116415
     * Deskripsi program: program ini berisi program untuk menampilkan 
     * Huruf besar huruf kecil
 
     */
    public static void main(String[] args) {
        // TODO code application logic here
 String Kalimat;
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("========HasilFormating=======");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf Kecil = " + Kecil);
    }
    
}
