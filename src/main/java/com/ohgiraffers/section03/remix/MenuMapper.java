package com.ohgiraffers.section03.remix;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> findAllMenus();

    MenuDTO findMenuByMenuCode(int menuCode);

    int registMenu(MenuDTO menu);

    int modifyMenu(MenuDTO menu);
    int removeMenu(MenuDTO menu);
}
