
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class ArrayBilangan {
    public static void main(String[] args) {
        int data[]= new int[6];
        data[0]=5; data[1]=8; data[2]= 6; data[3]=7;
        
        System.out.println(Arrays.toString(data));
        
        int data2 [] = {10,40,50,60,70};
        System.out.println(Arrays.toString(data2));
        //cari rata-rata
        double total=0;
        for(int i=0; i < data.length;i++){
            //System.out.println(data[i]);
            total = total + data[i];
        }
        double avg = total / data.length;
        System.out.println("Rata-rata : "+ avg);
    }
    
}
