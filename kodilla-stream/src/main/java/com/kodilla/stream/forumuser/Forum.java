package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUser = new ArrayList<>();

    public Forum() {
        theUser.add(new ForumUser(1, "user1", 'M', LocalDate.of(1996, 1, 17), 6));
        theUser.add(new ForumUser(2, "user2", 'M', LocalDate.of(1997, 12, 27), 11));
        theUser.add(new ForumUser(3, "user3", 'F', LocalDate.of(1998, 10, 7), 12));
        theUser.add(new ForumUser(4, "user4", 'M', LocalDate.of(1999, 5, 6), 9));
        theUser.add(new ForumUser(5, "user5", 'F', LocalDate.of(2000, 7, 17), 32));
        theUser.add(new ForumUser(6, "user6", 'M', LocalDate.of(1994, 6, 16), 65));
        theUser.add(new ForumUser(7, "user7", 'F', LocalDate.of(1995, 9, 22), 774));
        theUser.add(new ForumUser(8, "user8", 'F', LocalDate.of(2002, 8, 31), 90));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUser);
    }

}
