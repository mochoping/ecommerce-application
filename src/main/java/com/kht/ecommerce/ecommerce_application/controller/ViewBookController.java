package com.kht.ecommerce.ecommerce_application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewBookController {
    /*
    View - html 주소
    html 파일을 바라보는 주소와
    url 명칭 보통 동일하게 작성
    예외 ) 수정 / 상세보기 / 검색 일치하지 않을 수 있음

    Api  - JSON 데이터 주소
    html 파일명과  api 주소와 다르게 작성
    * */
    @GetMapping("/books")
    public String bookList() {
        return "books";
    }
}