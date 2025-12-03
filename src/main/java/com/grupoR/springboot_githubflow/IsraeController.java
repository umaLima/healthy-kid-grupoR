package com.grupoR.springboot_githubflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsraeController {

    @GetMapping("/ISRAE")
    public String Saludo() {
    	return "¡Hola, soy Israe de la rama israe! 🔥";

    }
}