package ed23_ud02_junittarea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneradorIpTest {
    private final GeneradorIp generadorIp = new GeneradorIp();

    
    void testGenerarNumero() {
        for (int i = 0; i < 1000; i++) {
            int numeroGenerado = generadorIp.generarNumero(0, 254);
            Assertions.assertTrue(numeroGenerado >= 0 && numeroGenerado <= 254,
                "El número generado no está entre 0 y 254: " + numeroGenerado);
        }
    }

    
    void testGenerarIp() {
        for (int i = 0; i < 1000; i++) {
            String ipGenerada = generadorIp.generarIp();
            Assertions.assertNotEquals(ipGenerada.charAt(0), '0',
                "La IP generada comienza con 0: " + ipGenerada);
            Assertions.assertNotEquals(ipGenerada.charAt(ipGenerada.length() - 1), '0',
                "La IP generada termina con 0: " + ipGenerada);
        }
    }
}
