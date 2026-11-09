package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum SymbolTradingState.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SymbolTradingState {

    /**
     * Symbol is open and available for trading.
     */
    TRADING((byte) 1, "Symbol is open and available for trading."),

    /**
     * Trading suspended.
     */
    HALTED((byte) 2, "Trading suspended."),

    /**
     * Applies only when a symbol is in a non-trading state with an auction cross pending to bring it back into trading.
     */
    RESUME_PENDING((byte) 3, "Applies only when a symbol is in a non-trading state with an auction cross pending to bring it back into trading.");

    private final byte wire;

    private final String description;

    SymbolTradingState(byte wire, String description) {
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
    public static Optional<SymbolTradingState> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRADING);
            case 2 -> Optional.of(HALTED);
            case 3 -> Optional.of(RESUME_PENDING);
            default -> Optional.empty();
        };
    }
}
