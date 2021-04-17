package Exercise;

//упражнение №6

public class Ex6 {
    public static void main(String[] arqs) {

        Dragon drogo = new Dragon("Дрого", 64 );
        Dragon reigal = new Dragon("Рейгаль", 62);
        Dragon viserion = new Dragon("Визерион", 60);

        drogo.fire("Рейгаль");
        System.out.println();
    }

    private static class Dragon {
        String name;
        int tooth;

        public Dragon(String name, int tooth) {
            this.name = name;
            this.tooth = tooth;
        }

        public String getName() {
            return name;
        }

        public int getTooth(int tooth) {
            return tooth;
        }

        public void fire(String name) {
        System.out.println(getName() + " ударил " + name); }
    }
}

        
        


