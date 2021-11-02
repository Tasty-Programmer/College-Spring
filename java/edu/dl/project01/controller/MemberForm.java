package edu.dl.project01.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
//import javax.validation.constraints.NotEmpty;

@Getter @Setter
@Slf4j
public class MemberForm {

    //@NotEmpty(message = "ID는 필수 입력값 입니다.")
    private String id;

    //@NotEmpty(message = "이름은 필수 입력값 입니다.")
    private String name;

    private String email;

    private String phone;

    private String address;

    private Long zipcode;
}
