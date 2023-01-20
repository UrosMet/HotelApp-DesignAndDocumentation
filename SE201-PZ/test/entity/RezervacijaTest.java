/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import exception.CenaException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Uros
 */
public class RezervacijaTest {
    
    public RezervacijaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of dodajNaCenu method, of class Rezervacija.
     */
    @Test
    public void testDodajNaCenu() throws CenaException {
        System.out.println("dodajNaCenu");
        Rezervacija instance = new Rezervacija();
        instance.setUkupnaCena(50);
        double expResult = 100.0;
        double result = instance.dodajNaCenu(50);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of dodajNaCenu method, of class Rezervacija.
     */
    @Test
    public void testDodajNaCenu2() throws CenaException {
        System.out.println("dodajNaCenu");
        Rezervacija instance = new Rezervacija();
        instance.setUkupnaCena(50);
        double expResult = 110.0;
        double result = instance.dodajNaCenu(50);
        assertNotEquals(expResult, result, 0.0);
        
    }
    /**
     * Test of dodajNaCenu method, of class Rezervacija.
     */
    @Test(expected = CenaException.class)
    public void testDodajNaCenu3() throws CenaException {
        System.out.println("dodajNaCenu");
        Rezervacija instance = new Rezervacija();
        instance.setUkupnaCena(50);
        double expResult = 100.0;
        double result = instance.dodajNaCenu(0);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
