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

       //task 3
        System.out.println("Task 3");
        age = 12;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
                System.out.println("Если человеку " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + ", то его место в университете");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + ", то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если человеку " + age + ", то ему пора ходить на работу");
        }

        //task 4
        System.out.println("Task 4");

        age= 8;
        if (age < 5) {
            System.out.println("Если возраст равен " + age + ", то он не может кататься на аттракционе.");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age > 14) {
            System.out.println("Если возраст равен " + age + ", то он может кататься без сопровождения взрослого.");
        }

    }
}



