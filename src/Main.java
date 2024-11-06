public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        //task 2
        System.out.println("Task 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task 3
        System.out.println("Task 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
    }
}



