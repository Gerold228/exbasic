package Library;

import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    static Map<Book, String> library = new HashMap<>();

    public static void addBook(String title, String author, int year, String location){
        Book added_book = new Book(title, author, year);
        library.put(added_book, location);
    }

    public static void removeBook(String title, String author, int year){
        Book remove_book = new Book(title, author, year);
        library.remove(remove_book);
    }

    public static void findBook(String title, String author, int year){
        Book find_book = new Book(title, author, year);
        String location = library.get(find_book);
        if (location != null){
            System.out.println(location);
        } else {
            System.out.println("Книга не найдена");
        }
    }

    public static void printAllBooks(){
        for (Map.Entry<Book, String> entry : library.entrySet()){
            System.out.println(entry.getKey().getTitle() + " " + entry.getKey().getAuthor() + " " + entry.getKey().getYear() + " " + entry.getValue());
        }
        System.out.println("///////////////////////////////////////////////////////////");
    }

    public static void main(String[] args){
        addBook("Война и мир", "Лев Толстой", 1869, "Художественная литература, стеллаж 5");
        addBook("1984", "Джордж Оруэлл", 2021, "Новинки, стол выдачи");
        addBook("Квантовая физика для чайников", "Стивен Хокинг", 2018, "Редкий фонд, комната 12А");
        addBook("The Hobbit", "J.R.R. Tolkien", 1937, "Иностранный отдел, стеллаж 3");
        addBook("Приключения Незнайки", "Николай Носов", 1954, "Детский зал, стеллаж 'Сказки'");
        addBook("Большая медицинская энциклопедия", "Коллектив авторов", 2020, "Читальный зал, стеллаж 1 (без выдачи)");
        addBook("Божественная комедия", "Данте Алигьери", 1895, "Архив, шкаф 14, сухой режим хранения");
        addBook("Clean Code", "Robert C. Martin", 2008, "IT-сектор, стеллаж B-2");
        addBook("Лирика", "Анна Ахматова", 1965, "Поэтический клуб, полка 'Серебряный век'");
        addBook("Современные подходы к проектированию высоконагруженных систем и микросервисной архитектуре", "Мартин Фаулер и др.", 2023, "Технический абонемент, зал 4, шкаф 7");
        printAllBooks();
        removeBook("Большая медицинская энциклопедия", "Коллектив авторов", 2020);
        printAllBooks();
        findBook("Война и мир", "Лев Толстой", 1869);
    }
}
