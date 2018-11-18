package dao;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;



@Component("daoUser")
public class DaoUser {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }

    public void saveUser(User user){

        String sql = " INSERT INTO users VALUES ("+ user.getLogin()+","+ user.getPassword() +")";

//jdbcTemplate.execute(sql);

        jdbcTemplate.update(sql);

    }

}