package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListOfUsers = new ArrayList<>();

    public Forum() {
        theListOfUsers.add(new ForumUser(1, "Blue", 'M', LocalDate.of(2000, 1, 12), 3));
        theListOfUsers.add(new ForumUser(2, "Red", 'M', LocalDate.of(1998, 1, 12), 10));
        theListOfUsers.add(new ForumUser(3, "Green", 'F', LocalDate.of(1986, 1, 12), 33));
        theListOfUsers.add(new ForumUser(4, "Grey", 'M', LocalDate.of(1993, 1, 12), 15));
        theListOfUsers.add(new ForumUser(5, "Silver", 'M', LocalDate.of(1989, 1, 12), 13));
        theListOfUsers.add(new ForumUser(6, "Orange", 'F', LocalDate.of(2003, 1, 12), 19));
        theListOfUsers.add(new ForumUser(7, "Black", 'F', LocalDate.of(1992, 1, 12), 38));
        theListOfUsers.add(new ForumUser(8, "White", 'M', LocalDate.of(1988, 1, 12), 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theListOfUsers);
    }

}
