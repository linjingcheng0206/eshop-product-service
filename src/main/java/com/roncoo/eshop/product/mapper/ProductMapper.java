package com.roncoo.eshop.product.mapper;

import com.roncoo.eshop.product.model.Product;
import org.apache.ibatis.annotations.*;

/**
 * @Author linjingcheng
 * @data 2020/10/17
 */
@Mapper
public interface ProductMapper {

    @Insert("INSERT INTO product(name,category_id,brand_id) VALUES(#{name},#{categoryId},#{brandId})")
    public void add(Product product);

    @Update("UPDATE product SET name=#{name},category_id=#{categoryId},brand_id=#{brandId} WHERE id=#{id}")
    public void update(Product product);

    @Delete("DELETE FROM product WHERE id=#{id}")
    public void delete(Long id);

    @Select("SELECT * FROM product WHERE id=#{id}")
    @Results({
            @Result(column = "category_id", property = "categoryId"),
            @Result(column = "brand_id", property = "brandId")
    })
    public Product findById(Long id);
}
