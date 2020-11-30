package com.kodilla.testing.library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);


        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");


        // Then
        assertEquals(4, theListOfBooks.size());

    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        assertTrue(false);
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {

        assertTrue(false);
    }

    @Test
    void testShouldReturnEmptyListWhenUserHasNoBooks(){

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooks = new ArrayList<>();
        LibraryUser user= new LibraryUser("Jakub","Rej","46456387287");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOfUser(user);

        //Then
        assertEquals(new ArrayList<Book>(), result);
    }

    @Test
    void testShouldReturnListWithOneBookWhenUserHasOneBooks(){

        //Given
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        LibraryUser user= new LibraryUser("Jakub","Rej","46456387287");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOfUser(user);

        //Then
        assertEquals(listOfBooks, result);
    }

    @Test
    void testShouldReturnListWithFiveBookWhenUserHasFiveBooks(){

        //Given
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("Zbrodnia i Kara", "Fiodor Dostojewski)", 1861);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);


        LibraryUser user= new LibraryUser("Jakub","Rej","46456387287");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOfUser(user);

        //Then
        assertEquals(listOfBooks, result);
    }
}
