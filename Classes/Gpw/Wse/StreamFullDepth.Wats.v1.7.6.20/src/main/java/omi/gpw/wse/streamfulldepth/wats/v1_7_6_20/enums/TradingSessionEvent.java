package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Identifies an event related to the trading status of a trading session
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionEvent {

    /**
     * Not applicable
     */
    NA((short) 1, "Not applicable"),

    /**
     * Start of technical session
     */
    START_OF_TECHNICAL_SESSION((short) 2, "Start of technical session"),

    /**
     * End of technical session
     */
    END_OF_TECHNICAL_SESSION((short) 3, "End of technical session"),

    /**
     * Initial reference data start
     */
    INITIAL_REFERENCE_DATA_START((short) 4, "Initial reference data start"),

    /**
     * Initial reference data end
     */
    INITIAL_REFERENCE_DATA_END((short) 5, "Initial reference data end"),

    /**
     * Previous day restate start
     */
    PREVIOUS_DAY_RESTATE_START((short) 6, "Previous day restate start"),

    /**
     * Previous day restate end
     */
    PREVIOUS_DAY_RESTATE_END((short) 7, "Previous day restate end"),

    /**
     * Next session reference data start
     */
    NEXT_SESSION_REFERENCE_DATA_START((short) 8, "Next session reference data start"),

    /**
     * Next session reference data end
     */
    NEXT_SESSION_REFERENCE_DATA_END((short) 9, "Next session reference data end"),

    /**
     * Start of trading session MIC
     */
    START_OF_TRADING_SESSION_MIC((short) 12, "Start of trading session MIC"),

    /**
     * End of trading session MIC
     */
    END_OF_TRADING_SESSION_MIC((short) 13, "End of trading session MIC");

    private final short wire;

    private final String description;

    TradingSessionEvent(short wire, String description) {
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
    public static Optional<TradingSessionEvent> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NA);
            case 2 -> Optional.of(START_OF_TECHNICAL_SESSION);
            case 3 -> Optional.of(END_OF_TECHNICAL_SESSION);
            case 4 -> Optional.of(INITIAL_REFERENCE_DATA_START);
            case 5 -> Optional.of(INITIAL_REFERENCE_DATA_END);
            case 6 -> Optional.of(PREVIOUS_DAY_RESTATE_START);
            case 7 -> Optional.of(PREVIOUS_DAY_RESTATE_END);
            case 8 -> Optional.of(NEXT_SESSION_REFERENCE_DATA_START);
            case 9 -> Optional.of(NEXT_SESSION_REFERENCE_DATA_END);
            case 12 -> Optional.of(START_OF_TRADING_SESSION_MIC);
            case 13 -> Optional.of(END_OF_TRADING_SESSION_MIC);
            default -> Optional.empty();
        };
    }
}
