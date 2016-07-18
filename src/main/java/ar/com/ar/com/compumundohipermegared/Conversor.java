
package ar.com.ar.com.compumundohipermegared;


import java.util.List;

public class Conversor {

    List<iConverter> listaConverters;

    public Conversor(List<iConverter> lista){
        listaConverters = lista;
    }

    public String convertir(int numero) {
       String res ="";
        for (iConverter c: listaConverters) {
            res+= c.converter(numero);
        }
        return res;
    }




}
