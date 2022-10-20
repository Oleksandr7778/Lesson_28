public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Oleksandr");

        int age = 18;

        if (age < 0) {
            System.out.println("You entered invalid data");
        } else if (age >= 0 && age <= 17) {
            System.out.println("You are not adult");
        } else {
            System.out.println("You are adult");
        }



        int salary = 3500;
        int experience = 1;
        extracted(experience, salary);

        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;
        }
        {
            System.out.println("sum=" + sum);
        }


    }

    private static void extracted(int experience, int salary) {

        float coeficient = 0f;

        if (experience >= 1 && experience <= 3) {
            coeficient = 0.1f;
        }
        if (experience > 3) {
            coeficient = 0.2f;
        }

        salary += (int) (salary * coeficient);
        if (salary < 4000) {
            salary += 1000;
        } else {
            salary += 500;
        }

        System.out.println("Your salary = " + salary);
    }

}
