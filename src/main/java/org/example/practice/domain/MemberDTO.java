package org.example.practice.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    // Mapper 어노테이션 사용시 사용
    Long memberId;
    String username;
    int age;

}
