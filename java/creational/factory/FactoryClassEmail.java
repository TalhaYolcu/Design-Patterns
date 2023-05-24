package factory;

//Email is a notification
public class FactoryClassEmail implements FactoryInterfaceNotification {
    
    @Override
    public void notifyUser() {
        System.out.println("Sending an email...");
    }
    //empty constructor
    public FactoryClassEmail() {}
}
