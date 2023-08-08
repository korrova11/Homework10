
public class Main {
    public static void main(String[] args) {
        task1();
        task1();
        task3();


    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "ФИО сотрудника - " + lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String forma = "Данные ФИО сотрудника для заполнения отчета - ";
        System.out.println(forma + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String forma = "Данные ФИО сотрудника - ";
        //сначала заменим заглавные буквы
        String fullName1 = fullName.replace("Ё", "Е");
        System.out.println(forma + fullName1.replace("ё", "е"));

    }
}