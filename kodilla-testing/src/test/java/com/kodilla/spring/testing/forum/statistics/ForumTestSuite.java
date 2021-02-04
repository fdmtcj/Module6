package com.kodilla.spring.testing.forum.statistics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumTestSuite {
    @Mock
    private Statistics statisticsMock;

    int testCounter = 0;
    private Object Statistics;

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeClass
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test " + testCounter);
    }


    @Test
    public void calculateAdvStatisticsForZeroPosts() {

        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> listWithoutUsers = Collections.emptyList();

        int postsCount = 0;


        when(statistics.usersNames()).thenReturn(listWithoutUsers);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(5);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(0, stats.getUserNumber());
        assertEquals(0, stats.getPostsNumber());
        assertEquals(5, stats.getComments());
        assertEquals(0.0, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(0.0, stats.getAverageCommentsPerUser(), 0.1);
        assertEquals(0.0, stats.getAverageCommentsPerPost(), 0.1);
    }


    @Test
    public void calculateAdvStatisticsFor1000Posts() {
        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Jakub");

        int postsCount = 1000;


        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(5);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(1, stats.getUserNumber());
        assertEquals(1000, stats.getPostsNumber());
        assertEquals(5, stats.getComments());
        assertEquals(1000, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(5, stats.getAverageCommentsPerUser(), 0.1);

    }


    @Test
    public void calculateAdvStatisticsForZeroComments() {

        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Jakub");

        int postsCount = 1000;


        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(0);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(1, stats.getUserNumber());
        assertEquals(1000, stats.getPostsNumber());
        assertEquals(0, stats.getComments());
        assertEquals(1000, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(0, stats.getAverageCommentsPerUser(), 0.1);

    }

    @Test
    public void calculateAdvStatisticsForCommentsNumberIsSmallerThanPosts() {

        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Jakub");

        int commentsCount = 100;
        int postsCount = 200;


        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(commentsCount);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(1, stats.getUserNumber());
        assertEquals(200, stats.getPostsNumber());
        assertEquals(100, stats.getComments());
        assertEquals(200, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(100, stats.getAverageCommentsPerUser(), 0.1);

    }

    @Test
    public void calculateAdvStatisticsForCommentsNumberIsBiggerThanPosts() {

        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Jakub");

        int commentsCount = 200;
        int postsCount = 100;


        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(commentsCount);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(1, stats.getUserNumber());
        assertEquals(100, stats.getPostsNumber());
        assertEquals(200, stats.getComments());
        assertEquals(100, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(200, stats.getAverageCommentsPerUser(), 0.1);

    }

    @Test
    public void calculateAdvStatisticsFor100Users() {

        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> userList = generateUsers(100);


        int commentsCount = 200;
        int postsCount = 100;


        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(commentsCount);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(100, stats.getUserNumber());
        assertEquals(100, stats.getPostsNumber());
        assertEquals(200, stats.getComments());
        assertEquals(1, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(2, stats.getAverageCommentsPerUser(), 0.1);

    }

    List<String> generateUsers(int number) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add("Imię" + i);
        }
        return list;
    }

    @Test
    public void calculateAdvStatisticsForZeroUsers() {

        //Given
        StatisticsCalc stats = new StatisticsCalc();
        Statistics statistics = mock(Statistics.class);
        List<String> userList = generateUsers(0);


        int commentsCount = 200;
        int postsCount = 100;


        when(statistics.usersNames()).thenReturn(userList);
        when(statistics.postsCount()).thenReturn(postsCount);
        when(statistics.commentsCount()).thenReturn(commentsCount);


        //When

        stats.calculateAdvStatistics(statistics);

        //Then

        assertEquals(0, stats.getUserNumber());
        assertEquals(100, stats.getPostsNumber());
        assertEquals(200, stats.getComments());
        assertEquals(0, stats.getAveragePostsPerUser(), 0.1);
        assertEquals(0, stats.getAverageCommentsPerUser(), 0.1);

    }
}








