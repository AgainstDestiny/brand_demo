package cn.itaxu.mapper;

import cn.itaxu.pojo.Brand;
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
}
