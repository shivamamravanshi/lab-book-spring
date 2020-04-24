package com.cg;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:emp.properties")
public class JavaConfig {
    @Bean
    SBU sbu(){
        SBU sbu = new SBU();
        return sbu;
    }

}
