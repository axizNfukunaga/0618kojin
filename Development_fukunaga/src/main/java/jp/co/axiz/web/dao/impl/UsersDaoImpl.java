package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.UsersDao;
import jp.co.axiz.web.entity.Users;
@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
	private NamedParameterJdbcTemplate nPJT;
	@Override
	public List<Users> login(String id, String pass) {
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id).addValue("pass",pass);
		try {
			return nPJT.query(
					"SELECT * FROM users WHERE user_id = :id AND password = :pass",
					param,
					new BeanPropertyRowMapper<Users>(Users.class));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

}
