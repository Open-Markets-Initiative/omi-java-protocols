package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.enums;

import java.util.Optional;

/**
 * The NASDAQ cross session for which the message is being generated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * NASDAQ Opening Cross
     */
    OPENING_CROSS('O', "NASDAQ Opening Cross"),

    /**
     * NASDAQ Closing Cross
     */
    CLOSING_CROSS('C', "NASDAQ Closing Cross"),

    /**
     * Cross for IPO and halted securities
     */
    IPO_AND_HALTED_CROSS('H', "Cross for IPO and halted securities"),

    /**
     * NASDAQ Cross Network: Intraday Cross and Post-Close Cross. Cross Trade Message only.
     */
    CROSS_NETWORK('I', "NASDAQ Cross Network: Intraday Cross and Post-Close Cross. Cross Trade Message only."),

    /**
     * EMC Cross. Cross Trade Message only.
     */
    EMC_CROSS('E', "EMC Cross. Cross Trade Message only.");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_CROSS);
            case 'C' -> Optional.of(CLOSING_CROSS);
            case 'H' -> Optional.of(IPO_AND_HALTED_CROSS);
            case 'I' -> Optional.of(CROSS_NETWORK);
            case 'E' -> Optional.of(EMC_CROSS);
            default -> Optional.empty();
        };
    }
}
