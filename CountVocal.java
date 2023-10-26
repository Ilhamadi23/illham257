/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class CountVocal {
    public static void main(String[] args) {
        String sentences = "Universitas Nusa Putra";
        int total_a = 0;
        int total_i = 0;
        int total_u = 0;
        int total_e = 0;
        int total_o = 0;
        //System.out.println(sentences.length());
        for(int i=0;i<sentences.length();i++){
            char letter = sentences.charAt(i);
            if(letter == 'a'){
                total_a++;
            }
            else if(letter == 'i'){
                total_i++;
            }
            else if(letter == 'u'){
                total_u++;
            }
            else if(letter == 'e'){
                total_e++;
            }
            else if(letter == 'o'){
                total_o ++;
            }
            
               
        }
        
        int total_vokal = total_a + total_i + total_u + total_e + total_o;
        
        System.out.println("Jumlah Huruf A :"+ total_a);
        System.out.println("Jumlah Huruf I :"+ total_i);
        System.out.println("Jumlah Huruf U :"+ total_u);
        System.out.println("umlah Huruf E :"+total_e);
        System.out.println("umlah Huruf O :"+ total_o);
        System.out.println("Jumlah Total Vokal :"+ total_vokal);
    
    }
    
}
