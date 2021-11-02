package edu.dl.project01;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HumanRepository {
    @PersistenceContext
    private EntityManager em;

    public Long save(Human human){
        em.persist(human);
        return human.getId();
    }

    public Human find(Long id){
        return em.find(Human.class, id);
    }
}
