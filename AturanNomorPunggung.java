

import javax.swing.JOptionPane;


public class AturanNomorPunggung {
    public static void main(String[] args) {
        int nopunggung;
        String posisi1, posisi2 = null;
            nopunggung= Integer.parseInt(JOptionPane.showInputDialog("Masukan nomor punggung :"));
        
        
        if(nopunggung%2 ==0){
            posisi1="Target Attacker";
            if(nopunggung>=50 && nopunggung<=100){
            posisi1="Target Attacker";
            posisi2="Berhak menjadi kapten tim"; 
            }
        }else if(nopunggung%2==1){
            posisi1=" Defender";
            if(nopunggung>90){
            posisi1=" Defender";
            posisi2=" Playmaker";
            }
        }else if(nopunggung%3==0 && nopunggung%5==0){
            posisi1=" Keeper";
        }else{
            posisi1="  ";
            posisi2="  ";
        }
           
        System.out.println("Posisi Dari Nomor Punggung : " +nopunggung+"\n"+ " Adalah : "+ posisi1 + posisi2 );
    }    
}
