package com.encapsulation.librarymanagementsystem;

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
    }
}