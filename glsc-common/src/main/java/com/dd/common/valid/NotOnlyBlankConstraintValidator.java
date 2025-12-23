package com.dd.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class NotOnlyBlankConstraintValidator implements ConstraintValidator<NotOnlyBlank, String> {
    // 判断是否校验成功
    /**
     * * @param integer 待校验的值
     * @param constraintValidatorContext 上下文
     * @return true-校验成功 false-校验失败
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // 验证字符串不是全为空格
        return value != null && !value.trim().isEmpty();
    }
}
