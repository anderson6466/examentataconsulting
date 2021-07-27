package com.examentataconsulting.examen.logica;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.examentataconsulting.examen.request.requestdto;
@Service("caracterInterface")
@Transactional
public class caracteresopImplement  implements caracterInterface {

	@Override
	public boolean ingresarCaracter1(requestdto Requestdto) {
		
		boolean resultfinal=true;
		
	     	int  count=0;
	     	int contador2palabras=0;
	     	boolean result=true;
		
		
	     	String cadena = Requestdto.getCaracter();
	     	for (int i = 0; i < cadena.length(); i++){
	     	    char letra1 = cadena.charAt(i);
	     	 	if(count!=contador2palabras) {
	     	  		
		     	  	  resultfinal=false;
		     	  		break;
		     	  	}
	     	   contador2palabras=0;
	     	  	for (int j = 0; j < cadena.length(); j++){
		     	   
	     	  		
	     	  		char letra2 = cadena.charAt(j);
		     	    if(  letra2==letra1) {
		     	    contador2palabras=contador2palabras+1;
		     	    
		     	   
			     	     if(result) {
		     	    	
		     	    	count=count+1;
		     	    	
		     	    	}
		     	    	
		     	    }
		     	    else if(letra2!=letra1) {
		     	   	result=false;
		     	    	 continue;
		     	    	
		     	    	
		     	    }
		     	    
		     	    
		     	    
		     	    
		     	 
		     	}
		     	
	     	 
	     	  	
	     	  
	     	}
	     	
	     	System.out.print(resultfinal);
	return resultfinal;

	}

	@Override
	public boolean ingresarCaracter2(requestdto Requestdto) {
		
		
		
		boolean resultfinal=true;
		
     	int  count=0;
     	int contador2palabras=0;
     	boolean result=true;
	
	
     	String cadena = Requestdto.getCaracter();
     	for (int i = 0; i < cadena.length(); i++){
     	    char letra1 = cadena.charAt(i);
     	 	if(count!=contador2palabras) {
     	  		
     	 		
     	 		if(contador2palabras != count+1 && contador2palabras != count-1    )
     	 		{
     	 		  resultfinal=false;
	     	  		break;
     	 			
     	 		}	 
	     	  	
     	 	
     	 	
     	 	}
     	   contador2palabras=0;
     	  	for (int j = 0; j < cadena.length(); j++){
	     	   
     	  		
     	  		char letra2 = cadena.charAt(j);
	     	    if(  letra2==letra1) {
	     	    contador2palabras=contador2palabras+1;
	     	    
	     	   
		     	     if(result) {
	     	    	
	     	    	count=count+1;
	     	    	
	     	    	}
	     	    	
	     	    }
	     	    else if(letra2!=letra1) {
	     	   	result=false;
	     	    	 continue;
	     	    	
	     	    	
	     	    }
	     	    
	     	    
	     	    
	     	    
	     	 
	     	}
	     	
     	 
     	  	
     	  
     	}
     	
     	System.out.print(resultfinal);
return resultfinal;
		
		
		
	 
	}

 

 
	
	
	
	
}
