package com.pragma.payment.infrastructure;

import com.pragma.payment.domain.PaymentEvent;
import reactor.core.publisher.Mono;

public interface PaymentRepository {
    Mono<PaymentEvent> savePaymentEvent(PaymentEvent paymentEvent);
}