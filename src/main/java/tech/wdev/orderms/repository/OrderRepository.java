package tech.wdev.orderms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.wdev.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
