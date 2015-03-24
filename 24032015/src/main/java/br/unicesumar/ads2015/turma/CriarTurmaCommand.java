package br.unicesumar.ads2015.turma;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarTurmaCommand {

    private final String nome;
    private final String codigo;
    private final Long cursoId;

    @JsonCreator
    public CriarTurmaCommand(@JsonProperty("nome") String nome, @JsonProperty("codigo") String codigo, @JsonProperty("cursoId") Long cursoId) {
        this.nome = nome;
        this.codigo = codigo;
        this.cursoId = cursoId;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Long getCursoId() {
        return cursoId;
    }
    
}
