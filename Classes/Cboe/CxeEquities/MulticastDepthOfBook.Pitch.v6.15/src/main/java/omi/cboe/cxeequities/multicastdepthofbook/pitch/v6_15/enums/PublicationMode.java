package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_15.enums;

import java.util.Optional;

/**
 * MMT Level 4
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PublicationMode {

    /**
     * Trade Report Has Been Delayed At The Request Of The Reporting Party
     */
    TRADE_REPORT_HAS_BEEN_DELAYED_AT_THE_REQUEST_OF_THE_REPORTING_PARTY('1', "Trade Report Has Been Delayed At The Request Of The Reporting Party"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified");

    private final char wire;

    private final String description;

    PublicationMode(char wire, String description) {
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
    public static Optional<PublicationMode> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(TRADE_REPORT_HAS_BEEN_DELAYED_AT_THE_REQUEST_OF_THE_REPORTING_PARTY);
            case '-' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
