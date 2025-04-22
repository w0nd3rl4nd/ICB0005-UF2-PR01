package com.icb0005.uf2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    void testFrenarNormal() {
        Vehiculo v = new Vehiculo("Toyota", "Yaris", 180, "Gasolina");
        v.acelerar(50);
        v.frenar(20);
        assertEquals(30, v.getVelocidadActual());
    }

    @Test
    void testFrenarBajoCero() {
        Vehiculo v = new Vehiculo("Toyota", "Yaris", 180, "Gasolina");
        v.acelerar(30);
        v.frenar(50);
        assertEquals(0, v.getVelocidadActual());
    }

    @Test
    void testParar() {
        Vehiculo v = new Vehiculo("Ford", "Focus", 180, "Diesel");
        v.acelerar(100);
        v.parar();
        assertEquals(0, v.getVelocidadActual());
    }
}
