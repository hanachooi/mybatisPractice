package org.example.practice.controller;

import lombok.RequiredArgsConstructor;
import org.example.practice.domain.MemberDTO;
import org.example.practice.domain.MemberVO;
import org.example.practice.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public MemberVO get(@PathVariable Long id){
        return memberService.get(id);
    }

}
