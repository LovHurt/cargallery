package com.lovehurts.service;

import com.lovehurts.dto.CurrencyRatesResponse;

public interface ICurrencyRateService {
    public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate);
}
