package tech.wdev.orderms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.wdev.orderms.controller.dto.ApiResponse;
import tech.wdev.orderms.controller.dto.OrderResponse;
import tech.wdev.orderms.service.OrderService;

@RestController
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/customers/{customersId}/orders")
    public ResponseEntity<ApiResponse<OrderResponse>> listOders(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                                                @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){

        return ResponseEntity.ok(null);
    }
}
