package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * &lt;space&gt; = Ignored; exceeds 1 reset per second Y = Success F = Rejected; exceeds firm reset limit C = Rejected; exceeds Custom Group ID limit E = Rejected; empty ResetRisk field I = Rejected; Incorrect data center S = Rejected; exceeds product level reset limit U = Rejected; invalid RiskRoot c = Rejected; invalid EFID/ClearingFirm
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RiskResetResult {

    /**
     * Ignored; exceeds 1 reset per second
     */
    IGNORED(' ', "Ignored; exceeds 1 reset per second"),

    /**
     * Success
     */
    SUCCESS('Y', "Success"),

    /**
     * Rejected; exceeds firm reset limit
     */
    REJECTED_70('F', "Rejected; exceeds firm reset limit"),

    /**
     * Rejected; exceeds Custom Group ID limit
     */
    REJECTED_67('C', "Rejected; exceeds Custom Group ID limit"),

    /**
     * Rejected; empty ResetRisk field
     */
    REJECTED_69('E', "Rejected; empty ResetRisk field"),

    /**
     * Rejected; Incorrect data center
     */
    REJECTED_73('I', "Rejected; Incorrect data center"),

    /**
     * Rejected; exceeds product level reset limit
     */
    REJECTED_83('S', "Rejected; exceeds product level reset limit"),

    /**
     * Rejected; invalid RiskRoot
     */
    REJECTED_85('U', "Rejected; invalid RiskRoot"),

    /**
     * Rejected; invalid EFID/ClearingFirm
     */
    REJECTED_99('c', "Rejected; invalid EFID/ClearingFirm");

    private final char wire;

    private final String description;

    RiskResetResult(char wire, String description) {
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
    public static Optional<RiskResetResult> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(IGNORED);
            case 'Y' -> Optional.of(SUCCESS);
            case 'F' -> Optional.of(REJECTED_70);
            case 'C' -> Optional.of(REJECTED_67);
            case 'E' -> Optional.of(REJECTED_69);
            case 'I' -> Optional.of(REJECTED_73);
            case 'S' -> Optional.of(REJECTED_83);
            case 'U' -> Optional.of(REJECTED_85);
            case 'c' -> Optional.of(REJECTED_99);
            default -> Optional.empty();
        };
    }
}
