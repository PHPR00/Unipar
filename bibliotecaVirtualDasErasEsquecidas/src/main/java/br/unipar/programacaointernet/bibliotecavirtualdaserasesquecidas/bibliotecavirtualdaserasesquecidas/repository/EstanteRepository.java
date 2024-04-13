package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.repository;

import br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model.Estante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class EstanteRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Estante> listarTodasEstantes() {
        String jpql = "SELECT l FROM Estante l";
        return em.createQuery(jpql, Estante.class).getResultList();
    }

    public Estante buscarPorID(Integer id) {
        return em.find(Estante.class, id);
    }

    public void cadastrar(Estante estante) throws Exception {
        try {
            em.persist(estante);
        } catch (Exception ex) {
            throw new Exception("Livro não pode ser cadastrado");
        }
    }
}
