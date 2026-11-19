package omi.cboe.bzxoptions.complextop.pitch.v1_1_54.enums;

import java.util.Optional;

/**
 * G = GTH Opening (C1 Only), O = RTH Opening (C1 Only), H = Halt Re-Opening.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Gth Opening
     */
    GTH_OPENING('G', "Gth Opening"),

    /**
     * Rth Opening
     */
    RTH_OPENING('O', "Rth Opening"),

    /**
     * Halt Re Opening
     */
    HALT_RE_OPENING('H', "Halt Re Opening");

    private final char wire;

    private final String description;

    AuctionType(char wire, String description) {
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
    public static Optional<AuctionType> fromWire(char wire) {
        return switch (wire) {
            case 'G' -> Optional.of(GTH_OPENING);
            case 'O' -> Optional.of(RTH_OPENING);
            case 'H' -> Optional.of(HALT_RE_OPENING);
            default -> Optional.empty();
        };
    }
}
