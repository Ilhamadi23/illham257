
import java.util.Scanner;
public class Kalori {
    public static void main(String[] args) {
        double laripermenit = 60/5;
        double pushup_permenit= 200d/30d;
        double plankpermenit = 5;
        double total =0;
        
        Scanner scanner =new Scanner(System.in);
        System.out.print("Waktu Lama Lari : ");
        String lari=scanner.nextLine();
        System.out.print("Waktu Lama Push-up : ");
        String pushup =scanner.nextLine();
        System.out.print("Waktu Lama Plank : ");
        String plank = scanner.nextLine();
        
        double dlari = Double.parseDouble(lari);
        double dpushup =Double.parseDouble(pushup);
        double dplank = Double.parseDouble(plank);
        
        if(dlari > 0){
            total = total + (dlari * laripermenit);
        }
        if(dpushup > 0){
            total = total + (dpushup * pushup_permenit);
        }
        if(dplank > 0){
            total = total + (dplank * plankpermenit);
        }
        System.out.println("Jumlah Kalori Yang keluar : "+ total);
        
        
    }
    
}
