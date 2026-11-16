class railway {
    private String passengerName;
    private int avaliableSeats;

    public railway(int totalSeats) {
        this.avaliableSeats = totalSeats;
    }

    public void bookTickets(String name) {
        if(avaliableSeats > 0) {
            this.passengerName = name;
            avaliableSeats--;
            System.out.println("Ticket booked for " + passengerName + ". Seats left: " + avaliableSeats);
        } else {
            System.out.println("Booking failed! No seats avaliable.");
        }
    }

    public void cancelTicket(String name) {
        avaliableSeats++;
        System.out.println("Ticket cancelled for " + name + ". Seats left: " + avaliableSeats);
    }

    public static void main(String[] args) {
        railway train = new railway(2);
        train.bookTickets("Sathish");
        train.bookTickets("Pavithra");
        train.bookTickets("Kiran");
        train.cancelTicket("Thangaraj");
    }
}