package com.mateus.pokedex.project.repository;

import java.util.Optional;

import com.mateus.pokedex.project.entity.Pokemon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Serve para fazer a ponte entre as infromações das entitys e dos metodos disponiveis no interface.
 * Interface obriga todos as classes que implementam PokemonService a seguir um padrão de metodos, podendo ser reescritos.
*/
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Optional<Pokemon> findByNumber(Integer number);
    Page<Pokemon> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
