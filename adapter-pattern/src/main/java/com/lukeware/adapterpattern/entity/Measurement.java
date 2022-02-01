package com.lukeware.adapterpattern.entity;

import com.lukeware.adapterpattern.IMeasurement;

/**
 * @author Diego Morais
 */
record Measurement(double value, Type type) implements IMeasurement {
}
