import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        addContact(phoneBook);
        phoneBook.showAllGroups();

        Contact number = phoneBook.searchContact(100);
        System.out.println(number);

        searchByGroup(phoneBook,"Работа");

    }

    public static void addContact(PhoneBook phoneBook) {
        phoneBook.addContactToGroup(new Contact("Петр", 100), "Работа,Другие");
        phoneBook.addContactToGroup(new Contact("Олег", 200), "Работа,Друзья");
        phoneBook.addContactToGroup(new Contact("Елена", 300), "Другие");
        phoneBook.addContactToGroup(new Contact("Виктория", 400), "Работа,Друзья");
        phoneBook.addContactToGroup(new Contact("Александр", 500), "Работа,Друзья");
    }

    public static void searchByGroup(PhoneBook phoneBook,String group)
    {
        List<Contact> list = phoneBook.searchGroup(group);
        int i = 1;
        try {
            for (Contact contact : list) {
                System.out.println(i + "." + contact);
                i++;
            }
        } catch (NullPointerException e) {
            System.out.println("Данной группы нет в списке");
        }
    }
}