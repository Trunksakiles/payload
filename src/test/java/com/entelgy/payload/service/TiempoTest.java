package com.entelgy.payload.service;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TiempoTest {
    private Tiempo tiempo = new Tiempo();

    @Test
    public void obtenerFormatoFecha() throws ParseException {
        String fechainput = "2022-06-02T11:47:00-0500";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        Date date = formatter.parse(fechainput);
        String fechaResult = tiempo.obtenerFormatoFecha(date);

        assertNotNull(fechaResult);
        assertEquals(fechainput, fechaResult);
    }


}