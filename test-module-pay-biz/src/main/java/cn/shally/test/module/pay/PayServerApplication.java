package cn.shally.test.module.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zongqiang
 * @date 2024年1月25日 14:21
 */
@SpringBootApplication
@MapperScan("cn.shally.test.module.pay.dal.mysql")
@EnableFeignClients(basePackages = {"cn.shally.test.module.*.api"})
public class PayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class, args);
    }

}
