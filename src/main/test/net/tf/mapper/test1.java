package net.tf.mapper;

import net.tf.bean.Girl;
import net.tf.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/5/16 18:20
 * @desc
 */
public class test1 {
    @Test
    public void test1() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        GirlMapper girlMapper = sqlSession.getMapper(GirlMapper.class);
        girlMapper.insert(new Girl("林心如","霍建花", new Date()));
        sqlSession.commit();
        sqlSession.close();

    }
}
