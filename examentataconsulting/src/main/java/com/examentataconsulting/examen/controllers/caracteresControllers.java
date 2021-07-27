package com.examentataconsulting.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
import com.examentataconsulting.examen.logica.caracterInterface;
import com.examentataconsulting.examen.request.requestdto;
 

@RestController
@RequestMapping("/caracteres")
public class caracteresControllers {

	@Autowired
	private caracterInterface caracterinterface;
	
	

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/caracteres1", method=RequestMethod.POST)
	public boolean caracteres1(@RequestBody requestdto Requestdto){
	   
		
		
		
	    return caracterinterface.ingresarCaracter1(Requestdto);
	}
	

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/caracteres2", method=RequestMethod.POST)
	public boolean caracteres2(@RequestBody requestdto Requestdto){
	   
		
		
		
	    return caracterinterface.ingresarCaracter2(Requestdto);
	}
	
	
}
