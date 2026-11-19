package omi.box.boxoptions.solaunicast.hsvf.v4_5_1.enums;

import java.util.Optional;

/**
 * Client wants to receive the market summaries and the Instrument key messages
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketSummaries {

    /**
     * Only The Market Summaries And The Instrument Key Messages
     */
    YES('Y', "Only The Market Summaries And The Instrument Key Messages"),

    /**
     * Regular Market Messages With The Summaries And The Instrument Key Messages
     */
    NO('N', "Regular Market Messages With The Summaries And The Instrument Key Messages");

    private final char wire;

    private final String description;

    MarketSummaries(char wire, String description) {
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
    public static Optional<MarketSummaries> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
