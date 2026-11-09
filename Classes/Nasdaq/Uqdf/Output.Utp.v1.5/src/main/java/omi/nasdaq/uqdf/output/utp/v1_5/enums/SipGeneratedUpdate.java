package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * SIP Generated Update
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SipGeneratedUpdate {

    /**
     * Originated from the market participant
     */
    ORIGINATED_FROM_THE_MARKET_PARTICIPANT(' ', "Originated from the market participant"),

    /**
     * SIP-generated transaction
     */
    SIP_GENERATED_TRANSACTION('E', "SIP-generated transaction");

    private final char wire;

    private final String description;

    SipGeneratedUpdate(char wire, String description) {
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
    public static Optional<SipGeneratedUpdate> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(ORIGINATED_FROM_THE_MARKET_PARTICIPANT);
            case 'E' -> Optional.of(SIP_GENERATED_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
