package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * As-Of Action
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AsOfAction {

    /**
     * As Of Trade Addition
     */
    AS_OF_TRADE_ADDITION('A', "As Of Trade Addition"),

    /**
     * As Of Trade Cancel
     */
    AS_OF_TRADE_CANCEL('C', "As Of Trade Cancel");

    private final char wire;

    private final String description;

    AsOfAction(char wire, String description) {
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
    public static Optional<AsOfAction> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AS_OF_TRADE_ADDITION);
            case 'C' -> Optional.of(AS_OF_TRADE_CANCEL);
            default -> Optional.empty();
        };
    }
}
