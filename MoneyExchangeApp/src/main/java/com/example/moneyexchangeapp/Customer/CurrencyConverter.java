package com.example.moneyexchangeapp.Customer;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private static final Map<String, Float> rates = new HashMap<>();

    static {
        rates.put("USD-BDT", 110f);
        rates.put("BDT-USD", 0.0091f);

        rates.put("USD-EUR", 0.92f);
        rates.put("EUR-USD", 1.08f);

        rates.put("USD-INR", 83f);
        rates.put("INR-USD", 0.012f);

        rates.put("EUR-BDT", 120f);
        rates.put("BDT-EUR", 0.0083f);
    }

    public static float convert(String from, String to, float amount) {
        String key = from + "-" + to;

        if (!rates.containsKey(key)) {
            return -1;
        }

        return amount * rates.get(key);
    }
}

