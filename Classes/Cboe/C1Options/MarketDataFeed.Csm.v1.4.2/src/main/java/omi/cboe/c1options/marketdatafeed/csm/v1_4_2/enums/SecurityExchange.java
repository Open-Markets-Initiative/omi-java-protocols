package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.enums;

import java.util.Optional;

/**
 * Defines the SecurityExchange values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityExchange {

    /**
     * Cboe
     */
    CBOE('C', "Cboe"),

    /**
     * One Chicago – Not Supported
     */
    ONE_CHICAGO_NOT_SUPPORTED('O', "One Chicago \u2013 Not Supported"),

    /**
     * CBSX – Not Supported
     */
    CBSX_NOT_SUPPORTED('W', "CBSX \u2013 Not Supported"),

    /**
     * CFE/COF
     */
    CFECOF('F', "CFE/COF"),

    /**
     * Cboe2 Options
     */
    CBOE_2_OPTIONS('2', "Cboe2 Options");

    private final char wire;

    private final String description;

    SecurityExchange(char wire, String description) {
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
    public static Optional<SecurityExchange> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CBOE);
            case 'O' -> Optional.of(ONE_CHICAGO_NOT_SUPPORTED);
            case 'W' -> Optional.of(CBSX_NOT_SUPPORTED);
            case 'F' -> Optional.of(CFECOF);
            case '2' -> Optional.of(CBOE_2_OPTIONS);
            default -> Optional.empty();
        };
    }
}
