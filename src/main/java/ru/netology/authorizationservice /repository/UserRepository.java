package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.model.Authorities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password){

        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("administrator") && password.equals("123456")){
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("dispatcher") && password.equals("09876")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        }else if (user.equals("user") && password.equals("111")){
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
