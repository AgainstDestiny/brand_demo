package cn.itaxu.mapper;

import cn.itaxu.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

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
    @Insert("insert into add (id,brandName,companyName,ordered,description) values(#{id},#{brandName},#{companyName}," +
            "#{ordered},#{description})")
    int add(Brand brand);
}
