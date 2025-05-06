package org.example.demo1;

import java.util.List;
/*
public class Customer extends User {
    
    private int loyaltyPoints;
    private List<String> paymentMethods;
    private List<Booking> bookings;
    private List<Transaction> payments;

    Customer(long ID, String name, String userName, String email, String password, String phoneNumber) {
        super(ID, name, userName, email, password, phoneNumber);
        this.loyaltyPoints = 0;
        this.paymentMethods = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.payments = new ArrayList<>();
    }
    Booking bookRoom(Hotel hotel, Room room, Date checkInDate, Date checkOutDate) {
        Booking booking = new Booking(this, hotel, room, checkInDate, checkOutDate);
        bookings.add(booking);
        return booking;
    }
    boolean cancelBooking(Booking booking) {
        if (bookings.contains(booking)) {
            bookings.remove(booking);
            return true;
        }
        return false;
    }
    List<Booking> viewBookingsHistory() {
        return bookings;
    }
    void addPaymentMethod(String paymentMethod) {
        paymentMethods.add(paymentMethod);
    }
    void removePaymentMethod(String paymentMethod) {
        paymentMethods.remove(paymentMethod);
    }
    List<String> viewPaymentMethods() {
        return paymentMethods;
    }
    void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }
    void redeemLoyaltyPoints(int points) {
        if (points <= loyaltyPoints) {
            this.loyaltyPoints -= points;
        } else {
            System.out.println("Not enough loyalty points to redeem.");
        }
    }
    int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    List<Transaction> viewPaymentsHistory() {
        return payments;
    }
    void addPayment(Transaction payment) {
        payments.add(payment);
    }
    void removePayment(Transaction payment) {
        payments.remove(payment);
    }

    
}
*/