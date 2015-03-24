package br.unicesumar.ads2015.turma;

import br.unicesumar.ads2015.cor.MapRowMapper;
import br.unicesumar.ads2015.curso.Curso;
import br.unicesumar.ads2015.curso.CursoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class TurmaService {
    @Autowired
    private CursoRepository cursoRepo;
    @Autowired
    private TurmaRepository turmaRepo;
    
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    
    
    public void executar(CriarTurmaCommand comando) { 
        Curso curso = cursoRepo.findOne(comando.getCursoId());
        Turma turma = new Turma(comando.getNome(), comando.getCodigo(), curso);
        turmaRepo.save(turma);                
    }

    public List<Map<String, Object>> getTurmas() {
        List<Map<String, Object>> turmas = jdbcTemplate.query("select t.id, "
                + "t.nome, "
                + "t.codigo, "
                + "t.curso_id, "
                + "c.nome as nome_curso "
                + "from turma t "
                + "inner join curso c on t.curso_id = c.id", new MapSqlParameterSource(), new MapRowMapper());
        return turmas;
        //return turmaRepo.findAll();
    }
    
}
