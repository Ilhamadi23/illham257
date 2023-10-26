
import javax.swing.JOptionPane;
public class Palindrome {
    public static void main(String[] args) {

         String kata;
        String jo;
        String jawab = "y";
         boolean isPalindrome = true;
        
        do {
            kata = JOptionPane.showInputDialog("Masukkan kata yang ingin diuji sebagai palindrome: ");
            kata = kata.toLowerCase();
            
           

            for (int i = 0; i < kata.length() / 2; i++) {
                char HurufMaju = kata.charAt(i);
                char HurufMundur = kata.charAt(kata.length() - 1 - i);
                
                if (HurufMaju != HurufMundur) {
                    isPalindrome = false;
                    break;
                }
            }
            
            if (isPalindrome) {
                jo = "palindrome";
            } else {
                jo = "bukan palindrome";
            }
            
            JOptionPane.showMessageDialog(null, kata + " adalah " + jo);
            
            jawab = JOptionPane.showInputDialog("Apakah Anda ingin mengulanginya lagi? (y/n)");
            jawab = jawab.toLowerCase();
        } while (jawab.equals("y"));
    }
        
}
