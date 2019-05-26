package com.matvey.exceptions;

public class AuthDoubleName extends AuthFailException {
    private String nickname;

    public AuthDoubleName(String nick) {
        super();
        this.nickname = nick;
    }
}
