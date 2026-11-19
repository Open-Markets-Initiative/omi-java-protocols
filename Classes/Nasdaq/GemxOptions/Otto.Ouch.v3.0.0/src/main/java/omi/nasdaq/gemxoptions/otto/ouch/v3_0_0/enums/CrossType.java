package omi.nasdaq.gemxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * A=Auction, Q=QCC, C=CCC
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Auction
     */
    AUCTION('A', "Auction"),

    /**
     * QCC
     */
    QCC('Q', "QCC"),

    /**
     * CCC
     */
    CCC('C', "CCC");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUCTION);
            case 'Q' -> Optional.of(QCC);
            case 'C' -> Optional.of(CCC);
            default -> Optional.empty();
        };
    }
}
