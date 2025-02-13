package com.lovehurts.service.impl;

import com.lovehurts.dto.CurrencyRatesResponse;
import com.lovehurts.exception.BaseException;
import com.lovehurts.exception.ErrorMessage;
import com.lovehurts.exception.MessageType;
import com.lovehurts.service.ICurrencyRateService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyRatesServiceImpl implements ICurrencyRateService {

    @Override
    public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {
//        "https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A.YTL&startDate=13-02-2025&endDate=13-02-2025&type=json";
        String rootUrl = "https://evds2.tcmb.gov.tr/service/evds/";
        String series = "TP.DK.USD.A";
        String type = "json";

        String endpoint = rootUrl + "series" + series + "&startDate=" + startDate + "&endDate=" + endDate + "&type=" + type;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("key", "Xxxxxxxxx");

        HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);

        try {
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<CurrencyRatesResponse> response = restTemplate.exchange(endpoint, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<CurrencyRatesResponse>() {
            });
            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            }
        } catch (Exception e) {
            throw new BaseException(new ErrorMessage(MessageType.CURRENCY_RATES_IS_OCCURED, e.getMessage()));
        }

        return null;
    }
}
