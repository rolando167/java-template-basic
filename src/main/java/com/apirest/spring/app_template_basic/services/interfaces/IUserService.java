package com.apirest.spring.app_template_basic.services.interfaces;

import java.util.List;

import com.apirest.spring.app_template_basic.models.dto.UserDto;
import com.apirest.spring.app_template_basic.models.entities.Users;

/*
 * Interfaz IUserService
 * Date:20/06/2026
*/
public interface IUserService {
    public List<Users> getAll();

    public Users findById(Integer id);

    public Users save(UserDto user);
    public Users update(UserDto user, Integer id);

    public void delete(Users user);
    public boolean existsById(Integer id);
}
