/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.ads2015.livro;
import br.unicesumar.ads2015.util.MapRowMapper;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livros")
@Transactional
public class LivroController {
    
    @Autowired
    private EntityManager em;
    
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    
    @RequestMapping(method = RequestMethod.POST)
    public void criarLivro(@RequestParam String titulo, @RequestParam int ano, @RequestParam double peso) {
        Livro novo = new Livro(titulo, ano, peso);
        em.persist(novo);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void alterarLivro(@RequestParam Long id, @RequestBody String titulo, @RequestBody int ano, @RequestBody double peso) {
        Livro livroRecuperado = em.find(Livro.class, id);
        livroRecuperado.setTitulo(titulo);
        livroRecuperado.setAno(ano);
        livroRecuperado.setPeso(peso);
        em.persist(livroRecuperado);
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    public void excluirLivro(@RequestParam Long id) {
        em.createQuery("delete from Livro l where l.id = :id").setParameter("id", id).executeUpdate();
    }
    
    @RequestMapping(value="/query/all", method = RequestMethod.GET)
    public List<Map<String, Object>> getLivros() {
        return jdbcTemplate.query("select * from livro", new MapSqlParameterSource(), new MapRowMapper());
    }
    
    @RequestMapping(value="/query/byAno", method = RequestMethod.GET)
    public List<Map<String, Object>> getLivrosByAno(@RequestParam String anomenor,@RequestParam String anomaior ) {
        final MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("anomenor", '%'+anomenor+'%');
        params.addValue("anomaior", '%'+anomaior+'%');
        return jdbcTemplate.query("select id, titulo from livro where ano between :anomenor and :anomaior", params, new MapRowMapper());
    }
    
    @RequestMapping(value="/query/byPeso", method = RequestMethod.GET)
    public List<Map<String, Object>> getLivrosByPeso(@RequestParam String peso) {
        final MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("peso", '%'+peso+'%');
        return jdbcTemplate.query("select * from livro where peso >= :peso ", params, new MapRowMapper());
    }
    
    
}
