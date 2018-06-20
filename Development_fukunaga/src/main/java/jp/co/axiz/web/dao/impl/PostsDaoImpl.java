package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.PostsDao;
import jp.co.axiz.web.entity.Posts;
@Repository
public class PostsDaoImpl implements PostsDao {
	@Autowired
	private NamedParameterJdbcTemplate nPJT;
	@Override
	public void post(String id, String contents, String genre_id) {
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id).addValue("contents", contents).addValue("genre_id", genre_id);
		try {
			nPJT.update(
					"INSERT INTO posts (user_id,contents,browsing_point,date,genre_id) VALUES(:id,:contents,0,CURRENT_DATE,:genre_id) ",
					param);
		} catch (EmptyResultDataAccessException e) {

		}
	}

	@Override
	public boolean check(String id) {
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		try {
			List<Posts> list=nPJT.query(
					"SELECT * FROM posts WHERE user_id = :id AND date= CURRENT_DATE",
					param,
					new BeanPropertyRowMapper<Posts>(Posts.class));

			return list.size()!=0;
		} catch (EmptyResultDataAccessException e) {
			return true;
		}
	}

	@Override
	public List<Posts> selectA(String contents) {
		String content= "%"+contents+"%";
		SqlParameterSource param = new MapSqlParameterSource().addValue("contents", content);
		try {
			List<Posts> list=nPJT.query(
					"SELECT * FROM"
					+ " (posts JOIN genres ON posts.genre_id=genres.genre_id)"
					+ "  JOIN users ON posts.user_id=users.user_id"
					+ " WHERE posts.contents LIKE :contents",
					param,
					new BeanPropertyRowMapper<Posts>(Posts.class));

			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Posts> selectG(String contents, String genre_id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Posts> selectAA(String contents) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Posts> selectAG(String contents, String genre_id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
