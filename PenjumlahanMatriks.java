
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class PenjumlahanMatriks {
    public static void main(String[] args) {
        int data1 [] = new int[5];
        data1[0]=5; data1[1]=8; data1[2]= 6; data1[3]=7;data1[4]=10;
        int data2 [] = {10,40,50,60,70};
        
        int hasil [] = new int[5];
        for(int i=0; i<data1.length;i++){
            hasil [i]= data1 [i] + data2 [i];
            System.out.println(data1[i] + "+"+ data2[i]+ "="+ hasil[i]);
        }
//        hasil [0]= data1 [0]+ data2[0];
//        hasil [1]= data1 [1]+ data2[1];
//        hasil [2]= data1 [2]+ data2[2];
//        hasil [3]= data1 [3]+ data2[3];
//        hasil [4]= data1 [4]+ data2[4];
       
        
//        System.out.println(Arrays.toString(data1));
//        System.out.println("+");
//        System.out.println(Arrays.toString(data2));   
//        System.out.println("=");  
//        System.out.println(Arrays.toString(hasil));
    }
    
}
