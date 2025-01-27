package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();


    // 사용자 저장
    void insertUser(User user);
    // 비밀번호만 암호화해서 처리
    User getByUserId(int id);
    // 이메일 존재 유무 확인
    boolean existByEmail(String email);

    int editUser(User user);
}