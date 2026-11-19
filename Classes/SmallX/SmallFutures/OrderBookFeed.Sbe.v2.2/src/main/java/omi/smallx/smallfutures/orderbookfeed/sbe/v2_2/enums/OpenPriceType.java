package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Open price type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenPriceType {

    /**
     * Indicative price calculated and published every second during the pre-opening auction
     */
    INDICATIVE('I', "Indicative price calculated and published every second during the pre-opening auction"),

    /**
     * Traded open price as a result of opening after the day pre-opening auction
     */
    TRADED('T', "Traded open price as a result of opening after the day pre-opening auction"),

    /**
     * No price
     */
    NO_PRICE('N', "No price");

    private final char wire;

    private final String description;

    OpenPriceType(char wire, String description) {
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
    public static Optional<OpenPriceType> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(INDICATIVE);
            case 'T' -> Optional.of(TRADED);
            case 'N' -> Optional.of(NO_PRICE);
            default -> Optional.empty();
        };
    }
}
