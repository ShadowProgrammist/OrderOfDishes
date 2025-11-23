package com.example.demo.models.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
public class Ingredient extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "is_allergic")
    private Boolean isAllergic;

    @ManyToMany(mappedBy = "ingredients")
    private List<Dish> dishes = new ArrayList<>();

    public Ingredient(String name, Boolean isAllergic, List<Dish> dishes) {
        this.name = name;
        this.isAllergic = isAllergic;
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAllergic() {
        return isAllergic;
    }

    public void setAllergic(Boolean allergic) {
        isAllergic = allergic;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
