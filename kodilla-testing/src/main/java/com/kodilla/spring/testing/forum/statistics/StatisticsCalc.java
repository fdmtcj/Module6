package com.kodilla.spring.testing.forum.statistics;

public class StatisticsCalc {
    int userNumber;
    int postsNumber;
    int comments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics)  {

        userNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        comments = statistics.commentsCount();

        if (userNumber == 0) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else {
            averagePostsPerUser =(double) postsNumber / userNumber;
            averageCommentsPerUser =(double) comments / userNumber;
        }
        if (postsNumber == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost =(double) comments / userNumber;
        }
    }


    public int getUserNumber() {
        return userNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getComments() {
        return comments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void show() {
        System.out.println("Forum:\n" +
                "Total users: " + userNumber + "\n" +
                "Total posts: " + postsNumber + "\n" +
                "Total comments: " + comments + "\n" +
                "Average post per user: " + averagePostsPerUser + "\n" +
                "Average comments per user: " + averageCommentsPerUser + "\n" +
                "Average comments per post: " + averageCommentsPerPost);
    }
}
