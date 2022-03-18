public class TipeDataBukanPrimitif {

    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // Konversi Primitif ke Bukan primitif
        int iniInt = 100;

        Integer iniInteger2 = iniInt;

        // Koversi dari tipeData bukan primitif (int) to (short)
        int iniInt2 = 200;
        Integer iniObject = iniInt2;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);


    }
}
