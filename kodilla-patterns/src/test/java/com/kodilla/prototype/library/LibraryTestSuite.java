package com.kodilla.prototype.library;
import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Library");
        Book book1 = new Book("xxxx", "yyyy", LocalDate.of(2001, Month.OCTOBER, 15));
        Book book2 = new Book("xxxx", "yyyy", LocalDate.of(2010, Month.DECEMBER, 12));
        Book book3 = new Book("xxxx", "yyyy", LocalDate.of(2002, Month.FEBRUARY, 20));
        Book book4 = new Book("xxxx", "yyyy", LocalDate.of(2011, Month.AUGUST, 10));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("my Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("my Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book4);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
