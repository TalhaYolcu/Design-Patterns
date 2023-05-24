package abstract_factory;

public interface AbstractFactory {
    //most upper base class, all ConcreteFactory classes derives from here
    //if you implement this interface, you can create products
    ProductA createProductA();
    ProductB createProductB();
}
