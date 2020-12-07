package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        //Zadanie 7.1

    //    PoemBeautifier poemBeautifier = new PoemBeautifier();

    //    poemBeautifier.beautify("PIERWSZY", String::toLowerCase);
    //    poemBeautifier.beautify("drugi", String::toUpperCase);
    //    poemBeautifier.beautify("Trzeci", (text) -> "*** " + text + " ***");
    //    poemBeautifier.beautify("Czwarty", (text) -> text.substring(1, text.length() - 1));
    //    poemBeautifier.beautify("AAAPiątyAAA", (text) -> text.replace("A", ""));

    //    System.out.println();
    //    System.out.println("Using Stream to generate even numbers from 1 to 20");
    //    NumbersGenerator.generateEven(20);

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsAmount() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();
    }
}








