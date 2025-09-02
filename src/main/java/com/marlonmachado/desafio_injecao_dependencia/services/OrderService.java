package com.marlonmachado.desafio_injecao_dependencia.services;

import com.marlonmachado.desafio_injecao_dependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShipingService shipingService;

    public double total(Order order){
        double valorComDesconto;

        valorComDesconto =  order.getBasic() - (order.getBasic() * order.getDiscount());
        return valorComDesconto + shipingService.shipment(order);
    }
}
