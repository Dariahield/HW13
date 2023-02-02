public class Main {
    /*
    Задание
    Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.

    Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.


     */
    public static void start() {


    }

    public static void main(String[] args) {
        Book book = new Book(" Преступление и наказание", 1866);
        Author author = new Author( "Федор ", "Достоевский");
        Author author2 = new Author( "Федор ", "Достоевский");


        System.out.println("book.bookName = " + book.getBookName());
        System.out.println("book.bookAge = " + book.getBookAge());
        book.setBookAge(1865);
        System.out.println("book.setBookAge = " + book.getBookAge());
        System.out.println("author.nameAuthor = " + author.getNameAuthor());
        System.out.println("author.surnameAuthor = " + author.getSurnameAuthor());

        Book book1 = new Book( " Война и мир", 1867);
        Author author1 = new Author (" Лев", "Толстой");

        System.out.println("book1.bookName = " + book1.getBookName());
        System.out.println("book1.bookAge = " + book1.getBookAge());
        System.out.println("author1.nameAuthor = " + author1.getNameAuthor());
        System.out.println("author1.surnameAuthor = " + author1.getSurnameAuthor());
        System.out.println(author);
        System.out.println(author1);
        System.out.println(book);
        System.out.println(book1);

        System.out.println("author " + author.equals(author));
        System.out.println("author1 " + author.equals(author1));
        System.out.println("author2 " + author.equals(author2));
        System.out.println("Hashcode author " + author.hashCode());
        System.out.println("book " + book.equals(book));
        System.out.println("book1 " + book.equals(book1));
        System.out.println("Hashcode book" + book.hashCode());


    }
}