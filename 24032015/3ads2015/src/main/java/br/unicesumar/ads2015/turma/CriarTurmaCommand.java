package br.unicesumar.ads2015.turma;

public class CriarTurmaCommand {

    private String nome;
    private String codigo;
    private Long cursoId;

    public CriarTurmaCommand(String nome, String codigo, Long cursoId) {
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
