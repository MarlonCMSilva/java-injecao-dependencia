package com.marlonmachado.desafio_injecao_dependencia;

import com.marlonmachado.desafio_injecao_dependencia.entities.Order;
import com.marlonmachado.desafio_injecao_dependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioInjecaoDependenciaApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioInjecaoDependenciaApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.00, 0.2);
        Order order2 = new Order(2282, 800.00, 0.1);
        Order order3 = new Order(1309, 95.90, 0.0);

        System.out.println("Exemplo 1 ");
        System.out.println("Pedido Código: "+  order1.getCode());
        System.out.println("Valor  Total: R$ " +  orderService.total(order1));
        System.out.println();
        System.out.println("Exemplo 2 ");
        System.out.println("Pedido Código: "+  order2.getCode());
        System.out.println("Valor  Total: R$ " +  orderService.total(order2));
        System.out.println();
        System.out.println("Exemplo 3 ");
        System.out.println("Pedido Código: "+  order3.getCode());
        System.out.println("Valor  Total: R$ " +  orderService.total(order3));
    }
}
