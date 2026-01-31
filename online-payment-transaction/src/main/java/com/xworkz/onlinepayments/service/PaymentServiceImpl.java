package com.xworkz.onlinepayments.service;

import com.xworkz.onlinepayments.entity.PaymentEntity;
import com.xworkz.onlinepayments.repository.PaymentRepository;
import com.xworkz.onlinepayments.repository.PaymentRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class PaymentServiceImpl implements PaymentService{

    PaymentRepository repository = new PaymentRepositoryImpl();

    @Override
    public PaymentEntity validateAndSavePaymentInfo(PaymentEntity entity) {
        System.out.println("Invoking validation");
        PaymentEntity isValid = null;

        if (entity!=null) {
            isValid = repository.savePaymentInfo(entity);
        } else {
            isValid = null;
        }

        return isValid;
    }

    @Override
    public List<PaymentEntity> validateAndFetchAllDetails() {
        System.out.println("Validating fetch method from service");

        List<PaymentEntity> list = repository.fetchAllDetails();
        if (list!=null && !list.isEmpty()) {
            System.out.println("payment entity found: " + list.size());
        }


        return list;
    }

    @Override
    public boolean validateAndDeletePaymentEntityUsingId(int id) {
        System.out.println("Validating delete from Service");
        boolean isdel = false;
        if (id>0) {
            isdel = repository.deletePaymentEntityUsingId(id);
        } else {
            isdel = false;
        }
        return isdel;
    }

    @Override
    public PaymentEntity validateAndFetchById(int id) {
        System.out.println("validating fetch from service");
        PaymentEntity isValid = null;

        if (id>0) {
            isValid = repository.fetchById(id);
        } else {
            isValid = null;
        }
        return isValid;
    }

    @Override
    public PaymentEntity validateAndUpdateById(PaymentEntity entity) {
        System.out.println("Validating update method from service");
        PaymentEntity isValid = null;

        if (entity!=null) {
            isValid = repository.updateById(entity);
        } else {
            isValid = null;
        }
        return isValid;
    }
}
