package com.hidden;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hidden.dao.ShopRepository;
import com.hidden.entities.Shop;

@SpringBootApplication
public class BackEndApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BackEndApplication.class, args);
		
		ShopRepository shopRepository = ctx.getBean(ShopRepository.class);
		List<Shop> l =shopRepository.findAll(); 
		System.out.println(l.get(0).getName());
		Collections.sort(l, new Comparator<Shop>() {

			@Override
			public int compare(Shop o1, Shop o2) {
				return o1.getLocation().compareTo(o2.getLocation());
			}
		});
		System.out.println(l.get(0).getName());
	}
}
