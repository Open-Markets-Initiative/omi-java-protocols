package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Controls the behavior of the quote OrderQty field
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SizeModifier {

    /**
     * Reduce outstanding size of quote by the OrderQty provided
     */
    REDUCED_SIZE('R', "Reduce outstanding size of quote by the OrderQty provided"),

    /**
     * NULL (0x00), New Quote Size
     */
    NEW_QUOTE_SIZE('0', "NULL (0x00), New Quote Size");

    private final char wire;

    private final String description;

    SizeModifier(char wire, String description) {
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
    public static Optional<SizeModifier> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REDUCED_SIZE);
            case '0' -> Optional.of(NEW_QUOTE_SIZE);
            default -> Optional.empty();
        };
    }
}
