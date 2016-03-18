package com.dorinbrage.github.jme.note.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dorinbrage.github.jme.note.dto.NoteDto;
import com.dorinbrage.github.jme.note.model.Note;

@Mapper
public interface NoteDtoMapper {

	NoteDtoMapper INSTANCE = Mappers.getMapper(NoteDtoMapper.class);
	
	Note fromDto(NoteDto dto);
	
	NoteDto toDto(Note note);
	
}
