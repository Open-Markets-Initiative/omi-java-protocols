package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * aFQReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AfqReason {

    /**
     * Quote_cancelled_by_the_Liquidity_Provider
     */
    QUOTECANCELLEDBYTHE_LIQUIDITY_PROVIDER((short) 1, "Quote_cancelled_by_the_Liquidity_Provider"),

    /**
     * Quote_cancelled_by_Market_Control
     */
    QUOTECANCELLEDBY_MARKET_CONTROL((short) 2, "Quote_cancelled_by_Market_Control"),

    /**
     * No_quote_M_minutes_before_an_uncrossing
     */
    NOQUOTE_MMINUTESBEFOREANUNCROSSING((short) 3, "No_quote_M_minutes_before_an_uncrossing"),

    /**
     * No_quote_S_seconds_before_an_uncrossing
     */
    NOQUOTE_SSECONDSBEFOREANUNCROSSING((short) 4, "No_quote_S_seconds_before_an_uncrossing"),

    /**
     * Quote_completely_matched
     */
    QUOTECOMPLETELYMATCHED((short) 5, "Quote_completely_matched"),

    /**
     * aFQReason
     */
    NO_VALUE((short) 255, "aFQReason");

    private final short wire;

    private final String description;

    AfqReason(short wire, String description) {
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
    public static Optional<AfqReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(QUOTECANCELLEDBYTHE_LIQUIDITY_PROVIDER);
            case 2 -> Optional.of(QUOTECANCELLEDBY_MARKET_CONTROL);
            case 3 -> Optional.of(NOQUOTE_MMINUTESBEFOREANUNCROSSING);
            case 4 -> Optional.of(NOQUOTE_SSECONDSBEFOREANUNCROSSING);
            case 5 -> Optional.of(QUOTECOMPLETELYMATCHED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
