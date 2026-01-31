package com.xworkz.onlinepayments.service;

import com.xworkz.onlinepayments.entity.PaymentEntity;

import java.util.List;

public interface PaymentService {

    PaymentEntity validateAndSavePaymentInfo(PaymentEntity entity);
    List<PaymentEntity> validateAndFetchAllDetails();
    boolean validateAndDeletePaymentEntityUsingId(int id);
    PaymentEntity validateAndFetchById(int id);
    PaymentEntity validateAndUpdateById(PaymentEntity entity);
}
