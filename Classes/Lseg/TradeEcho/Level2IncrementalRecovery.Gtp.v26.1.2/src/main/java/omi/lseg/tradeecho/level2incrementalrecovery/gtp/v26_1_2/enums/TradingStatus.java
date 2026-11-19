package omi.lseg.tradeecho.level2incrementalrecovery.gtp.v26_1_2.enums;

import java.util.Optional;

/**
 * Current Trading status of the Instrument. Populated only when the message is sent at the end of individual order book snapshots during a trading session. Blank if not applicable.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Inactive
     */
    INACTIVE('1', "Inactive"),

    /**
     * Suspended
     */
    SUSPENDED('2', "Suspended"),

    /**
     * Active
     */
    ACTIVE('3', "Active"),

    /**
     * Regulatory Halt
     */
    REGULATORY_HALT('P', "Regulatory Halt");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(INACTIVE);
            case '2' -> Optional.of(SUSPENDED);
            case '3' -> Optional.of(ACTIVE);
            case 'P' -> Optional.of(REGULATORY_HALT);
            default -> Optional.empty();
        };
    }
}
