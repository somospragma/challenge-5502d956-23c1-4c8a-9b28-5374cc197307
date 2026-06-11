package com.pragma.payment.application;

import com.pragma.payment.domain.PaymentEvent;
import reactor.core.publisher.Mono;

public interface PaymentEventService {
    Mono<PaymentEvent> validatePaymentEvent(PaymentEvent paymentEvent);
}