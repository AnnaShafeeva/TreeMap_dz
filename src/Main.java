import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Вася", "Иванов", 8));
        people.add(new Person("Саша", "Петров", 10));
        people.add(new Person("Мария", "Степанова", 8));
        people.add(new Person("Анна", "Александрова", 7));
        people.add(new Person("Ирина", "Зак", 100));
        people.add(new Person("Костя", "Иванов Романовский Булкин", 50));
        people.add(new Person("Поля", "Букина Булкина Гришко-Петрова", 40));
        people.add(new Person("Коля", "Чайковский Михайлов", 5));
        people.add(new Person("Оля", "Икс Мар-Таб", 70));

        Comparator<Person> comparator = (o1, o2) -> {
            int resultCompare = Integer.compare(o1.getSurname().length(), o2.getSurname().length());
            int quantity = 2;
            String[] partsSurname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] partsSurname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

            int resultCompareNotZero = (resultCompare == 1) ? -1 : 1;

            if (resultCompare == 0 || (partsSurname1.length >= quantity &&
                    partsSurname2.length >= quantity)) {
                if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return resultCompareNotZero;
        };

        Collections.sort(people, comparator);

        System.out.println(people);
    }
}
