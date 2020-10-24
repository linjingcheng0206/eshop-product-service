package com.roncoo.eshop.product.mapper;

import com.roncoo.eshop.product.model.Category;
import org.apache.ibatis.annotations.*;

/**
 * @Author linjingcheng
 * @data 2020/10/17
 */
@Mapper
public interface CategoryMapper {
    @Insert("INSERT INTO category(name,description) VALUES(#{name},#{description})")
    public void add(Category category);

    @Update("UPDATE category set name=#{name},description=#{description} WHERE id=#{id}")
    public void update(Category category);

    @Delete("DELETE FROM category WHERE id=#{id}")
    public void delete(Long id);

    @Select("SELECT * FROM category WHERE id=#{id}")
    public Category findById(Long id);




}
