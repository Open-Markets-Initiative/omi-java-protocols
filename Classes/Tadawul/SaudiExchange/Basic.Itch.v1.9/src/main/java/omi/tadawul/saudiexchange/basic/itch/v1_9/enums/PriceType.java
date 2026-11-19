package omi.tadawul.saudiexchange.basic.itch.v1_9.enums;

import java.util.Optional;

/**
 * Orderbook Price Types
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * Close Price
     */
    CLOSE_PRICE('C', "Close Price"),

    /**
     * Reference Price
     */
    REFERENCE_PRICE('R', "Reference Price"),

    /**
     * Static Reference Price
     */
    STATIC_REFERENCE_PRICE('S', "Static Reference Price"),

    /**
     * Static Limit Price Down
     */
    STATIC_LIMIT_PRICE_DOWN('d', "Static Limit Price Down"),

    /**
     * Static Limit Price Up
     */
    STATIC_LIMIT_PRICE_UP('u', "Static Limit Price Up"),

    /**
     * Settlement Price
     */
    SETTLEMENT_PRICE('L', "Settlement Price"),

    /**
     * Last Trade Price Only Sent By The Glimpse Recovery Service See Section 7
     */
    LAST_TRADE_PRICE_ONLY_SENT_BY_THE_GLIMPSE_RECOVERY_SERVICE_SEE_SECTION_7('T', "Last Trade Price Only Sent By The Glimpse Recovery Service See Section 7");

    private final char wire;

    private final String description;

    PriceType(char wire, String description) {
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
    public static Optional<PriceType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSE_PRICE);
            case 'R' -> Optional.of(REFERENCE_PRICE);
            case 'S' -> Optional.of(STATIC_REFERENCE_PRICE);
            case 'd' -> Optional.of(STATIC_LIMIT_PRICE_DOWN);
            case 'u' -> Optional.of(STATIC_LIMIT_PRICE_UP);
            case 'L' -> Optional.of(SETTLEMENT_PRICE);
            case 'T' -> Optional.of(LAST_TRADE_PRICE_ONLY_SENT_BY_THE_GLIMPSE_RECOVERY_SERVICE_SEE_SECTION_7);
            default -> Optional.empty();
        };
    }
}
