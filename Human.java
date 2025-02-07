abstract class Human {

    public String name = "Paul-Ludwig";
    public int age = 15;

    public abstract void study();

}

class Student extends Human{

    public int year = 10; //year in school
    public void study() {
        System.out.println("I am studying very hard!");
    }
}
