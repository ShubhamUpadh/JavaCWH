import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Library{

    private HashMap<String, Integer> issuedBooks= new HashMap<>();

    public void getAvailableBooks() {
        for (String x : availableBooks){
            if (!Objects.equals(x,"")){
                System.out.print(x);
            }
        }
    }

    private String[] availableBooks = new String[100];
    public Library(String[] books){
        this.availableBooks = books;
    }

    public String issueBook(String bookName){
        for (int i = 0; i < availableBooks.length; i++){
            if (Objects.equals(availableBooks[i], bookName)){
                String issuedBook = availableBooks[i];
                availableBooks[i] = "";
                issuedBooks.put(issuedBook, i);
                return (issuedBook + " has been issued\nEnjoy Reading");
            }
        }
        return "Book with the title " + bookName + " doesn't exist in our library";
    }

    public String returnBook(String bookName){
        for (Map.Entry<String, Integer> entry : issuedBooks.entrySet()){
            if (Objects.equals(entry.getKey(), bookName)){
                availableBooks[entry.getValue()] = bookName;
                issuedBooks.remove(entry.getKey());
                return bookName + " has been returned";
            }
        }
        return "No such book has been issued";
    }
}

public class LibraryExercise {
    public static void main(String[] args) {

        String[] books = {
                "To Kill a Mockingbird",
                "1984",
                "Pride and Prejudice",
                "The Great Gatsby",
                "Moby-Dick",
                "War and Peace",
                "The Catcher in the Rye",
                "The Lord of the Rings",
                "The Hobbit",
                "Harry Potter and the Sorcerer's Stone"
        };

        Library onlineLibrary = new Library(books);
        int input = 0;
        int choice;
        String bookName;
        Scanner sc = new Scanner(System.in);
        while (input < 5){
            System.out.println("1 for issue, 2 for return");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of the book");
            bookName = sc.nextLine();
            if (choice == 1){
                System.out.println(onlineLibrary.issueBook(bookName));
            }
            else {
                System.out.println(onlineLibrary.returnBook(bookName));
            }
            input++;
        }

        onlineLibrary.getAvailableBooks();


    }
}
