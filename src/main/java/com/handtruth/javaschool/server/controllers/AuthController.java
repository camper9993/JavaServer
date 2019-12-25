package com.handtruth.javaschool.server.controllers;

import com.handtruth.javaschool.server.model.AllUserData;
import com.handtruth.javaschool.server.model.AuthResponse;
import com.handtruth.javaschool.server.model.RegisterResponse;
import com.handtruth.javaschool.server.model.UserDetail;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AuthController {

    private Map<String, AllUserData> userDatabase = new HashMap<>();
    private Map<String, String> tokenTable = new HashMap<>();

    {
        userDatabase.put("admin@test.test", new AllUserData(
                        new UserDetail("Lexa", "Danilov", "20", "admin@test.test", "simple123456"),
                        Arrays.asList(0, 1),
                        Collections.singletonList(0)
                )
        );
    }

    @PostMapping(value = "/auth", produces = "application/json")
    public AuthResponse auth(@ModelAttribute @Valid UserDetail user) {
        String login = user.getLogin();
        String password = user.getPassword();
        System.out.println(user.toString());
        if (userDatabase.containsKey(login) && userDatabase.get(login).getUser_detail().getPassword().equals(password)) {
            String token = "123123123123";
            tokenTable.put(login, token);
            return new AuthResponse(200, token, userDatabase.get(login));
        } else {
            return new AuthResponse(-1, "-1", null);
        }
    }

    @PostMapping(value = "/registration", produces = "application/json")
    public RegisterResponse registration(@ModelAttribute @Valid UserDetail user) {
        String login = user.getLogin();
        String password = user.getPassword();
        if (!userDatabase.containsKey(login)) {
            userDatabase.put(user.getLogin(), new AllUserData(user, Collections.emptyList(), Collections.emptyList()));
            return new RegisterResponse(200, user);
        } else {
            return new RegisterResponse(-1, null);
        }
    }
}
