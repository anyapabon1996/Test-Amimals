import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Main.java.Basilisco;

public class BasiliscoTest {
	
	Basilisco bCase; 
	
	@Before
	public void before() {
		bCase = new  Basilisco("Reptil", "Basilisco", "Lugares humedos y espaciosos", 0);
	}

	@Test
	public void getType() {
		assertEquals("Reptil", bCase.getType());
	}

	@Test
	public void setType() {
		bCase.setType("Flying");
		
		assertEquals("Flying", bCase.getType()); 
	}
	
	
	//Test de la propiedad Name
	@Test
	public void getName() {
		assertEquals("Basilisco", bCase.getName());
	}
	
	@Test
	public void setName() {
		bCase.setName("Lily");
		
		assertEquals("Lily", bCase.getName());
	}
	 
	
	//Test de la propiedad habitat
	public void TestgetHabitat() {
		assertEquals("Lugares humedos y espaciosos", bCase.getHabitat());
	}
	
	public void TestsetHabitat() {
		bCase.setHabitat("Torre de Astronomia");
		assertEquals("Torre de Astronomia", bCase.getHabitat());
	}
	
	
	//Test de la propiedad feetQuantities
	@Test
	public void getFeetQuantities() {
		assertSame(0, bCase.getFeetQuantities()); 
	}
	
	@Test
	public void setFeetQuantities() {
		bCase.setFeetQuantities(1);
		
		assertSame(1, bCase.getFeetQuantities()); 

	}
	
	
	//Testeamos el metodo sound
	@Test
	public void sound() {
		assertEquals("El Basilisco emite dos clases de sonidos: uno siseante, caracteristico de las serpientes, y un rugido ensordecedor, propio de su estado furico.", bCase.sound()); 
	}
	
	
	//Testeamos el metodo health
	@Test
	public void health() {
		assertFalse(bCase.health());
	}
	
	
	//Testemos el metodo kill
	@Test
	public void kill() {
		assertTrue(bCase.kill());
	}
	
	
	//Testeanis el metodo appear
	@Test
	public void appear() {
		assertFalse(bCase.appear());
	}
	
	
	//Testeamos el metodo velocity
	@Test
	public void velocity(){
		assertEquals("Debido a su inmensidad, su velocidad se ve reducida", bCase.velocity());
	}
	
	
	@Test
	public void TesttoString() {    
		assertEquals("{ type='Reptil', name='Basilisco', habitat='Lugares humedos y espaciosos', feetQuantities='0'}", bCase.toString());
	} 
}
