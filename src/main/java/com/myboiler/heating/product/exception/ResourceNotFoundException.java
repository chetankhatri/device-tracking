package com.myboiler.heating.product.exception;

public class ResourceNotFoundException extends RuntimeException {

    Long resourceId;

    public ResourceNotFoundException(Long resourceId, String message) {
        super(message);
        this.resourceId = resourceId;
    }
}