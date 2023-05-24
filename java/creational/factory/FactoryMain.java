package factory;

public class FactoryMain {
    public static void main(String[] args) {
        //this pattern is helpful when you want to abstract the object creation process and make it customizable in subclasses

        //to create objects, we have to have a factory
        FactoryClassNotification notificationFactory=new FactoryClassNotification();

        //create sms
        FactoryInterfaceNotification notificationSMS = notificationFactory.createNotifiaction("SMS");
        notificationSMS.notifyUser();

        //create email
        FactoryInterfaceNotification notificationMail = notificationFactory.createNotifiaction("EMAIL");
        notificationMail.notifyUser();   
    
    }
}
