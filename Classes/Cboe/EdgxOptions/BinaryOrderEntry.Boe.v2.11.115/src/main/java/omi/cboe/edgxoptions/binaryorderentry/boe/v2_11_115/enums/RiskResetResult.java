package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * &lt;space&gt; = Ignored; exceeds 1 reset per 100 milliseconds C = Rejected; exceeds Custom Group ID limit D = Rejected; automatic risk resets are disabled E = Rejected; empty ResetRisk field F = Rejected; exceeds firm reset limit I = Rejected; incorrect data center M = Rejected; invalid matching unit S = Rejected; exceeds risk root reset limit U = Rejected; invalid RiskRoot Y = Success c = Rejected; invalid EFID/ClearingFirm y = Rejected; in replay Additional reject values may be added in the future with no notice.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RiskResetResult {

    /**
     * Ignored; exceeds 1 reset per 100 milliseconds
     */
    IGNORED(' ', "Ignored; exceeds 1 reset per 100 milliseconds"),

    /**
     * Rejected; exceeds Custom Group ID limit
     */
    REJECTED_67('C', "Rejected; exceeds Custom Group ID limit"),

    /**
     * Rejected; automatic risk resets are disabled
     */
    REJECTED_68('D', "Rejected; automatic risk resets are disabled"),

    /**
     * Rejected; empty ResetRisk field
     */
    REJECTED_69('E', "Rejected; empty ResetRisk field"),

    /**
     * Rejected; exceeds firm reset limit
     */
    REJECTED_70('F', "Rejected; exceeds firm reset limit"),

    /**
     * Rejected; incorrect data center
     */
    REJECTED_73('I', "Rejected; incorrect data center"),

    /**
     * Rejected; invalid matching unit
     */
    REJECTED_77('M', "Rejected; invalid matching unit"),

    /**
     * Rejected; exceeds risk root reset limit
     */
    REJECTED_83('S', "Rejected; exceeds risk root reset limit"),

    /**
     * Rejected; invalid RiskRoot
     */
    REJECTED_85('U', "Rejected; invalid RiskRoot"),

    /**
     * Success
     */
    SUCCESS('Y', "Success"),

    /**
     * Rejected; invalid EFID/ClearingFirm
     */
    REJECTED_99('c', "Rejected; invalid EFID/ClearingFirm"),

    /**
     * Rejected; in replay Additional reject values may be added in the future with no notice.
     */
    REJECTED_121('y', "Rejected; in replay Additional reject values may be added in the future with no notice.");

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
            case 'C' -> Optional.of(REJECTED_67);
            case 'D' -> Optional.of(REJECTED_68);
            case 'E' -> Optional.of(REJECTED_69);
            case 'F' -> Optional.of(REJECTED_70);
            case 'I' -> Optional.of(REJECTED_73);
            case 'M' -> Optional.of(REJECTED_77);
            case 'S' -> Optional.of(REJECTED_83);
            case 'U' -> Optional.of(REJECTED_85);
            case 'Y' -> Optional.of(SUCCESS);
            case 'c' -> Optional.of(REJECTED_99);
            case 'y' -> Optional.of(REJECTED_121);
            default -> Optional.empty();
        };
    }
}
