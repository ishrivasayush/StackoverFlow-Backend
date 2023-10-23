package com.narainox.stackoverflow.backend.exception;

public class ResourceNotFoundException extends RuntimeException{
    private String resource;
    private String value;
    private String type;

    public ResourceNotFoundException(String resource, String value, String type) {
        super(String.format("%s Not Found With %s : %s",resource,type,value));
        this.resource = resource;
        this.value = value;
        this.type = type;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
