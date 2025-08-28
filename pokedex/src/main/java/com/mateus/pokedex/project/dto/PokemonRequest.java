package com.mateus.pokedex.project.dto;

import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PokemonRequest {
    
    @NotNull
    private Integer number;

    @NotBlank
    private String name;

    private Set<String> types;
    private Double heigth;
    private Double weigth;
    private String description;
    
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<String> getTypes() {
        return types;
    }
    public void setTypes(Set<String> types) {
        this.types = types;
    }
    public Double getHeigth() {
        return heigth;
    }
    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }
    public Double getWeigth() {
        return weigth;
    }
    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
}
