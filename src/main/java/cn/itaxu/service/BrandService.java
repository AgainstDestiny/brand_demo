package cn.itaxu.service;

import cn.itaxu.mapper.BrandMapper;
import cn.itaxu.pojo.Brand;
import cn.itaxu.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Description: cn.itaxu.service
 * @author: Axu
 * @date:2022/11/4 21:04
 */
public class BrandService {
   SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有
     * @return
     */
    public List<Brand> selectAll(){
        // 调用BrandMapper.selectAll()

        // 2.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.获取BrandMapper
        BrandMapper userMapper = sqlSession.getMapper(BrandMapper.class);
        // 4.调用方法
        List<Brand> brands = userMapper.selectAll();
        // 5.释放资源
        sqlSession.close();
        return brands;
    }

    /**
     * 添加品牌数据
     * @param brand
     */
    public void add(Brand brand){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.add(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 根据 id 查询
     * @param id
     * @return
     */
    public Brand selectById(int id){
        // 调用BrandMapper.selectAll()

        // 2.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.获取BrandMapper
        BrandMapper userMapper = sqlSession.getMapper(BrandMapper.class);
        // 4.调用方法
        Brand brand = userMapper.selectById(id);
        // 5.释放资源
        sqlSession.close();
        return brand;
    }

    public void update(Brand brand){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
    }

}
