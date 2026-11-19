package omi.asx.asxderivatives.t24.itch.v1_13.enums;

import java.util.Optional;

/**
 * Indicates the current session state for the contract.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Pending
     */
    PENDING('p', "Pending"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Pre-Open (or first price discovery)
     */
    PRE_OPEN('P', "Pre-Open (or first price discovery)"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Levelling
     */
    LEVELLING('l', "Levelling"),

    /**
     * Locked
     */
    LOCKED('L', "Locked"),

    /**
     * Opened
     */
    OPENED('O', "Opened"),

    /**
     * End Lock or Unavailable
     */
    UNAVAILABLE('U', "End Lock or Unavailable"),

    /**
     * Pre-Price Discovery
     */
    PRE_PRICE_DISCOVERY('d', "Pre-Price Discovery"),

    /**
     * Inactive or deactivated single session option
     */
    INACTIVE('I', "Inactive or deactivated single session option"),

    /**
     * Price Discovery (a subsequent price discovery)
     */
    PRICE_DISCOVERY('D', "Price Discovery (a subsequent price discovery)"),

    /**
     * Activated or re-activated single session option
     */
    ACTIVATED('A', "Activated or re-activated single session option"),

    /**
     * Regulatory Halt (an ad hoc price discovery)
     */
    REGULATORY_HALT('R', "Regulatory Halt (an ad hoc price discovery)");

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
            case 'p' -> Optional.of(PENDING);
            case 'H' -> Optional.of(HALTED);
            case 'P' -> Optional.of(PRE_OPEN);
            case 'C' -> Optional.of(CLOSED);
            case 'l' -> Optional.of(LEVELLING);
            case 'L' -> Optional.of(LOCKED);
            case 'O' -> Optional.of(OPENED);
            case 'U' -> Optional.of(UNAVAILABLE);
            case 'd' -> Optional.of(PRE_PRICE_DISCOVERY);
            case 'I' -> Optional.of(INACTIVE);
            case 'D' -> Optional.of(PRICE_DISCOVERY);
            case 'A' -> Optional.of(ACTIVATED);
            case 'R' -> Optional.of(REGULATORY_HALT);
            default -> Optional.empty();
        };
    }
}
