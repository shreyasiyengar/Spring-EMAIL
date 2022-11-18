package SpringBootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class SpringBootEmailApplication {

	@Autowired
	private JavaMailSender javaMailSender;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailApplication.class, args);
	}

	public void sendEmail() {
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo("iyengarshreyas4@gmial.com");

		msg.setSubject("Testing from Spring Boot");
		msg.setText("DON'T LEAK YOUR PASSWORD ANY ONE");

		javaMailSender.send(msg);
	}

}
