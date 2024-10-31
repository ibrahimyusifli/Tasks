package ArrayListTask1;

public class Author {
    private String authorName;
    private boolean isAlive;
    private String dateOfBirth;

    public Author(String authorName, boolean isAlive,String dateOfBirth){
        this.authorName = authorName;
        this.isAlive = isAlive;
        this.dateOfBirth = dateOfBirth;
    }

    public void setAuthorName(String authorName){this.authorName=authorName;}
    public void setIsAlive(boolean isAlive){this.isAlive=isAlive;}
    public void setDateOfBirth(String dateOfBirth){this.dateOfBirth=dateOfBirth;}

    public String getAuthorName(){return authorName;}
    public boolean getIsAlive(){return isAlive;}
    public String getDateOfBirth(){return dateOfBirth;}

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", isAlive=" + isAlive +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
