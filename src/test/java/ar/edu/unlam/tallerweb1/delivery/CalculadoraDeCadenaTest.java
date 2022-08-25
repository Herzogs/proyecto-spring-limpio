package ar.edu.unlam.tallerweb1.delivery;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculadoraDeCadenaTest {


    @Test(expected = RuntimeException.class)
    public void DebeLanzarUnaExceptionSiRecibeUnaCadenaVacia(){

        //Preparacion
        CalculadoraDeCadena calc = DadoQueTenemosUnaCalculadora();

        //Ejecucion
        Long resultado = CuandoRealizamosLaOperacion(calc,"");
        //Validacion

    }

    @Test
    public void DebeDevolver4SiRecibe2Y2(){
        CalculadoraDeCadena calc = DadoQueTenemosUnaCalculadora();
        Long resultado = CuandoRealizamosLaOperacion(calc,"2,2");
        EntoncesReciboElResultado(resultado,4L);

    }

    @Test
    public void DebeDevolver6SiRecibe3y3(){
        CalculadoraDeCadena calc = DadoQueTenemosUnaCalculadora();
        Long resultado = CuandoRealizamosLaOperacion(calc,"3,3");
        EntoncesReciboElResultado(resultado,6L);
    }

    private void EntoncesReciboElResultado(Long resultado, Long i) {
        assertThat(resultado).isEqualTo(i);
    }

    private Long CuandoRealizamosLaOperacion(CalculadoraDeCadena calc, String t) {
        return calc.sumar(t);
    }

    private CalculadoraDeCadena DadoQueTenemosUnaCalculadora() {
        return new CalculadoraDeCadena();
    }

}