package com.demo.dscatalog.Service;

import com.demo.dscatalog.DTO.CategoryDTO;
import com.demo.dscatalog.Model.Category;
import com.demo.dscatalog.Repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
//essa notation ela vai registrar a minha classe como um componente que vai participar do sistema de
//injeçção de dependencias automatizado do spring, ou seja, o spring vai fazer a injeção de dependencias

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    //transational propriedades ACID de BD
  //  @Transactional
   // public Category createBook (Category category) {
       // return categoryRepository.save(category);
   // }

    @Transactional
    public List<CategoryDTO> findAll(){
         List<Category> listCategories = categoryRepository.findAll();

//         List<CategoryDTO> listDTO = new ArrayList<>();
//         for (Category cat: listCategories){
//             listDTO.add(new CategoryDTO(cat));
//         } uma forma de fazer o retorno das listas de categorias atraves do DTO
//         return listDTO;

       return listCategories.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
       //a função lambda vai transformar o elemento X que é do tipo category em um novo categoryDTO recebendo o X

    }




}
