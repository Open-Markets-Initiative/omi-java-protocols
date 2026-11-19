package omi.nasdaq.nsmequities.noiview.asciiitch.v3_0_2013.enums;

import java.util.Optional;

/**
 * Indicates if NASDAQ system limits order entry for issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RoundLotsOnly {

    /**
     * Nasdaq Omx System Only Accepts Round Lots Orders For This Security
     */
    NASDAQ_OMX_SYSTEM_ONLY_ACCEPTS_ROUND_LOTS_ORDERS_FOR_THIS_SECURITY('Y', "Nasdaq Omx System Only Accepts Round Lots Orders For This Security"),

    /**
     * Nasdaq Omx System Does Not Have Any Order Size Restrictions For This Security
     */
    NASDAQ_OMX_SYSTEM_DOES_NOT_HAVE_ANY_ORDER_SIZE_RESTRICTIONS_FOR_THIS_SECURITY('N', "Nasdaq Omx System Does Not Have Any Order Size Restrictions For This Security");

    private final char wire;

    private final String description;

    RoundLotsOnly(char wire, String description) {
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
    public static Optional<RoundLotsOnly> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(NASDAQ_OMX_SYSTEM_ONLY_ACCEPTS_ROUND_LOTS_ORDERS_FOR_THIS_SECURITY);
            case 'N' -> Optional.of(NASDAQ_OMX_SYSTEM_DOES_NOT_HAVE_ANY_ORDER_SIZE_RESTRICTIONS_FOR_THIS_SECURITY);
            default -> Optional.empty();
        };
    }
}
