package com.Email.javaemail.controller;

import com.Email.javaemail.model.MailStructure;
import com.Email.javaemail.services.MailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailControler {
    @Autowired
    private MailServices mailServices;
    @PostMapping("/send/{mail}")
    public String sendmail(@PathVariable String mail, @RequestBody MailStructure mailstructure){
        mailServices.sendmail(mail,mailstructure);
        return "Send the Mail Successfully !! ";

    }
}
