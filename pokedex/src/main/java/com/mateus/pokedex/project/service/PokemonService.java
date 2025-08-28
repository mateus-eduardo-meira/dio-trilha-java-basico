package com.mateus.pokedex.project.service;

import com.mateus.pokedex.project.dto.PokemonRequest;
import com.mateus.pokedex.project.dto.PokemonResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/*
 * Interface de contrato usada no PokemonServiceImpl.
 * Todos os metodos aqui, obrigatóriamente devem ser implementados no PokemonServiceImpl. 
 * Essas duas classes dependem uma da outra e definem os metodos que poderam ser utilizados para criar /editar /atualizar /deletar algum pokemon.
*/

public interface PokemonService {
    PokemonResponse create(PokemonRequest request);
    PokemonResponse getById(Long id);
    Page<PokemonResponse> list(String name, String type, Pageable pageable);
    PokemonResponse update(Long id, PokemonRequest request);
    void delete(Long id);
}
