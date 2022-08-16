package dao;

import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaDao {
    public EntityManagerFactory entityManagerFactory = null;
    public EntityManager entityManager = null;

    public PessoaDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("modernaJPA");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }


    public void salvar(Pessoa pessoa) {
        entityManager.persist(pessoa);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Pessoa pesquisaPorId(Long id) {
        Pessoa pessoaEncontrada = entityManager.find(Pessoa.class, id);

        entityManager.close();

        return pessoaEncontrada;
    }

    public void deletar(Long id) {
        var pessoaEncontrada = entityManager.find(Pessoa.class, id);
        entityManager.remove(pessoaEncontrada);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizar(Pessoa pessoa) {
        entityManager.merge(pessoa);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
