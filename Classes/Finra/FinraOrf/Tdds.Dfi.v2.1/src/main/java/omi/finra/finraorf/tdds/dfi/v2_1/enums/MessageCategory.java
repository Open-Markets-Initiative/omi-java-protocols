package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * Message Category
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageCategory {

    /**
     * Trade Messages Header
     */
    TRADE('T', "Trade Messages Header"),

    /**
     * Administrative Messages Header
     */
    ADMINISTRATIVE('A', "Administrative Messages Header"),

    /**
     * Control Messages Header
     */
    CONTROL('C', "Control Messages Header");

    private final char wire;

    private final String description;

    MessageCategory(char wire, String description) {
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
    public static Optional<MessageCategory> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TRADE);
            case 'A' -> Optional.of(ADMINISTRATIVE);
            case 'C' -> Optional.of(CONTROL);
            default -> Optional.empty();
        };
    }
}
