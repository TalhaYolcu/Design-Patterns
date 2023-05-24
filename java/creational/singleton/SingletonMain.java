package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        try {
            //initialize instance properly
            SingletonClass mySingletonClassFirst=SingletonClass.getInstance();

            //throws error
            SingletonClass mySingletonClass=new SingletonClass();
        }
        catch(Exception ex) {
            System.out.println("Constructor is called");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Program ends here");
        }
    }
}

