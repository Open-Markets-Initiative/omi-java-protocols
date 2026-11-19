package omi.hkex.hkexsecurities.indexretrans.omd.v1_45.enums;

import java.util.Optional;

/**
 * Index status. Can be blank if not defined by third party index compilers.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IndexStatus {

    /**
     * Closing Value
     */
    CLOSING_VALUE('C', "Closing Value"),

    /**
     * Indicative
     */
    INDICATIVE('I', "Indicative"),

    /**
     * Opening Index
     */
    OPENING_INDEX('O', "Opening Index"),

    /**
     * Last Close Value Previous Session
     */
    LAST_CLOSE_VALUE_PREVIOUS_SESSION('P', "Last Close Value Previous Session"),

    /**
     * Preliminary Close
     */
    PRELIMINARY_CLOSE('R', "Preliminary Close"),

    /**
     * Stop Loss Index
     */
    STOP_LOSS_INDEX('S', "Stop Loss Index"),

    /**
     * Real Time Index Value
     */
    REAL_TIME_INDEX_VALUE('T', "Real Time Index Value");

    private final char wire;

    private final String description;

    IndexStatus(char wire, String description) {
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
    public static Optional<IndexStatus> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSING_VALUE);
            case 'I' -> Optional.of(INDICATIVE);
            case 'O' -> Optional.of(OPENING_INDEX);
            case 'P' -> Optional.of(LAST_CLOSE_VALUE_PREVIOUS_SESSION);
            case 'R' -> Optional.of(PRELIMINARY_CLOSE);
            case 'S' -> Optional.of(STOP_LOSS_INDEX);
            case 'T' -> Optional.of(REAL_TIME_INDEX_VALUE);
            default -> Optional.empty();
        };
    }
}
