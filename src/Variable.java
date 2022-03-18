public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Septian Girendra Wardhani";

        System.out.println(name);

        int age = 22;
        String address ="Indonesia";

        System.out.println(age);
        System.out.println(address);

        // penulisan variabel tanpa memberi type data
        var firtsName ="Septian";
        var middleName = "Girendra";
        var lastName = "Wardhani";
        var age1 = 22;

        System.out.println(firtsName+" "+middleName+" "+lastName+" age "+age1);

        //final == untuk memberi nilai variabel agar tidak bisa dirubah

        final String application ="Belajar Java";
        System.out.println(application);

    }
}
