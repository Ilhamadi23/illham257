
import javax.swing.JOptionPane;
public class angkaPalindromeTerdekat {
    public static void main(String[] args) {
       

    String jawab = "y";
        do {
            int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang ingin di looping: "));
            int hasil = angka + 1;

            while (true) {
                if (isPalindrome(hasil)) {
                break;
                }
                hasil++;
            }
            System.out.println("Input: " + angka + " Output: " + hasil);
            jawab = JOptionPane.showInputDialog("Apakah Anda ingin mencoba lagi? (Y/N)");
            jawab = jawab.toLowerCase();
        } while (jawab.equals("y"));
    }

    public static boolean isPalindrome(int angka) {
        String perubahan = Integer.toString(angka);      
        for (int i = 0; i <perubahan.length() / 2; i++) {
            char angkaMaju=perubahan.charAt(i);
            char angkaMundur=perubahan.charAt(perubahan.length()-1 -i);
            
            if(angkaMaju != angkaMundur){
                return false;
            }
        }
        return true;
    }
}
    
      


