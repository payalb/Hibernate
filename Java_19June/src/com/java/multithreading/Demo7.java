package com.java.multithreading;

 class Test extends Thread{
    private int i;
    public void run(){
          i++;
    }

    public static void main(String[] args) throws InterruptedException{
          Test a = new Test();
          a.run();
          System.out.print(a.i);
          a.start();
          a.join();
          System.out.print(a.i);
          Test b = new Test();
          b.start();
          b.join();
          System.out.print(b.i);
    }
}