package omi.nse.nsecd.dropcopy.nnfdirect.v1_7.enums;

import java.util.Optional;

/**
 * Type of message sent or received
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransactionCode {

    /**
     * Logs the user on to the drop copy feed
     */
    SIGNON_IN_MESSAGE((short) 2300, "Logs the user on to the drop copy feed"),

    /**
     * Confirms the logon. Alpha Char carries the number of streams the drop copy feed is sent from, one download request being needed per stream. On an error the same transaction code carries the Error Response layout instead, distinguished only by a non zero Error Code
     */
    SIGN_ON_OUT_MESSAGE((short) 2301, "Confirms the logon. Alpha Char carries the number of streams the drop copy feed is sent from, one download request being needed per stream. On an error the same transaction code carries the Error Response layout instead, distinguished only by a non zero Error Code"),

    /**
     * Keeps the connection alive during periods of inactivity. Carries the Message Header alone
     */
    HEARTBEAT_MESSAGE((short) 23506, "Keeps the connection alive during periods of inactivity. Carries the Message Header alone"),

    /**
     * Requests the trade download for one stream, named in the first byte of Alpha Char, from the time given in Sequence Number
     */
    DC_DOWNLOAD_REQUEST_MESSAGE((short) 8000, "Requests the trade download for one stream, named in the first byte of Alpha Char, from the time given in Sequence Number"),

    /**
     * Confirms a trade
     */
    TRADE_CONFIRMATION_MESSAGE((short) 2222, "Confirms a trade"),

    /**
     * Confirms the cancellation of a trade
     */
    TRADE_CANCEL_CONFIRM_MESSAGE((short) 2282, "Confirms the cancellation of a trade"),

    /**
     * Rejects a trade cancellation
     */
    TRADE_CANCEL_REJECT_MESSAGE((short) 2286, "Rejects a trade cancellation"),

    /**
     * Confirms the modification of a trade
     */
    TRADE_MODIFY_CONFIRM_MESSAGE((short) 2287, "Confirms the modification of a trade"),

    /**
     * Rejects a trade modification
     */
    TRADE_MODIFY_REJECT_MESSAGE((short) 2288, "Rejects a trade modification"),

    /**
     * Approves a give up
     */
    GIVEUP_APP_CONFIRM_TM_MESSAGE((short) 4506, "Approves a give up"),

    /**
     * Rejects a give up
     */
    GIVEUP_REJ_CONFIRM_TM_MESSAGE((short) 4507, "Rejects a give up");

    private final short wire;

    private final String description;

    TransactionCode(short wire, String description) {
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
    public static Optional<TransactionCode> fromWire(short wire) {
        return switch (wire) {
            case 2300 -> Optional.of(SIGNON_IN_MESSAGE);
            case 2301 -> Optional.of(SIGN_ON_OUT_MESSAGE);
            case 23506 -> Optional.of(HEARTBEAT_MESSAGE);
            case 8000 -> Optional.of(DC_DOWNLOAD_REQUEST_MESSAGE);
            case 2222 -> Optional.of(TRADE_CONFIRMATION_MESSAGE);
            case 2282 -> Optional.of(TRADE_CANCEL_CONFIRM_MESSAGE);
            case 2286 -> Optional.of(TRADE_CANCEL_REJECT_MESSAGE);
            case 2287 -> Optional.of(TRADE_MODIFY_CONFIRM_MESSAGE);
            case 2288 -> Optional.of(TRADE_MODIFY_REJECT_MESSAGE);
            case 4506 -> Optional.of(GIVEUP_APP_CONFIRM_TM_MESSAGE);
            case 4507 -> Optional.of(GIVEUP_REJ_CONFIRM_TM_MESSAGE);
            default -> Optional.empty();
        };
    }
}
