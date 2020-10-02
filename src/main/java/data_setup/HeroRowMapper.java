package data_setup;

import hero.Hero;
import hero.HeroOrigin;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HeroRowMapper {

    public Hero mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Hero(rs.getString(1), rs.getString(2), rs.getString(3), new HeroOrigin(rs.getInt(4), rs.getString(5)));
    }
}
