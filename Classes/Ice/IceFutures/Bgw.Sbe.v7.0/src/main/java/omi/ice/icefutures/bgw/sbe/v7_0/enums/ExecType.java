package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * execType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecType {

    /**
     * New
     */
    NEW('0', "New"),

    /**
     * PartialFill
     */
    PARTIAL_FILL('1', "PartialFill"),

    /**
     * Fill
     */
    FILL('2', "Fill"),

    /**
     * Cancelled
     */
    CANCELLED('4', "Cancelled"),

    /**
     * Replaced
     */
    REPLACED('5', "Replaced"),

    /**
     * Rejected
     */
    REJECTED('8', "Rejected"),

    /**
     * Restated
     */
    RESTATED('D', "Restated"),

    /**
     * TradeCorrect
     */
    TRADE_CORRECT('G', "TradeCorrect"),

    /**
     * TradeCancel
     */
    TRADE_CANCEL('H', "TradeCancel");

    private final char wire;

    private final String description;

    ExecType(char wire, String description) {
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
    public static Optional<ExecType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NEW);
            case '1' -> Optional.of(PARTIAL_FILL);
            case '2' -> Optional.of(FILL);
            case '4' -> Optional.of(CANCELLED);
            case '5' -> Optional.of(REPLACED);
            case '8' -> Optional.of(REJECTED);
            case 'D' -> Optional.of(RESTATED);
            case 'G' -> Optional.of(TRADE_CORRECT);
            case 'H' -> Optional.of(TRADE_CANCEL);
            default -> Optional.empty();
        };
    }
}
