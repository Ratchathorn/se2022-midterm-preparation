package q6;

public class DoneState implements State {

    TicketMachine ticketMachine;

    public DoneState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void chooseStation(String station) {
        System.out.println("! Retrieve ticket first");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("! Retrieve ticket first");
    }

    @Override
    public void retrieveTicket() {
        System.out.println("Here is your ticket");

        ticketMachine.setCurrentState(ticketMachine.getReady());

        System.out.println("You are at: " + ticketMachine.getCurrentStation());
    }
}
