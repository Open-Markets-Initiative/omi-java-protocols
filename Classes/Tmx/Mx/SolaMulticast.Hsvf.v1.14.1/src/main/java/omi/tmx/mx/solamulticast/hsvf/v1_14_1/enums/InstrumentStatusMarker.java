package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Indicates instrument status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentStatusMarker {

    /**
     * Preopening
     */
    PREOPENING('Y', "Preopening"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING('T', "Continuous Trading"),

    /**
     * Forbidden
     */
    FORBIDDEN('F', "Forbidden"),

    /**
     * Intervention Before Opening
     */
    INTERVENTION_BEFORE_OPENING('E', "Intervention Before Opening"),

    /**
     * Halted Trading
     */
    HALTED_TRADING('H', "Halted Trading"),

    /**
     * Reserved (goes into a state as pre-opening where orders can be sent, modified, or canceled)
     */
    RESERVED('R', "Reserved (goes into a state as pre-opening where orders can be sent, modified, or canceled)"),

    /**
     * Suspended (goes into a state as pre-opening where orders can be sent, modified, or cancelled)
     */
    SUSPENDED('S', "Suspended (goes into a state as pre-opening where orders can be sent, modified, or cancelled)"),

    /**
     * Surveillance intervention (Consultation phase)
     */
    SURVEILLANCE_INTERVENTION('A', "Surveillance intervention (Consultation phase)"),

    /**
     * Endof Day Inquiries
     */
    ENDOF_DAY_INQUIRIES('C', "Endof Day Inquiries"),

    /**
     * If Not Used
     */
    IF_NOT_USED(' ', "If Not Used");

    private final char wire;

    private final String description;

    InstrumentStatusMarker(char wire, String description) {
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
    public static Optional<InstrumentStatusMarker> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(PREOPENING);
            case 'O' -> Optional.of(OPENING);
            case 'T' -> Optional.of(CONTINUOUS_TRADING);
            case 'F' -> Optional.of(FORBIDDEN);
            case 'E' -> Optional.of(INTERVENTION_BEFORE_OPENING);
            case 'H' -> Optional.of(HALTED_TRADING);
            case 'R' -> Optional.of(RESERVED);
            case 'S' -> Optional.of(SUSPENDED);
            case 'A' -> Optional.of(SURVEILLANCE_INTERVENTION);
            case 'C' -> Optional.of(ENDOF_DAY_INQUIRIES);
            case ' ' -> Optional.of(IF_NOT_USED);
            default -> Optional.empty();
        };
    }
}
