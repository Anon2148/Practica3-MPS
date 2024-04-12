package org.mps.ronqi2;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ronQI2SilverTest {


    @Mock
    List<Float> lecturasP = mock(List.class);

    @Mock
    List<Float> lecturasS = mock(List.class);


    @InjectMocks
    RonQI2Silver ronQI2SilverInjectMock = new RonQI2Silver();

    @Test
    public void obtenerNuevaLectura_add_call_for_lecturasP_test(){


        ronQI2SilverInjectMock.obtenerNuevaLectura();
        verify(lecturasP, times(1)).add(0.0f);
    }


    @Test
    public void obtenerNuevaLectura_add_call_for_lecturasS_test(){


        ronQI2SilverInjectMock.obtenerNuevaLectura();
        verify(lecturasS, times(1)).add(0.0f);

    }

    @Test
    public void obtenerNuevaLectura_remove_call_for_lecturasP_test(){


        when(lecturasP.size()).thenReturn(10);
        ronQI2SilverInjectMock.obtenerNuevaLectura();
        verify(lecturasP, times(1)).remove(0);
    }

    @Test
    public void obtenerNuevaLectura_remove_call_for_lecturasS_test(){


        when(lecturasS.size()).thenReturn(10);
        ronQI2SilverInjectMock.obtenerNuevaLectura();
        verify(lecturasS, times(1)).remove(0);
    }
    /*
     * Analiza con los caminos base qué pruebas se han de realizar para comprobar que al inicializar funciona como debe ser.
     * El funcionamiento correcto es que si es posible conectar ambos sensores y configurarlos,
     * el método inicializar de ronQI2 o sus subclases,
     * debería devolver true. En cualquier otro caso false. Se deja programado un ejemplo.
     */

    /*
     * Un inicializar debe configurar ambos sensores, comprueba que cuando se inicializa de forma correcta (el conectar es true),
     * se llama una sola vez al configurar de cada sensor.
     */

    /*
     * Un reconectar, comprueba si el dispositivo desconectado, en ese caso, conecta ambos y devuelve true si ambos han sido conectados.
     * Genera las pruebas que estimes oportunas para comprobar su correcto funcionamiento.
     * Centrate en probar si todo va bien, o si no, y si se llama a los métodos que deben ser llamados.
     */
    
    /*
     * El método evaluarApneaSuenyo, evalua las últimas 5 lecturas realizadas con obtenerNuevaLectura(), 
     * y si ambos sensores superan o son iguales a sus umbrales, que son thresholdP = 20.0f y thresholdS = 30.0f;, 
     * se considera que hay una apnea en proceso. Si hay menos de 5 lecturas también debería realizar la media.
     * /
     
     /* Realiza un primer test para ver que funciona bien independientemente del número de lecturas.
     * Usa el ParameterizedTest para realizar un número de lecturas previas a calcular si hay apnea o no (por ejemplo 4, 5 y 10 lecturas).
     * https://junit.org/junit5/docs/current/user-guide/index.html#writing-tests-parameterized-tests
     */
}
