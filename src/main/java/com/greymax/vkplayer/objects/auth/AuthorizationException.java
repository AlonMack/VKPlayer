package com.greymax.vkplayer.objects.auth;


public class AuthorizationException extends Exception{
    @Override
    public String getMessage(){
        return "Authorization failed. Bad e-mail/password?";
    }
}


