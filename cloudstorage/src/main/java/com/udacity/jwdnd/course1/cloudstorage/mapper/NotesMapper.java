package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.entity.Notes;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface NotesMapper {

    @Select("SELECT * FROM NOTES WHERE userId = #{userid}")
    ArrayList<Notes> getAllNote(int userid);

    @Insert("INSERT INTO NOTES (notetitle, notedescription, userId) VALUES(#{noteTitle}, #{noteDescription}, #{userId})")
    @Options(useGeneratedKeys = true, keyProperty = "noteId")
    int insert(Notes notes);

    @Update("UPDATE NOTES SET noteDescription = #{noteDescription}, noteTitle = #{notetitle} WHERE noteId = #{noteId}")
    int update(String noteDescription, String noteTitle, int noteId);

    @Delete("DELETE FROM NOTES WHERE noteId = #{noteId}")
    int delete(int noteId);

}
