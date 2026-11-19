package omi.bme.bmeequities.fulldepth.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Price Tick rules for security
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceTickRule {

    /**
     * 1/10^Numdeci
     */
    TICK_RULE_1((short) 1, "1/10^Numdeci"),

    /**
     * P &lt; 50: 1/10^Numdeci; P &gt;= 50: 5/10^Numdeci
     */
    TICK_RULE_2((short) 2, "P < 50: 1/10^Numdeci; P >= 50: 5/10^Numdeci"),

    /**
     * 5/10^Numdeci
     */
    TICK_RULE_3((short) 3, "5/10^Numdeci"),

    /**
     * P &lt; 10: 1/10^Numdeci; 10 &lt;= P &gt; 50: 5/10^Numdeci; 50 &lt;= P &gt; 100: 1/10^(Numdeci-1); P &gt;= 100: 5/10^(Numdeci-1)
     */
    TICK_RULE_4((short) 4, "P < 10: 1/10^Numdeci; 10 <= P > 50: 5/10^Numdeci; 50 <= P > 100: 1/10^(Numdeci-1); P >= 100: 5/10^(Numdeci-1)"),

    /**
     * According Tick Size Table in ESMA RTS-11. Tick size depends on Average daily number of transactions (ADNT)
     */
    TICK_RULE_5((short) 5, "According Tick Size Table in ESMA RTS-11. Tick size depends on Average daily number of transactions (ADNT)"),

    /**
     * According Tick Size Table in ESMA RTS-11. ADNT is assumed to be always 0.
     */
    TICK_RULE_6((short) 6, "According Tick Size Table in ESMA RTS-11. ADNT is assumed to be always 0."),

    /**
     * According Tick Size Table in ESMA RTS-11. ADNT is assumed to be always above 9000
     */
    TICK_RULE_7((short) 7, "According Tick Size Table in ESMA RTS-11. ADNT is assumed to be always above 9000");

    private final short wire;

    private final String description;

    PriceTickRule(short wire, String description) {
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
    public static Optional<PriceTickRule> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TICK_RULE_1);
            case 2 -> Optional.of(TICK_RULE_2);
            case 3 -> Optional.of(TICK_RULE_3);
            case 4 -> Optional.of(TICK_RULE_4);
            case 5 -> Optional.of(TICK_RULE_5);
            case 6 -> Optional.of(TICK_RULE_6);
            case 7 -> Optional.of(TICK_RULE_7);
            default -> Optional.empty();
        };
    }
}
