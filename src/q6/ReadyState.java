package q6;

public class ReadyState implements State{

    TicketMachine ticketMachine;

    public ReadyState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void chooseStation(String station) {

        ticketMachine.calculateTicketPrice(station);
        double price = ticketMachine.getCurrentTicketPrice();
        System.out.println("\nGoing to: " + station);
        System.out.println("Price: " + price);

        ticketMachine.setCurrentState(ticketMachine.getPaying());

        System.out.println("\nYou still have to pay: " + price);
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("! Choose station first");
    }

    @Override
    public void retrieveTicket() {
        System.out.println("! Choose station first");
    }
}
