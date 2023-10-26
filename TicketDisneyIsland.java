
import javax.swing.JOptionPane;

public class TicketDisneyIsland {
    public static void main(String[] args) {
        int age,tinggi,total;
        String hasil1,hasil2 = null;
        String jawab= "y";
        
        do{
        age=Integer.parseInt(JOptionPane.showInputDialog("Masukan Umur Pengunjung "));
        tinggi= Integer.parseInt(JOptionPane.showInputDialog("Masukan Tinggi Pengunjunhg "));
        
        if(age <= 1){
            hasil1="Di Larang Masuk";
        }else if(age <= 3 ){
            hasil1="Rp 30.000";
            if(tinggi >= 70){
                hasil1="Rp 30.000";
                hasil2="Rp 10.000";
            }
        }else if(age <=7){
            hasil1="Rp 40.000";
            if(tinggi>=120){
                hasil1="Rp 40.000";
                hasil2="Rp 15.000";
            }
        }else if(age<=10){
            hasil1="Rp 50.000";
            if(tinggi>=150){
                hasil1="Rp 50.000";
                hasil2="Rp 20.000";
            }
        }else{
            hasil1="Rp 80.000";
            hasil2="Rp _";
        }
        
        System.out.println("Umur : "+ age +"\n"+"Tinggi : "+tinggi+"\n"+"Harga Ticket : "+ hasil1+ "+"+hasil2);
        
            
            jawab=JOptionPane.showInputDialog("Apakah kamu mau memesan ticket lagi? ");
            jawab= jawab.toLowerCase();
        
        }while(jawab.equals("y"));
    }
        
    
}
