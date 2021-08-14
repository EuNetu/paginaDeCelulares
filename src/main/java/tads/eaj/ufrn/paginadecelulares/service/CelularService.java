package tads.eaj.ufrn.paginadecelulares.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tads.eaj.ufrn.paginadecelulares.model.Celular;
import tads.eaj.ufrn.paginadecelulares.repository.CelularRepository;

import java.util.List;

@Service
public class CelularService {

    CelularRepository repository;

    @Autowired
    public void setRepository(CelularRepository repository) {
        this.repository = repository;
    }

    public List<Celular> findAll(){
        return repository.findAll();
    }

    public void save(Celular c){
        repository.save(c);
    }

    public Celular getById(Long id){
        return repository.getById(id);
    }
}
