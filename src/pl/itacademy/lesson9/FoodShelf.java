package pl.itacademy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class FoodShelf {
    private List<Box<Food>> listOfFood = new ArrayList<>();

    public void addItem(Box<Food> item) {
        listOfFood.add(item);
    }

    public List<Box<Food>> getItem() {
        return listOfFood;
    }
}
