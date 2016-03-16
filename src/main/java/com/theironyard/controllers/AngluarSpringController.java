package com.theironyard.controllers;


import com.theironyard.entities.User;
import com.theironyard.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by ericweidman on 3/16/16.
 */
@RestController
public class AngluarSpringController {
    @Autowired
    UserRepository users;

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public List<User> getUsers(){
        return (List<User>) users.findAll();
    }

}
