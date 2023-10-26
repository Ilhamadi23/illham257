
public class LantaiHotel {
    public static void main(String[] args) {
     String hotel[][]={
         {"*","*","*","X","*"},
         {"*","*","*","*","*"},
         {"*","*","*","*","*"},
         {"*","*","*","*","x"},
         
     };
     int kamarKosong=0;
     int kamarTerisi=0;
    
     for(int i=0;i<hotel.length;i++){
         for(int j=0;j<hotel[i].length;j++){
             if(hotel[i][j].equals("X")){
                 System.out.println("Tamu berada di lantai "+((hotel[i].length-1)-i)+" Kamar "+(j+1));
                 System.out.println("Tamu berada di lantai "+((hotel[i].length)-4-i)+" Kamar "+(j+2));
                 
                 
                
             }
         } 
             
         } 
    }
    
}
