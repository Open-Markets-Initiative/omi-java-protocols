package omi.databento.marketdata.normalized.dbn.v2.enums;

import java.util.Optional;

/**
 * The classification of the instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentClass {

    /**
     * Bond
     */
    BOND('B', "Bond"),

    /**
     * Call
     */
    CALL('C', "Call"),

    /**
     * Future
     */
    FUTURE('F', "Future"),

    /**
     * Index
     */
    INDEX('I', "Index"),

    /**
     * Stock
     */
    STOCK('K', "Stock"),

    /**
     * Mixed Spread
     */
    MIXED_SPREAD('M', "Mixed Spread"),

    /**
     * Put
     */
    PUT('P', "Put"),

    /**
     * Future Spread
     */
    FUTURE_SPREAD('S', "Future Spread"),

    /**
     * Option Spread
     */
    OPTION_SPREAD('T', "Option Spread"),

    /**
     * Fx Spot
     */
    FX_SPOT('X', "Fx Spot"),

    /**
     * Commodity Spot
     */
    COMMODITY_SPOT('Y', "Commodity Spot");

    private final char wire;

    private final String description;

    InstrumentClass(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<InstrumentClass> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BOND);
            case 'C' -> Optional.of(CALL);
            case 'F' -> Optional.of(FUTURE);
            case 'I' -> Optional.of(INDEX);
            case 'K' -> Optional.of(STOCK);
            case 'M' -> Optional.of(MIXED_SPREAD);
            case 'P' -> Optional.of(PUT);
            case 'S' -> Optional.of(FUTURE_SPREAD);
            case 'T' -> Optional.of(OPTION_SPREAD);
            case 'X' -> Optional.of(FX_SPOT);
            case 'Y' -> Optional.of(COMMODITY_SPOT);
            default -> Optional.empty();
        };
    }
}
