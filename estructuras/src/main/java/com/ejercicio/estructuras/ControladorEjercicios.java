package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero) {
		String ret = "";
		
		if (numero % 2 == 0) {
			ret += numero + " es par";
		} else {
			ret += numero + " es impar"; 
		}
		
		return "<h1>" + ret + "</h1>";
	}
	
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numero) {
	    String ret = "";
	    ret += "<table border=1>";
	    
	    for (int i = 1; i <= 10; i++) {
	        ret += "<tr>";
	        ret += "<td>" + numero + " x " + i + "</td>";
	        ret += "<td>" + (numero * i) + "</td>";
	        ret += "</tr>";
	    }
	    
	    ret += "</table>";

	    return ret;
	}

}
