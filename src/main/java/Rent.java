import java.util.List;


public class Rent {

    public enum Price {
        hour(5),
        day(20),
        week(60),
        ;
        private Integer value;

        Price(Integer value) {
            this.value = value;
        }
    }

    private Person person;
    private List<Bike> bikeList;
    private Double amount;
    private Price price;


    public void setPerson(Person person) {
        this.person = person;
    }


    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public double getPrice() {
        return amount * price.value;
    }


    public void setBikeList(List<Bike> bikeList) {
        this.bikeList = bikeList;
    }

    public Double getRentBike(List<Bike> bikes) {
        if (bikes.size() >= 3 && bikes.size() <= 5) {
            return getPrice() - (getPrice() * 30 / 100);
        } else {
            return getPrice();
        }
    }

    public void info() {
        System.out.println("Rent by: ");
        System.out.println(person.toString());
        System.out.println("Bikes: ");
        bikeList.stream().forEach(System.out::println);
        System.out.println("Bill: ");
        System.out.println(getRentBike(bikeList));
    }
}
