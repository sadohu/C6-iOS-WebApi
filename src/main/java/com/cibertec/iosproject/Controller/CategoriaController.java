package com.cibertec.iosproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.iosproject.Entity.Categoria;
import com.cibertec.iosproject.Service.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Categoria>> list(){
        return ResponseEntity.ok(categoriaService.list());
    }

    @PostMapping("/registrar")
    public ResponseEntity<Categoria> add(@RequestBody Categoria categoria){
        Categoria response = categoriaService.addOrUpdate(categoria);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria){
        Categoria response = categoriaService.addOrUpdate(categoria);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> update(@PathVariable int id){
        categoriaService.remove(id);
        String response = "Categoria eliminada";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
