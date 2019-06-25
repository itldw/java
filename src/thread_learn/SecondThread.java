package thread_learn;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:42 2019/6/25
 * @Modified By :
 */
public class SecondThread implements Runnable {
    private  int i;
    public void run() {
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static  void main(String[] args){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20){
                SecondThread secondThread=new SecondThread();
                new Thread(secondThread,"新线程1").start();
                new Thread(secondThread,"新线程2").start();
            }

        }
    }
}
