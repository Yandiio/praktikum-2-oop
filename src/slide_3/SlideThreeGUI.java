package slide_3;

import javax.swing.*;

/**
 * @author Yandi Fenanda
 * @createdOn 14/03/23
 */
public class SlideThreeGUI {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukan Nama Anda!");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
