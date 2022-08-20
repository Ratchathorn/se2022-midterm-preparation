package q6;

public class Main {

    public static void main(String[] args) {

        TicketMachine ticketMachine = new TicketMachine("Home");

        ticketMachine.insertCoin(5);
        ticketMachine.retrieveTicket();
        ticketMachine.chooseStation("Kasetsart University");

        ticketMachine.chooseStation("School");
        ticketMachine.retrieveTicket();
        ticketMachine.insertCoin(5);
        ticketMachine.insertCoin(5);
        ticketMachine.insertCoin(5);
        ticketMachine.insertCoin(10);
        ticketMachine.insertCoin(10);

        ticketMachine.chooseStation("Lak Song");
        ticketMachine.insertCoin(10);
        ticketMachine.retrieveTicket();
    }

}
