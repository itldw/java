package thread_learn;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:06 2019/6/19
 * @Modified By :
 */
public class DeamonThread extends  Thread {

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        for(int i=0;i<100;i++){
            if(i==20){
                DeamonThread deamonThread=new DeamonThread();
                deamonThread.setDaemon(true);
                deamonThread.start();
            }
            System.out.println(Thread.currentThread()+" "+i);
        }
    }

}
