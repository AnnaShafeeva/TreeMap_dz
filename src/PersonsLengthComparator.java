import java.util.Comparator;
import java.util.regex.Pattern;

public class PersonsLengthComparator implements Comparator<Person> {
    private String[] partsSurname1;
    private String[] partsSurname2;
    private int quantity;


    public PersonsLengthComparator(int quantity){
        this.quantity = quantity;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int resultCompare = Integer.compare(o1.getSurname().length(), o2.getSurname().length());

        partsSurname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        partsSurname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

        int resultCompareNotZero = (resultCompare == 1) ? -1 : 1;

        if (resultCompare == 0 || (partsSurname1.length >= quantity &&
                partsSurname2.length >= quantity )){
            if (o1.getAge() > o2.getAge()){
                return -1;
            } else {
                return 1;
            }
        }
        return resultCompareNotZero;
    }
}
