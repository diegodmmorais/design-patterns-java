package com.lukeware.flyweight.entity;

import com.lukeware.flyweight.IDeliveryLocationData;

/**
 * @author Diego Morais
 */
final record DeliveryLocationData(String zipCode, String cyte) implements IDeliveryLocationData {
}
