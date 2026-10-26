package com.petersonsantos9k.picpay_desafio.controller;

import com.petersonsantos9k.picpay_desafio.dto.UserRequestDTO;
import com.petersonsantos9k.picpay_desafio.dto.UserResponseDTO;
import com.petersonsantos9k.picpay_desafio.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private static final String message = "";

    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@RequestBody @Valid UserRequestDTO dto){
        return ResponseEntity.ok().body(
            userService.create(dto)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable UUID id){
        return ResponseEntity.ok().body(
            userService.findById(id)
        );
    }


}
