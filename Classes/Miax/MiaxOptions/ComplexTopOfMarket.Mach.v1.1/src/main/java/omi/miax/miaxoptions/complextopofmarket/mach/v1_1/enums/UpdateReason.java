package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * “N” – New strategy created
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UpdateReason {

    /**
     * New
     */
    NEW_STRATEGY_CREATED('N', "New"),

    /**
     * Strategy Definition Updated
     */
    UPDATED('U', "Strategy Definition Updated");

    private final char wire;

    private final String description;

    UpdateReason(char wire, String description) {
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
    public static Optional<UpdateReason> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NEW_STRATEGY_CREATED);
            case 'U' -> Optional.of(UPDATED);
            default -> Optional.empty();
        };
    }
}
