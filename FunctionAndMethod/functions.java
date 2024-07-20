package FunctionAndMethod;

public class functions {
    static class Human{
        int age;
        String name;

        public Human(){
            age=21;
            name="nahak";
        }

    }
    public static void main(String[] args) {

        Human obj = new Human();
        System.out.println(obj.age+"---"+obj.name);


    }

}
