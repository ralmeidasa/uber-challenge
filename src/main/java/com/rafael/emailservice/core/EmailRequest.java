package com.rafael.emailservice.core;

public record EmailRequest(String to, String subject, String body){}
