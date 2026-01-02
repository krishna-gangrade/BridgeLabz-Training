package com.encapsulation.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String borrower; // sensitive data

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14;
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
        if (borrower == null) {
            return "No borrower";
        }
        return "Borrowed by: ****" + borrower.substring(0, 1);
    }
}