package org.example.practice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.practice.domain.MemberDTO;

import java.util.List;

@Mapper
public interface MemberMapper {

    MemberDTO findById(Long memberId);
}
