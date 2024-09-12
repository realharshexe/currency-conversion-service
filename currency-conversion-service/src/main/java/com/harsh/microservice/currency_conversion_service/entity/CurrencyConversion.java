package com.harsh.microservice.currency_conversion_service.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class CurrencyConversion {

    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalAmount;
    private String environment;

    public CurrencyConversion(Long id, String from, String to, BigDecimal quantity) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
    }
}
