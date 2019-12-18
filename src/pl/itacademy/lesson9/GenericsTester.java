package pl.itacademy.lesson9;

public class GenericsTester {
    public static void main(String[] args) {

        Tale pinnokio = new Tale();
        Tale redHat = new Tale();
        Tale kolobok = new Tale();

        Fantasy starWars = new Fantasy();
        Fantasy fantasyWorld = new Fantasy();

        Toy toy = new Toy();
        Toy toy1 = new Toy();

        Food burger = new Food();
        Food sandwich = new Food();
        Food bigMack = new Food();


        Box<Food> foodBox = new Box<>();
        foodBox.addItem(burger);
        foodBox.addItem(sandwich);
        foodBox.addItem(bigMack);

        Box<Toy> toyBox = new Box<>();
        toyBox.addItem(toy);
        toyBox.addItem(toy1);

        Box<Book> bookBox = new Box<>();
        bookBox.addItem(starWars);
        bookBox.addItem(fantasyWorld);

        ToyShelf toyShelf = new ToyShelf();
        toyShelf.addItem(toyBox);


        BookShelf<Box<Book>> bookShelf = new BookShelf<>();
        bookShelf.addItem(bookBox);

        UniversalShelf universalShelf = new UniversalShelf();
        universalShelf.addBox(toyBox);
        universalShelf.addBox(bookBox);
        universalShelf.addBox(foodBox);

    }
}
