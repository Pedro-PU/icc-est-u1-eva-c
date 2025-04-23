package Views;
import Models.Book;

public class ViewConsole {
    public void printArreglo(Book[] books) {
        for(int i=0; i<books.length; i++){
            System.out.println(books[i]);
        }

    }
    public void messageOrden(String messaje){
        System.out.println(messaje);
    }
}
