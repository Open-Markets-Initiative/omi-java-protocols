package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.enums;

import java.util.Optional;

/**
 * C = Closed Q = Queuing O = Opening/Re-opening Auction T = Trading S = Suspension H = Halted
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Queuing
     */
    QUEUING('Q', "Queuing"),

    /**
     * Opening Reopening Auction
     */
    OPENING_REOPENING_AUCTION('O', "Opening Reopening Auction"),

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Suspension
     */
    SUSPENSION('S', "Suspension"),

    /**
     * Halted
     */
    HALTED('H', "Halted");

    private final char wire;

    private final String description;

    Status(char wire, String description) {
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
    public static Optional<Status> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSED);
            case 'Q' -> Optional.of(QUEUING);
            case 'O' -> Optional.of(OPENING_REOPENING_AUCTION);
            case 'T' -> Optional.of(TRADING);
            case 'S' -> Optional.of(SUSPENSION);
            case 'H' -> Optional.of(HALTED);
            default -> Optional.empty();
        };
    }
}
