package br.com.mizaeldouglas.backend.services;

import br.com.mizaeldouglas.backend.entities.Category;
import br.com.mizaeldouglas.backend.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired // Injeção de dependência
    private CategoryRepository repository;
    public List<Category> findAll() {
        return repository.findAll();
    }
    public Category findById(Long id) {
        return repository.findById(id).get();
    }


}
