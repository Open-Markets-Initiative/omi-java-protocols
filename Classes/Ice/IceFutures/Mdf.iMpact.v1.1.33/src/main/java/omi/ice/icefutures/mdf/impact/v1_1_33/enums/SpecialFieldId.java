package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * Special field type
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SpecialFieldId {

    /**
     * Eris Futures Price
     */
    ALT_PRICE((byte) 1, "Eris Futures Price"),

    /**
     * High Eris Futures Price
     */
    ALT_HIGH_PRICE((byte) 2, "High Eris Futures Price"),

    /**
     * Low Eris Futures Price
     */
    ALT_LOW_PRICE((byte) 3, "Low Eris Futures Price"),

    /**
     * Volume-weighted Average Eris Futures Price
     */
    ALT_VWAP((byte) 4, "Volume-weighted Average Eris Futures Price"),

    /**
     * Last Trade Eris Futures Price
     */
    ALT_LAST_TRADE_PRICE((byte) 5, "Last Trade Eris Futures Price"),

    /**
     * Order is All-Or-None
     */
    AON((byte) 6, "Order is All-Or-None");

    private final byte wire;

    private final String description;

    SpecialFieldId(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<SpecialFieldId> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(ALT_PRICE);
            case 2 -> Optional.of(ALT_HIGH_PRICE);
            case 3 -> Optional.of(ALT_LOW_PRICE);
            case 4 -> Optional.of(ALT_VWAP);
            case 5 -> Optional.of(ALT_LAST_TRADE_PRICE);
            case 6 -> Optional.of(AON);
            default -> Optional.empty();
        };
    }
}
