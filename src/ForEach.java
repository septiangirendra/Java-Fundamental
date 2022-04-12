public class ForEach {

    public static void main(String[] args) {

        String[] name ={

                "Belajar","Java","dengan","pak","eko"
        };

        for (var i = 0; i<name.length; i++){
            System.out.println(name[i]);
        }

        // Cara Baru
        for (var names : name){
            System.out.println(names);
        }

    }
}
