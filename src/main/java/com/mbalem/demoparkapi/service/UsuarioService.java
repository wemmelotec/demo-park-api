package com.mbalem.demoparkapi.service;

import com.mbalem.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

}
