package com.asthetik.springcloud.dao;

import com.asthetik.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    boolean create(Payment payment);

    Payment findById(@Param("id") Long id);
}
