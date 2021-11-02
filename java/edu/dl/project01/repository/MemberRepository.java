package edu.dl.project01.repository;

import edu.dl.project01.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    @PersistenceContext //JPA 사용
    private EntityManager em; //injection

    public void save(Member member){
        em.persist(member); //JPA가 저장하는 로직
    }
    public Member fineOne(String id){ //멤버하나
        return em.find(Member.class, id);
    }
    public List<Member> findAll(){ //멤버리스트
        return em.createQuery(
                "select m from Member m",
                        Member.class)
                .getResultList();
    }
    public List<Member> findById(String id){ //하나만 찾을 때
        return em.createQuery(
                "select m from Member m where m.id = :id",
                        Member.class)
                .setParameter("id", id)
                .getResultList();
    }
}
