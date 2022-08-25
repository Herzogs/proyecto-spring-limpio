package ar.edu.unlam.tallerweb1.delivery;


import java.util.List;

public class CalculadoraDeCadena {

    public Long sumar(String cadena) throws RuntimeException{
        if(!cadena.equals("")){
            Long n = 0L;
            List<String> num = List.of(cadena.split(","));
            for (String c:num) {
                n += Long.parseLong(c);
            }
            return n;
        }
        throw new RuntimeException();
    }
}
