public class PenerimaanCalonProgrammer {
    public static void main(String[] args) {
        String resultnilai,resulthasil;
        String name = "Johan";
        String nilai = "B";
        int hasil = 80;
        System.out.println("Nama : "+ name +"\n"+"Nilai Test : "+hasil+"\n"+ "Nlai Interview : "+ nilai );
        if(hasil>=80 && hasil <=100){
            resulthasil="LOLOS";
        }
        else if(hasil>=60 && hasil<=80){
            resulthasil="DIPERTIMBANGKAN";
        }
        else{
            resulthasil="GAGAL";
        }
        if(nilai=="A" ){
            resultnilai="LOLOS";
        }
        else if(nilai=="B"){
            resultnilai="LOLOS";
        }
        else {
            resultnilai="DIPERTIMBANGKAN";
        }
        if(resulthasil=="LOLOS"&& resultnilai=="LOLOS"){
            System.out.println("Selamat Kamu Berhasil Menjadi Programmer");
        }
        else if(resulthasil=="DIPERTIMBANGKAN"&& resultnilai=="LOLOS"){
            System.out.println("Selamat Kamu Berhasil Menjadi Programmer");
        }
        else{
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Programmer");
        }
        
    }
    
}
