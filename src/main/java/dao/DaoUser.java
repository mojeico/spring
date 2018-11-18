package dao;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class DaoUser {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }



    public void saveUserJdbc(User user){
        String sql = "INSERT INTO users (login, password) VALUES (? , ?)";
        jdbcTemplate.update(sql , new Object[]{user.getLogin() , user.getPassword()});
    }

    public User showUserJdbc(User user){
        String sql = "SELECT * FROM users WHERE login = ? ;";
        System.out.println(jdbcTemplate.queryForObject(sql, new Object[]{user.getLogin()}, new UserRowMapper()) );
        return jdbcTemplate.queryForObject(sql, new Object[]{user.getLogin()}, new UserRowMapper() );
    }


    public String tryUser(User user){
        return null;
    }







    private static  final class UserRowMapper implements RowMapper<User>{

        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();

            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));

            return user;
        }
    }

}