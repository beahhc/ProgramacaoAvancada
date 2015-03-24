/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.pais;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alunos
 */
@Entity
public class Pais {
    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    private  Long id;
    private String sigla;
    private String nome;

    public Pais() {
    }

    public Pais(Long id, String sigla, String nome) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", sigla=" + sigla + ", nome=" + nome + '}';
    }

    public Long getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
