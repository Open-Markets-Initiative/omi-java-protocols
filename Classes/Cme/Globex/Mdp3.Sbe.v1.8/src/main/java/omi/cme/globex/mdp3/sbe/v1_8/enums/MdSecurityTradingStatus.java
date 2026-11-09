package omi.cme.globex.mdp3.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Identifies the current state of the instrument. In Security Definition message this tag is available in the Instrument Replay feed only
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdSecurityTradingStatus {

    /**
     * Identifies the current state of the instrument. In Security Definition message this tag is available in the Instrument Replay feed only
     */
    NO_VALUE((short) 255, "Identifies the current state of the instrument. In Security Definition message this tag is available in the Instrument Replay feed only"),

    /**
     * Trading Halt
     */
    TRADING_HALT((short) 2, "Trading Halt"),

    /**
     * Close
     */
    CLOSE((short) 4, "Close"),

    /**
     * New Price Indication
     */
    NEW_PRICE_INDICATION((short) 15, "New Price Indication"),

    /**
     * Ready To Trade
     */
    READY_TO_TRADE((short) 17, "Ready To Trade"),

    /**
     * Not Available For Trading
     */
    NOT_AVAILABLE_FOR_TRADING((short) 18, "Not Available For Trading"),

    /**
     * Unknown or Invalid
     */
    UNKNOWN_OR_INVALID((short) 20, "Unknown or Invalid"),

    /**
     * Pre Open
     */
    PRE_OPEN((short) 21, "Pre Open"),

    /**
     * Pre Cross
     */
    PRE_CROSS((short) 24, "Pre Cross"),

    /**
     * Cross
     */
    CROSS((short) 25, "Cross"),

    /**
     * Post Close
     */
    POST_CLOSE((short) 26, "Post Close"),

    /**
     * No Change
     */
    NO_CHANGE((short) 103, "No Change");

    private final short wire;

    private final String description;

    MdSecurityTradingStatus(short wire, String description) {
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
    public static Optional<MdSecurityTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 2 -> Optional.of(TRADING_HALT);
            case 4 -> Optional.of(CLOSE);
            case 15 -> Optional.of(NEW_PRICE_INDICATION);
            case 17 -> Optional.of(READY_TO_TRADE);
            case 18 -> Optional.of(NOT_AVAILABLE_FOR_TRADING);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID);
            case 21 -> Optional.of(PRE_OPEN);
            case 24 -> Optional.of(PRE_CROSS);
            case 25 -> Optional.of(CROSS);
            case 26 -> Optional.of(POST_CLOSE);
            case 103 -> Optional.of(NO_CHANGE);
            default -> Optional.empty();
        };
    }
}
