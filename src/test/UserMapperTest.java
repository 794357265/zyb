package test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import domain.Item;
import mapper.ItemMapper;

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
		
		
		ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
		
		Item item = new Item();
		item.setRemark("test");
		//item.setUser_id(1);
		//item.setType_id(1);
		//item.setDate("2018-11-12");
		item.setStart_date("2018-11-01");
		//itemMapper.insertItem(item);
		//itemMapper.deleteItemById(1);
		List<Item> allItem = itemMapper.getItems(item);
		System.out.println(allItem);
		//sqlSession.commit();
		sqlSession.close();
		
	}

}
