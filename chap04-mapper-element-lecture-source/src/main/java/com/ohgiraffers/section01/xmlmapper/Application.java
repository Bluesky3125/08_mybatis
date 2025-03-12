package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementService es = new ElementService();

        do {
            System.out.println("===== <resultMap> 테스트 메뉴 =====");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <association> 테스트");
            System.out.println("3. <collection> 테스트");
            System.out.print("메뉴 번호를 입력하세요: ");
            int no;
            try {
                no = sc.nextInt();
            } catch (Exception e) {
                no = -1;
            }
            switch (no) {
                case 1:
                    es.selectResultMapTest();
                    break;
                case 2:
                    es.selectResultMapAssociationTest();
                    break;
                case 3:
                    es.selectResultMapCollectionTest();
                    break;
                default:
                    return;
            }
        } while (true);
    }
}
