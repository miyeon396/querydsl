package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

    //select m from Member m Where m.username = ? 이게 매핑되면서 실행 될 것
    List<Member> findByUsername(String username);
}
