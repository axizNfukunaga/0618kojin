package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entity.Users;

public interface UsersDao {
	public List<Users> login(String id,String pass);
}
