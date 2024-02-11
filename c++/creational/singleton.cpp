#include <iostream>
#include <string>

class SingletonClass {
    private:
        SingletonClass(const std::string name,const int id) : name(name), id(id) {
            std::cout<<"Private default constructor worked\n";
        }
        static SingletonClass* instance;
    public:
        std::string name="Name";
        int id=2347;
        SingletonClass(SingletonClass& other) = delete;
        void operator=(const SingletonClass &) = delete;
        static SingletonClass* getInstance(const std::string name,const int id);
};

SingletonClass* SingletonClass::instance=nullptr;

SingletonClass* SingletonClass::getInstance(const std::string name,const int id) {
        std::cout<<"getInstance called\n";
        if(instance==nullptr) {
            instance = new SingletonClass(name,id);
        }
        return instance;
    }

int main(int argc, char const *argv[])
{
    SingletonClass* singletonObject = SingletonClass::getInstance("Talha",4);
    std::cout<<"Name : "<<singletonObject->name<<" Id : "<<singletonObject->id<<std::endl;
    return 0;
}
