/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilham
 */
public class CountMaleAndFemale {
    public static void main(String[] args) {
        String tempatduduk[]={"L","L","P","P","P","P","L","L"};
        int jumlahlakilaki=0;
        int jumlahperempuan=0;
        for (String tempatduduk1 : tempatduduk) {
            if (tempatduduk1.equals("L")) {
                jumlahlakilaki = jumlahlakilaki +1;
            } else {
                jumlahperempuan = jumlahperempuan+1;
            }
        }
        int totalorang= jumlahlakilaki + jumlahperempuan;
        System.out.println("Jumlah Laki-laki di bioskop = "+jumlahlakilaki);
        System.out.println("Jumlah Perempuan di bioskop = "+jumlahperempuan);
        System.out.println("Jumlah Orang di bioskop = " + totalorang);
    }
    
}
