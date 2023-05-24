package builder;

public class BuilderMain {
    public static void main(String[] args) {
        //object to be builded
        Person person=new Person.Builder().
            name("Name").age(18).gender(true).build();
        
        System.out.println("Builded person:");
        System.out.println(person.toString());
    }
    
}
