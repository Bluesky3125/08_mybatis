package com.ohgiraffers.section01.xmlconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuController mc = new MenuController();
        do {
            System.out.println("===== 메뉴 관리 =====");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 관리 번호를 입력하세요: ");
            int no;
            try {
                no = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                continue;
            }
            switch (no) {
                case 1:
                    mc.findAllMenus();
                    break;
                case 2:
                    mc.findMenuByMenuCode(inputMenuCode());
                    break;
                case 3:break;
                case 4:break;
                case 5:break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
            }
        } while (true);
    }

    /* 설명. 사용자의 입력 값을 Map<String, String> 형태로 반환(request의 parameter 개념 적용) */
    private static Map<String, String> inputMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 메뉴를 입력하세요: ");
        String menuCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);

        return parameter;
    }
}
