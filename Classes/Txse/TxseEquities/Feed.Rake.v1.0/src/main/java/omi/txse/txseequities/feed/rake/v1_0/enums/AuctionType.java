package omi.txse.txseequities.feed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum AuctionType. Type of auction event.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionType {

    /**
     * Scheduled regular-session cross that establishes the official opening price for a symbol.
     */
    OPENING((byte) 1, "Scheduled regular-session cross that establishes the official opening price for a symbol."),

    /**
     * Scheduled end-of-day cross that establishes the official closing price for a symbol.
     */
    CLOSING((byte) 2, "Scheduled end-of-day cross that establishes the official closing price for a symbol."),

    /**
     * Reopening cross following a trading halt or LULD trading pause.
     */
    HALT((byte) 3, "Reopening cross following a trading halt or LULD trading pause."),

    /**
     * Cross for a symbol's initial public offering.
     */
    IPO((byte) 4, "Cross for a symbol's initial public offering.");

    private final byte wire;

    private final String description;

    AuctionType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<AuctionType> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(OPENING);
            case 2 -> Optional.of(CLOSING);
            case 3 -> Optional.of(HALT);
            case 4 -> Optional.of(IPO);
            default -> Optional.empty();
        };
    }
}
