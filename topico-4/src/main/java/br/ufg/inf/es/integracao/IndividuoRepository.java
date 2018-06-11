/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.entidades.Individuo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Extenção da classe MongoRepository.
 */
public interface IndividuoRepository extends MongoRepository<Individuo, String> { }