package com.sthefanny.SendMail;

import com.sthefanny.SendMail.service.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SendMailApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	public void emailSendingTest() {
		emailSenderService.sendEmail("teste@teste.com", "teste", "testando");
	}

}
