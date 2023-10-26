/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class PalindromeCheck {
    public static void main(String[] args) {
//        String sentences ="kasur rusak";
//        String ispalindrome = "palindrom";
//        
//        for(int i=0; i<sentences.length();i++){
//            char forward = sentences.charAt(i);
//            char backward = sentences.charAt((sentences.length()-1));
//            
//            if(forward != backward){
//                ispalindrome = "Bukan Palindrome";
//                break;
//            }
//        }
//        System.out.println(ispalindrome);
          String sentences = "Kasur Ini rusak";
        String hasil;
        boolean isPalindrome = true;

        // Hilangkan spasi dan ubah menjadi huruf kecil
        String cleanSentences = sentences.replaceAll("\\s", "").toLowerCase();

        for (int i = 0; i < cleanSentences.length() / 2; i++) {
            char forward = cleanSentences.charAt(i);
            char backward = cleanSentences.charAt(cleanSentences.length() - 1 - i);

            if (forward != backward) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            hasil = "Palindrome";
        } else {
            hasil = "Bukan Palindrome";
        }

        System.out.println(sentences +" Adalah kata "+hasil);
    }
    
}
