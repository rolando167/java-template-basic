package com.apirest.spring.app_template_basic.services.implem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apirest.spring.app_template_basic.models.dto.UserDto;
import com.apirest.spring.app_template_basic.models.entities.Users;
import com.apirest.spring.app_template_basic.services.interfaces.IUserService;

@SuppressWarnings("null")
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<Users> getAll() {
        return getUsers();
    }

    @Override
    public Users findById(Integer id) {
        List<Users> lista = getUsers();
        Users usuario = null;
        for(Users user: lista){
            if(user.getId() == id){
                usuario = user;
                break;
            }
        }
        return usuario;
    }

    // @Transactional
    @Override
    public Users save(UserDto userDTO) {
        Users users = Users.builder()
            //.id(null) - depende generado DB
            .name(userDTO.getName())
            .lastname(userDTO.getName())
            .height(userDTO.getHeight())
            .date_register(new java.util.Date())
            .build();
        // save logic ...

        return users;
    }

    @Override
    public Users update(UserDto userDTO, Integer id) {
        Users users = null;
        if(existsById(id)){
            users = Users.builder()
                //.id(id)
                .name(userDTO.getName())
                .lastname(userDTO.getName())
                .height(userDTO.getHeight())
                .date_update(new java.util.Date())
                .build();
            // Update logic ...
        }

        return users;
    }

    @Override
    public void delete(Integer id) {
        List<Users> lista = getUsers();
        for(Users user: lista){
            if(user.getId() == id){
                //... Logica eliminar - directo o repository
                break;
            }
        }
    }

    @Override
    public boolean existsById(Integer id) {
        List<Users> lista = getUsers();
        boolean exists = false;
        for(Users user: lista){
            if(user.getId() == id){
                exists = true;
                break;
            }
        }
        return exists;
    }

    private List<Users> getUsers(){
        Users user1 = new Users();
        user1.setId(1);
        user1.setName("Luis");
        user1.setLastname("Martinez");
        user1.setHeight(1.75);
        user1.setDate_register(new java.util.Date());

        Users user2 = new Users();
        user2.setId(2);
        user2.setName("Lola");
        user2.setLastname("Toyota");
        user2.setHeight(1.64);
        user2.setDate_register(new java.util.Date());

        List<Users> lista = new ArrayList<Users>();
        lista.add(user1);
        lista.add(user2);
        return lista ;
    }

}