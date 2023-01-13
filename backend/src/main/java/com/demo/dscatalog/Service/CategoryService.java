package com.demo.dscatalog.Service;

import com.demo.dscatalog.Model.Category;
import com.demo.dscatalog.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//essa notation ela vai registrar a minha classe como um componente que vai participar do sistema de
//injeçção de dependencias automatizado do spring, ou seja, o spring vai fazer a injeção de dependencias

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    //transational propriedades ACID de BD

    @Transactional
    public List<Category> findAllBooks(){
        return categoryRepository.findAll();
    }

    public Category createBook (Category category) {
        return categoryRepository.save(category);
    }




}
