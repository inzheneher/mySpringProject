package org.mav.myspringproject.data;

import org.mav.myspringproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcUserRepository implements UserRepository {

    private JdbcTemplate template;

    @Autowired
    public JdbcUserRepository(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public Iterable<User> findAll() {
        return template.query("select * from User", this::mapRowToUser);
    }

    @Override
    public User findOne(String id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    private User mapRowToUser(ResultSet rs, int rowNum)
            throws SQLException {
        return new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("lastName"),
                rs.getInt("age"),
                null);
    }
}
