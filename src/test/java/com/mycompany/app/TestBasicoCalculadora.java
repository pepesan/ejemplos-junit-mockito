package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by pepesan on 10/6/15.
 */
public class TestBasicoCalculadora {
    public Calculadora c;
    @Before
    public void setUp(){
        c= new Calculadora();
    }

    @Test
    public void nombreTest(){
        int i=c.suma(2,3);
        assertEquals(5,i);
        //System.out.println("Hola Mundo Junit");
    }

    @Test
    public void multiSix(){
        int i=c.multi(2,3);
        assertEquals(6,i);
    }
    @Test
    public void multiFour(){
        int i=c.multi(2,2);
        assertEquals(4,i);
    }

}
