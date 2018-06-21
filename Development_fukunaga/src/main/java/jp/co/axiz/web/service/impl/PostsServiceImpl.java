package jp.co.axiz.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.axiz.web.dao.PostsDao;
import jp.co.axiz.web.entity.Posts;
import jp.co.axiz.web.service.PostsService;
@Service
public class PostsServiceImpl implements PostsService {
	@Autowired
	PostsDao postsDao;
	@Override
	public void post(String id, String contents, String genre_id) {
		postsDao.post(id, contents, genre_id);

	}

	@Override
	public boolean check(String id) {
		boolean success=postsDao.check(id);
		return !success;
	}

	@Override
	public List<Posts> selectA(String contents) {
		List<Posts> list=postsDao.selectA(contents);
		return list;
	}

	@Override
	public List<Posts> selectG(String contents, String genre_id) {
		List<Posts> list=postsDao.selectG(contents,genre_id);
		return list;
	}

	@Override
	public List<Posts> orderA() {
		List<Posts> list=postsDao.orderA();
		return list;

	}

	@Override
	public List<Posts> orderG(String genre_id) {
		List<Posts> list=postsDao.orderG(genre_id);
		return list;

	}

	@Override
	public Integer getPoint(Integer post_id) {

		return postsDao.getPoint(post_id);
	}

	@Override
	public void pointUp(Integer post_id, Integer point) {
		postsDao.pointUp(post_id, point);

	}

	@Override
	public List<Posts> orderD() {
		List<Posts> list=postsDao.orderD();
		return list;
	}



}
