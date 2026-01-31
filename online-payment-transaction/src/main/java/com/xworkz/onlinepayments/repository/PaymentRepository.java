package com.xworkz.onlinepayments.repository;

import com.xworkz.onlinepayments.entity.PaymentEntity;

import java.util.List;

public interface PaymentRepository {

    PaymentEntity savePaymentInfo(PaymentEntity entity);
    List<PaymentEntity> fetchAllDetails();
    boolean deletePaymentEntityUsingId(int id);
    PaymentEntity fetchById(int id);
    PaymentEntity updateById(PaymentEntity entity);
}
