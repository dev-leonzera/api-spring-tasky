package br.com.devleonzera.tasky.service;

import br.com.devleonzera.tasky.entity.Projeto;
import br.com.devleonzera.tasky.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjetoService {
    private ProjetoRepository projetoRepository;
    public ProjetoService(ProjetoRepository projetoRepository){
        this.projetoRepository = projetoRepository;
    }

    public List<Projeto> create(Projeto projeto){
        projetoRepository.save(projeto);
        return list();
    }

    public List<Projeto> list(){
        return projetoRepository.findAll();
    }

    public List<Projeto> update(Projeto projeto){
        projetoRepository.save(projeto);
        return list();
    }

    public List<Projeto> delete(Long id){
        projetoRepository.deleteById(id);
        return list();
    }
}
