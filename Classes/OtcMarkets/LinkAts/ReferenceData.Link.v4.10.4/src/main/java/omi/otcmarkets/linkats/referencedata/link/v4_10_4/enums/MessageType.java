package omi.otcmarkets.linkats.referencedata.link.v4_10_4.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * This message appears on all channels and indicates the beginning of a spin message cycle.
     */
    START_OF_SPIN_MESSAGE((short) 11, "This message appears on all channels and indicates the beginning of a spin message cycle."),

    /**
     * This message appears on all channels and indicates the end of a spin message cycle.
     */
    END_OF_SPIN_MESSAGE((short) 12, "This message appears on all channels and indicates the end of a spin message cycle."),

    /**
     * This message is sent out at 6 AM on all channels. The message can also be sent mid-day if a technical outage caused a temporary closure of the market.
     */
    MARKET_OPEN_MESSAGE((short) 13, "This message is sent out at 6 AM on all channels. The message can also be sent mid-day if a technical outage caused a temporary closure of the market."),

    /**
     * This message is sent out at 5 PM on all channels. The message can also be sent mid-day if a technical outage causes a temporary closure of the market.
     */
    MARKET_CLOSE_MESSAGE((short) 14, "This message is sent out at 5 PM on all channels. The message can also be sent mid-day if a technical outage causes a temporary closure of the market."),

    /**
     * Extended security attribute information for OTC Markets securities. Sent on the Reference Data channel with CUSIP.
     */
    EXTENDED_SECURITY_MESSAGE((short) 15, "Extended security attribute information for OTC Markets securities. Sent on the Reference Data channel with CUSIP.");

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
            case 11 -> Optional.of(START_OF_SPIN_MESSAGE);
            case 12 -> Optional.of(END_OF_SPIN_MESSAGE);
            case 13 -> Optional.of(MARKET_OPEN_MESSAGE);
            case 14 -> Optional.of(MARKET_CLOSE_MESSAGE);
            case 15 -> Optional.of(EXTENDED_SECURITY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
