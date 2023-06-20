package com.example.storydashboard.service;


import com.example.storydashboard.mapper.MemberMapper;
import com.example.storydashboard.model.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class memberService {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
    Date time = new Date();
    String localTime = format.format(time);

    @Autowired
    MemberMapper memberMapper;

    // DB 상태를 변경하는 작업에 수행되어야 하는 연산
    // begin, commit을 자동으로 수행
    // 예외 발생 시 rollback 처리를 자동으로

    @Transactional
    public void joinUser(MemberVO memberVO) {

        memberVO.setIndate(localTime);
        memberMapper.saveMember(memberVO);
    }



}
