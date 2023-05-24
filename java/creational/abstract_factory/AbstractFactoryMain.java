package abstract_factory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        //Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
        // It allows you to create families of objects that are designed to work together. 

        //You can create different buttons and text on different operating systems

        
        //first have an abstract factory
        AbstractFactory factory1 = new ConcreteFactory1();

        //create products from factory1
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.doSth();
        productB1.doSth();

        //then have another factory
        AbstractFactory factory2 = new ConcreteFactory2();

        //create prodcuts from factory2
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.doSth();
        productB2.doSth();
    }
}
