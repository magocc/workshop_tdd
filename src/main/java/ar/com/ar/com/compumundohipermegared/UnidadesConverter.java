package ar.com.ar.com.compumundohipermegared;

/**
 * Created by reuniones on 15/07/16.
 */
public class UnidadesConverter implements iConverter {

    String [] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

    public String converter(int numero) {

        int aValor= numero%10;

        return unidades [aValor] ;
    }
}
