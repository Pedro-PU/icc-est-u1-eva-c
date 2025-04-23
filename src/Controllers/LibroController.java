package Controllers;
import Models.Book;

public class LibroController{
    public void sortByName(Book[] books){
        int n = books.length;
        System.out.println("Ordenando libros por nombre con BubbleSort");
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(books[j].getName().compareToIgnoreCase(books[j+1].getName())<0){
                    Book temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                }
            }
        } 
    }

    public Book searchByName(Book[] books, String name) {
        int bajo = 0;
        int alto = books.length - 1;
    
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            String valorCentral = books[central].getName();
    
            int comparacion = valorCentral.compareToIgnoreCase(name);
    
            if (comparacion == 0) {
                return books[central];
            }
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return null;
    }


    
}