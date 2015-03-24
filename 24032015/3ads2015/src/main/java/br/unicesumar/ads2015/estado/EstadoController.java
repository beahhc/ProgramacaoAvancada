/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.estado;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alunos
 */
@RestController
@RequestMapping("/estado")
public class EstadoController {
    public void criarTurma(@RequestParam String nome, @RequestParam String sigla, @RequestParam Long paisId) {
        
    }
    public void executar(@RequestParam CriarEstadoCommand comando) {
        
    }
}
