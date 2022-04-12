public class MethodOverloading {

    public static void main(String[] args) {

        // Method overloading dapat memanggil dirinya sendiri tetapi harus beda parameter
        sayHello();
        sayHello("Seppo");
        sayHello("Seppo","dani");

    }

    static  void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello "+name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }
}
