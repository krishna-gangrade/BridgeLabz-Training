package com.inheritance.single.librarymanagement;

class Author extends Book {

    String authorName;
    String authorBio;

    Author(String title, int publicationYear, String authorName, String authorBio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name      : " + authorName);
        System.out.println("Author Overview  : " + authorBio);
    }
}