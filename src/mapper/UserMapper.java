package mapper;

import java.util.List;

import domain.User;

public interface UserMapper {
	
	public User getUserById(int id) throws Exception;
	
	public List<User> getUserByName(String name) throws Exception;
	
	public void deleteUser(int id) throws Exception;

}
