public class Main {

    public static void main(String[] args) {

        Student paul = new Student();

        if (paul.age == 1) {
            System.out.printf("\n%s is %d year old!\n",paul.name, paul.age);
        } else {
            System.out.printf("\n%s is %d years old!\n",paul.name, paul.age);
        }

        paul.study();

    }

}
