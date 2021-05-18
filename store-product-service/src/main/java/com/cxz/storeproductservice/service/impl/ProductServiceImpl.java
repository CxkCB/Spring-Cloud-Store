package com.cxz.storeproductservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxz.storeproductservice.entity.Product;
import com.cxz.storeproductservice.mapper.ProductMapper;
import com.cxz.storeproductservice.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
