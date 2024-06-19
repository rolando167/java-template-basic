package com.apirest.spring.app_template_basic.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/inicio")
    public String inicio() {
        System.out.println("En ruta :D");
        int numero = numero();
        return "Hola :D  " + numero;
    }

    private int numero() {
        return 49;
    }
}
