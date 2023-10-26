/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class SwitchCountVokal {
    public static void main(String[] args) {
        int day = 9;
        String result="";
        switch(day){
            case 1 :
                result = "senin";
                break;
            case 2 :
                result = "Selasa";
                break;
            case 3 :
                result = "rabu";
                break;
            case 4 :
                result = "kamis";
                break;
            case 5 :
                result = "jumat";
                break;
            case 6 :
                result = "sabtu";
                break;
            case 7 :
                result = "minggu";
                break;
            default :
                result = "'Not Valid'";
                        
                        
                
        }
        System.out.println("Hari ini adalah :"+ result);
    }
    
}
