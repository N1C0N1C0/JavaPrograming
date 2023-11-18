package chap21;

public class ObjectDeepCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i=0; i<library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("박완서");
        library[0].setTitle("나목");

        System.out.println("== library  ==");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== Copy library  ==");
        for(Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
