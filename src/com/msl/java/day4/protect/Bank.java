package com.msl.java.day4.protect;



 public  class   Bank {
       private Bank(){

       }
       private static Bank instance = new Bank();

       public  static  Bank getInstance(){
           return instance;
       }
}
