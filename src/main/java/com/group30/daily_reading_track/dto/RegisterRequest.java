package com.group30.daily_reading_track.dto;
// 用于注册时接收参数
public class RegisterRequest {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private String verificationCode;
    
    // getter 和 setter
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
 
    public String getConfirmPassword() {
        return confirmPassword;
    }
 
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerificationCode(){
        return verificationCode;
    }
    
    public void setVerificationCode(String verificationCode){
        this.verificationCode = verificationCode;
    }
}