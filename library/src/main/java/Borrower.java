import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }




    public int collectionSize(){
        return collection.size();
    }

    public void borrow(Library library){
        this.collection.add(library.removeBook());
    }
}
