package singleton;

import javax.management.RuntimeErrorException;

public class SingletonClass {

    //instance to be created only once
    private static volatile SingletonClass x;
    
    //constructor ensures that there is no having an instance except than getInstance method
    public SingletonClass() {
        if(x!=null) {
            throw new RuntimeErrorException(new Error("please call getInstance method!"));
        }
    }

    //method ensures that object is created only once
    public synchronized static SingletonClass getInstance() {
        //first check, if it is not null, another thread created it before
        if(x==null) {
            //thread sync
            synchronized (String.class) {
                //double check, if any of the two threads passed the first check simultaneously, then they will return from here
                if(x==null) {
                    //create object here
                    x=new SingletonClass();
                }
            }
        }
        //return object here
        return x;
    }
}
