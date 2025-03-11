package com.ohgiraffers.section01.xml;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<MenuDTO> selectMenuByPrice(int maxPrice);
    List<MenuDTO> searchMenu(SearchCriteria searchCriteria);
    List<MenuDTO> searchMenuBySupCategory(SearchCriteria searchCriteria);
    List<MenuDTO> searchMenuByRandomMenuCode(List<Integer> randomList);
    List<MenuDTO> searchMenuByCodeOrAll(SearchCriteria searchCriteria);
    List<MenuDTO> searchMenuByNameOrCategory(Map<String, Object> searchCriteriaMap);

    int updateMenu(Map<String, Object> criteria);
}
