import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Book{
    String name, author, issuedTo, issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void issueBook(String issuedTo, String issuedOn){
        this.issuedTo = issuedTo;
        this.issuedOn = issuedOn;
    }

    public void returnBook(){
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public boolean isIssued(){
        if (Objects.equals(this.issuedTo,null)){
            return false;
        }
        return true;
    }

    public String bookInfo(){
        System.out.println(this.name + " " + this.author + " " + this.issuedTo + " " + this.issuedOn + " ");
        return "info returned";
    }
}

class Library{
    private ArrayList<Book> books;
    private HashSet<String> bookName;
    public Library(ArrayList<Book> books){
        this.books = books;
        bookName = new HashSet<>();
        for (Book book : books){
            bookName.add(book.getName());
        }
    }

    public boolean issueBookHelper(String name){

        int i = 0;
        for (; i < books.size(); i++){
            if (Objects.equals(books.get(i).getName(), name)){
                //book = books.get(i);
                break;
            }
        }
        if (books.get(i).isIssued()){
            return false;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the issuee");
        String personName = sc.nextLine();

        LocalDate d = LocalDate.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyy");
        String issueDate = d.format(myFormat);

        books.get(i).issueBook(personName,issueDate);
        return true;
    }
    public boolean returnBookHelper(String name){

        int i = 0;
        for (; i < books.size(); i++){
            if (Objects.equals(books.get(i).getName(), name)){
                break;
            }
        }
        if (!books.get(i).isIssued()){
            return false;
        }
        books.get(i).returnBook();
        return true;
    }

    public void issueBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book to be issued");
        String booknm = sc.nextLine();

        if (!bookName.contains(booknm)){
            System.out.println("No such book exists");
            return;
        }
        else {
            System.out.println("Book with name " + booknm + " found");
            boolean value = issueBookHelper(booknm);
            if (value){
                System.out.println("Successfully issued the book");
            }
            else {
                System.out.println("This book has already been issued");
            }
        }
        return;
    }
    public void returnBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book to be returned");
        String booknm = sc.nextLine();

        if (!bookName.contains(booknm)){
            System.out.println("No such book exists");
            return;
        }
        else {
            System.out.println("Book with name " + booknm + " found");
            boolean value = returnBookHelper(booknm);
            if (value){
                System.out.println("Successfully returned the book");
            }
        }
        return;
    }
}

public class libraryManagement {
    public static void main(String[] args) {
        Book newBook= new Book("ABC", "XYZ");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(newBook);
        //System.out.println(bookList);
        //System.out.println(bookList.getFirst().bookInfo());
        Library newLib = new Library(bookList);
        newLib.issueBook();
        System.out.println(bookList.getFirst().bookInfo());

        newLib.returnBook();
        System.out.println(bookList.getFirst().bookInfo());

    }
}
