/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketsystem;

/*
 *
 * @author Iago
 */
public class UserInfo {
    
    private int user_id;
    private String user_login;
    private String user_pass;
    private boolean tryLogin;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }
    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
    public void setTryLogin(boolean tryLogin) {
        this.tryLogin = tryLogin;
        System.out.println(tryLogin);
    }
    public int getUser_id() {
        return user_id;
    }
    public String getUser_login() {
        return user_login;
    }
    public String getUser_pass() {
        return user_pass;
    }
    public boolean getTryLogin() {
        return tryLogin;
    }
}
