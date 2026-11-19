package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * Scope of the deletion request: P=Product (requires ProductID, InstrumentID must be 0), I=Instrument (requires InstrumentID, ProductID must be 0), F=Firm (ProductId and InstrumentId must be set to zero)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Scope {

    /**
     * Cancel all open orders for the specified FirmID/ProductID/InstrumentType
     */
    PRODUCT('P', "Cancel all open orders for the specified FirmID/ProductID/InstrumentType"),

    /**
     * Cancel all the open orders for the specified FirmID/InstrumentID
     */
    INSTRUMENT('I', "Cancel all the open orders for the specified FirmID/InstrumentID"),

    /**
     * Cancel all open orders for the specified FirmID/InstrumentType
     */
    FIRM('F', "Cancel all open orders for the specified FirmID/InstrumentType");

    private final char wire;

    private final String description;

    Scope(char wire, String description) {
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
    public static Optional<Scope> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRODUCT);
            case 'I' -> Optional.of(INSTRUMENT);
            case 'F' -> Optional.of(FIRM);
            default -> Optional.empty();
        };
    }
}
