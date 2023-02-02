import java.awt.datatransfer.StringSelection;
import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author nameAuthor = (Author) o;
        return this.nameAuthor.equals(((Author) o).nameAuthor)
                && this.surnameAuthor.equals(((Author) o).surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nameAuthor, this.surnameAuthor);

    }

    @Override
    public String toString() {
        return "Author " + this.nameAuthor + " " + this.surnameAuthor;
    }
}
