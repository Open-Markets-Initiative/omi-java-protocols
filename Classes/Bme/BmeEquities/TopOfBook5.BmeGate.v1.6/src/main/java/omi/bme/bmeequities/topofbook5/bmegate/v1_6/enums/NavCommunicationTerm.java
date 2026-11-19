package omi.bme.bmeequities.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Net Asset Value Communication Term
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NavCommunicationTerm {

    /**
     * D 1
     */
    D1('1', "D 1"),

    /**
     * D 2
     */
    D2('2', "D 2"),

    /**
     * D 3
     */
    D3('3', "D 3");

    private final char wire;

    private final String description;

    NavCommunicationTerm(char wire, String description) {
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
    public static Optional<NavCommunicationTerm> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(D1);
            case '2' -> Optional.of(D2);
            case '3' -> Optional.of(D3);
            default -> Optional.empty();
        };
    }
}
