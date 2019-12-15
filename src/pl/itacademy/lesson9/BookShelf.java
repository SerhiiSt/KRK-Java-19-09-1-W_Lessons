package pl.itacademy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> {


    private List<Box<Book>> items = new ArrayList<>();

    public void addItem(Box<Book> bookBox){items.add(bookBox);}
}
