package CatalinTEst;

public class Person  implements Behavior {
    public String present(){
        return "I'm a person ";
    }

    @Override
    public void eat() {
        System.out.println("I'm eating ");
    }
}
