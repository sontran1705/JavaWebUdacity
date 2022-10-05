package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.entity.Files;
import com.udacity.jwdnd.course1.cloudstorage.entity.Notes;
import com.udacity.jwdnd.course1.cloudstorage.services.FilesService;
import com.udacity.jwdnd.course1.cloudstorage.services.MessageListService;
import com.udacity.jwdnd.course1.cloudstorage.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    private MessageListService messageListService;

    @Autowired
    private FilesService filesService;

    @Autowired
    private NotesService noteService;



    @GetMapping()
    public String showHome(Model model){
        List<Notes> listUserNote = noteService.getAllNote();
       /* List<CredentialWithDecryptedPassword> listUserCredential = credentialService.getAllCredential();*/
        List<Files> listUserFile = filesService.getAllFile();
      /*  System.out.println("Note count: " + listUserNote.size());
        System.out.println("Credential count: " + listUserCredential.size());*/
        model.addAttribute("listNote", listUserNote);
       /* model.addAttribute("listCredential", listUserCredential);*/
        model.addAttribute("listFile", listUserFile);
        return "home";
    }



  /*  public HomeController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }

    @GetMapping()
    public String getHomePage(MessageForm messageForm, Model model) {
        model.addAttribute("greetings", this.messageListService.getMessages());
        return "home";
    }

    @PostMapping()
    public String addMessage(MessageForm messageForm, Model model) {
        messageListService.addMessage(messageForm.getText());
        model.addAttribute("greetings", messageListService.getMessages());
        messageForm.setText("");
        return "home";
    }
    */


}