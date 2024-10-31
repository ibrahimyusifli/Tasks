package ArrayListTask1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Book> books;
    private int age;

    public Person(String name,List<Book> books, Integer age) {
        this.name = name;
        this.age = age;
        this.books = new ArrayList<>();
    }

    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}

    public String getName(){return name;}
    public List<Book> getBooks(){return books;}
    public int getAge(){return age;}

    public boolean addBook(Book book){
        if(book.getIsForSale()){
            books.add(book);
            return true;
        }
        return false;
    }

    public boolean deleteBook(String bookName){
        for (Book book : books){
            if(book.getBookName().equals(bookName)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public Book findBookWithMaxPageCount() {
        if (books.isEmpty()) return null;
        Book maxPageBook = books.get(0);
        for (Book book : books) {
            if (book.getPageCount() > maxPageBook.getPageCount()) {
                maxPageBook = book;
            }
        }
        return maxPageBook;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", books=" + books +
                ", age=" + age +
                '}';
    }
}
