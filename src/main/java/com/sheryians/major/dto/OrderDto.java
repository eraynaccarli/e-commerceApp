package com.sheryians.major.dto;

import lombok.Data;

@Data
public class OrderDto {

    private String firstName;

    private String lastName;

    private String address1;

    private String address2;

    private int postCode;

    private String city;

    private String phoneNumber;

    private String email;

    private String AdditionalInformation;

    private  long userId;

}
