package builder;

//class to be builded
public class Person {
    //fields
    private String name;
    private int age;
    private boolean gender;

    //constructor that takes a builder, it is called after builder
    private Person(Builder builder) {
        name=builder.name;
        age=builder.age;
        gender=builder.gender;
    }

    
    //public inner builder class, it is called before person's constructor
    public static class Builder {
        private String name;
        private int age;
        private boolean gender;

        //empty constructor
        public Builder() {}

        //Build name property
        public Builder name(String name) {
            this.name=name;
            return this;
        }

        //Build age property
        public Builder age(int age) {
            this.age=age;
            return this;
        }

        //Build gender property
        public Builder gender(boolean gender) {
            this.gender=gender;
            return this;
        }
        //Build the Person, it should be called after properties builded
        public Person build() {
            return new Person(this);
        }

    }
    //getters for person
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

}
