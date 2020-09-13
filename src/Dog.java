import java.util.LinkedList;
import java.util.Scanner;

public class Dog {
    protected String name;
    protected int age;
    Dog(String n, int a){
        name=n;
        age=a;
    }
    void setAge(int a){
        age=a;
    }
    public void setName(String name){
        this.name=name;
    };
    public String getName(){
        return name;
    };
    public int getAge(){
        return age;
    };
    int ageH() {
        return age * 7;
    }
    String ToString(){
            return name+" "+age;
    }
}

class DogKennel {
    void plus(LinkedList a, int age, String name){
        Dog d=new Dog(name,age);
        a.add(d);
    }
    public static void main(String[] args){
        int n=10;
        LinkedList<Dog> dogs=new LinkedList<>();
        DogKennel ken=new DogKennel();
        ken.plus(dogs,12,"ben");
        System.out.println(dogs.get(0).ToString());

    }

}