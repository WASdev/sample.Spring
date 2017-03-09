/*
 * COPYRIGHT LICENSE: This information contains sample code provided in source code form.
 * You may copy, modify, and distribute these sample programs in any form without payment
 * to IBM for the purposes of developing, using, marketing or distributing application
 * programs conforming to the application programming interface for the operating platform
 * for which the sample code is written.
 * 
 * Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON 
 * AN "AS IS" BASIS AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING,
 * BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY,
 * SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE, AND ANY WARRANTY OR
 * CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF
 * THE SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT,
 * UPDATES, ENHANCEMENTS OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.
 * 
 * (C) Copyright IBM Corp. 2001, 2013.
 * All Rights Reserved. Licensed Materials - Property of IBM.
 */
package com.ibm.ws.samples.spring;

import java.util.Locale;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.ws.samples.phonebook.SimplePhoneBookManager;

@Controller
public class PhoneBookController {
    private static final Logger logger = LoggerFactory.getLogger(PhoneBookController.class);
    
    @Autowired
    private SimplePhoneBookManager phoneBookManager;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listPhones(Locale locale, Model model) {
    	BasicConfigurator.configure();
        logger.info("Welcome home! The client locale is {}.", locale);

        model.addAttribute("phones", this.phoneBookManager.getPhoneBook());
        
        return "listPhones";
    }

}
