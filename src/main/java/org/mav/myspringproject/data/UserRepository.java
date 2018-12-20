package org.mav.myspringproject.data;

import org.mav.myspringproject.model.User;

public interface UserRepository {
    Iterable<User> findAll();

    User findOne(String id);

    User save(User user);
}
