package com.example.storydashboard.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class MemberVO {
    private int idx;
    @NotBlank(message = "이름은 필수 입력값입니다")
    @Pattern(regexp="(^[a-zA-Z]+$)",
            message = "이름은 영문으로 입력합니다")
    private String firstname;
    @NotBlank(message = "성은 필수 입력값입니다")
    @Pattern(regexp="(^[a-zA-Z]+$)",
            message = "이름은 영문으로 입력합니다")
    private String secondname;
    @NotBlank(message = "이메일도 필수 입력값입니다")
    @Email(message = "이메일 형식에 맞지 않습니다.")
    private String email;
    private String indate;
    private int withdraw;
    @NotBlank(message = "비밀번호도 필수 입력값입니다")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String password;

}
