import java.util.Scanner;
public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah baris ");
        int baris =sc.nextInt();
        System.out.println("jumlah kolom ");
        int kolom=sc.nextInt();
        int matrix[][]=new int[baris][kolom];
        
        for(int m=0;m<matrix.length;m++){
            for(int n=0;n<matrix[m].length;n++){
                if(m==n){
                    matrix[m][n]=1;
                }else{
                    matrix[m][n]=0;
                }
                System.out.print(matrix[m][n]);
            }
             System.out.println();
        }
       
    }
    
}
