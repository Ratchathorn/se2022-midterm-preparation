package q5;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {

    private String packageName;
    private List<Tour> tours;

    public PackageTour (String packageName) {
        this.packageName = packageName;
        this.tours = new ArrayList<Tour>();
    }

    public void addTour (Tour tour) {
        tours.add(tour);
    }

    @Override
    public String getName() {
        String name = packageName + "[";
        int i = 0;

        for (; i < tours.size()-1; i++) {
            name += tours.get(i).getName() + ", ";
        }
        name += tours.get(i).getName() + "]";
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        int min = Integer.MAX_VALUE;
        for (Tour tour : tours) {
            if (tour.getAvailableSeats() < min) {
                min = tour.getAvailableSeats();
            }
        }
        return min;
    }

}
