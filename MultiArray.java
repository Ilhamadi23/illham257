public class MultiArray {
    
    static int data1[][]=new int [3][3];
    static int data2[][]={{10,20,30,46,76},{40,50,60}};

    public static void main(String[] args) {
    
    int len=data2.length;
    System.out.println(data2[0][0]);
    data2[0][0]=15;
    
   
    for (int baris =0; baris <len;baris++){
         for (int kolom=0; kolom<data2[baris].length;kolom++){
             System.out.println(baris+"-"+kolom);
             System.out.println(data2[baris][kolom]);
//             
//             int total =0;
//             double jumlahData=0;
//             for (int baris=0;baris<len;baris++){
//                 for(int kolom=0;kolom<data2[baris].length;kolom++){
//                     System.out.println(baris+"-"+kolom);
//                     System.out.println(data2[baris][kolom]);
//                     total=total + data2 [baris][kolom];
//                     jumlahData=jumlahData+1;
//                     
////                 }
////             }
//             
//           }
//        } 
//    double avg= total/(double)jumlahData;
//        System.out.println("rata rata = "+avg);
         }
         } 
    }
         
}
