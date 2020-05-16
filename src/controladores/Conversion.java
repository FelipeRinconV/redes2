package controladores;


class Conversor {

    /**
     * Metodo para realizar conversiones de decimal a binario
     * @param num
     * @return
     */
    private  String convertirDecimalBinario(String num){

        return Integer.toBinaryString(Integer.parseInt(num));
    }

    /**
     *
     * @param num
     * @return
     */
    private String convertirDecimalHexadecimal(String num){

        return Integer.toHexString(Integer.parseInt(num));
    }

    





}


