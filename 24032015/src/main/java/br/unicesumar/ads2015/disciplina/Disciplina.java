package br.unicesumar.ads2015.disciplina;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false, unique = true)
    private String identificacao;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, String identificacao) {
        this.id = id;
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
        
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", nome=" + nome + ", identificacao=" + identificacao + '}';
    }

}
