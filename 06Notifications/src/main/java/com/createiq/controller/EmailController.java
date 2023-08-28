package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.service.EmailService;

@RestController
@RequestMapping("/emails")
public class EmailController {
	
    @Autowired
    private EmailService emailService;
    
    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestParam String toAddress,
    		                                @RequestParam String fromAddress,
                                           @RequestParam String subject,
                                           @RequestParam String content) {
        emailService.saveAndSendEmail(toAddress,fromAddress, subject, content);
        return ResponseEntity.ok("Email sent and saved.");
    }
}
