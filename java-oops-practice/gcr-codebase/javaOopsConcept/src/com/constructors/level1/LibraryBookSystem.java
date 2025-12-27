package com.constructors.level1;

//Superclass
public class LibraryBookSystem {

 // Access modifiers
 public String ISBN;        // public
 protected String title;    // protected
 private String author;     // private

 // Constructor
 public LibraryBookSystem(String ISBN, String title) {
     this.ISBN = ISBN;
     this.title = title;
 }

 // Setter method to set author name
 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter method to get author name
 public String getAuthor() {
     return author;
 }
}