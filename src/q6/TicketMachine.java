package q6;

public class TicketMachine {

    private State ready;
    private State paying;
    private State done;

    private State currentState;
    private String currentStation;
    private double currentTicketPrice;

    public TicketMachine(String currentStation) {
        this.ready = new ReadyState(this);
        this.paying = new PayingState(this);
        this.done = new DoneState(this);

        this.currentState = ready;
        this.currentStation = currentStation;
        System.out.println("\nYou are at: " + currentStation);
    }

    public State getReady() {
        return ready;
    }

    public State getPaying() {
        return paying;
    }

    public State getDone() {
        return done;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public double getCurrentTicketPrice() {
        return currentTicketPrice;
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void calculateTicketPrice(String station) {
        // hard-code
        currentTicketPrice = 30;
    }

    public void chooseStation(String station) {
        currentState.chooseStation(station);
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(amount);
    }

    public void retrieveTicket() {
        currentState.retrieveTicket();
    }
}
