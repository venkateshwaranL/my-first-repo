class Animal {
    void sound() {
        System.out.println("Normal Animal of the Sound");
    }
}

class Dog extends Animal {  // Dog class inherits from Animal
    void sound() {
        System.out.println("It's Dog Sound");
    }
}

class Cat extends Animal {  // Cat class inherits from Animal
    void sound() {
        System.out.println("It's Cat Sound");
    }
}

class Main2 {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal obj1 = new Dog();  // Dog is treated as an Animal
        Animal obj2 = new Cat();  // Cat is treated as an Animal

        obj.sound();  // Calls Animal's sound method
        obj1.sound(); // Calls Dog's sound method
        obj2.sound(); // Calls Cat's sound method
    }
}
