package com.encapsulation.librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String borrower;

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            borrower = borrowerName;
            isAvailable = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public String getBorrowerInfo() {
        return borrower == null ? "No borrower" : "Borrowed (masked)";
    }
}