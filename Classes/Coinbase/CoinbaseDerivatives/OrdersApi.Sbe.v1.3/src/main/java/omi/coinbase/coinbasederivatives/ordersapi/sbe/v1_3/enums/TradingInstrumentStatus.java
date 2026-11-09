package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.enums;

import java.util.Optional;

/**
 * status
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum TradingInstrumentStatus {

    /**
     * OK
     */
    OK((byte) 0, "OK"),

    /**
     * TEMPORARILY_UNAVAILABLE
     */
    TEMPORARILY_UNAVAILABLE((byte) 1, "TEMPORARILY_UNAVAILABLE"),

    /**
     * BACK_PRESSURED
     */
    BACK_PRESSURED((byte) 2, "BACK_PRESSURED");

    private final byte wire;

    private final String description;

    TradingInstrumentStatus(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<TradingInstrumentStatus> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(OK);
            case 1 -> Optional.of(TEMPORARILY_UNAVAILABLE);
            case 2 -> Optional.of(BACK_PRESSURED);
            default -> Optional.empty();
        };
    }
}
