package com.xworkz.onlinepayments.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NamedQuery(name = "findAllDetails", query = "select x from PaymentEntity x")
@NamedQuery(name = "updatePaymentEntityUsingId",
        query = "update PaymentEntity x set x.amount=:amount where x.id=:id")
@Table(name = "payment_info")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int id;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "transaction_id")
    private long transactionId;

    @Column(name = "amount_sender_name")
    private String amountSenderName;
    private double amount;

    @Column(name = "amount_receiver_name")
    private String amountReceiverName;
    private String date;


}
