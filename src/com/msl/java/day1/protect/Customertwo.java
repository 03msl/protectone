package com.msl.java.day1.protect;

/**
 * @ClassName Customertwo
 * @Description TODO
 * @Author Administrator
 * @Date 2020/6/18 10:54
 * @Version 1.0
 **/

public class Customertwo {
    private  String firstName;
    private  String lastname;
    private Accountwo accountw;
    public  Customertwo(String f,String l){
        firstName=f;
        lastname=l;
    }
    public  String getFirstName(){
        return  firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Accountwo getAccountw() {
        return accountw;
    }

    public void setAccountw(Accountwo acct) {
       accountw=acct;
    }
}
