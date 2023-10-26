public class loopin {
    public static void main(String[] args) {
        
        

        int n = 1;
        int m = 4;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
            n = m;
            m += 3;
      }
    }
}