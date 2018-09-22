package com.amitabh.rest.services.restfulservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private static List<User> users = new ArrayList<>();
    private static Integer serCount = 7;
    
    static {
        users.add(new User(1, "Adam" , new Date()));
        users.add(new User(2, "Bryan" , new Date()));
        users.add(new User(3, "Chloe" , new Date()));
        users.add(new User(4, "David" , new Date()));
        users.add(new User(5, "Elf" , new Date()));
        users.add(new User(6, "Frank" , new Date()));
        users.add(new User(7, "Grand" , new Date()));
    }
    
    public List<User> findAll(){
        return users;
    }
    
    public User save(User user) {
        if(user.getId() == null) {
            user.setId(++serCount);
        }
        users.add(user);
        return user;
    }
    
    public User findOne(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
 
}
