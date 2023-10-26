/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class PrimaCheck {
    public static void main(String[] args) {
        int bil = 2;
        int faktor = 0;
        for(int i=1; i<= bil;i++){
            if(bil % i==0){
                faktor++;
            }
        }
        if(faktor==2){
            System.out.println(bil +" Adalah bilangan PRIMA");
        }
        else{
            System.out.println(bil+" Adalah bukan PRIMA");
        }
    }
           
    
}
