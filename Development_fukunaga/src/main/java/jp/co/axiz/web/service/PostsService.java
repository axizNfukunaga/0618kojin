package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entity.Posts;

public interface PostsService {
	public void post(String id, String contents, String genre_id) ;
	public boolean check(String id);
	public List<Posts> selectA(String contents);
	public List<Posts> selectG(String contents, String genre_id);
	public List<Posts> orderA();
	public List<Posts> orderG(String genre_id);
	public Integer getPoint(Integer post_id);
	public void pointUp(Integer post_id, Integer point);
	public List<Posts> orderD();

}
