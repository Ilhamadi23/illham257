public class Pencarian_Anggota {
    public static void main(String[] args) {
        String name= "Jordi";
        String addres= "Nevada";
        int age= 25;
        int tabungan= 10000000; 
        System.out.println("Nama ="+ name+ "\n"+ "Umur =" +age+ "\n"+ "Alamat ="+ addres+ "\n"+ "Tabugan ="+ tabungan );
         if (age > 40 && (addres.equals("Nevada") || addres.equals("New York") ||addres.equals("Havana")) && tabungan > 10000000) {
             System.out.println( name + " kemungkinan adalah seorang anggota mafia dengan pangkat Don.");
        } else if (age>= 25 && age <= 40 && (addres.equals("New Jersey") || addres.equals("Manhattan") || addres.equals("Nevada")) && tabungan >= 1000000 && tabungan <= 2000000) {
             System.out.println(name + " kemungkinan adalah seorang anggota mafia dengan pangkat Underboss."); 
        } else if (age >= 18 && age <= 24 && (addres.equals("California") || addres.equals("Detroit") || addres.equals("Boston")) && tabungan < 1000000) {
             System.out.println(name + " kemungkinan adalah seorang anggota mafia dengan pangkat Capo."); 
        } else {
             System.out.println(name + " tidak mencurigakan."); 
        }
    }
}
