/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.estado;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import br.unicesumar.ads2015.pais.Pais;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Alunos
 */
@Entity
public class Estado {
    
    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    private Long id;
    private String sigla;
    private String nome;
    
    @ManyToOne
    private Pais pais;

    public Estado() {
    }

    public Estado(String sigla, String nome, Pais pais) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", sigla=" + sigla + ", nome=" + nome + ", pais=" + pais + '}';
    }

    public Long getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
    
    
    
    
    
    
    
}
