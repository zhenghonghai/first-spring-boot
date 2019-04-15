package modules.login.entity;

import java.io.Serializable;

public class Login implements Serializable {

    private static final long serialVersionUID = 1l;
    private int id;     // 主键
    private String username;    // 登录用户名
    private String password;    // 密码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
