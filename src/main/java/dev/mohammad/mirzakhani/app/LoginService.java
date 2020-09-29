package dev.mohammad.mirzakhani.app;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String login(String username) {

        return username + " : You have successfully signed in";
    }
}
