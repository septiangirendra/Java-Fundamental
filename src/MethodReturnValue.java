public class MethodReturnValue {

    public static void main(String[] args) {

        var result = sum(10,10);
        System.out.println("Luas segitia "+result);

        System.out.println(hitung(100,"luas",100));
        System.out.println(hitung(100,"keliling",100));
        System.out.println(hitung(100,"salah",100));

    }

    static double sum(int alas, int tinggi ){
        var luas = 0.5*alas*tinggi;
        return luas;
    }

    // method dengan cara lebih dari 1 variabel

    static double hitung(int alas, String operasi, int tinggi){
        switch (operasi){
            case "luas":
                return  0.5*alas*tinggi;
            case "keliling":{
                return alas+alas+alas;
            }
        }
        return 0;
    }
}
