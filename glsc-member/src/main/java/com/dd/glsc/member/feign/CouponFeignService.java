package com.dd.glsc.member.feign;

import com.dd.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 远程调用优惠券服务
 */
@FeignClient("glsc-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/coupons")
    public R memebercoupons();
}
