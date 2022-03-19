public class TernaryOperator {

    public static void main(String[] args) {


        // Tanpa ternary operator
        // Lebih efektif
        var nilai = 75;
        var absen = 70;
        String ucapan;

        if (nilai >= 75){
            ucapan=("Anda lulus");
        } else {
            ucapan=("Coba lagi tahun depan");
        }
        System.out.println(ucapan);

        // Menggunakan ternary operator
        // hanya bisa menggunakan maksimal 2 hasil
        String ucapan1 = nilai >= 75 && absen >= 75? "Lulus" : "Tidak Lulus" ;
        System.out.println(ucapan1);

    }
}
