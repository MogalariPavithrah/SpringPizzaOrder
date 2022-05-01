package com.abc.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.pizza.entity.OrderTransactions;
@Repository
public interface OrderTransactionRepository extends JpaRepository<OrderTransactions, Integer>{

}
