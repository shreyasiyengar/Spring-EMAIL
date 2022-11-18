package SpringBootEmail.controller;

import SpringBootEmail.SpringBootEmailApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmialController {

    @Autowired
    SpringBootEmailApplication sendingEmailApplication;

    @RequestMapping("/sendEmail")
    public String send() {
        sendingEmailApplication.sendEmail();
//        sendingEmailApplication.sendEmailWithAttachment();
        return "Email sent succeddfully";
    }
}
