package com.example.employee.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorImpl implements AuditorAware<String> {

    @SuppressWarnings("null")
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("SystemAdmin");
    }
}
