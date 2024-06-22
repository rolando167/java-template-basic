package com.apirest.spring.app_template_basic.services.implem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apirest.spring.app_template_basic.models.dto.UserDto;
import com.apirest.spring.app_template_basic.models.entities.Users;
import com.apirest.spring.app_template_basic.services.interfaces.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<Users> getAll() {

        Users user1 = new Users();
        user1.setId(1);
        user1.setName("Luis");
        user1.setLastname("Martinez");
        user1.setDate_register(new java.util.Date());

        Users user2 = new Users();
        user1.setId(2);
        user1.setName("Lola");
        user1.setLastname("Toyota");
        user1.setDate_register(new java.util.Date());

        List<Users> lista = new ArrayList<Users>();
        lista.add(user1);
        lista.add(user2);


        return lista ;
    }

    @Override
    public Users findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Users save(UserDto user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Users update(UserDto user, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Users user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public boolean existsById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

}
