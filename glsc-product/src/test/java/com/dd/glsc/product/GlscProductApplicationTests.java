package com.dd.glsc.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dd.glsc.product.entity.BrandEntity;
import com.dd.glsc.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GlscProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
        brandEntity.setName("xiaomi");
        brandService.updateById(brandEntity);
        System.out.println("修改成功");*/
        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>()
                .eq("brand_id", 1L)
        );
        for (BrandEntity brandEntity : brandList) {
            System.out.println(brandEntity);
        }
    }

}
