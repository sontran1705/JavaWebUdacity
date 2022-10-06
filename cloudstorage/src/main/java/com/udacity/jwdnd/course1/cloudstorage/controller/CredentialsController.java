package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.CredentialsDto;
import com.udacity.jwdnd.course1.cloudstorage.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/credentials")
public class CredentialsController {

    @Autowired
    private CredentialsService credentialsService;

    @PostMapping("/addOrUpdate")
    public String addOrUpdateCredential(CredentialsDto credentialsDto, Model model) {
        credentialsService.addOrUpdateCrentials(credentialsDto);
        model.addAttribute("result", true);
        return "result";
    }

    @GetMapping("/delete/{credentialId}")
    public String deleteCredential(@PathVariable(name = "credentialId", required = true) int credentialId, Model model) {
        credentialsService.deleteCredential(credentialId);
        model.addAttribute("result", true);
        return "result";
    }
}
