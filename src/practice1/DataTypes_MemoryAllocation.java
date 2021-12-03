package practice1;

public class DataTypes_MemoryAllocation {
    public static void main(String[] args) {
        // byte - 8 bit memory
        byte number1 = -128;
        byte number2 = 127;

        //short - 16 bit
        short x = -32768;
        short y = 32767;

        //int - 32 bit
        int a = -2_147_483_648;
        int b = 2_147_483_647;

        //long - 64bit -l
        long e = 5678345408976567l;

        //float  - 32 bit// precession 7 bits// you have to force java by using "f" after thr number or typecasting by suffixed using "float"
        float c = 1.22332f;

        //double  - 64 bit, Hence Can handle much bigger fractional number than float// precession 15 bits
        // default data type for dealing with fractional number in java
        //
        double d = 1.22332d;//Its range is 4.9e-324 to 1.8e+308

        boolean s = true;

        // unicode char/ one single char
        char t = '\u0221';
        char ss = 'f';

        System.out.println(t);
        System.out.println(ss);

    }
}

