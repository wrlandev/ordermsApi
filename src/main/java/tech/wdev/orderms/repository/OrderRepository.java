package tech.wdev.orderms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.wdev.orderms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
