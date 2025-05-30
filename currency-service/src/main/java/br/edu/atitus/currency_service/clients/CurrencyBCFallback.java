package br.edu.atitus.currency_service.clients;

import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class CurrencyBCFallback implements CurrencyBCClient {
    @Override
    public CurrencyBCResponse getCurrency(String moeda) {
        CurrencyBCResponse Fallback = new CurrencyBCResponse();
        Fallback.setValue(Collections.emptyList());
        return Fallback;
    }
}
