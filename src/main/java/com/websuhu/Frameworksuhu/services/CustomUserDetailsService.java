/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websuhu.Frameworksuhu.services;

/**
 *
 * @author YOGA
 */
import com.websuhu.Frameworksuhu.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.websuhu.Frameworksuhu.entities.User;
 

public class CustomUserDetailsService  {
 
    @Autowired
    private UserRepository userRepo;
     
    
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepo.findByEmail(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new CustomUserDetails(user);
//    }
 
}
