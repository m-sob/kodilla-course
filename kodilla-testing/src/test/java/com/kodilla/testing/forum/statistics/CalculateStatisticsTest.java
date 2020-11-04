package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/*
gdy liczba postów = 0, zal
gdy liczba postów = 1000,
gdy liczba komentarzy = 0,
gdy liczba komentarzy < liczba postów,
gdy liczba komentarzy > liczba postów,
gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.
 */

@ExtendWith(MockitoExtension.class)
class CalculateStatisticsTest {

    @Mock
    private Statistics statisticsMock;

    @Test
    void shouldCalculateAdvStatisticsWhenZeroPosts() {
        //given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = Arrays.asList("admin1", "admin2", "admin3", "admin4", "admin5", "admin6");
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(6, calculateStatistics.getUsers());
        assertEquals(0, calculateStatistics.getPosts());
        assertEquals(5, calculateStatistics.getComments());
        assertEquals(0, calculateStatistics.getPostsPerUsers());
        assertEquals(0.8333333333333334, calculateStatistics.getCommentsPerUsers());
        assertEquals(0, calculateStatistics.getCommentsPerPosts());

    }

    @Test
    void shouldCalculateAdvStatisticsWhen1000Posts() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = Arrays.asList("admin1", "admin2", "admin3", "admin4", "admin5");
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(5, calculateStatistics.getUsers());
        assertEquals(1000, calculateStatistics.getPosts());
        assertEquals(10, calculateStatistics.getComments());
        assertEquals(200, calculateStatistics.getPostsPerUsers());
        assertEquals(2 , calculateStatistics.getCommentsPerUsers());
        assertEquals(0.001, calculateStatistics.getCommentsPerPosts());
    }

    @Test
    void shouldCalculateAdvStatisticsWhenZeroComments() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = Arrays.asList("admin1", "admin2", "admin3", "admin4", "admin5");
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(5, calculateStatistics.getUsers());
        assertEquals(10 , calculateStatistics.getPosts());
        assertEquals(0 , calculateStatistics.getComments());
        assertEquals(2 , calculateStatistics.getPostsPerUsers());
        assertEquals(0 , calculateStatistics.getCommentsPerUsers());
        assertEquals(0 , calculateStatistics.getCommentsPerPosts());
    }

    @Test
    void shouldCalculateAdvStatisticsWhenPostMoreThanComments(){
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = Arrays.asList("admin1", "admin2", "admin3", "admin4", "admin5");
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(5 ,calculateStatistics.getUsers());
        assertEquals(5 ,calculateStatistics.getPosts());
        assertEquals(10 ,calculateStatistics.getComments());
        assertEquals(1 ,calculateStatistics.getPostsPerUsers());
        assertEquals(2 ,calculateStatistics.getCommentsPerUsers());
        assertEquals(2 ,calculateStatistics.getCommentsPerPosts());
    }

    @Test
    void shouldCalculateAdvStatisticsWhenCommentsMoreThanPosts(){
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = Arrays.asList("admin1", "admin2", "admin3", "admin4", "admin5");
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(5);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(5 ,calculateStatistics.getUsers());
        assertEquals(20 ,calculateStatistics.getPosts());
        assertEquals(5 ,calculateStatistics.getComments());
        assertEquals(4 ,calculateStatistics.getPostsPerUsers());
        assertEquals(1 ,calculateStatistics.getCommentsPerUsers());
        assertEquals(0.25 ,calculateStatistics.getCommentsPerPosts());
    }

    @Test
    void shouldCalculateAdvStatisticsWhenZeroUsers() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, calculateStatistics.getUsers());
        assertEquals(5, calculateStatistics.getPosts());
        assertEquals(10, calculateStatistics.getComments());
        assertEquals(0, calculateStatistics.getPostsPerUsers());
        assertEquals(0, calculateStatistics.getCommentsPerUsers());
        assertEquals(2, calculateStatistics.getCommentsPerPosts());
    }

    @Test
    void shouldCalculateAdvStatisticsWhen100Users() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> usernames = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            usernames.add("admin" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);

        // When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, calculateStatistics.getUsers());
        assertEquals(5, calculateStatistics.getPosts());
        assertEquals(10, calculateStatistics.getComments());
        assertEquals(0.05, calculateStatistics.getPostsPerUsers());
        assertEquals(0.1, calculateStatistics.getCommentsPerUsers());
        assertEquals(2, calculateStatistics.getCommentsPerPosts());

    }
}