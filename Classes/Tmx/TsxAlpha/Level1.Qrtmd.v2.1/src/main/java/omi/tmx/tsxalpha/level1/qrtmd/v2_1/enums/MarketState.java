package omi.tmx.tsxalpha.level1.qrtmd.v2_1.enums;

import java.util.Optional;

/**
 * The indication of the current market state.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketState {

    /**
     * Pre Open
     */
    PRE_OPEN('P', "Pre Open"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Open
     */
    OPEN('S', "Open"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Extended Hours Close
     */
    EXTENDED_HOURS_CLOSE('F', "Extended Hours Close"),

    /**
     * Extended Hours Cxls
     */
    EXTENDED_HOURS_CXLS('N', "Extended Hours Cxls");

    private final char wire;

    private final String description;

    MarketState(char wire, String description) {
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
    public static Optional<MarketState> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRE_OPEN);
            case 'O' -> Optional.of(OPENING);
            case 'S' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSED);
            case 'F' -> Optional.of(EXTENDED_HOURS_CLOSE);
            case 'N' -> Optional.of(EXTENDED_HOURS_CXLS);
            default -> Optional.empty();
        };
    }
}
