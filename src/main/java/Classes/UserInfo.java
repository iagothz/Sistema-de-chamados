/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/*
 *
 * @author Iago
 */
public class UserInfo {
    
    private static int user_id;
    private static String user_login;
    private static String user_pass;
    private static boolean tryLogin;

    public void setUser_id(int user_id) {
        UserInfo.user_id = user_id;
    }
    public void setUser_login(String user_login) {
        UserInfo.user_login = user_login;
    }
    public void setUser_pass(String user_pass) {
        UserInfo.user_pass = user_pass;
    }
    public void setTryLogin(boolean tryLogin) {
        UserInfo.tryLogin = tryLogin;
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
