package jp.co.axiz.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.axiz.web.dao.UsersDao;
import jp.co.axiz.web.entity.Users;
import jp.co.axiz.web.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
@Autowired
UsersDao usersDao;
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

}
