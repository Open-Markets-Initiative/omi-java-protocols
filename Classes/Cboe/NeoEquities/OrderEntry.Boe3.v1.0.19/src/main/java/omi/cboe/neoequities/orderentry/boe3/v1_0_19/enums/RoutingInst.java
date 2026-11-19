package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Routing instruction for the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RoutingInst {

    /**
     * Post Only Cancel
     */
    POST_ONLY_CANCEL('P', "Post Only Cancel"),

    /**
     * Post Only Reprice
     */
    POST_ONLY_REPRICE('p', "Post Only Reprice");

    private final char wire;

    private final String description;

    RoutingInst(char wire, String description) {
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
    public static Optional<RoutingInst> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(POST_ONLY_CANCEL);
            case 'p' -> Optional.of(POST_ONLY_REPRICE);
            default -> Optional.empty();
        };
    }
}
