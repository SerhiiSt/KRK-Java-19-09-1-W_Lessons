package pl.itacademy.lesson9;

import java.util.ArrayList;
import java.util.List;

public class UniversalShelf {

    private List<Box<?>> boxes = new ArrayList<>();

    public void addBox(Box<?> box) {
        boxes.add(box);
    }

    public List<Box<?>> getBoxes() {
        return boxes;
    }
}

