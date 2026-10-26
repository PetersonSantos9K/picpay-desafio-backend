package com.petersonsantos9k.picpay_desafio.service.mapper;

import com.petersonsantos9k.picpay_desafio.domain.User;
import com.petersonsantos9k.picpay_desafio.dto.UserRequestDTO;
import com.petersonsantos9k.picpay_desafio.dto.UserResponseDTO;
import java.math.BigDecimal;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-26T02:18:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setFullName( dto.fullName() );
        user.setTaxId( dto.taxId() );
        user.setEmail( dto.email() );
        user.setPassword( dto.password() );

        return user;
    }

    @Override
    public UserResponseDTO toResponse(User dto) {
        if ( dto == null ) {
            return null;
        }

        UUID id = null;
        String fullName = null;
        String taxId = null;
        String email = null;
        BigDecimal balance = null;

        id = dto.getId();
        fullName = dto.getFullName();
        taxId = dto.getTaxId();
        email = dto.getEmail();
        balance = dto.getBalance();

        UserResponseDTO userResponseDTO = new UserResponseDTO( id, fullName, taxId, email, balance );

        return userResponseDTO;
    }
}
