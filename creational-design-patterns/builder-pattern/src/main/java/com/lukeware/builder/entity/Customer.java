package com.lukeware.builder.entity;

final record Customer(String name,
                      String lastName,
                      String phone,
                      String identifierDocument,
                      String email) implements ICustomer {
}
