package com.tinghai.product.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product")
public interface HelloClient {

	@GetMapping("/product/hello")
	String helloWorld();

}
