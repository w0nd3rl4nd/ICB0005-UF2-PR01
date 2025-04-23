package com.icb0005.uf2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
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
        Vehiculo v = new Vehiculo("Toyota", "Yaris", 180, "Gasolina");
        v.acelerar(100);
        v.parar();
        assertEquals(0, v.getVelocidadActual());
    }

    @Test
    void testAcelerarNormal() {
        Vehiculo v = new Vehiculo("Toyota", "Yaris", 180, "Gasolina");
        v.acelerar(50);
        assertEquals(50, v.getVelocidadActual());
    }

    @Test
    void testAcelerarSuperaMax() {
        Vehiculo v = new Vehiculo("Toyota", "Yaris", 180, "Gasolina");
        v.acelerar(300);
        assertEquals(180, v.getVelocidadActual());
    }

    @Test
    void testEsDeportivoTrue() {
        Vehiculo v = new Vehiculo("Ferrari", "488", 320, "Gasolina");
        assertTrue(v.esDeportivo());
    }

    @Test
    void testEsDeportivoFalse() {
        Vehiculo v = new Vehiculo("Toyota", "Yaris", 180, "Gasolina");
        assertFalse(v.esDeportivo());
    }

}
