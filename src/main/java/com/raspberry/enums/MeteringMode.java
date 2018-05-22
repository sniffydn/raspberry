package com.raspberry.enums;

public enum MeteringMode {

    /**
     * Average the whole frame for metering.
     */
    AVERAGE,
    /**
     * Spot metering.
     */
    SPOT,
    /**
     * Assume a backlit image.
     */
    BACKLIT,
    /**
     * Matrix metering.
     */
    MATRIX;
}
