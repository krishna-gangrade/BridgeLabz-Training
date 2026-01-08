package com.day5.parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Internal booking record
    private String bookingLog;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean parkVehicle(Vehicle vehicle) {

        if (isOccupied) return false;

        if (!vehicle.getClass().getSimpleName()
                .equalsIgnoreCase(vehicleTypeAllowed)) {
            return false;
        }

        isOccupied = true;
        bookingLog = "Vehicle " + vehicle.getVehicleNumber() +
                     " parked in slot " + slotId +
                     " at " + location;
        return true;
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    // Only logs are exposed
    public String getBookingLog() {
        return bookingLog;
    }

    public int getSlotId() {
        return slotId;
    }
}