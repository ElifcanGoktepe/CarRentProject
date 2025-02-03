package com.elifcan.carrentproject.dto.request;

public record DoRegisterRequestDto(
        String brand,
        String model,
        String color,
        String fuelType
) {
}
