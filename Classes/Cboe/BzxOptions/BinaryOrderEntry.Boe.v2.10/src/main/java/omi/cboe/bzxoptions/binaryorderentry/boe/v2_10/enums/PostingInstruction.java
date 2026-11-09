package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Posting Instruction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PostingInstruction {

    /**
     * Post Only
     */
    POST_ONLY('P', "Post Only"),

    /**
     * Book Only
     */
    BOOK_ONLY('B', "Book Only"),

    /**
     * Book Only No Slide
     */
    BOOK_ONLY_NO_SLIDE('N', "Book Only No Slide"),

    /**
     * Post Only No Slide
     */
    POST_ONLY_NO_SLIDE('R', "Post Only No Slide");

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
            case 'N' -> Optional.of(BOOK_ONLY_NO_SLIDE);
            case 'R' -> Optional.of(POST_ONLY_NO_SLIDE);
            default -> Optional.empty();
        };
    }
}
