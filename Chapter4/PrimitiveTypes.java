package Chapter4;

public class PrimitiveTypes {

    public static void main (String [] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
        types.checkOtherTypes();
        types.checkChar();
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("MIn =" + byteMin);
        System.out.println("Max =" + byteMax);

        byteMin = (byte) (byteMin - 1);
        byteMax = (byte) (byteMax + 1);
        System.out.println("byteMin -1 =" + byteMin);
        System.out.println("byteMax +1 =" + byteMax);


    }


    public void checkOtherTypes (){
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println("shortMax =" + shortMax);
        System.out.println("intMax =" + intMax);
        System.out.println("longMax =" + longMax);



        shortMax = (byte) (shortMax - 1);
        intMax = (byte) (intMax + 1);
        longMax = (byte) (longMax + 1);
        System.out.println("shortMax -1 =" + shortMax);
        System.out.println("intMax +1 =" + intMax);
        System.out.println("longMax +1 =" + longMax);


    }

    public void checkChar () {
        char charMinx = '\u0009';
        char charMax = '\uffff';
        System.out.println("charMin=" + charMinx);
        System.out.println("charMax=" + charMax);

        int intValue = 'a';
        System.out.println("intValue =["+intValue+"]");
    }
}
