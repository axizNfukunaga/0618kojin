package jp.co.axiz.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.axiz.web.dao.PostsDao;
import jp.co.axiz.web.dao.UsersDao;
import jp.co.axiz.web.entity.Users;
import jp.co.axiz.web.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersDao usersDao;
	@Autowired
	PostsDao postsDao;

	@Transactional
	@Override
	public Users login(String id, String pass) {
		boolean success;
		List<Users> list=usersDao.login(id,pass);
		success=list.size()!=0;
		if(success) {
			return list.get(0);
		}else {
			return null;
		}

	}

	@Transactional
	@Override
	public boolean idCheck(String id) {
		boolean is;
		List<Users> list=usersDao.idCheck(id);
		is=list.size()==0;
		return is;
	}

	@Transactional
	@Override
	public void regist(String id, String nic, String pass) {
		usersDao.regist(id, nic, pass);

	}

	@Transactional
	@Override
	public void rankChange(String id, String rank_id) {
		usersDao.rankChange(id, rank_id);

	}

	@Transactional
	@Override
	public void unsub(String id) {
		usersDao.unsub(id);
		postsDao.unsub(id);

	}

	@Transactional
	@Override
	public List<Users> serchId(String id) {
		return usersDao.idSerch(id);

	}



}
