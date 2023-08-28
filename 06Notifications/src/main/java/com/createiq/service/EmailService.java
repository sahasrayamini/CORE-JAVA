package com.createiq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.createiq.entity.Email;
import com.createiq.entity.EmailRequest;
import com.createiq.repo.EmailRepository;

@Service
public class EmailService {
    @Autowired
    private EmailRepository emailRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public void sendNotificationEmail(String assetName, String action) {
        String toAddress = "b.yamini294@gmail.com"; // Change this to the actual recipient address
        String fromAddress="sahasrayamini97@gmail.com";
        String subject = "Asset Information " + action;
        String content = "Asset '" + assetName + "' has been " + action + ".";
        
        
    }
    
    public void saveAndSendEmail(String toAddress,String fromAddress, String subject, String content) {
        Email email = new Email();
        email.setToAddress(toAddress);
        email.setFromAddress(fromAddress);
        email.setSubject(subject);
        email.setContent(content);
        
        emailRepository.save(email);
        
        // Assuming you have a REST API endpoint to send emails
        String emailApiUrl = "YOUR_EMAIL_API_URL_HERE";
        // Create a request object based on your API's requirements
        EmailRequest emailRequest = new EmailRequest(toAddress,fromAddress, subject, content);
        
        // Send the email using RestTemplate
        ResponseEntity<String> response = restTemplate.postForEntity(emailApiUrl, emailRequest, String.class);
        
        if (response.getStatusCode().is2xxSuccessful()) {
            // Email sent successfully
        } else {
            // Handle email sending failure
        }
    }
}
