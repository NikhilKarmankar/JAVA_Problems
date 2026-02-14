
class Book {

    static int totalNoOfBooks;

    String author;                          // Blocks uske niche constructors aur phir uske niche methods
    String title;                           // static variables phir non static varibles-static block-normal block-constructors-methods
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0 ;
    }

    {
        totalNoOfBooks++;
    }

    Book(String isbn , String title , String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn, "Unknown" , "Unknown");

    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }

    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed , please leave a review ");
        }else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book ("1" ,"Design" ,"Author");
        Book myBook = new Book("2");
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

    }


}



