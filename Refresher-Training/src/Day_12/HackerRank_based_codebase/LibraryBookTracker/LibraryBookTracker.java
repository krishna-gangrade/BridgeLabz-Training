package Day_12.HackerRank_based_codebase.LibraryBookTracker;

public class LibraryBookTracker {
    String title;
    String author;
    String isBn;

    static int totalBooksInLibrary=0;
    static int totalBooksCheckedOut=0;

    LibraryBookTracker(String title, String author, String isBn){
        this.title= title;
        this.author= author;
        this.isBn= isBn;
        totalBooksInLibrary++;
    }

    void checkOut(){
        totalBooksCheckedOut++;
    }

    void returnBook(){
        totalBooksCheckedOut--;
    }

    public static void main(String[] args) {
        LibraryBookTracker book1= new LibraryBookTracker("Java","James Gosling", "001");
        LibraryBookTracker book2= new LibraryBookTracker("C++","Bjarne Stroustrup", "002");
        LibraryBookTracker book3= new LibraryBookTracker("Python","Guido Van Rossum", "003");
        LibraryBookTracker book4= new LibraryBookTracker("DSA","Robert Lafore", "004");
        LibraryBookTracker book5= new LibraryBookTracker("DataBase","Korth", "005");

        book1.checkOut();
        book2.checkOut();
        book3.checkOut();

        book1.returnBook();

        System.out.println("Total books in library: "+ LibraryBookTracker.totalBooksInLibrary);

        System.out.println("Total books Check out : "+ LibraryBookTracker.totalBooksCheckedOut);
    }
}
