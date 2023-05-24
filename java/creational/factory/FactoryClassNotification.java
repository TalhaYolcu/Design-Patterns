package factory;

//notification generator class, does not need to be inherit from interface, it just generates
public class FactoryClassNotification {
    //generate a notification based instance
    public FactoryInterfaceNotification createNotifiaction(String channel) {
        //empty class name
        if(channel==null || channel.isEmpty()) {
            return null;
        }
        switch (channel) {
            //generate sms
            case "SMS" : return new FactoryClassSMS();
            
            //generate email
            case "EMAIL" : return new FactoryClassEmail();
            
            //there is no type with given name
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);

        }
    }
}
