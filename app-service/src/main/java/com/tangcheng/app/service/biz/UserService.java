package com.tangcheng.app.service.biz;

import com.tangcheng.app.domain.vo.ResultData;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by tang.cheng on 2017/4/13.
 */
public interface UserService extends UserDetailsService{
    ResultData<?> getUser(String username);

    ResultData<?> putUser(String username, String email);

    ResultData<?> delUser(String username);

    ResultData<?> addUser(String username, String email, String password);
}