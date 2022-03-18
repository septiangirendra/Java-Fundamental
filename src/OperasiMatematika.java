public class OperasiMatematika {

    public static void main(String[] args) {

        // Unary Operator > operator yang ditempatkan di setelah variabel

        int f = 100;
        int g = 10;

        f++;
        System.out.println(f);

        g--;
        System.out.println(g);

        System.out.println(!true);


        // Augmented Assignments > operasi ke dalam variabel diri sendiri
        int e = 100;

        e += 10;
        System.out.println(e);

        e -= 10;
        System.out.println(e);

        e *= 10;
        System.out.println(e);

        // Operasi Matematika
        Integer a = 100;
        Integer b = 10;
        float c = 0.25f;
        int d = 1000;

        System.out.println(a + b + c);
        System.out.println(a * b * c);
        System.out.println(a - b * c);
        System.out.println(a / b );
        System.out.println(a % b );
        System.out.println(d * b );


    }

}
