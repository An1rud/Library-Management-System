import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member getMember(String memberId) {
        return members.get(memberId);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String memberId, String isbn) {
        Member member = getMember(memberId);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null && !book.isBorrowed()) {
            member.borrowBook(book);
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book cannot be borrowed!");
        }
    }

    public void returnBook(String memberId, String isbn) {
        Member member = getMember(memberId);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null && book.isBorrowed()) {
            member.returnBook(book);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book cannot be returned!");
        }
    }
}
