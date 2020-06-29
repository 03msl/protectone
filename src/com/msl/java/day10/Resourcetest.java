package com.msl.java.day10;

class Resoure{
    private  String name;
    private String sex;
    private boolean falg = false;

    public synchronized void set(String name,String sex){
           if(falg)
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.name = name;
            this.sex = sex;
            falg = true;
            this.notifyAll();
        }
     public synchronized  void out(){
    if(!falg)
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println(name + "    " +sex);
        falg =false;
        notifyAll();

     }
}
    class Input implements Runnable{
       Resoure r ;
       Input(Resoure r){
           this.r = r;
       }
        @Override

        public void run() {
            int x =0;
            while(true){
                if(x==0){
                    r.set("abc","nan");
                }
                else {
                    r.set("丽丽","nv");
                }
                x=(x+1)%2;
            }
        }
    }
    class Output implements  Runnable{
     Resoure r;
     Output(Resoure r){
         this.r = r;
     }
        @Override
        public void run() {
         while (true){
             r.out();
         }

        }
    }
public class Resourcetest {
    public static void main(String[] args) {
        Resoure r = new Resoure();
        Input in = new Input(r);
        Output out = new Output(r);
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}
