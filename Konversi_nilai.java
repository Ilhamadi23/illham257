/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendi alfa nayoan
 */
public class Konversi_nilai {
    public static void main(String[] args) {
        int nilai = 101;
        if(nilai >=85 && nilai <=100){
            System.out.println("Nilai anda A");
        }
        else if(nilai >=75 && nilai <=84){
            System.out.println("Nilai anda B");
        }
        else if(nilai >=65 && nilai <=74){
            System.out.println("NIlai anda C");
        }
        else if(nilai >=55 && nilai <=64){
            System.out.println("Nilai anda D");
        }
        else if(nilai <= 50 && nilai >= 0){
            System.out.println("Nilai anda E");
        }
        else{
            System.out.println("Nilai tidak valid");
        }
    }
}
