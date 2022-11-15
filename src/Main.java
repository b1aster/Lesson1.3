public class Main {
    public static void main(String[] args) {

        // Задача 1
        int personId = 1024;
        byte personAge = 34;
        short counter = 5234;
        long countOfStars = 84723894728934L;
        float posX = 0.27f;
        double posY = 1.0d;

        System.out.println("Значение переменной personId с типом int равно " + personId);
        System.out.println("Значение переменной personAge с типом byte равно " + personAge);
        System.out.println("Значение переменной counter с типом short равно " + counter);
        System.out.println("Значение переменной countOfStars с типом long равно " + countOfStars);
        System.out.println("Значение переменной posX с типом float равно " + posX);
        System.out.println("Значение переменной posY с типом double равно " + posY);

        // Задача 2
        float temp = 27.12f;
        long countOfSands = 987_678_965_549L;
        byte a = 2;
        short b = 786;
        boolean isPerson = false;
        int maxLines = 569;
        short alt = -159;
        short firstNumber = 27897;
        double height = 67.d;

        // Разделитель
        System.out.println();

        // Задача 3
        byte studentsOfLP = 23;
        byte studentsOfAS = 27;
        byte studentsOfEA = 30;

        short totalPages = 480;

        int totalStudents = studentsOfLP + studentsOfAS + studentsOfEA;
        int pagesPerStudent = totalPages / totalStudents;

        System.out.println("На каждого ученика рассчитано " + pagesPerStudent + " листов бумаги");

        // Разделитель
        System.out.println();

        // Задача 4
        int prodIn2min = 16;
        System.out.println("За 2 минуты работы машины произвела бутылок " + prodIn2min + " штук");

        int prodIn20min = prodIn2min * 10;
        System.out.println("За 20 минут работы машины произвела бутылок " + prodIn20min + " штук");

        int prodIn24hours = prodIn20min * 3 * 24;
        System.out.println("За 24 часа работы машины произвела бутылок " + prodIn24hours + " штук");

        int prodIn3Days =  prodIn24hours * 3;
        System.out.println("За 3 дня работы машины произвела бутылок " + prodIn3Days + " штук");

        int prodIn1Month = prodIn3Days * 10; // 30 days
        System.out.println("За 1 месяц работы машины произвела бутылок " + prodIn1Month + " штук");
    }
}