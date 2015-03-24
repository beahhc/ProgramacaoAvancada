/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.estado;

import br.unicesumar.ads2015.pais.Pais;
import br.unicesumar.ads2015.pais.PaisRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alunos
 */
@Component
@Transactional
public class EstadoService {
     @Autowired
    private EstadoRepository estadoRepo;
    @Autowired
    private PaisRepository paisRepo;
    
    
    public void executar(CriarEstadoCommand comando) { 
        Pais pais = paisRepo.findOne(comando.getPaisId());
        Estado estado = new Estado(comando.getNome(), comando.getSigla(), pais);
        estadoRepo.save(estado);                
    }
}
