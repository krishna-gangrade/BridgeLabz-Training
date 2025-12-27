package com.constructors.level1;

//Subclass
class EBook extends LibraryBookSystem {

// Constructor
public EBook(String ISBN, String title) {
   super(ISBN, title);
}

// Method demonstrating access modifiers
public void displayDetails() {
   System.out.println("ISBN   : " + ISBN);        // public
   System.out.println("Title  : " + title);       // protected
   System.out.println("Author : " + getAuthor()); // private via getter
}

public static void main(String[] args) {

   EBook ebook = new EBook("978-0135166307", "Core Java");

   // Setting author using public setter
   ebook.setAuthor("Cay S. Horstmann");

   // Getting and displaying author using getter
   ebook.displayDetails();
}
}