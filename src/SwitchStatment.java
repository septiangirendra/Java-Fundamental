public class SwitchStatment {

    public static void main(String[] args) {

        // switch biasa java 14 kebawah

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Lulus dengan baik");
                break;
            case "B":
                System.out.println("Lulus baik");
                break;
            case "C":
                System.out.println("Cukup Baik");
                break;
            default:
                System.out.println("Tidak Lulus");
        }

        // switch lamda
        switch (nilai){
            case "A" -> System.out.println("Wow anda lulus");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Tidak lulus");
            default -> System.out.println("Salah jurusan");
        }

        // yield/return value dengan menyimpan hasil case ke dalam variabel
        // tersedia dijava 14
        String ucapan = switch (nilai){
            case "A":
                yield "Anda lulus dengan puas";
            case "B":
                yield "Anda cukup baik";
            case "C":
                yield "Anda cukup";
            default:
                yield "Salah jurusan";
        };

        System.out.println(ucapan);

    }

}
