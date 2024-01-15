package br.com.devleonzera.tasky.controller;

import br.com.devleonzera.tasky.entity.Projeto;
import br.com.devleonzera.tasky.service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    private ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService){
        this.projetoService = projetoService;
    }

    @PostMapping
    List<Projeto> create(@RequestBody Projeto projeto){
        return projetoService.create(projeto);
    }

    @GetMapping
    List<Projeto> list(){
        return projetoService.list();
    }

    @PutMapping
    List<Projeto> update(Projeto projeto){
        return projetoService.update(projeto);
    }

    @DeleteMapping("{id}")
    List<Projeto> delete(@PathVariable("id") Long id){
        return projetoService.delete(id);
    }
}
