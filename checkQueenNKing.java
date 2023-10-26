public class checkQueenNKing {
    public static void main(String[] args) {
        //k=king/raja
        //r=rook/benteng
        int barisk=0;
        int barisr=0;
        int kolomk=0;
        int kolomr=0;
        String keterangan="";
        
       String ches[][]={
           {"K","","","","",""},
           {"","","","","",""},
           {"","","","","",""},
           {"","","","","",""},
           {"","","","","",""},
           {"","R","","","",""},
       };
       
       for(int i=0;i<ches.length;i++){
           for(int j=0;j<ches[barisk].length;j++){
               if(ches[i] [j].equals("K")){
                   barisk=i;
                   kolomk=j;
               }
               if(ches[i][j].equals("R")){
                   barisr=i;
                   kolomr=j;                   
               }
               
           }
           if((barisk== barisr)||(kolomk==kolomr)){
               keterangan="skak";
              
           }
           else{
               keterangan="tidak skak";
           }
           
       }
        System.out.println(keterangan);
    }
    
}
