public class MethodVariabelArgument {

    public static void main(String[] args) {

        // Menggunakan Array
        int[] values ={80,80,80,80,80};
        sayCongrats("Seppo", values);

        // Menggunakan Variabel
        sayCongrats1("Dani", 10,10,10,10,10);

    }

    // Menggunakan Array
    static void sayCongrats(String name, int[] values){
        var total =0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name+", anda lulus");
        } else {
            System.out.println("Selamat " +name+", Tidak lulus");
        }
    }

    // Menggunakan variabel
    static void sayCongrats1(String name, int... values){
        var total =0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name+", anda lulus");
        } else {
            System.out.println("Selamat " +name+", Tidak lulus");
        }
    }

}
