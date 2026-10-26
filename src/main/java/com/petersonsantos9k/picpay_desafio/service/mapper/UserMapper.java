package com.petersonsantos9k.picpay_desafio.service.mapper;

import com.petersonsantos9k.picpay_desafio.domain.User;
import com.petersonsantos9k.picpay_desafio.dto.UserRequestDTO;
import com.petersonsantos9k.picpay_desafio.dto.UserResponseDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequestDTO dto);
    UserResponseDTO toResponse(User dto);


}
