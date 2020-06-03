package com.dani.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.dani.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
