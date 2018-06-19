package jp.co.axiz.web.service;

import jp.co.axiz.web.entity.Users;

public interface UsersService {
	public Users login(String id, String pass);
}
