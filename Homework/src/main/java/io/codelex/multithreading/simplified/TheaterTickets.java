package io.codelex.multithreading.simplified;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TheaterTickets {

    /*
    Theatre has only five tickets left. Twenty people are rushing to buy them.
    But by running (try to run it!) the program it seems that it does many wrong things:
    - for first customers it says that tickets are not available
    - allows for many people to buy the same ticket
    - sometimes program ends with an error
    Fix the method buyTicket, so it would correctly sell tickets one by one.
     */

    static List<String> tickets = new LinkedList<>(Arrays.asList("Ticket_1", "Ticket_2", "Ticket_3", "Ticket_4", "Ticket_5"));

    public static void main(String[] args) {

        class PersonBuyingTicket extends Thread {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                buyTicket();
            }
        }

        int personCount = 20;
        for (int i = 0; i < personCount; i++) {
            new PersonBuyingTicket().start();
        }
    }

    //Fix this method
    public static synchronized void buyTicket() {
        if (tickets.size() > 0) {
            String ticket = tickets.get(0);
            tickets.remove(ticket);
            System.out.println("Ticket was bought: " + ticket);
        } else {
            System.out.println("Sorry, no more tickets available!");
        }
    }

}
