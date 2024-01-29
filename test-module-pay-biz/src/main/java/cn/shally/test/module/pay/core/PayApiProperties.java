package cn.shally.test.module.pay.core;

import cn.wisewe.framework.web.core.properties.ApiProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

/**
 * pay API配置
 * @author liaoxu
 * @date 2023/12/13 09:53
 */
@Component
public class PayApiProperties implements ApiProperties {
    @Override
    @NotEmpty(message = "API 前缀不能为空")
    public String getPrefix() {
        return "/admin-api";
    }

    @Override
    @NotEmpty(message = "Controller 所在包不能为空")
    public String getController() {
        return "**.pay.controller.**";
    }
}
