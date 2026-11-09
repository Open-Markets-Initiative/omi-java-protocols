package omi.coinbase.deribit.marketdataapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * reason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum Reason {

    /**
     * SEQ_TOO_LOW
     */
    SEQ_TOO_LOW((byte) 1, "SEQ_TOO_LOW"),

    /**
     * SEQ_TOO_HIGH
     */
    SEQ_TOO_HIGH((byte) 2, "SEQ_TOO_HIGH"),

    /**
     * RATE_LIMIT_EXCEEDED
     */
    RATE_LIMIT_EXCEEDED((byte) 3, "RATE_LIMIT_EXCEEDED"),

    /**
     * OTHER_ERROR
     */
    OTHER_ERROR((byte) 4, "OTHER_ERROR");

    private final byte wire;

    private final String description;

    Reason(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<Reason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(SEQ_TOO_LOW);
            case 2 -> Optional.of(SEQ_TOO_HIGH);
            case 3 -> Optional.of(RATE_LIMIT_EXCEEDED);
            case 4 -> Optional.of(OTHER_ERROR);
            default -> Optional.empty();
        };
    }
}
