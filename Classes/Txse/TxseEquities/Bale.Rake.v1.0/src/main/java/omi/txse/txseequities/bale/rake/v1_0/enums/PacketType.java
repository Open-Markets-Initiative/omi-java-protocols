package omi.txse.txseequities.bale.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum RakeUdpPacketType. Identifies the Rake Udp packet variant. Informational only.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PacketType {

    /**
     * Sequenced data packet.
     */
    SEQUENCED_DATA((short) 0, "Sequenced data packet."),

    /**
     * Heartbeat only. Sequence is set to the next expected sequence and the message count is 0.
     */
    HEARTBEAT((short) 1, "Heartbeat only. Sequence is set to the next expected sequence and the message count is 0."),

    /**
     * First packet of the session. Both the sequence and message count are 0. May repeat multiple times.
     */
    START_OF_SESSION((short) 2, "First packet of the session. Both the sequence and message count are 0. May repeat multiple times."),

    /**
     * Last packet of the session. Sequence is the highest known for the session; count is 0. Repeats at some small interval. No payload data is sent after the first EOS packet.
     */
    END_OF_SESSION((short) 3, "Last packet of the session. Sequence is the highest known for the session; count is 0. Repeats at some small interval. No payload data is sent after the first EOS packet."),

    /**
     * Reserved for future use.
     */
    GAP_FILL_REQUEST((short) 4, "Reserved for future use."),

    /**
     * Reserved for future use.
     */
    GAP_FILL_RESPONSE((short) 5, "Reserved for future use.");

    private final short wire;

    private final String description;

    PacketType(short wire, String description) {
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
    public static Optional<PacketType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SEQUENCED_DATA);
            case 1 -> Optional.of(HEARTBEAT);
            case 2 -> Optional.of(START_OF_SESSION);
            case 3 -> Optional.of(END_OF_SESSION);
            case 4 -> Optional.of(GAP_FILL_REQUEST);
            case 5 -> Optional.of(GAP_FILL_RESPONSE);
            default -> Optional.empty();
        };
    }
}
