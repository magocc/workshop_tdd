package ar.com.ar.com.compumundohipermegared;

/**
 * Created by reuniones on 15/07/16.
 */
public class DecenasConverter implements iConverter {

    String [] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

    public String converter(int numero) {

        int aValor= numero%100/10;

        return decenas [aValor] ;
    }
}
