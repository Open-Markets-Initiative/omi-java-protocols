package omi.asianext.asianextderivatives.snapshot.amd.v1_3.enums;

import java.util.Optional;

/**
 * Message type identifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * A Snapshot Start message is published as the first message in a snapshot to identify the sequence number in the continuous stream that this snapshot relates to.
     */
    SNAPSHOT_START_MESSAGE((short) 10, "A Snapshot Start message is published as the first message in a snapshot to identify the sequence number in the continuous stream that this snapshot relates to."),

    /**
     * A Book Status message is published to report the trading and market status of each security and the number of open orders on the order book for the security at the time of the snapshot.
     */
    BOOK_STATUS_MESSAGE((short) 11, "A Book Status message is published to report the trading and market status of each security and the number of open orders on the order book for the security at the time of the snapshot."),

    /**
     * An appropriate number of Book Entry messages is published after each Book Status message to provide details of each order and allow the book to be built.
     */
    BOOK_ENTRY_MESSAGE((short) 12, "An appropriate number of Book Entry messages is published after each Book Status message to provide details of each order and allow the book to be built."),

    /**
     * A series of Tick Table Data messages are published to specify the dynamic tick tables and static ticks that apply to the securities traded on AsiaNext.
     */
    TICK_TABLE_DATA_MESSAGE((short) 7, "A series of Tick Table Data messages are published to specify the dynamic tick tables and static ticks that apply to the securities traded on AsiaNext."),

    /**
     * Security Definition messages are published to identify the securities traded on AsiaNext.
     */
    SECURITY_DEFINITION_MESSAGE((short) 8, "Security Definition messages are published to identify the securities traded on AsiaNext."),

    /**
     * Security Definition messages are published to identify the Futures securities traded on AsiaNext.
     */
    SECURITY_DEFINITION_FUTURES_MESSAGE((short) 30, "Security Definition messages are published to identify the Futures securities traded on AsiaNext."),

    /**
     * Security Definition messages are published to identify the Option securities traded on AsiaNext.
     */
    SECURITY_DEFINITION_OPTIONS_MESSAGE((short) 32, "Security Definition messages are published to identify the Option securities traded on AsiaNext."),

    /**
     * The Security Status message is published when the trading status of a security changes or when there is a change to the status of the market on AsiaNext to which the security belongs.
     */
    SECURITY_STATUS_MESSAGE((short) 9, "The Security Status message is published when the trading status of a security changes or when there is a change to the status of the market on AsiaNext to which the security belongs."),

    /**
     * The Sequence Number Reset is published when AsiaNext initiates a seqNo reset.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE((short) 29, "The Sequence Number Reset is published when AsiaNext initiates a seqNo reset.");

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
            case 7 -> Optional.of(TICK_TABLE_DATA_MESSAGE);
            case 8 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 30 -> Optional.of(SECURITY_DEFINITION_FUTURES_MESSAGE);
            case 32 -> Optional.of(SECURITY_DEFINITION_OPTIONS_MESSAGE);
            case 9 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 29 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            default -> Optional.empty();
        };
    }
}
