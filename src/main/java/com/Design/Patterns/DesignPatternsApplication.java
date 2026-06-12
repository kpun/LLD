package com.Design.Patterns;

import com.Design.Patterns.Factory.Shape;
import com.Design.Patterns.Factory.ShapeFactory;
import com.Design.Patterns.Factory.ShapeFactoryImpl;
import com.Design.Patterns.Strategy.Fix.CardOrder;
import com.Design.Patterns.Strategy.Fix.CardPayment;
import com.Design.Patterns.Strategy.Fix.Order;
import com.Design.Patterns.Strategy.Fix.PaymentStrategy;
import com.Design.Patterns.decorator.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Product product = new Product(10.00);

		PriceCalculator priceCalculator = new GST(new FlatDiscount(new BasePriceCalculator()));
		System.out.println(priceCalculator.calculatePrice(product));
	}

}
