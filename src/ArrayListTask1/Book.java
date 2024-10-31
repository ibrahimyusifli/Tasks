package ArrayListTask1;

import java.util.List;

public final class Book {
    private final List<Author> authors;
    private final String bookName;
    private final int pageCount;
    private final boolean isForSale;
    private final String description;

    public Book(List<Author> authors, String bookName,int pageCount, boolean isForSale, String description){
        this.authors = authors;
        this.bookName=bookName;
        this.pageCount=pageCount;
        this.isForSale=isForSale;
        this.description=description;
    }

    public List<Author> getAuthors(){return authors;}
    public String getBookName(){return bookName;}
    public int getPageCount(){return pageCount;}
    public boolean getIsForSale(){return isForSale;}
    public String getDescription(){return description;}

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", bookName='" + bookName + '\'' +
                ", pageCount=" + pageCount +
                ", isForSale=" + isForSale +
                ", description='" + description + '\'' +
                '}';
    }
}
