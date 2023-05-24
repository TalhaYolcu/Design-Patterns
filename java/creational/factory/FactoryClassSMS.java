package factory;

//sms is a notification
public class FactoryClassSMS implements FactoryInterfaceNotification{
    
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS...");
    }
    //empty constructor
    public FactoryClassSMS() {}
}
