package com.cg;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.cg")
@PropertySource("classpath:emp.properties")
public class JavaConfig {


}
