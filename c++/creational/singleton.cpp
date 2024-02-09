#include<iostream>
#include <string>

class SingletonClass {
    private:
    SingletonClass instance=nullptr;
    SingletonClass(string name,int id) : name(name), id(id) {
        std::cout<<"Private default constructor worked\n";
    }
    public:
    std::string name="Name";
    int id=2347;
    static SingletonClass getInstance() {
        std::cout<<"getInstance called\n";
        if(instance!=nullptr) {
            instance = new SingletonClass(name,id);
        }
        return instance;
    }
}

int main(int argc, char const *argv[])
{
    SingletonClass singletonObject = SingletonClass.getInstance();
    std::cout<<"Name : "<<singletonObject.name<<" Id : "<<singletonObject.id<<std::endl;
    return 0;
}
