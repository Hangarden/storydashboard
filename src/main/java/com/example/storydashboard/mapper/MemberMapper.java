package com.example.storydashboard.mapper;

import com.example.storydashboard.model.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void saveMember(MemberVO memberVO);
}
