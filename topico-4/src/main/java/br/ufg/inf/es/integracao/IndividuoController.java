/*
 * Copyright (c) 2018.
 * Matheus Ribeiro Pimenta Nunes
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.entidades.Individuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mongodb://root:qwe123@ds255320.mlab.com:55320/nosql")
public class IndividuoController {

    @Autowired
    private IndividuoService individuoService;

    /**
     * Listar todos os indivíduos cadastrado no banco.
     * @return Lista de indivíduos.
     */
    @GetMapping
    public ResponseEntity<List<Individuo>> listarTodos() {
        return ResponseEntity.ok(this.individuoService.listarTodos());
    }

    /**
     * listar um determinado indivíduo do banco.
     * @param id Id do indivíduo.
     * @return Dados do indivíduo.
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Individuo>> listarPorId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(this.individuoService.listarPorId(id));
    }

    /**
     * Persiste um indivíduo no banco.
     * @param paciente Intancia de um indivíduo.
     * @return Indivíduo cadastrado.
     */
    @PostMapping
    public ResponseEntity<Individuo> cadastrar(@RequestBody Individuo paciente) {
        return ResponseEntity.ok(this.individuoService.cadastrar(paciente));
    }

    /**
     * Atualiza um paciente.
     * @param id Id do indivíduo.
     * @param paciente Intancia de um indivíduo.
     */
    @PutMapping(path = "/{id}")
    public ResponseEntity<Individuo> atualizar(@PathVariable(name = "id") String id, Individuo paciente) {
        paciente.setKey(id);
        return ResponseEntity.ok(this.individuoService.atualizar(paciente));
    }

    /**
     * Remove um paciente.
     * @param id Id do indivíduo.
     */
    @DeleteMapping(path = "/{id}")
    public void remover(@PathVariable(name = "id") String id) {
        this.individuoService.remover(id);
    }

}
