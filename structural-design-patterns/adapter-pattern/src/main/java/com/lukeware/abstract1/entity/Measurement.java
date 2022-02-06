package com.lukeware.abstract1.entity;

import com.lukeware.abstract1.IMeasurement;

/**
 * @author Diego Morais
 */
record Measurement(double value, Type type) implements IMeasurement {
}
