package com.apirest.spring.app_template_basic.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.spring.app_template_basic.models.entities.Users;
import com.apirest.spring.app_template_basic.services.interfaces.IUserService;

/**
 * @author rhidalgo
 *         Fecha : 22/06/2024
 *         {@inheritDoc} - http://localhost:8080/api/user
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        return new ResponseEntity<>(
                "test xD id ",
                headers, // or null
                HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> finAll() {
        List<?> genericModelList = new ArrayList<>();
        genericModelList = userService.getAll();
        return new ResponseEntity<>(genericModelList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {

        Users  users = userService.findById(id);

        return new ResponseEntity<Users>(
                users,
                null,
                HttpStatus.OK);
    }
}
