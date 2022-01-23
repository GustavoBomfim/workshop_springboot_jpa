package com.project.code1.repositories;

import com.project.code1.entities.OrderItem;
import com.project.code1.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
