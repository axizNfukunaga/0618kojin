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
	public List<Posts> selectAA(String contents) {
		List<Posts> list=postsDao.selectAA(contents);
		return list;
	}

	@Override
	public List<Posts> selectAG(String contents, String genre_id) {
		List<Posts> list=postsDao.selectAG(contents,genre_id);
		return list;
	}

}
