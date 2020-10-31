package GBJava;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

//        DemoClass demo = new DemoClass();
//        demo.collectionDemo();


        phoneBook.add("89001112233", "Michaels");
        phoneBook.add("89102223344", "Martinez");
        phoneBook.add("89202223344", "Johns");
        phoneBook.add("89304445566", "Jackson");
        phoneBook.add("89169876543", "Smith");
        phoneBook.add("89257316598", "Morris");
        phoneBook.add("89196587896", "Sparrow");
        phoneBook.add("89635247862", "Mosesson");
        phoneBook.add("89269995522", "Ivanov");
        phoneBook.add("89263335687", "Petrov");
        phoneBook.add("89103335687", "Petrov");
        phoneBook.add("89153335687", "Petrov");
        phoneBook.add("89632541792", "Sidorov");
        phoneBook.showContents();
        //phoneBook.toString();
        phoneBook.get("Petrov");
    //    phoneBook.FindNumberPhone("Petrov");

    }
}
