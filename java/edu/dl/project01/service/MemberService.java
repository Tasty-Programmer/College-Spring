package edu.dl.project01.service;

import edu.dl.project01.domain.Member;
import edu.dl.project01.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //JPA서비스는 트랜잭션 내에서 실행
@Transactional(readOnly = true) //읽기 성능 최적화
public class MemberService {
    @Autowired //인젝션을 위해
    private MemberRepository memberRepository;
    //가입
    @Transactional(readOnly = false) //읽기만 하는것은 아니기 때문
    public String join(Member member){
        //저장 전 중복 검색
        memberRepository.save(member); //저장
        return member.getId();
    }
    private void validateDuplicateMember(Member member){
        List<Member> findMembers = 
                memberRepository.findById(member.getId());

        if(!findMembers.isEmpty()){
            throw new IllegalStateException("존재하는 회원");
        }
    }
    //조회/전체조회 //readonly = true 적용되어 있음
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }
    public Member findOne(String id){
        return memberRepository.fineOne(id);
    }
}
