package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Defines the InstrumentType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentType {

    /**
     * Futures
     */
    FUTURES('F', "Futures"),

    /**
     * Options On
     */
    OPTIONS_ON('O', "Options On"),

    /**
     * Trade At
     */
    TRADE_AT('T', "Trade At"),

    /**
     * Basis
     */
    BASIS('B', "Basis");

    private final char wire;

    private final String description;

    InstrumentType(char wire, String description) {
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
    public static Optional<InstrumentType> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(FUTURES);
            case 'O' -> Optional.of(OPTIONS_ON);
            case 'T' -> Optional.of(TRADE_AT);
            case 'B' -> Optional.of(BASIS);
            default -> Optional.empty();
        };
    }
}
