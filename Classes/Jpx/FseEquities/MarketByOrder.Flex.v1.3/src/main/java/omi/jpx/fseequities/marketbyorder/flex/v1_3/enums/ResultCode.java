package omi.jpx.fseequities.marketbyorder.flex.v1_3.enums;

import java.util.Optional;

/**
 * Set to the result code of the login request
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ResultCode {

    /**
     * Accepted
     */
    ACCEPTED('A', "Accepted"),

    /**
     * Out Of Service
     */
    OUT_OF_SERVICE('O', "Out Of Service"),

    /**
     * Incorrect User Id
     */
    INCORRECT_USER_ID('U', "Incorrect User Id"),

    /**
     * Incorrect Sequence Number
     */
    INCORRECT_SEQUENCE_NUMBER('S', "Incorrect Sequence Number"),

    /**
     * Incorrect Packet Type
     */
    INCORRECT_PACKET_TYPE('T', "Incorrect Packet Type"),

    /**
     * Incorrect Mcg Number
     */
    INCORRECT_MCG_NUMBER('M', "Incorrect Mcg Number"),

    /**
     * Other Error
     */
    OTHER_ERROR('Z', "Other Error");

    private final char wire;

    private final String description;

    ResultCode(char wire, String description) {
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
    public static Optional<ResultCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTED);
            case 'O' -> Optional.of(OUT_OF_SERVICE);
            case 'U' -> Optional.of(INCORRECT_USER_ID);
            case 'S' -> Optional.of(INCORRECT_SEQUENCE_NUMBER);
            case 'T' -> Optional.of(INCORRECT_PACKET_TYPE);
            case 'M' -> Optional.of(INCORRECT_MCG_NUMBER);
            case 'Z' -> Optional.of(OTHER_ERROR);
            default -> Optional.empty();
        };
    }
}
