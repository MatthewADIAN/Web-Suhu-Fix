/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websuhu.Frameworksuhu.controllers;

import com.websuhu.Frameworksuhu.services.RegisterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author YOGA
 */
@Controller
@RequestMapping("register")
public class RegisterController {
    
    @Autowired
    RegisterServices registerService;
    
}
