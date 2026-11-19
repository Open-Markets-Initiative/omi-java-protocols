package omi.aquis.aquisequities.snapshot.amd.v4_0.enums;

import java.util.Optional;

/**
 * Message type identifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * A Snapshot Start message is published as the first message in a snapshot to identify the sequence number in the continuous stream that this snapshot relates to. It also states the number of securities being reported in this snapshot.
     */
    SNAPSHOT_START_MESSAGE((short) 10, "A Snapshot Start message is published as the first message in a snapshot to identify the sequence number in the continuous stream that this snapshot relates to. It also states the number of securities being reported in this snapshot."),

    /**
     * A Book Status message is published to report the trading and market status of each security and the number of open orders on the order book for the security at the time of the snapshot.
     */
    BOOK_STATUS_MESSAGE((short) 11, "A Book Status message is published to report the trading and market status of each security and the number of open orders on the order book for the security at the time of the snapshot."),

    /**
     * An appropriate number of Book Entry messages is published after each Book Status message to provide details of each order and allow the book to be built.
     */
    BOOK_ENTRY_MESSAGE((short) 12, "An appropriate number of Book Entry messages is published after each Book Status message to provide details of each order and allow the book to be built."),

    /**
     * During the MaC phase, Aquis will publish the volume of the 5 best bid and offer orders per security in chronological order using the MaC Book Entry Message.
     */
    MAC_BOOK_ENTRY_MESSAGE((short) 18, "During the MaC phase, Aquis will publish the volume of the 5 best bid and offer orders per security in chronological order using the MaC Book Entry Message.");

    private final short wire;

    private final String description;

    MsgType(short wire, String description) {
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
    public static Optional<MsgType> fromWire(short wire) {
        return switch (wire) {
            case 10 -> Optional.of(SNAPSHOT_START_MESSAGE);
            case 11 -> Optional.of(BOOK_STATUS_MESSAGE);
            case 12 -> Optional.of(BOOK_ENTRY_MESSAGE);
            case 18 -> Optional.of(MAC_BOOK_ENTRY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
