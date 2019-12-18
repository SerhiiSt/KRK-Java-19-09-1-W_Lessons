package pl.itacademy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class ToyShelf {

    private List<Box<Toy>> listOfToys = new ArrayList<>();

    public void addItem(Box<Toy> item) {
        listOfToys.add(item);
    }

    public List<Box<Toy>> getItem() {
        return listOfToys;
    }

}
