package com.mateus.pokedex.project.dto;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
   
public class PokemonResponse {
 
    //mudar isso aqui se der erro na criação de um novo registro. Não tenho certeza se tem que ser obrigatório, pois esta marcado como generate.IDENTITY na entity
    @NotNull
    private Long id;

    @NotNull
    private Integer number;

    @NotBlank
    private String name;

    private Set<String> types;
    private Double heigth;
    private Double weigth;
    private String description;    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


    
}
