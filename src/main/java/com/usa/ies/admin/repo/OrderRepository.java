package com.usa.ies.admin.repo;

import org.springframework.data.repository.CrudRepository;

import com.usa.ies.admin.entity.CartOrder;

public interface OrderRepository extends CrudRepository<CartOrder, Integer>{

}
