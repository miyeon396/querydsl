package study.querydsl.repository;

import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    //이 기능을 내가 직접 구현한 애를 사용하고 싶음 springdatajpa사용하면서
    List<MemberTeamDto> search(MemberSearchCondition condition);

}
