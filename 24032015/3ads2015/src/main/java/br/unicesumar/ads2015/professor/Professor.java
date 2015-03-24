package br.unicesumar.ads2015.professor;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Formação formação;

    public Professor() {
    }

    public Professor(Long id, String nome, Formação formação) {
        this.id = id;
        this.nome = nome;
        this.formação = formação;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + ", forma\u00e7\u00e3o=" + formação + '}';
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Formação getFormação() {
        return formação;
    }

    public void setFormação(Formação formação) {
        this.formação = formação;
    }
    
    
    
}
