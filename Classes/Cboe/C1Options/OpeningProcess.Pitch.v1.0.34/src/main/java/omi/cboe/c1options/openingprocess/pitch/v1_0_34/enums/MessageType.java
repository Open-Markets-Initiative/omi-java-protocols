package omi.cboe.c1options.openingprocess.pitch.v1_0_34.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed.
     */
    TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed."),

    /**
     * A Time message is sent whenever the source time for a unit passes over a second boundary.
     */
    TIME_MESSAGE((short) 32, "A Time message is sent whenever the source time for a unit passes over a second boundary."),

    /**
     * Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange."),

    /**
     * Auction Summary messages are used to disseminate the results of an auction. An Opening or Re-Opening Auction Summary message for each symbol is sent at the conclusion of its Opening or Re-Opening auction and represents the Cboe Opening Price.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction. An Opening or Re-Opening Auction Summary message for each symbol is sent at the conclusion of its Opening or Re-Opening auction and represents the Cboe Opening Price."),

    /**
     * The Width Update message is used to communicate the opening quote width multiplier.
     */
    WIDTH_UPDATE_MESSAGE((short) 210, "The Width Update message is used to communicate the opening quote width multiplier."),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol."),

    /**
     * The End of Session message is sent for the feed when all the units have shut down.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for the feed when all the units have shut down."),

    /**
     * The SOQ Strike Range Update message is only available on the C1 Exchange. This message disseminates the minimum and maximum strike prices of the price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date.
     */
    SOQ_STRIKE_RANGE_UPDATE_MESSAGE((short) 157, "The SOQ Strike Range Update message is only available on the C1 Exchange. This message disseminates the minimum and maximum strike prices of the price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date."),

    /**
     * The Constituent Symbol Mapping message is only available on the C1 Exchange. This message is used to communicate which options series (if any) are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ).
     */
    CONSTITUENT_SYMBOL_MAPPING_MESSAGE((short) 158, "The Constituent Symbol Mapping message is only available on the C1 Exchange. This message is used to communicate which options series (if any) are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ).");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 177 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 209 -> Optional.of(OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 210 -> Optional.of(WIDTH_UPDATE_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 157 -> Optional.of(SOQ_STRIKE_RANGE_UPDATE_MESSAGE);
            case 158 -> Optional.of(CONSTITUENT_SYMBOL_MAPPING_MESSAGE);
            default -> Optional.empty();
        };
    }
}
