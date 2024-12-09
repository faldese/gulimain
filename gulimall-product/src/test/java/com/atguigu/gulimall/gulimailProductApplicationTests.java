package com.atguigu.gulimall;

import com.atguigu.gulimall.product.GulimainProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GulimainProductApplication.class)
@RunWith(SpringRunner.class)
public class gulimailProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("蒙牛");
        brand.setDescript("纯牛马");
        brandService.save(brand);
    }

}
