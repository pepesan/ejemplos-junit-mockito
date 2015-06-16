package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by pepesan on 10/6/15.
 */
public class TestCliente {

    public Cliente c;

    @Before
    public void setUp(){
        c=new Cliente();
    }

    @Test
    public void testNoEsNull(){
        //assertNotNull(c);
        assertThat(c,notNullValue());
    }

    @Test
    public void testConstructorWithoutParameters(){
        Cliente cliente=new Cliente();
        assertThat(cliente.getNombre(),is(""));
        assertThat(cliente.getApellidos(),is(""));
        assertThat(cliente.getDni(),is(""));
        assertThat(cliente.getEmail(),is(""));
        assertThat(cliente.getFechaNac(),notNullValue());

    }

    @Test
    public void testConstructorWithParameters(){
        Date fecha=new Date();
        Cliente cliente=new Cliente("Nombre",
                "Apellidos","07899543A","p@p.com",fecha);
        assertThat(cliente.getNombre(),is("Nombre"));
        assertThat(cliente.getApellidos(),is("Apellidos"));
        assertThat(cliente.getDni(),is("07899543A"));
        assertThat(cliente.getEmail(),is("p@p.com"));
        assertThat(cliente.getFechaNac(),sameInstance(fecha));

    }
    @Test
    public void testSetterAndGetterNombre(){
        String nombre="Nombre";
        c.setNombre(nombre);
        assertThat(nombre,is(c.getNombre()));
    }
    @Test
    public void testSetterAndGetterApellidos(){
        String apellidos="8 Vascos";
        c.setApellidos(apellidos);
        assertThat(apellidos,is(c.getApellidos()));
    }
    @Test
    public void testSetterAndGetterDni(){
        String dni="0879887652A";
        c.setDni(dni);
        assertThat(dni,is(c.getDni()));
    }
    @Test
    public void testSetterAndGetterEmail(){
        String email="p@p.com";
        c.setEmail(email);
        assertThat(email,is(c.getEmail()));
    }
    @Test
    public void testSetterAndGetterFechaNac(){
        Date fecha=new Date();
        c.setFechaNac(fecha);
        assertThat(fecha,is(c.getFechaNac()));
    }


}
