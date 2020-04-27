package CatalinTEst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.present());
        person.eat();

        Professor professor = new Professor();
        System.out.println(professor.present());
        professor.teachMath();
        professor.eat();

        Person catalin = new Professor();
        System.out.println(catalin.present());


        Person sergiu = new Student();
        sergiu.present();

        Behavior behavior = new Professor();
        behavior.eat();

        List<String> tomatoes = new ArrayList<String>();
        List<String> potatoes = new LinkedList<String>();
        read(potatoes);

    }
    public static void read(List<String> arrayList){
    }

}

