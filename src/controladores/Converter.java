package controladores;

public class Converter {


    /**
     * Metodo para realizar conversiones de decimal a binario
     * @param num
     * @return
     */
    public static  String convertirDecimalBinario(String num){

        return Integer.toBinaryString(Integer.parseInt(num));
    }

    /**
     *De decimal a hexadecimal.
     * @param num
     * @return
     */
    public  static String convertirDecimalHexadecimal(String num){

        int dec=Integer.parseInt(num);

        return Integer.toHexString(dec);
    }


    /**
     *De binario a decimal.
     */

    public static  String convertirBinarioDecimal(String num){

        return String.valueOf(Integer.parseInt(num,2));
    }

    /**
     *
     * @param num
     * @return
     */
    public  static String convertirHexadecimalDecimal(String num){

        return String.valueOf(Integer.parseInt(num,16));
    }


    /**
     * Binario  a hexadecimal
     */

    public static String  convertirBinarioHexadecimal(String num){

        int decimal = Integer.parseInt(num,2);

        return  Integer.toString(decimal,16);

    }

    /**
     * Convertir de hexadecimal a binario
     * @param num
     * @return
     */
    public static  String convertirHexadecimalBinario(String num){

        int decimal = Integer.parseInt(num,16);

        return  Integer.toString(decimal,2);
    }



}
