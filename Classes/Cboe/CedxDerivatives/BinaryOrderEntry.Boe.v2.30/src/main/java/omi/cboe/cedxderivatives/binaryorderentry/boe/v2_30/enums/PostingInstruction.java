package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.enums;

import java.util.Optional;

/**
 * P = Post Only (do not remove liquidity) B = Book Only (allow removal of liquidity, avail- able for Market Makers of futures only). Note that for options, only Post Only is sup- ported.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PostingInstruction {

    /**
     * Post Only (do not remove liquidity)
     */
    POST_ONLY('P', "Post Only (do not remove liquidity)"),

    /**
     * Book Only (allow removal of liquidity, avail- able for Market Makers of futures only). Note that for options, only Post Only is sup- ported.
     */
    BOOK_ONLY('B', "Book Only (allow removal of liquidity, avail- able for Market Makers of futures only). Note that for options, only Post Only is sup- ported.");

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
            case 'P' -> Optional.of(POST_ONLY);
            case 'B' -> Optional.of(BOOK_ONLY);
            default -> Optional.empty();
        };
    }
}
