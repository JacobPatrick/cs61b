public class Cat extends Animal {
    // Note that the constructors of the classes are not inheritated.
    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow";
    }

    @Override
    public void greet() {
        System.out.println("Cat " + name + " says: " + makeNoise());
    }

    public static void main(String[] args) {

        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 5);
        a.greet();
        c.greet();

        a = c;
        ((Cat) a).greet(); // One kind of wierd syntax.
        a.greet(); // If the method is overrided, when called, the dynamic class will be called.
    }
}
