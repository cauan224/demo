package com.example.aula3.service;

import com.example.aula3.model.Usuario;
import com.example.aula3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired //faz o papel do contrutor
    private UsuarioRepository usuarioRepository;

    //consultar banco de dados
    public List<Usuario> listartodal() {
        return usuarioRepository.findAll();
    }

    //salvar no banco de dados
    public Usuario salvar(Usuario usuario) {
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Email ja cadastrado");
        }
        //Só executa a linha abaixo se o email não estiver cadastrado
        return usuarioRepository.save(usuario);
    }

    //update

    public Usuario atualizar(UUID id, Usuario usuario) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario não encontrado");

        }
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    //delete
    public void deletar(UUID id) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario não encontrado");
        }
        usuarioRepository.deleteById(id);
    }
}





