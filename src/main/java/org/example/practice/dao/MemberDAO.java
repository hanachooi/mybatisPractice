package org.example.practice.dao;

import lombok.RequiredArgsConstructor;
import org.example.practice.domain.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class MemberDAO {

    // Mapper 인터페이스 대신에 sqlSessionTemplate 이 xml을 직접 호출
    private final SqlSessionTemplate sqlSession;

    // mapper.xml의 경로 지정임. mapper.xml 의 NAMESPACE와 일치해야함
    private static final String NAMESPACE = "org.example.practice.mapper.MemberMapper";

    // 직접 xml 을 호출해야함
    public MemberVO findById(Long memberId) {
        return sqlSession.selectOne(NAMESPACE + ".findById", memberId);
    }

}
