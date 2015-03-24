/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.pais;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

/**
 *
 * @author Alunos
 */
public interface PaisRepository extends JpaRepository<Pais, Long> {
    
}
