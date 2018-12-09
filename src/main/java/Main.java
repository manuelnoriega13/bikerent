import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("a");
        person.setDirection("a direction");
        person.setPhoneNumer("13");

        Bike bike1 = new Bike();
        bike1.setId(1L);
        bike1.setType("type 1");

        Bike bike2 = new Bike();
        bike2.setId(1L);
        bike2.setType("type 2");

        Bike bike3 = new Bike();
        bike3.setId(1L);
        bike3.setType("type 3");

        Bike bike4 = new Bike();
        bike4.setId(1L);
        bike4.setType("type 4");

        Bike bike5 = new Bike();
        bike5.setId(1L);
        bike5.setType("type 5");

        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        bikeList.add(bike3);
        bikeList.add(bike4);
        bikeList.add(bike5);

        Rent rent = new Rent();
        rent.setAmount(24.0);
        rent.setPrice(Rent.Price.week);
        rent.setPerson(person);
        rent.setBikeList(bikeList);
        Double a = rent.getRentBike(bikeList);
        System.out.println(a);
       rent.info();
    }
}
