public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("John");
        person1.setAge(12);
        person1.calculate();


    }
}

class Person {
    private String name;
    private int age;
    private int yearsToRetirement;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Error");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println(name + " " + age);
    }

    void calculate() {
        yearsToRetirement = 70 - age;
        System.out.println(name + " years to retirement is " + yearsToRetirement);
    }
}



