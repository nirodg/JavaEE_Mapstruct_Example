/*
 * The MIT License
 *
 * Copyright 2016 Dorin Gheorghe Brage.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.dorinbrage.github.jme.user.tests;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.dorinbrage.github.jme.note.enums.NoteStatus;
import com.dorinbrage.github.jme.note.model.Note;
import com.dorinbrage.github.jme.user.model.User;

/**
 *
 * @author Dorin Gheorghe Brage
 */
public class UserTests {
    
	private User user;
	
	private Note note;
	
	private List<Note> notes;
	

	private final Integer noteId = 1; 
	private final String noteContent = "Hello world!";
	private final Enum<NoteStatus> noteStatus = NoteStatus.PUBLISHED;
	
	
	@Test
	public void createUser() throws ParseException{
	
		user = new User();
		note = new Note();
		notes = new ArrayList<Note>();

        // Set the id for the NOTE and test it
        note.setId(noteId);
        assertEquals(Integer.valueOf(1), note.getId());
        System.out.println("Expected id \"1\". Passed");
        
        // Set the content and test it
        note.setContent(noteContent);
        assertEquals(String.valueOf("Hello world!"), note.getContent());
        System.out.println("Expected content \"Hello world!\". Passed");
        
        // Set the status and test it
        note.setStatus((NoteStatus) noteStatus);
        assertEquals(NoteStatus.PUBLISHED, note.getStatus());
        System.out.println("Expected status \"PUBLISHED\". Passed");
        
        System.out.println("Note created correctly. Test passed.");

        // Add the note to the list
        notes.add(note);
		
		// Set the id for the USER and test it
		user.setId(1);
        assertEquals(Integer.valueOf(1), user.getId());
        System.out.println("Expected id \"1\". Passed");
		
		user.setUsername("admin");
        assertEquals(String.valueOf("admin"), user.getUsername());
        System.out.println("Expected username \"admin\". Passed");
		
		user.setEmail("admin@localhost");
        assertEquals(String.valueOf("admin@localhost"), user.getEmail());
        System.out.println("Expected email \"admin@localhost\". Passed");
		
        // Set notes to the user.
		user.setNotes(notes);
		
		// Check the expected result for the notes
		for(Note checkNote : user.getNotes()){
			// Check the id
			assertEquals(Integer.valueOf(1), checkNote.getId());
			System.out.println("Expected id \"1\". Passed");
			
			// Check the content
			assertEquals(String.valueOf("Hello world!"), checkNote.getContent());
	        System.out.println("Expected content \"Hello world!\". Passed");
	        
	        // Check the status
	        assertEquals(NoteStatus.PUBLISHED, checkNote.getStatus());
	        System.out.println("Expected status \"PUBLISHED\". Passed");
		}
		
		// Set createdAt and test it
		Date createdAt = new SimpleDateFormat("yyyy-mm-dd").parse("2016-3-15");
		Date expectedcreatedAt = new SimpleDateFormat("yyyy-mm-dd").parse("2016-3-15");
		user.setCreatedAt(createdAt);
		assertEquals(expectedcreatedAt, user.getCreatedAt());
		System.out.println("Expected creation date \"2016-3-15\". Passed");
		
		// Set updateddAt and test it
		Date updatedAt = new SimpleDateFormat("yyyy-mm-dd").parse("2016-3-15");
		user.setUpdatedAt(updatedAt);	
		Date expectedUpdatedAt = new SimpleDateFormat("yyyy-mm-dd").parse("2016-3-15");
		assertEquals(expectedUpdatedAt, user.getUpdatedAt());
		System.out.println("Expected modification date \"2016-3-15\". Passed");
		
		System.out.println("User created correctly. Test passed.");
	}
    
}
