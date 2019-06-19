package thread_learn;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 13:54 2019/6/19
 * @Modified By :
 */
public class JoinTread extends  Thread {


    public  JoinTread(String name){
        super(name);
    }


    @Override
    public void run() {

        for(int i=0;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static  void main(String[] args) throws InterruptedException {
        new JoinTread("新线程").start();
        for(int i=0;i<100;i++){
            if(i==20){
                JoinTread jt=  new JoinTread("被join的线程");
                jt.start();
                jt.join();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}
