package com.example.aula.Service;

import com.example.aula.model.Cliente;
import com.example.aula.repository.ClienteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServeci {
    private ClienteRepo clienteRepo;

    public ClienteServeci(ClienteRepo clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public List<Cliente> listarTodos() {
        return clienteRepo.findAll();
    }
    public Cliente salvar(Cliente cliente) {
        if (clienteRepo.findByprotocolo(cliente.getProtocolo()).isPresent()) {
            throw new RuntimeException("Protocolo já existe");
        }
        return clienteRepo.save(cliente);
    }
}
