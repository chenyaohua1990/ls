package com.skms;

import com.skms.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("userImp")
public class UserImp implements UserApi {
    @Autowired
    private UserService userSerice;

    public String login(Map<String, String> map) {
        userSerice.login(map);
        return null;
    }

}
