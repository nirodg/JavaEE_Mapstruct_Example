package com.dorinbrage.github.jme.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dorinbrage.github.jme.user.dto.UserDto;
import com.dorinbrage.github.jme.user.model.User;

@Mapper
public interface UserDtoMapper {

	UserDtoMapper INSTANCE = Mappers.getMapper(UserDtoMapper.class);

	User fromDto(UserDto dto);

	UserDto toDto(User note);

}
