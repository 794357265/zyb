package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import domain.User;
import mapper.UserMapper;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		
		String config = "sqlMapConfig.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(config);
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//User user = userMapper.getUserById(1);
		
		List<User> list = userMapper.getUserByName("小明");
		
		System.out.println(list);
		
		sqlSession.close();
		
	}

}