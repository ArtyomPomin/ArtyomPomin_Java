package Exercise;

public class Dragon {
    static Dragon drogo = new Dragon("Дрого", 64);
    static Dragon reigal = new Dragon("Рейгаль", 62 );
    static Dragon viserion = new Dragon("Визерион", 60);

    private String name;
    private int tooth;

    public Dragon(String name, int tooth) {
        this.name = name;
        this.tooth = tooth;
    }

    public static void main(String[] args) {
        drogo.fire("Рейгаль");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getTooth(int tooth) {
        return tooth;
    }
    public void fire(String name){
        System.out.println(getName() + " ударил " +name);
    }
}

        
        


