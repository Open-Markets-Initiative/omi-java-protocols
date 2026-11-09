package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum RestatementReason.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum RestatementReason {

    /**
     * A new displayed slice of a reserve order has been added to the displayed book.
     */
    RESERVE_REPLENISHED((byte) 1, "A new displayed slice of a reserve order has been added to the displayed book."),

    /**
     * A reprice-eligible order has been repriced to a new price.
     */
    REPRICED((byte) 2, "A reprice-eligible order has been repriced to a new price."),

    /**
     * Orders staged awaiting the result of the auction with unfilled residual have been reinstated into continuous book.
     */
    POST_AUCTION((byte) 3, "Orders staged awaiting the result of the auction with unfilled residual have been reinstated into continuous book.");

    private final byte wire;

    private final String description;

    RestatementReason(byte wire, String description) {
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
    public static Optional<RestatementReason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(RESERVE_REPLENISHED);
            case 2 -> Optional.of(REPRICED);
            case 3 -> Optional.of(POST_AUCTION);
            default -> Optional.empty();
        };
    }
}
