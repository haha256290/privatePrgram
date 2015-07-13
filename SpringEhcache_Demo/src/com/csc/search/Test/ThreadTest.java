package com.csc.search.Test;
public class ThreadTest {  
    public static void main(String[] args) {  
          
        final Business business=new Business();  
  
          
        //子线程  
        new Thread(new Runnable() {  
            public void run() {  
                for (int i = 0; i < 5; i++) {  
                    try {  
                        business.sub(i);  
                    } catch (InterruptedException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }  
                }  
            }  
        }).start();  
          
//----------------------------线程二-------------------------------------------------  
          
        //main方法本身是个线程，即线程二运行代码直接放到main方法中  
        for (int i = 0; i < 5; i++) {  
            try {  
                business.main(i);  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
          
    }  
}  
  
class Business{  
    private boolean isSub=true;//当前运行的方法是sub()  
      
    //线程一  
    public synchronized void sub(int i) throws InterruptedException {  
        while (!isSub) {  
            this.wait();  
        }  
        for (int j = 0; j < 10; j++) {  
            System.out.println("sub thread sequence is "+j+" and loop is "+i);  
        }  
        isSub = false;  
        this.notify();  
    }  
      
    //主线程，即main  
    public synchronized void main(int i) throws InterruptedException{  
        while (isSub) {  
            this.wait();  
        }  
        for (int j = 0; j < 10; j++) {  
            System.out.println("main thread sequence is "+j+" and loop is "+i);  
        }  
        isSub = true;  
        this.notify();  
    }  
}  