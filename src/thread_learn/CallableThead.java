package thread_learn;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 15:08 2019/6/25
 * @Modified By :
 */
public class CallableThead {

    public static  void main(String[] args){

        FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for(;i<100;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            //call方法返回值
            return  i;
        });

        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20){
                new Thread(task,"带有返回值的线程").start();
            }

            try {
                 System.out.println("子线程的返回值"+ task.get());
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
