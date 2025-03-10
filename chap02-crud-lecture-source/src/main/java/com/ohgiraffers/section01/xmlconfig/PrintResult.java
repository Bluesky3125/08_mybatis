package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    public void printErrorMessage(String message) {
        System.out.println("에러 메시지: " + message);
    }

    public void printSuccessMessage(String statusCode) {
        String successMessage = "";
        switch (statusCode) {
            case "regist": successMessage = "신규 메뉴 등록 성공"; break;
            case "modify": successMessage = "메뉴 수정 성공"; break;
            case "remove": successMessage = "메뉴 삭제 성공";
        }

        System.out.println(successMessage);
    }

    public void printMenus(List<MenuDTO> menuList) {
//        menuList.forEach(menu -> System.out.println(menu));
        menuList.forEach(System.out::println);

    }

    public void printMenu(MenuDTO menu) {
        System.out.println("menu = " + menu);
    }
}
