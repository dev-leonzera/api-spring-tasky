package br.com.devleonzera.tasky.controller;

import br.com.devleonzera.tasky.entity.Cliente;
import br.com.devleonzera.tasky.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    @PostMapping
    List<Cliente> create(@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }
    @GetMapping
    List<Cliente> list(){
        return clienteService.list();
    }
    @PutMapping
    List<Cliente> update(Cliente cliente){
        return clienteService.update(cliente);
    }
    @DeleteMapping("{id}")
    List<Cliente> delete(@PathVariable("id") Long id){
        return clienteService.delete(id);
    }
}
