
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 

/**
 *
 * @author ilham
 */
public class WhileLoop {
    public static void main(String[] args) {
        int bil1, bil2;
        String jawab = "y";
        do{
        bil1 =  Integer.parseInt(JOptionPane.showInputDialog("Isikan Bilangan 1"));
        
        bil2 =  Integer.parseInt(JOptionPane.showInputDialog("Isikan Bilangan 2"));
        
        int hasil = bil1 + bil2;
        JOptionPane.showMessageDialog(null,"Hasil Jumlah ="+hasil);
        
        jawab= JOptionPane.showInputDialog("Apakah mau mengulang (y/t)");
        }while(jawab.equals("y"));
    }
    
}
