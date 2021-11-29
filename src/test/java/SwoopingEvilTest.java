import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Main.java.SwoopingEvil;

public class SwoopingEvilTest {

	SwoopingEvil sCase; 
	
	@Before
	public void before() {
		sCase = new  SwoopingEvil("Volador", "Newt Jr", "bosques", null);
	}

	@Test
	public void getType() {
		assertEquals("Volador", sCase.getType());
	}

	@Test
	public void setType() {
		sCase.setType("Flying");
		
		assertEquals("Flying", sCase.getType()); 
	}
	
	
	//Test de la propiedad Name
	@Test
	public void getName() {
		assertEquals("Newt Jr", sCase.getName());
	}
	
	@Test
	public void setName() {
		sCase.setName("Lily");
		
		assertEquals("Lily", sCase.getName());
	}
	
	
	//Test de la propiedad habitat
	public void TestgetHabitat() {
		assertEquals("bosques", sCase.getHabitat());
	}
	
	public void TestsetHabitat() {
		sCase.setHabitat("Torre de Astronomia");
		assertEquals("Torre de Astronomia", sCase.getHabitat());
	}
	
	
	//Test de la propiedad feetQuantities
	@Test
	public void getFeetQuantities() {
		assertNull(sCase.getFeetQuantities()); 
	}
	
	@Test
	public void setFeetQuantities() {
		sCase.setFeetQuantities(1);
		
		assertSame(1, sCase.getFeetQuantities()); 

	}
	
	
	//Testeamos el metodo sound
	@Test
	public void sound() {
		assertEquals("Emite un sonido etereo", sCase.sound()); 
	}
	
	
	//Testeamos el metodo health
	@Test
	public void health() {
		assertTrue(sCase.health());
	}
	
	
	//Testemos el metodo kill
	@Test
	public void kill() {
		assertTrue(sCase.kill());
	}
	
	
	//Testeanis el metodo appear
	@Test
	public void appear() {
		assertFalse(sCase.appear());
	}
	
	
	//Testeamos el metodo velocity
	@Test
	public void velocity(){ 
		assertEquals("Volador de gran velocidad y resistencia", sCase.velocity());
	}
	
	
	@Test
	public void TesttoString() {
		assertEquals("{ type='Volador', name='Newt Jr', habitat='bosques', feetQuantities='null'}", sCase.toString());
	}
}
