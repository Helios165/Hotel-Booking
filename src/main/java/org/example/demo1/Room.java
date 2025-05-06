package org.example.demo1;
/*
public class Room {

    private long ID;
    private int capacity;
    private float price;
    private boolean booked;
    private Date availableDate;
    private String hotelName;
    private String description;
    // Static list to hold all rooms
    static List<Room> rooms = new ArrayList<>(); // Static list to hold all rooms
    
    Room(long ID, int capacity, float price, boolean booked, Date availableDate, String hotelName, String description) {
        this.ID = ID;
        this.capacity = capacity;
        this.price = price;
        this.booked = booked;
        this.availableDate = availableDate;
        this.hotelName = hotelName;
        this.description = description;
        rooms.add(this); // Add the room to the static list upon creation
    }
    long getID() {
        return ID;
    }
    void setID(long ID) {
        this.ID = ID;
    }
    int getCapacity() {
        return capacity;
    }
    void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    float getPrice() {
        return price;
    }
    void setPrice(float price) {
        this.price = price;
    }
    boolean isBooked() {
        return booked;
    }
    void setBooked(boolean booked) {
        this.booked = booked;
    }
    Date getAvailableDate() {
        return availableDate;
    }
    void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }
    String getHotelName() {
        return hotelName;
    }
    void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    String getDescription() {
        return description;
    }
    void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Room room = (Room) obj;
        return(
        ID == room.ID && 
        capacity == room.capacity && 
        Float.compare(room.price, price) == 0 && 
        booked == room.booked &&
        hotelName.equals(room.hotelName) &&
        description.equals(room.description));
    }


}

 */