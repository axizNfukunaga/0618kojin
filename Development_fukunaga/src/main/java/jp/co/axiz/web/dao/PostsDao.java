package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entity.Posts;

public interface PostsDao {
	public void post(String id, String contents, String genre_id);
	public boolean check(String id);
	public List<Posts> selectA(String contents);
	public List<Posts> selectG(String contents, String genre_id);
	public List<Posts> selectAA(String contents);
	public List<Posts> selectAG(String contents, String genre_id);
}
