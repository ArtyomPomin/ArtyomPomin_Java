package Ex8;

public class Animal extends Predator{
    protected String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void hunt() {
        {
            System.out.println(name+ " хищник");
        }
    }
}


