package thread_learn;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 11:00 2019/6/19
 * @Modified By :
 */
public class ThreadCreateAndStart extends  Thread {

    @Override
    public void run() {
         for(int i=0;i<100;i++){
             System.out.println("thread name:"+getName()+"_"+i);

         }
    }
}
