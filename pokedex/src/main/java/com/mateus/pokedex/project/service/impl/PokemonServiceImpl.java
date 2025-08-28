package com.mateus.pokedex.project.service.impl;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import com.mateus.pokedex.project.dto.PokemonRequest;
import com.mateus.pokedex.project.dto.PokemonResponse;
import com.mateus.pokedex.project.entity.Pokemon;
import com.mateus.pokedex.project.repository.PokemonRepository;
import com.mateus.pokedex.project.service.PokemonService;

import java.util.NoSuchElementException;

@Service
public class PokemonServiceImpl implements PokemonService{

    @Autowired
    private PokemonRepository repository;

    @Override
    public PokemonResponse create(PokemonRequest request) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(request.getName());
        pokemon.setNumber(request.getNumber());
        pokemon.setTypes(request.getTypes());
        pokemon.setHeigth(request.getHeigth());
        pokemon.setWeigth(request.getWeigth());
        pokemon.setDescription(request.getDescription());
        Pokemon saved = repository.save(pokemon);

        return toResponse(saved);
    }

    //Exception persobnalizada aqui
    @Override
    public PokemonResponse getById(Long id){
        return repository.findById(id).map(this::toResponse)
            .orElseThrow(() -> new NoSuchElementException("Pokémon não encontrado: " + id));
    }

    @Override
    public Page<PokemonResponse> list(String name, String type, Pageable pageable) {
        Page<Pokemon> page = (name == null || name.isEmpty())
            ? repository.findAll(pageable)
            : repository.findByNameContainingIgnoreCase(name, pageable);
        
        return new PageImpl<>(page.getContent().stream().map(this::toResponse).collect(Collectors.toList()), pageable, page.getTotalElements());
    }

    @Override
    public PokemonResponse update(Long id, PokemonRequest request) {
        Pokemon pokemon = repository.findById(id).orElseThrow(() -> new NoSuchElementException("Pokémon não encontrado: " + id));
        pokemon.setName(request.getName());
        pokemon.setNumber(request.getNumber());
        pokemon.setTypes(request.getTypes());
        pokemon.setHeigth(request.getHeigth());
        pokemon.setWeigth(request.getWeigth());
        pokemon.setDescription(request.getDescription());
        Pokemon saved = repository.save(pokemon);

        return toResponse(saved);
    }

    @Override
    public void delete(Long id) {
        Pokemon pokemon = repository.findById(id).orElseThrow(() -> new NoSuchElementException("Pokémon não encontrado: " + id));
        repository.delete(pokemon);
    }

    private PokemonResponse toResponse(Pokemon p) {
        PokemonResponse r = new PokemonResponse();
        r.setId(p.getId());
        r.setNumber(p.getNumber());
        r.setName(p.getName());
        r.setTypes(p.getTypes());
        r.setHeigth(p.getHeigth());
        r.setWeigth(p.getWeigth());
        r.setDescription(p.getDescription());
        r.setCreatedAt(p.getCreatedAt());
        r.setUpdatedAt(p.getUpdatedAt());
        return r;
    }
}
