package com.cibertec.iosproject.Service;

import java.util.List;

import com.cibertec.iosproject.Entity.Categoria;

public interface CategoriaService {
    List<Categoria> list();
    Categoria addOrUpdate(Categoria categoria);
    void remove(int id);
}
