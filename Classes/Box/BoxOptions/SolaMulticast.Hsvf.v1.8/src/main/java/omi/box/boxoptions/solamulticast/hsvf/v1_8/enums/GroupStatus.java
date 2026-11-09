package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Value is O
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum GroupStatus {

    /**
     * Preopening Phase
     */
    PREOPENING_PHASE('Y', "Preopening Phase"),

    /**
     * Opening Phase
     */
    OPENING_PHASE('O', "Opening Phase"),

    /**
     * Opened For Trading
     */
    OPENED_FOR_TRADING('T', "Opened For Trading"),

    /**
     * Forbidden Phase
     */
    FORBIDDEN_PHASE('F', "Forbidden Phase"),

    /**
     * Trading Halted
     */
    TRADING_HALTED('H', "Trading Halted"),

    /**
     * Surveillance Intervention Phase
     */
    SURVEILLANCE_INTERVENTION_PHASE('A', "Surveillance Intervention Phase"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Beginning Of Day Inquiries
     */
    BEGINNING_OF_DAY_INQUIRIES('B', "Beginning Of Day Inquiries");

    private final char wire;

    private final String description;

    GroupStatus(char wire, String description) {
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
    public static Optional<GroupStatus> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(PREOPENING_PHASE);
            case 'O' -> Optional.of(OPENING_PHASE);
            case 'T' -> Optional.of(OPENED_FOR_TRADING);
            case 'F' -> Optional.of(FORBIDDEN_PHASE);
            case 'H' -> Optional.of(TRADING_HALTED);
            case 'A' -> Optional.of(SURVEILLANCE_INTERVENTION_PHASE);
            case 'C' -> Optional.of(CLOSED);
            case 'B' -> Optional.of(BEGINNING_OF_DAY_INQUIRIES);
            default -> Optional.empty();
        };
    }
}
