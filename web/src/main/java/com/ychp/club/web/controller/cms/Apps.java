package com.ychp.club.web.controller.cms;

import com.ychp.club.auth.application.AuthorityManager;
import com.ychp.club.auth.model.App;
import com.ychp.club.common.model.Paging;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Desc:
 * Author: <a href="ychp@terminus.io">应程鹏</a>
 * Date: 16/12/9
 */
@Slf4j
@Controller
@RequestMapping("/cms")
public class Apps {

    @Autowired
    private AuthorityManager authorityManager;

    @RequestMapping("/apps")
    public String apps(Model model, @RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                        @RequestParam(value = "pageSize",defaultValue = "20") Integer pageSize){

        Paging<App> appPaging = authorityManager.pagingApp(pageNo, pageSize, null);

        model.addAttribute("apps", appPaging);
        return "auth/app/apps";
    }

}