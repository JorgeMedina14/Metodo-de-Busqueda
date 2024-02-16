public class Metodo_De_Busqueda{
    public static void main(String[] args){
        int[] lista = {1, 2, 3, 4, 5, 6, 7};
        int posicionSecuencial = busquedaSecuencial(lista, 4);
        int posicionBinaria = busquedaBinaria(lista, 7);

        if (posicionSecuencial == -1) {
            System.out.println("Número no encontrado");
        } else {
            System.out.println("Número encontrado en la posición " + posicionSecuencial);
        }

        if (posicionBinaria == -1) {
            System.out.println("Número no encontrado");
        } else {
            System.out.println("Número encontrado en la posición " + posicionBinaria );
        }
    } 

    public static int busquedaSecuencial(int [] v, int buscado){
        boolean encontrado = false;
        int i = 0;
        while (i<= v.length-1 && !encontrado) {
            if(buscado==v[i]){
                encontrado = true;
            }else{
                i++;
            }
        }
        if (encontrado == true) {
            return i;
        }else{
            return -1;
        }
    }
    
    public static int busquedaBinaria(int[] v, int buscado){
        int bajo = 0;
        int alto = v.length-1;
        int central = -1;

        boolean encontrado = false;
        while (!encontrado && bajo<=alto) {
            central = (int)(bajo+alto)/2;
            if (buscado == v[central]) {
                encontrado = true;
            }else{
                if (buscado<v[central]) {
                    alto = central-1;
                }else{
                    bajo = central +1;
                }
            }
        }
        if (encontrado == true) {
            return central;
        }else{
            return -1;
        }
    }
}