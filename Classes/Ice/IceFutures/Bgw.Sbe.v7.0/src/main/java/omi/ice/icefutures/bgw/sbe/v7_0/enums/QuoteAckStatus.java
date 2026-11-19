package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * quoteAckStatus
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteAckStatus {

    /**
     * Accepted
     */
    ACCEPTED(0, "Accepted"),

    /**
     * CancelledAll
     */
    CANCELLED_ALL(4, "CancelledAll"),

    /**
     * Rejected
     */
    REJECTED(5, "Rejected"),

    /**
     * PartiallyCancelled
     */
    PARTIALLY_CANCELLED(200, "PartiallyCancelled"),

    /**
     * UnreasonableQuotes
     */
    UNREASONABLE_QUOTES(300, "UnreasonableQuotes");

    private final int wire;

    private final String description;

    QuoteAckStatus(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<QuoteAckStatus> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(ACCEPTED);
            case 4 -> Optional.of(CANCELLED_ALL);
            case 5 -> Optional.of(REJECTED);
            case 200 -> Optional.of(PARTIALLY_CANCELLED);
            case 300 -> Optional.of(UNREASONABLE_QUOTES);
            default -> Optional.empty();
        };
    }
}
