import java.util.Comparator;

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

        partsSurname1 = o1.getSurname().split(" ");
        partsSurname2 = o2.getSurname().split(" ");

        int resultCompareNotZero = (resultCompare == 1 || (partsSurname1.length >= quantity &&
                partsSurname2.length >= quantity )) ? -1 : 1;
        if (resultCompare == 0){
            if (o1.getAge() > o2.getAge()){
                return -1;
            } else {
                return 1;
            }
        }
        return resultCompareNotZero;
    }
}
