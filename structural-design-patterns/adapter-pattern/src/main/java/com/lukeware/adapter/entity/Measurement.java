package com.lukeware.adapter.entity;

import com.lukeware.adapter.IMeasurement;

/**
 * @author Diego Morais
 */
record Measurement(double value, Type type) implements IMeasurement {
}
