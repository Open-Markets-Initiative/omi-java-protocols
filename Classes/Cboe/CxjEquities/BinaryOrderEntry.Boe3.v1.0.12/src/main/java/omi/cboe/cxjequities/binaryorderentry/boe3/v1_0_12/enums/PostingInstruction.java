package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.enums;

import java.util.Optional;

/**
 * Posting instruction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PostingInstruction {

    /**
     * Post Only Never Take Liquidity
     */
    POST_ONLY_NEVER_TAKE_LIQUIDITY('P', "Post Only Never Take Liquidity"),

    /**
     * NULL (0x00), allow taking
     */
    ALLOW_TAKING('0', "NULL (0x00), allow taking");

    private final char wire;

    private final String description;

    PostingInstruction(char wire, String description) {
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
    public static Optional<PostingInstruction> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(POST_ONLY_NEVER_TAKE_LIQUIDITY);
            case '0' -> Optional.of(ALLOW_TAKING);
            default -> Optional.empty();
        };
    }
}
