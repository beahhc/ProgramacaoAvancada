package br.unicesumar.ads2015.turma;

import br.unicesumar.ads2015.curso.Curso;
import br.unicesumar.ads2015.curso.CursoRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class TurmaService {
    @Autowired
    private CursoRepository cursoRepo;
    @Autowired
    private TurmaRepository turmaRepo;
    
    
    public void executar(CriarTurmaCommand comando) { 
        Curso curso = cursoRepo.findOne(comando.getCursoId());
        Turma turma = new Turma(comando.getNome(), comando.getCodigo(), curso);
        turmaRepo.save(turma);                
    }
    
}
