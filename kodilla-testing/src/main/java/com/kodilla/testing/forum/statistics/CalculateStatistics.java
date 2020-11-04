package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;

import java.util.List;

public class CalculateStatistics {

    private int users;
    private int posts;
    private int comments;
    private double postsPerUsers;
    private double commentsPerUsers;
    private double commentsPerPosts;

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUsers() {
        return postsPerUsers;
    }

    public double getCommentsPerUsers() {
        return commentsPerUsers;
    }

    public double getCommentsPerPosts() {
        return commentsPerPosts;
    }
//liczbę użytkowników,
    //liczbę postów,
    //liczbę komentarzy,
    //średnią liczbę postów na użytkownika,
    //średnią liczbę komentarzy na użytkownika,
    //średnią liczbę komentarzy na post.

    public void calculateAdvStatistics(Statistics statistics) {
        this.users = statistics.usersNames().size();
        this.posts = statistics.postCount();
        this.comments = statistics.commentsCount();

        if (users != 0) {
            this.postsPerUsers = (double) posts / users;
        } else {
            this.postsPerUsers = 0;
        }

        if (users != 0) {
            this.commentsPerUsers = (double) comments / users;
        } else {
            this.commentsPerUsers = 0;
        }

        if (posts != 0) {
            this.commentsPerPosts = (double) comments / posts;
        } else
            this.commentsPerPosts = 0;
        }



}
