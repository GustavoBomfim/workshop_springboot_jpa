package com.project.code1.services;

import com.project.code1.entities.User;
import com.project.code1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
    public User insert(User obj){
        return repository.save(obj);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
}
