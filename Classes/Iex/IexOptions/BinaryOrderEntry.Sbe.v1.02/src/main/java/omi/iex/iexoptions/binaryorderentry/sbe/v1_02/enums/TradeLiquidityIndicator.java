package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * tradeLiquidityIndicator
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum TradeLiquidityIndicator {

    /**
     * AddedLiquidity
     */
    ADDED_LIQUIDITY((byte) 1, "AddedLiquidity"),

    /**
     * RemovedLiquidity
     */
    REMOVED_LIQUIDITY((byte) 2, "RemovedLiquidity"),

    /**
     * Routed
     */
    ROUTED((byte) 3, "Routed"),

    /**
     * OpeningProcess
     */
    OPENING_PROCESS((byte) 4, "OpeningProcess"),

    /**
     * ReOpeningProcess
     */
    RE_OPENING_PROCESS((byte) 5, "ReOpeningProcess"),

    /**
     * SUMInitiating
     */
    SUM_INITIATING((byte) 6, "SUMInitiating"),

    /**
     * SUMResponse
     */
    SUM_RESPONSE((byte) 7, "SUMResponse"),

    /**
     * SUMUnrelated
     */
    SUM_UNRELATED((byte) 8, "SUMUnrelated");

    private final byte wire;

    private final String description;

    TradeLiquidityIndicator(byte wire, String description) {
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
    public static Optional<TradeLiquidityIndicator> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(ADDED_LIQUIDITY);
            case 2 -> Optional.of(REMOVED_LIQUIDITY);
            case 3 -> Optional.of(ROUTED);
            case 4 -> Optional.of(OPENING_PROCESS);
            case 5 -> Optional.of(RE_OPENING_PROCESS);
            case 6 -> Optional.of(SUM_INITIATING);
            case 7 -> Optional.of(SUM_RESPONSE);
            case 8 -> Optional.of(SUM_UNRELATED);
            default -> Optional.empty();
        };
    }
}
