package br.com.mizaeldouglas.backend.resouces;

import br.com.mizaeldouglas.backend.dto.CategoryDTO;
import br.com.mizaeldouglas.backend.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll() {
        List<CategoryDTO> cat =  service.findAll();
        return ResponseEntity.ok().body(cat);
    }

}
