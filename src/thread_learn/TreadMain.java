package thread_learn;

/**
 * 线程的创建和启动
 * @Author:ldw
 * @Description
 * @Date ：Create in 10:54 2019/6/19
 * @Modified By :
 */
public class TreadMain {
    public static  void main(String[] args){

        //继承线程类
        ThreadCreateAndStart threadCreateAndStart=new ThreadCreateAndStart();
        threadCreateAndStart.setName("test_thread");
        threadCreateAndStart.start();
    }
}
