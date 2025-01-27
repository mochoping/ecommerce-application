package com.kht.ecommerce.ecommerce_application.mapper;

import com.kht.ecommerce.ecommerce_application.dto.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    // 사용자 조회
    List<User>  getAllUsers();
    // 사용자 저장
    void insertUser(User user);
    User getByUserId(int id);
    // 이메일 존재 유무 확인

    // int get = 몇 개 찾았는지 관행.
    int existByEmail(String email);

    // 수정하기 수정을 1가지만 진행할 경우 void 로 작성할 수 있음
    // 갯수가 여러개일 경우 int 사용하는 것이 좋음
    int editUser(User user);
}