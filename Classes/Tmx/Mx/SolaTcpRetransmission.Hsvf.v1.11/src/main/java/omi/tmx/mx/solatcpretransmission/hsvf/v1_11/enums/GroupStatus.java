package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums;

import java.util.Optional;

/**
 * group status of the trading instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum GroupStatus {

    /**
     * Pre Opening Phase
     */
    PRE_OPENING_PHASE('Y', "Pre Opening Phase"),

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
     * Intervention Before Opening
     */
    INTERVENTION_BEFORE_OPENING('E', "Intervention Before Opening"),

    /**
     * Trading Halted
     */
    TRADING_HALTED('H', "Trading Halted"),

    /**
     * Surveillance Intervention phase (Consultation phase)
     */
    SURVEILLANCE_INTERVENTION_PHASE('A', "Surveillance Intervention phase (Consultation phase)"),

    /**
     * End Of Day Inquiries Phase
     */
    END_OF_DAY_INQUIRIES_PHASE('C', "End Of Day Inquiries Phase"),

    /**
     * If Not Used
     */
    IF_NOT_USED(' ', "If Not Used");

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
            case 'Y' -> Optional.of(PRE_OPENING_PHASE);
            case 'O' -> Optional.of(OPENING_PHASE);
            case 'T' -> Optional.of(OPENED_FOR_TRADING);
            case 'F' -> Optional.of(FORBIDDEN_PHASE);
            case 'E' -> Optional.of(INTERVENTION_BEFORE_OPENING);
            case 'H' -> Optional.of(TRADING_HALTED);
            case 'A' -> Optional.of(SURVEILLANCE_INTERVENTION_PHASE);
            case 'C' -> Optional.of(END_OF_DAY_INQUIRIES_PHASE);
            case ' ' -> Optional.of(IF_NOT_USED);
            default -> Optional.empty();
        };
    }
}
