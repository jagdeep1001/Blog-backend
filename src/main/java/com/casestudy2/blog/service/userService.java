package com.casestudy2.blog.service;

import com.casestudy2.blog.model.users;
import com.casestudy2.blog.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class userService {
    @Autowired
 userRepository UserRepository;
 public users addUser(users user){return UserRepository.save(user); }
 public Long getUserId(Principal principal){
     String email =principal.getName();
     return UserRepository.findByEmail(email).getUserId();
 }
public users callUser(Principal principal)
{
    return UserRepository.findByEmail(principal.getName());
}
public users changeUserDetails(users user)
{
    users olduser = UserRepository.findByUserId(user.getUserId());
    olduser.setUserId(user.getUserId());
    olduser.setEmail(user.getEmail());
    olduser.setUsername(user.getUsername());
    olduser.setPassword(user.getPassword());
    olduser.setMobile(user.getMobile());
    olduser.setGender(user.getGender());
    UserRepository.saveAndFlush(olduser);
    return olduser;
}
 public users getOneUser(Long id)
    {
    return UserRepository.findByUserId(id);
    }
}
