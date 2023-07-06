package WebSample.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class SampleController {
//    @GetMapping("/order/1")
//    public String getOrder() {
//        log.info("Get some order");
//        return "orderId: 1, orderAmount : 1000";
//    }

    @PostMapping("/order/1")
    public String createOrder() {
        log.info("create order");
        return "orderId: 1, orderAmount : 1000";
    }

    @GetMapping("/order/{orderId}/orderAmount/{orderAmount}")
    public String getOrder2(@PathVariable String orderId, @PathVariable String orderAmount){
        log.info("orderId : {}, orderAmount : {}", orderId, orderAmount);
        return "orderId : " + orderId + ", orderAmount : " + orderAmount;
    }
    @GetMapping("/order")
    public String searchOrder(String orderId, String orderAmount) {
        log.info("orderId : {}, orderAmount : {}", orderId, orderAmount);
        return "orderId : " + orderId + ", orderAmount : " + orderAmount;
    }


}
