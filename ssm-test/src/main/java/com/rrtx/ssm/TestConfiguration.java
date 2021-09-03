package com.rrtx.ssm;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @author 申劭明
 * @date 2021/9/2 14:26
 */
@Configuration
public class TestConfiguration implements Ordered {

	public TestConfiguration() {
		System.out.println("test configuration");
	}

	@Override
	public int getOrder() {
		return LOWEST_PRECEDENCE - 100;
	}
}
