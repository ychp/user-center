package com.ychp.club.auth.utils;

import com.ychp.club.common.util.CustomerStringUtils;
import org.springframework.util.StringUtils;

/**
 * Desc:
 * Author: <a href="ychp@terminus.io">应程鹏</a>
 * Date: 16/12/14
 */
public class AuthUtils {

    private static final String PERM_TEMPLATE = "perms[{0}]";

    public static String getAuth(String auth, String permKey){
        String fullAuth = auth;
        if(!StringUtils.isEmpty(permKey)){
            fullAuth += "," + CustomerStringUtils.formatString(PERM_TEMPLATE, permKey);
        }
        return fullAuth;
    }


}
