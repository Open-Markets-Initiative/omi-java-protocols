package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Type of auction order being submitted
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Automated Improvement Mechamism
     */
    AIM('1', "Automated Improvement Mechamism"),

    /**
     * Qualified Contingent Cross
     */
    QCC('2', "Qualified Contingent Cross"),

    /**
     * Solicitation Cross
     */
    SAM('3', "Solicitation Cross");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(AIM);
            case '2' -> Optional.of(QCC);
            case '3' -> Optional.of(SAM);
            default -> Optional.empty();
        };
    }
}
