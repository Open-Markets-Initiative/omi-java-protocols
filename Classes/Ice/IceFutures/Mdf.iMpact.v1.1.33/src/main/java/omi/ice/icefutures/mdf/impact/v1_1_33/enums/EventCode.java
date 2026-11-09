package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * Event code: ‘0’ – Normal trade, ‘1’ – Cancelled trade, ‘2’ – Adjusted trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Normal Trade
     */
    NORMAL_TRADE('0', "Normal Trade"),

    /**
     * Cancelled Trade
     */
    CANCELLED_TRADE('1', "Cancelled Trade"),

    /**
     * Adjusted Trade
     */
    ADJUSTED_TRADE('2', "Adjusted Trade");

    private final char wire;

    private final String description;

    EventCode(char wire, String description) {
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
    public static Optional<EventCode> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NORMAL_TRADE);
            case '1' -> Optional.of(CANCELLED_TRADE);
            case '2' -> Optional.of(ADJUSTED_TRADE);
            default -> Optional.empty();
        };
    }
}
