package com.examentataconsulting.examen;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.examentataconsulting.examen.logica.caracterInterface;
import com.examentataconsulting.examen.request.requestdto;

@SpringBootTest
class ExamentataconsultingApplicationTests {

	
	 
	@Autowired
	private caracterInterface caracterinterface;
 
	public  requestdto requestdtos ;
	
	@Test
	void caracter1() {
		
		requestdtos = new requestdto();
		requestdtos.setCaracter("tererere");
;
		assertNotNull(	caracterinterface.ingresarCaracter1(requestdtos));
	}
	
	@Test
	void caracter2() {
		
		requestdtos = new requestdto();
		requestdtos.setCaracter("tererere");
		caracterinterface.ingresarCaracter2(requestdtos);
		
	}
	
	
	

}
