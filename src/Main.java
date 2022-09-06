import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Вася", "Иванов", 8));
        people.add(new Person("Саша", "Петров", 10));
        people.add(new Person("Мария", "Степанова", 8));
        people.add(new Person("Анна", "Александрова", 7));
        people.add(new Person ("Ирина", "Зак", 100));
        people.add(new Person("Костя", "Иванов Романовский Булкин", 50));
        people.add(new Person("Поля", "Букина Булкина Гришко-Петрова", 40));
        people.add(new Person("Коля", "Чайковский Михайлов", 5));
        people.add(new Person("Оля", "Икс Мар-Таб", 70));

        Collections.sort(people, new PersonsLengthComparator(2));

        System.out.println(people);
    }
}
