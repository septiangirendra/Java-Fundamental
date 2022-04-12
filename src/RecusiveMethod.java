public class RecusiveMethod {

    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecrusive(5));
        loop(10);

    }

    // factorial dengan perulangan biasa
    static int factorialLoop(int value){
        var result =1;
        for (var counter =1; counter<= value; counter++){
            result *= counter;
        }
        return result;
    }

    // dengan method recrusive
    static int factorialRecrusive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecrusive(value-1);
        }
    }

    // recrusive method
    static  void loop(int value){
        if (value == 0){
            System.out.println("selesai");
        } else {
            System.out.println("Loop "+value);
            loop(value -1);
        }
    }
}
