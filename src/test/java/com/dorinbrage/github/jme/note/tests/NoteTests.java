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
package com.dorinbrage.github.jme.note.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dorinbrage.github.jme.note.enums.NoteStatus;
import com.dorinbrage.github.jme.note.model.Note;

/**
 *
 * @author Dorin Gheorghe Brage
 */

public class NoteTests {
    
	private final Integer noteId = 1; 
	private final String noteContent = "Hello world!";
	private final Enum<NoteStatus> noteStatus = NoteStatus.PUBLISHED;
	
    @Test
    public void createNote(){
    	// Create the note
        Note note = new Note();
        
        // Set the id and test it
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
    }
}
