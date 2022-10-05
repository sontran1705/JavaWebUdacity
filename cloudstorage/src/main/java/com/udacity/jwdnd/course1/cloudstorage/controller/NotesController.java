package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.NotesDto;
import com.udacity.jwdnd.course1.cloudstorage.services.NotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notes")
public class NotesController {
    private NotesService noteService;

    public NotesController(NotesService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/addOrUpdate")
    public String addNote(NotesDto noteForm, Model model){
        noteService.addOrUpdate(noteForm);
        model.addAttribute("result", true);
        return "result";
    }

    @GetMapping("/delete/{noteId}")
    public String deleteNote(@PathVariable(name = "noteId", required = true) int noteId, Model model){
        noteService.deleteNote(noteId);
        model.addAttribute("result", true);
        return "result";
    }
}
