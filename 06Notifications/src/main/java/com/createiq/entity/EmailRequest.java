package com.createiq.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmailRequest {
    private String from;
    private String to;
    private String subject;
    private String content;

    // Constructors, getters, setters
}
