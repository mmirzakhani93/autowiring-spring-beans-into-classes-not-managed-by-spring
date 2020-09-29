package dev.mohammad.mirzakhani.app;

public class Controller {

    private LoginService loginService;

    public Controller() {

        loginService = BeanUtil.getBean(LoginService.class);
    }

    public void login() {

        System.out.println(loginService.login("Mirzakhani"));
    }
}
