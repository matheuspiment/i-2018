/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.entidades.Individuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class IndividuoService {

    @Autowired
    private IndividuoRepository individuoRepository;

    public List<Individuo> listarTodos() {
        return this.individuoRepository.findAll();
    }

    public Optional<Individuo> listarPorId(@PathVariable("id") String id) {
        return this.individuoRepository.findById(id);
    }

    public Individuo cadastrar(Individuo paciente) {
        return this.individuoRepository.save(paciente);
    }

    public Individuo atualizar(Individuo paciente) {
        return this.individuoRepository.save(paciente);
    }
    
    public void remover(String id) {
        this.individuoRepository.deleteById(id);
    }
}
