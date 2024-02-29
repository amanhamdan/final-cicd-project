package com.example.finalcicdproject.service;

import com.example.finalcicdproject.repos.TemperatureDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TemperatureService {
    @Autowired
    private TemperatureDataRepository temperatureDataRepository;

}
