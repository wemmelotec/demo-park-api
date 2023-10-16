package com.mbalem.demoparkapi.service;

import com.mbalem.demoparkapi.entity.Usuario;
import com.mbalem.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Usuário não encontrado!")
        );
    }
    @Transactional
    public Usuario editarSenha(Long id, String password) {
        Usuario user = buscarPorId(id);
        user.setPassword(password);
        //não precisei utilizar o save pois o prórpio Hibernet faz essa atualização
        //quando ele buscar o objeto ele mantém em memória e se fecha ele após o meu return
        return user;
    }
}
