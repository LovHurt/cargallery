package com.lovehurts.controller;

import com.lovehurts.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {
    public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate, String endDate );
}
