public class Scope {

    public static void main(String[] args) {

        sayHello("Seppo");

    }

    static void sayHello(String name){
        // String hello berada di dalam satu block method sayHello jadi bisa diakses
        String hello = "Hello "+ name;

        if (!name.isBlank()){
            String hi = "Hi "+ name;
            // hi bisa diakses di dalam if karena satu block program
            System.out.println(hi);
        }

    }
}
