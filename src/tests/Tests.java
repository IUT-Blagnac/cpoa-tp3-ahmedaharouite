import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

import main.*;

public class Tests {
	
	@Test
	public void testGetNomPizzaBrestFromage() {	
		Pizzeria pizzeriaBrest = new PizzeriaBrest();
		Pizza PF = pizzeriaBrest.commanderPizza("fromage");
		
		assertEquals("Pizza sauce style brest et fromage", PF.getNom()); 
	}
	
	@Test
	public void testGetNomPizzaBrestGrecque() {	
		Pizzeria pizzeriaBrest = new PizzeriaBrest();
		Pizza PG = pizzeriaBrest.commanderPizza("grecque");
		
		assertEquals("Pizza grecque style brest", PG.getNom());
	}
	
	@Test
	public void testGetNomPizzaBrestPoivrons() {	
		Pizzeria pizzeriaBrest = new PizzeriaBrest();
		Pizza PP = pizzeriaBrest.commanderPizza("poivrons");
		
		assertEquals("Pizza poivrons style brest", PP.getNom()); 
	}
	
	
	@Test
	public void testGetNomPizzaStrasbourgFromage() {	
		Pizzeria pizzeriaStrasbourg = new PizzeriaStrasbourg();
		Pizza PF = pizzeriaStrasbourg.commanderPizza("fromage");
		
		assertEquals("Pizza pâte style Strasbourg et fromage", PF.getNom()); 
	}
	
	@Test
	public void testGetNomPizzaStrasbourgGrecque() {	
		Pizzeria pizzeriaStrasbourg = new PizzeriaStrasbourg();
		Pizza PG = pizzeriaStrasbourg.commanderPizza("grecque");
		
		assertEquals("Pizza grecque style Strasbourg", PG.getNom());
	}
	
	@Test
	public void testGetNomPizzaStrasbourgPoivrons() {	
		Pizzeria pizzeriaStrasbourg = new PizzeriaStrasbourg();
		Pizza PP = pizzeriaStrasbourg.commanderPizza("poivrons");
		
		assertEquals("Pizza poivrons style Strasbourg", PP.getNom()); 
	}
	
	@Test
    public void testFabriqueDePizzerias() {
		FabriqueDePizzerias FP;
        Pizzeria PB;

        FP = new FabriqueDePizzerias();
        PB = FP.creer("Brest");
        assertFalse(PB==null);
    }
}
