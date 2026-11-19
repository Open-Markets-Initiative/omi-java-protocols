package omi.nasdaq.nsmequities.drop.asciidrop.v2_2.enums;

import java.util.Optional;

/**
 * The clearing path this trade will take.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClearingCode {

    /**
     * Q = QSR
     */
    QSR('Q', "Q = QSR");

    private final char wire;

    private final String description;

    ClearingCode(char wire, String description) {
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
    public static Optional<ClearingCode> fromWire(char wire) {
        return wire == 'Q' ? Optional.of(QSR) : Optional.empty();
    }
}
