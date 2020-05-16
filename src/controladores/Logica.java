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
}
