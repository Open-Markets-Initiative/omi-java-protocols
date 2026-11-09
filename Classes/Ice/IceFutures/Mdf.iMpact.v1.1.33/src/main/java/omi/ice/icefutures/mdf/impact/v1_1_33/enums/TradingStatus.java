package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * See Appendix A on the trading status codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Close
     */
    CLOSE('C', "Close"),

    /**
     * Expired
     */
    EXPIRED('E', "Expired"),

    /**
     * Pre Open
     */
    PRE_OPEN('1', "Pre Open"),

    /**
     * Pre Close
     */
    PRE_CLOSE('2', "Pre Close");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSE);
            case 'E' -> Optional.of(EXPIRED);
            case '1' -> Optional.of(PRE_OPEN);
            case '2' -> Optional.of(PRE_CLOSE);
            default -> Optional.empty();
        };
    }
}
