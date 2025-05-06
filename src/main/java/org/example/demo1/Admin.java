package org.example.demo1;
/*
import java.util.List;

import Rooms.Room;

public class Admin extends User {
    private String role;
    private String department;

    Admin (long ID, String name, String userName, String email, String password, String phoneNumber, String role, String department) {
        super(ID, name, userName, email, password, phoneNumber);
        this.role = role;
        this.department = department;
    }
    void updateRole(String role) {
        this.role = role;
    }
    void updateDepartment(String department) {
        this.department = department;
    }
    String getRole() {
        return role;
    }
    String getDepartment() {
        return department;
    }
    boolean mangeUser(User user , String action) {
        if (action.equals("remove") || action.equals("delete")) {
            User.removeUser(user.getID());
            return true;
        } else if (action.equals("update")) {
            User.updateProfile(user.getID(), user.getName(), user.getUserName(), user.getEmail(), user.getPassword(), user.getPhoneNumber());
            return true;
        } else {
            System.out.println("Invalid action for user management.");
            return false;
        }
        return false;
    }

    List<Booking> viewAllBookings() {
        // code to view all bookings
        return null;
    }
    List<User> viewAllUsers() {
        return User.getAllUsers();
    }
    List<Room> viewAllRooms() {
        return Room.getAllRooms()
    }
    List<Hotel> viewAllHotels() {
        // code to view all hotels
        return null;
    }
    List<Transaction> viewAllTransactions() {
        // code to view all transactions
        return null;
    }

}
*/