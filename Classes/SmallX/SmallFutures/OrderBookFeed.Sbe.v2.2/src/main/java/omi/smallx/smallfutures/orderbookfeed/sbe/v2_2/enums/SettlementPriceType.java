package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Settlement price type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementPriceType {

    /**
     * Final settlement price for a day, published within 15 mins after instrument market is closed for a day
     */
    FINAL('F', "Final settlement price for a day, published within 15 mins after instrument market is closed for a day"),

    /**
     * Preliminary. Reserved for future use, not published
     */
    PRELIMINARY('P', "Preliminary. Reserved for future use, not published"),

    /**
     * No price. For multi-leg, or if not calculated yet
     */
    NO_PRICE('N', "No price. For multi-leg, or if not calculated yet");

    private final char wire;

    private final String description;

    SettlementPriceType(char wire, String description) {
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
    public static Optional<SettlementPriceType> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(FINAL);
            case 'P' -> Optional.of(PRELIMINARY);
            case 'N' -> Optional.of(NO_PRICE);
            default -> Optional.empty();
        };
    }
}
