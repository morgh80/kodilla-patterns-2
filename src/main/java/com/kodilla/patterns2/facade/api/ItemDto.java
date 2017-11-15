package com.kodilla.patterns2.facade.api;

public class ItemDto {

    private final Long productId;
    private final Integer quantity;

    public ItemDto(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }

}
