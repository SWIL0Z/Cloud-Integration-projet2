package com.RichemeVyas.Domain;

public class User {

    User (String login){
        this.login = login;
    }

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User " + login;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof User){
            if (((User) obj).login == this.login)
                return true;
        }
        return false;
    }
}
