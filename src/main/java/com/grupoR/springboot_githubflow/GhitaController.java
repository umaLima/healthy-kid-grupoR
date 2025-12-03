package com.grupoR.springboot_githubflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GhitaController {

    @GetMapping("/ghita")
    public String saludo() {
    	return "Hola, soy Ghita y he cambiado el texto!";

    }
}
