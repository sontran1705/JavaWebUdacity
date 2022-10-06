package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.entity.Notes;
import com.udacity.jwdnd.course1.cloudstorage.mapper.NotesMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.NotesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NotesService {

    @Autowired
    private NotesMapper noteMapper;

    @Autowired
    private UserService userService;

    public ArrayList<Notes> getAllNote(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username =  authentication.getPrincipal().toString();
        Integer userId = userService.getUserIdByUsername(username);
        if(userId == 0){
            return new ArrayList<>();
        }

        ArrayList<Notes> lstFound = noteMapper.getAllNote(userId);
        return lstFound;
    }

    public int addOrUpdate(NotesDto notesDto){
        Notes notes = new Notes();
        notes.setNoteTitle(notesDto.getNoteTitle());
        notes.setNoteDescription(notesDto.getNoteDescription());

        if(notesDto.getNoteId() == 0){
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String userName =  authentication.getPrincipal().toString();
            notes.setUserId(userService.getUserIdByUsername(userName));
            return noteMapper.insert(notes);
        }
        else{
            notes.setNoteId(notesDto.getNoteId());
            return noteMapper.update(notes.getNoteTitle(), notes.getNoteDescription(), notes.getNoteId());
        }
    }

    public boolean deleteNote(int noteId){
        int deletedNote = noteMapper.delete(noteId);
        if(deletedNote == 1){
            return true;
        }
        return false;
    }
}

