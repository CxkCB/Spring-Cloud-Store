package com.cxz.storeproductservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Product {

//    商品ID
    @TableId(value = "product_id",type = IdType.AUTO)
    int productId;

//    商品标题
    String productTitle;

//    商品图片
    String productImage;

//    商品价格
    String productPrice;

//    商品描述
    String productDescription;

}
