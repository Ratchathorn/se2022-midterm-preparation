package q6;

public class PayingState implements State{

    TicketMachine ticketMachine;
    public double currentPayment;

    public PayingState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
        this.currentPayment = 0;
    }

    @Override
    public void chooseStation(String station) {
        System.out.println("! Cannot change station");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("You inserted: " + amount);
        currentPayment += amount;
        double price = ticketMachine.getCurrentTicketPrice();
        if (currentPayment < price) {
            System.out.println("You still need to pay: " + (price - currentPayment));
        } else {
            if (currentPayment > price) {
                System.out.println("Your change: " + (currentPayment - price));
            }
            System.out.println();

            ticketMachine.setCurrentState(ticketMachine.getDone());
            currentPayment = 0;
        }
    }

    @Override
    public void retrieveTicket() {
        System.out.println("! Pay first");
    }
}
