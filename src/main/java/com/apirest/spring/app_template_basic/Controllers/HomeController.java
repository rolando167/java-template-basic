package com.apirest.spring.app_template_basic.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.spring.app_template_basic.services.IHomeService;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private IHomeService iHomeService;

    @GetMapping("/inicio")
    public String inicio() {
        System.out.println("En ruta :D");
        int numero = numero();
        return "Hola :D  " + numero;
    }

    private int numero() {
        return 49;
    }

    @GetMapping("/ordenar")
    public ResponseEntity<?> getSortNumber(@RequestBody Map<?,Object> param) {

        Object datos = param.get("datos");
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("entrada", datos);
        response.put("salida", iHomeService.ordenarBurbuja(datos));
        return new ResponseEntity<>(response , HttpStatus.OK);
    }
}
