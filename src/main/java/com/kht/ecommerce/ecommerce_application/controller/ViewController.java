package com.kht.ecommerce.ecommerce_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    // 사용자 목록 페이지
    @GetMapping("/")
    public String usersPage() {
        return "index";
    }

    // 상품 목록 페이지
    @GetMapping("/products")
    public String productsPage() {
        return "products";
    }

    // 장바구니 페이지
    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }

    // 유저 장바구니 페이지
    @GetMapping("/cart{userId}")
    public String getCartByUserId(@PathVariable("userId") int id) {
        return "cart";
    }

    // 회원가입 페이지 볼 수 있게 회원가입.html 불러오기
    @GetMapping("/join")
    public String joinPage() {
        return "join";
    }

    // 유저 정보 수정 페이지 조회 user-edit.html
    @GetMapping("/user/edit")
    public String userEditPage(@RequestParam("id") int id) {
        return "user_edit";
    }
    @GetMapping("/products/insert")
    public String  getProduct() {
        return "insertProduct";
    }

    @GetMapping("/inputEmail")
    public String  getEmail() {
        return "inputEmail";
    }

    // 수정하기  RequestParam 은 url 작성 X
    @GetMapping("/update/product")
    public String  updateProduct(@RequestParam("id") int id) {
        return "updateProduct";
    }
}