package com.hidden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hidden.dao.*;
import com.hidden.entities.*;
import com.hidden.util.Utils;

@SpringBootApplication
public class BackEndApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BackEndApplication.class, args);
		
		ShopRepository shopRepository = ctx.getBean(ShopRepository.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		List<Shop> l = shopRepository.findAll();
		System.out.println(l.get(3).getName());
		
		Utils compare = new Utils(32.896924399999996, -6.9137273);
		compare.compare(l);
		System.out.println(l.get(3).getName());
		
	}
}
