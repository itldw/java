package thread_learn;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 14:27 2019/6/19
 * @Modified By :
 */
public class YeildThread extends  Thread {

    public  YeildThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println(getName()+" "+i);
            if(i==20){
                Thread.yield();
            }
        }
    }

    public  static  void main(String[] args){
        YeildThread yd1=new YeildThread("高级");
        yd1.setPriority(Thread.MAX_PRIORITY);
        yd1.start();

        YeildThread yd2=new YeildThread("低级");
        yd2.setPriority(Thread.MIN_PRIORITY);
        yd2.start();
    }


}
