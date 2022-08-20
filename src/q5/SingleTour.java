package q5;

public class SingleTour implements Tour {

    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int seats) {
        this.name = name;
        this.price = price;
        this.allSeats = seats;
        this.reservedSeats = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        return allSeats - reservedSeats;
    }

    public void reserveSeats(int seats) {
        if (reservedSeats + seats > allSeats) {
            throw new IllegalArgumentException("Not enough seats");
        }
        allSeats -= seats;
    }

}
