package br.ufg.inf.es.integracao.topico_3.xml;

/**
 * Created by aluno on 07/05/18.
 */

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Turma.java
 * Purpose: Representar uma turma de alunos.
 *
 * @author Matheus Ribeiro Pimenta Nunes
 */
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Calcados {
    @XmlElement(name = "calcado")
    private List<Calcado> calcados;

    public List<Calcado> getCalcados() {
        return calcados;
    }

    public void setCalcados(List<Calcado> calcados) {
        this.calcados = calcados;
    }
}