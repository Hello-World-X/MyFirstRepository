package com.example.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar  // 底层注解使用了 Zuul 代理
// 必须通过 api 网关访问，配置 Zuul，通过 Zuul 访问。
public class SidecarApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SidecarApplication.class, args);
	}
}
