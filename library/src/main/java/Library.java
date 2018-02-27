import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }




    public void add(Book book){
        if (this.stockCount() < capacity) {
            this.stock.add(book);
        }

    }

    public int stockCount(){
        return this.stock.size();
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }
}


