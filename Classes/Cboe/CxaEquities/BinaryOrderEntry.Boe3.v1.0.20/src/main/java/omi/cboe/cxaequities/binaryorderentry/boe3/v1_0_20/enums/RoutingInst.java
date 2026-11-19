package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Indicates the order is a Post Only order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RoutingInst {

    /**
     * Post Only Never Take Liquidity
     */
    POST_ONLY_NEVER_TAKE_LIQUIDITY('P', "Post Only Never Take Liquidity"),

    /**
     * only eligible to trade with opposing Farpoint
     */
    FOCUSED_NEARPOINT('F', "only eligible to trade with opposing Farpoint");

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
            case 'P' -> Optional.of(POST_ONLY_NEVER_TAKE_LIQUIDITY);
            case 'F' -> Optional.of(FOCUSED_NEARPOINT);
            default -> Optional.empty();
        };
    }
}
