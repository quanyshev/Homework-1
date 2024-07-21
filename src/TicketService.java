class TicketService {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket("Alpha", 123);
        Ticket ticket3 = new Ticket(1234, "Beta", 321, "14.02.2025 17:00", true, 'A', 23.54F);

        //check setting price
        ticket1.setTikcetPrice(12.35f);
        System.out.println(ticket1.getTikcetPrice());

        //check time instance creation
        System.out.println(ticket1.creationTime);
    }
}
