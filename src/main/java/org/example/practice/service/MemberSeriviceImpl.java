package org.example.practice.service;

import lombok.RequiredArgsConstructor;
import org.example.practice.dao.MemberDAO;
import org.example.practice.domain.MemberVO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberSeriviceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Override
    public MemberVO get(Long memberId) {
        return memberDAO.findById(memberId);
    }

}
