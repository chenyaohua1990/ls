package com.skms;

import com.alibaba.fastjson.JSON;
import com.skms.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class UserImp implements UserApi {
    @Autowired
    private UserService userSerice;

    public String login(HashMap<String, String> map) {
        System.out.print(JSON.toJSONString(map));
        userSerice.login(map);
        return null;
    }

}
