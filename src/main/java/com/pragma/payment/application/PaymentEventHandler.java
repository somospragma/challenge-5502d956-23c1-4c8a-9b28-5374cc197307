package com.pragma.payment.application;

import com.pragma.payment.domain.PaymentEvent;
import com.pragma.payment.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PaymentEventHandler {
    private final PaymentEventService paymentEventService;
    private final PaymentRepository paymentRepository;

    public PaymentEventHandler(PaymentEventService paymentEventService, PaymentRepository paymentRepository) {
        this.paymentEventService = paymentEventService;
        this.paymentRepository = paymentRepository;
    }

    public Mono<PaymentEvent> handlePaymentEvent(PaymentEvent paymentEvent) {
        return paymentEventService.validatePaymentEvent(paymentEvent)
               .flatMap(validatedEvent -> paymentRepository.savePaymentEvent(validatedEvent));
    }
}