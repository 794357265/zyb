package com.newtec.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.newtec.dao.UserMapper1;
import com.newtec.dao.UserMapperImpl1;
import com.newtec.domain.User;
import com.newtec.mapper.UserMapper;

public class UserMapperTest {

	private static SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		
		String config = "sqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(config);
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	@Test
	public void test() throws Exception {
//		UserMapper1 userMapper = new UserMapperImpl1(sqlSessionFactory);
//		List<User> user = userMapper.getUserByName("小明");
//		System.out.println(user);

		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		User user = new User();
//		user.setSex("1");
//		user.setUsername("小明");
		List<String> ids = new ArrayList<String>();
		ids.add("1");
		ids.add("25");
		List<User> list = userMapper.getUserByIds(ids);
		System.out.println(list);
		//List<User> user = userMapper.getUserByName("小明");
		//userMapper.deleteUser(26);
		//User user = new User();
//		user.setId(27);
//		user.setBirthday(new Date());
//		user.setSex("2");
//		user.setUsername("王五");
		//userMapper.insertUser(user);
		
		
		//sqlSession.close();
		
	}

}
