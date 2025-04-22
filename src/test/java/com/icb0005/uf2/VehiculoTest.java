package com.icb0005.uf2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VehiculoTest {

    @Test
    public void testAcelerarNormal() {
        Vehiculo vehiculo = new Vehiculo("Marca", "Modelo", 200, "Gasolina");
        vehiculo.acelerar(20);
        assertEquals(20, vehiculo.getVelocidadActual());
    }

    @Test
    public void testAcelerarSuperaMax() {
        Vehiculo vehiculo = new Vehiculo("Marca", "Modelo", 200, "Gasolina");
        vehiculo.acelerar(300);
        assertEquals(200, vehiculo.getVelocidadActual());  // Verificar que no supere la velocidad máxima
    }
}

	


