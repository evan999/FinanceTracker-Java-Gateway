package com.financetracker.APIGateway;

//import com.financetracker.APIGateway.filters.ErrorFilter;
//import com.financetracker.APIGateway.filters.PostFilter;
//import com.financetracker.APIGateway.filters.PreFilter;
//import com.financetracker.APIGateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

//	@Bean
//	public PreFilter preFilter() {
//		return new PreFilter();
//	}
//	@Bean
//	public PostFilter postFilter() {
//		return new PostFilter();
//	}
//	@Bean
//	public ErrorFilter errorFilter() {
//		return new ErrorFilter();
//	}
//	@Bean
//	public RouteFilter routeFilter() {
//		return new RouteFilter();
//	}

}
