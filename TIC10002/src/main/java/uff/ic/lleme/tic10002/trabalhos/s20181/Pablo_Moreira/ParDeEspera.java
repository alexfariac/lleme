/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tic10002.trabalhos.s20181.Pablo_Moreira;

import uff.ic.lleme.tic10002.trabalhos.s20181.Pablo_Moreira.model.Atendimento;

/**
 *
 * @author pablomoreira
 */
public class ParDeEspera {

    private Atendimento atendimento;
    private float prioridade;

    public ParDeEspera(Atendimento atendimento, float prioridade) {
        this.atendimento = atendimento;
        this.prioridade = prioridade;
    }

    public float getPrioridade() {
        return prioridade;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    void setPrioridade(int novaPrioridade) {
        this.prioridade = novaPrioridade;
    }

}