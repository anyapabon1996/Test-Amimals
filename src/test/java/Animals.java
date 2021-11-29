import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Main.java.Fenix;

public class Animals {

	Fenix animalPrube;

	@Before
	public void befor() {
		animalPrube = new Fenix("Volador", "Fawks", "Llanuras altas", 2);
	} 

	//Test de la propiedad Type
	@Test
	public void getType() {
		assertEquals("Volador", animalPrube.getType());
	}

	@Test
	public void setType() {
		animalPrube.setType("Flying");
		
		assertEquals("Flying", animalPrube.getType()); 
	}
	
	
	//Test de la propiedad Name
	@Test
	public void getName() {
		assertEquals("Fawks", animalPrube.getName());
	}
	
	@Test
	public void setName() {
		animalPrube.setName("Lily");
		
		assertEquals("Lily", animalPrube.getName());
	} 
	
	
	//Test de la propiedad habitat
	public void TestgetHabitat() {
		assertEquals("Llanuras altas", animalPrube.getHabitat());
	}
	
	public void TestsetHabitat() {
		animalPrube.setHabitat("Campanario"); 
		
		assertEquals("Campanario", animalPrube.getHabitat());
	}   
	
	//Test de la propiedad feetQuantities
	@Test
	public void getFeetQuantities() {
		assertSame(2, animalPrube.getFeetQuantities()); 
	}
	
	@Test
	public void setFeetQuantities() {
		animalPrube.setFeetQuantities(1);
		
		assertSame(1, animalPrube.getFeetQuantities()); 
	}
	
	
	//Testeamos el metodo sound
	@Test
	public void sound() {
		assertEquals("Se caracteriza por su canto, capaz de entenderse como una expresión emocionaque brota desde el interior de la persona. Solo se conoce una pieza de su canto, captada después de la muerte de Dumbledore. Visitar: https://www.youtube.com/watch?v=akxeqLr7A0M", animalPrube.sound()); 
	} 
	
	
	//Testeamos el metodo health
	@Test
	public void health() {
		assertTrue(animalPrube.health());
	}
	
	
	//Testemos el metodo kill
	@Test
	public void kill() {
		assertFalse(animalPrube.kill());
	}
	
	
	//Testeanis el metodo appear
	@Test
	public void appear() {
		assertTrue(animalPrube.appear());
	}
	
	
	//Testeamos el metodo velocity
	@Test
	public void velocity(){
		assertEquals("Altamente veloz", animalPrube.velocity());
	} 
	
	
	@Test
	public void TesttoString() {
		assertEquals("{ type='Volador', name='Fawks', habitat='Llanuras altas', feetQuantities='2'}", animalPrube.toString());
	}
	
	
}
	

