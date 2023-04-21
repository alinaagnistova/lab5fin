package command;

import collection.CollectionManager;
import error.InvalidInputException;
/**
 * print_field_descending_weapon_type :
 * print the values of the weaponType field of all elements in descending order
 */
public class PrintFieldDescendingWeapon extends BaseCommand{
    private final CollectionManager collection;

    public PrintFieldDescendingWeapon(CollectionManager collection) {
        this.collection = collection;
    }

    public void execute(String[] args) {
        if (args.length > 1) {
            throw new InvalidInputException("Вы неправильно ввели команду");
        } else {
            collection.printFieldDescendingWeapon();
        }
    }


    public void getDescription() {
        String description = "print_field_descending_weapon_type : вывести значения поля weaponType всех элементов в порядке убывания";
        System.out.println(description);
    }
}
