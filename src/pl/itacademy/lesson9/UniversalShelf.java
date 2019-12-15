package pl.itacademy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class UniversalShelf<T> {

    private List<T> items = new ArrayList<>();

    public void addItem (T item){ items.add(item);}
}
