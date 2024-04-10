package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Order;
import model.UserScratchCardReport;
import services.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        Order order = orderService.createOrder(createOrderRequest.getUserId(), createOrderRequest.getItemIds(), createOrderRequest.getScratchCardId());
        return ResponseEntity.ok(order);
    }

    @GetMapping("/reports")
    public ResponseEntity<List<UserScratchCardReport>> getUserScratchCardReports() {
        List<UserScratchCardReport> reports = orderService.getUserScratchCardReports();
        return ResponseEntity.ok(reports);
    }
}
