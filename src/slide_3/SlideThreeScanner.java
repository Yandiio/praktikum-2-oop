package slide_3;

import java.util.Scanner;

/**
 * @author Muh. Yandi Fenanda
 * @createdOn 14/03/23
 */
public class SlideThreeScanner {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;

        System.out.print("Nama \t:");
        nama = input.next();
        System.out.print("Umur\t:");
        umur = input.nextInt();

        System.out.println("Nama : "+nama+"\n" + "Umur  :" + umur);
    }
}