package omi.tradelogiq.lynxats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * Settlement terms of the cross
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementType {

    /**
     * Regular Settlement
     */
    REGULAR_SETTLEMENT('0', "Regular Settlement"),

    /**
     * Cash (T+0)
     */
    CASH('1', "Cash (T+0)"),

    /**
     * Next Day (T+1)
     */
    NEXT_DAY('2', "Next Day (T+1)"),

    /**
     * Delayed Delivery
     */
    DELAYED_DELIVERY('3', "Delayed Delivery");

    private final char wire;

    private final String description;

    SettlementType(char wire, String description) {
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
    public static Optional<SettlementType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(REGULAR_SETTLEMENT);
            case '1' -> Optional.of(CASH);
            case '2' -> Optional.of(NEXT_DAY);
            case '3' -> Optional.of(DELAYED_DELIVERY);
            default -> Optional.empty();
        };
    }
}
