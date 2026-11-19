package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Rejection motive
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MassCancelRejectReason {

    /**
     * No Permission
     */
    NO_PERMISSION('G', "No Permission"),

    /**
     * Cancelled Because Of Market State
     */
    CANCELLED_BECAUSE_OF_MARKET_STATE('8', "Cancelled Because Of Market State"),

    /**
     * Invalid Data
     */
    INVALID_DATA('9', "Invalid Data");

    private final char wire;

    private final String description;

    MassCancelRejectReason(char wire, String description) {
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
    public static Optional<MassCancelRejectReason> fromWire(char wire) {
        return switch (wire) {
            case 'G' -> Optional.of(NO_PERMISSION);
            case '8' -> Optional.of(CANCELLED_BECAUSE_OF_MARKET_STATE);
            case '9' -> Optional.of(INVALID_DATA);
            default -> Optional.empty();
        };
    }
}
