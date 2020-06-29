package com.msl.java.day7;

public enum Genders implements  GenderDesc{
    MALE("男"){
        public void info(){
            System.out.println("这个枚举值代表男性");
        }
    },
    FEAMALE("女"){
        @Override
        public void info() {
            System.out.println("这个枚举值代表女性");
        }
    };
    private  final  String name;
   private Genders(String name) {
        this.name = name;
    }

}
