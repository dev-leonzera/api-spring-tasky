package br.com.devleonzera.tasky.service;

import br.com.devleonzera.tasky.entity.Cliente;
import br.com.devleonzera.tasky.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> create(Cliente cliente){
        clienteRepository.save(cliente);
        return list();
    }
    public List<Cliente> update(Cliente cliente){
        clienteRepository.save(cliente);
        return list();
    }
    public List<Cliente> list(){
        return clienteRepository.findAll();
    }
    public List<Cliente> delete(Long id){
        clienteRepository.deleteById(id);
        return list();
    }

}
