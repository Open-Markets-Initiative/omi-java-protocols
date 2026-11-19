package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * CCP Code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CcpCode2 {

    /**
     * Bme Clearing… Others To Be Defined
     */
    BME_CLEARING__OTHERS_TO_BE_DEFINED('1', "Bme Clearing\u2026 Others To Be Defined"),

    /**
     * N/A
     */
    NOT_APPLICABLE('0', "N/A");

    private final char wire;

    private final String description;

    CcpCode2(char wire, String description) {
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
    public static Optional<CcpCode2> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BME_CLEARING__OTHERS_TO_BE_DEFINED);
            case '0' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
