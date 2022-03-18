public class Array {

    public static void main(String[] args) {


        // cara penulisan pertama
        String[] arrayString;
        arrayString = new String[3]; // panjangnya 3

        arrayString[0] = "Septian";
        arrayString[1] = "Girendra";
        arrayString[2] = "Wardhani";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // array di dalam array
        String[][] members = {
                {"Septian","Girendra"},
                {"Fajar","Eko"},
                {"Akai","Miya"}
        };

        System.out.println(members[2][1]);
        System.out.println(members[1][1]);

        // cara penulisan ke dua
        String[] namaNama = {
                "Septian", "Girendra"
        };

        int[] arrayInt = new int[]{
          1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        System.out.println(arrayInt[6]);

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong[2]);

        // Merubah isi array
        arrayLong[0] = 100;
        arrayLong[0] = 0;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

    }

}
