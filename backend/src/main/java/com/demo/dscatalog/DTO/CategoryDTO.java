package com.demo.dscatalog.DTO;


import com.demo.dscatalog.Model.Category;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public CategoryDTO(Category categoryEntity){
        this.id = categoryEntity.getId();
        this.name = categoryEntity.getName();
    }
    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
