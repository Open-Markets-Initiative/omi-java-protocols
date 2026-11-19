package omi.nasdaq.nsmequities.noiview.asciiitch.v3_0_2013.enums;

import java.util.Optional;

/**
 * Indicates if the NASDAQ security is set up for IPO release.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoFlag {

    /**
     * Nasdaq Listed Instrument Is Set Up As A New Ipo Security
     */
    NASDAQ_LISTED_INSTRUMENT_IS_SET_UP_AS_A_NEW_IPO_SECURITY('Y', "Nasdaq Listed Instrument Is Set Up As A New Ipo Security"),

    /**
     * Nasdaq Listed Instrument Is Not Set Up As A New Ipo Security
     */
    NASDAQ_LISTED_INSTRUMENT_IS_NOT_SET_UP_AS_A_NEW_IPO_SECURITY('N', "Nasdaq Listed Instrument Is Not Set Up As A New Ipo Security"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    IpoFlag(char wire, String description) {
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
    public static Optional<IpoFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(NASDAQ_LISTED_INSTRUMENT_IS_SET_UP_AS_A_NEW_IPO_SECURITY);
            case 'N' -> Optional.of(NASDAQ_LISTED_INSTRUMENT_IS_NOT_SET_UP_AS_A_NEW_IPO_SECURITY);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
