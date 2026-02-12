package org.example.practice.service;

import lombok.RequiredArgsConstructor;
import org.example.practice.domain.MemberDTO;
import org.example.practice.domain.MemberVO;
import org.example.practice.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface MemberService {


    public MemberVO get(Long memberId);

}
