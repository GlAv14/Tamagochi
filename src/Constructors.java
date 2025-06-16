public class Constructors {
    public static void main(String[] args) {
        Human human1 = new Human("John", 23);
        human1.speak();
    }
}
    class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }


        void speak() {
            System.out.println("Hello I am " + name);
        }
    }

