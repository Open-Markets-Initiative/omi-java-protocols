package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Indicating the auction type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Regular Pip
     */
    REGULAR_PIP('G', "Regular Pip"),

    /**
     * Solicitation
     */
    SOLICITATION('B', "Solicitation"),

    /**
     * Facilitation
     */
    FACILITATION('C', "Facilitation"),

    /**
     * Exposed Order
     */
    EXPOSED_ORDER('F', "Exposed Order");

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
            case 'G' -> Optional.of(REGULAR_PIP);
            case 'B' -> Optional.of(SOLICITATION);
            case 'C' -> Optional.of(FACILITATION);
            case 'F' -> Optional.of(EXPOSED_ORDER);
            default -> Optional.empty();
        };
    }
}
