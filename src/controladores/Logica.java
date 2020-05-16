package controladores;

public class Logica {

    /**
     * Metodo que recibe la cantidad de bits de la mascara de red y retorna
     * la mascara de red en binario
     * @param mascaraRed
     * @return mascaraEnBinaraio que es un string con la mascara de red en binario
     */
    public static String calcularMascaraSubred(String mascaraRed){

        String mascaraEnBinario = "";
        int cantidadBits = Integer.parseInt(mascaraRed);

        for(int i = 0; i<=32;i++){

            if(i<=cantidadBits){
                mascaraEnBinario= mascaraEnBinario + "1";
            }else{
                mascaraEnBinario=mascaraEnBinario + "0" ;
            }
        }
        return mascaraEnBinario;
    }

    /**
     * Metodo que recibe la cantidad de bits en 1 de la mascara de red
     * y retorna el numero de bits usados para los host
     *
     * @param mascaraRed
     * @return numeroBitsHost que es un String con el numero de bits usador por el host en la red
     */
    public static String calcularBitsHost(String mascaraRed){

        int bitsMascaraRed = 32 - Integer.parseInt(mascaraRed);

        String numeroBitsHost = String.valueOf(bitsMascaraRed);

        return numeroBitsHost;
    }

    public static String calcularDireccionesParaAsignar(String numeroDeBits){

        String DireccionesParaAsignar = "";

        int numeroBits = Integer.parseInt(numeroDeBits);

        int numeroDirecciones = (int) Math.pow(2,numeroBits);



        return null;
    }
}
