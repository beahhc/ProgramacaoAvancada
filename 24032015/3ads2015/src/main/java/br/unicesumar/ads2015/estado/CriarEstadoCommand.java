/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.estado;

/**
 *
 * @author Alunos
 */
public class CriarEstadoCommand {
    private String nome;
    private String sigla;
    private Long paisId;

    public CriarEstadoCommand() {
    }

    public CriarEstadoCommand(String nome, String sigla, Long paisId) {
        this.nome = nome;
        this.sigla = sigla;
        this.paisId = paisId;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Long getPaisId() {
        return paisId;
    }
    
    
}
