package com.example.storydashboard.controller;

import com.example.storydashboard.model.MemberVO;
import com.example.storydashboard.service.memberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class DashBoardController {

    @Autowired
    memberService memberService;

    @GetMapping("/")
    public String homepage() {
        return "/index";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/regist")
    public String registForm() {
        return "register";
    }

    @PostMapping("/singUp")
    public String signUp(@Valid MemberVO memberVO) {
        memberService.joinUser(memberVO);
        return "redirect:/login";
    }


}
