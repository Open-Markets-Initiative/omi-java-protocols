package omi.miax.pearloptions.topofmarket.mach.v1_9.enums;

import java.util.Optional;

/**
 * Trade Condition Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Cancel Of Trade Previously Reported Other Than As The Last Or Opening For The Particular Option
     */
    CANCEL_OF_TRADE('A', "Cancel Of Trade Previously Reported Other Than As The Last Or Opening For The Particular Option");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return wire == 'A' ? Optional.of(CANCEL_OF_TRADE) : Optional.empty();
    }
}
