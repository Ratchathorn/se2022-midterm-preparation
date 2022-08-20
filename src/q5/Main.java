package q5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Tour> tours = new ArrayList<Tour>();

        SingleTour tour1 = new SingleTour("Tour 1", 10000, 100);
        SingleTour tour2 = new SingleTour("Tour 2", 15000, 75);
        SingleTour tour3 = new SingleTour("Tour 3", 20000, 50);
        SingleTour floatingMarket1 = new SingleTour("Floating Market 1", 10000, 50);
        SingleTour floatingMarket2 = new SingleTour("Floating Market 2", 8000, 60);
        SingleTour temple1 = new SingleTour("Temple 1", 7500, 50);
        SingleTour temple2 = new SingleTour("Temple 2", 12500, 80);

        PackageTour floatingMarketPackage = new PackageTour("Floating Market Package");
        floatingMarketPackage.addTour(floatingMarket1);
        floatingMarketPackage.addTour(floatingMarket2);

        PackageTour templeFloatingMarketPackage = new PackageTour("Temple + Floating Market Package");
        templeFloatingMarketPackage.addTour(temple1);
        templeFloatingMarketPackage.addTour(temple2);
        templeFloatingMarketPackage.addTour(floatingMarketPackage);

        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(floatingMarketPackage);
        tours.add(templeFloatingMarketPackage);

        for (Tour tour: tours) {
            System.out.println("Name: " + tour.getName());
            System.out.println("Price: " + tour.getPrice());
            System.out.println("Seats: " + tour.getAvailableSeats());
        }

    }
}
