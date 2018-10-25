package dao;

import domain.User;

public interface UserMapper {
	
	public User getUserById(int id) throws Exception;
	
	public void deleteUser(int id) throws Exception;

}
