package cn.itaxu.mapper;

import cn.itaxu.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Description: cn.itaxu.mapper
 * @author: Axu
 * @date:2022/11/4 20:57
 */
public interface BrandMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from brand_test")
    List<Brand> selectAll();

    /**
     * 添加数据
     * @param brand
     * @return
     */
    @Insert("insert into brand_test values(#{id},#{brandName},#{companyName}," +
            "#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 根据 id 查询
     * @param id
     * @return
     */
    @Select("select * from brand_test where id=#{id}")
    Brand selectById(int id);

    /**
     * 更新数据
     * @param brand
     */
    @Update("update brand_test set id=#{id},brandName=#{brandName},companyName=#{companyName},ordered=#{ordered}," +
            "description=#{description},status=#{status} where id=#{id}")
    void update(Brand brand);
}
