package com.example.project2611

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/fc
    fun loginCheck():Boolean{
        if(username.equals("salwa") && password.equals("amikom")) {
            return true
        }else{
            return false
        }
    }

}