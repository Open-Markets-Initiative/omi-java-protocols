package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * The cross the order is intended for
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossTypeValue {

    /**
     * Closing Cross
     */
    CLOSING_CROSS('C', "Closing Cross"),

    /**
     * Opening Cross
     */
    OPENING_CROSS('O', "Opening Cross"),

    /**
     * Scheduled Intraday Cross
     */
    SCHEDULED_INTRADAY_CROSS('I', "Scheduled Intraday Cross"),

    /**
     * Halt Cross
     */
    HALT_CROSS('H', "Halt Cross"),

    /**
     * Auction On Demand
     */
    AUCTION_ON_DEMAND('A', "Auction On Demand");

    private final char wire;

    private final String description;

    CrossTypeValue(char wire, String description) {
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
    public static Optional<CrossTypeValue> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSING_CROSS);
            case 'O' -> Optional.of(OPENING_CROSS);
            case 'I' -> Optional.of(SCHEDULED_INTRADAY_CROSS);
            case 'H' -> Optional.of(HALT_CROSS);
            case 'A' -> Optional.of(AUCTION_ON_DEMAND);
            default -> Optional.empty();
        };
    }
}
