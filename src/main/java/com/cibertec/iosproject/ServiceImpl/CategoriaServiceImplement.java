package com.cibertec.iosproject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.iosproject.Entity.Categoria;
import com.cibertec.iosproject.Repository.CategoriaRepository;
import com.cibertec.iosproject.Service.CategoriaService;

@Service
public class CategoriaServiceImplement implements CategoriaService{
    @Autowired
    private CategoriaRepository repository;

    @Override
    public List<Categoria> list() {
        return repository.findAll();
    }

    @Override
    public Categoria addOrUpdate(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }
    
}
