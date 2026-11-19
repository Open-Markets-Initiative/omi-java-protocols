package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.enums;

import java.util.Optional;

/**
 * Defines the TradePublishInd values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradePublishInd {

    /**
     * Do not publish. Deprecated from 4th December 2017 in Certification and 2nd January 2018 in Production. Any requests to publish a trade using this indicator will not be honoured and will instead be published im- mediately.
     */
    DO_NOT_PUBLISH((short) 0, "Do not publish. Deprecated from 4th December 2017 in Certification and 2nd January 2018 in Production. Any requests to publish a trade using this indicator will not be honoured and will instead be published im- mediately."),

    /**
     * Publish trade
     */
    PUBLISH_TRADE((short) 1, "Publish trade"),

    /**
     * Deferred publication In order for RTS 1 based instruments to be considered for a deferral, Capacity = P (maps to ’DEAL’) must be set. For RTS 1 and RTS 2 instruments, delayed publication/deferrals are ignored if the trade does not qualify for delayed publication.
     */
    DEFERRED_PUBLICATION((short) 2, "Deferred publication In order for RTS 1 based instruments to be considered for a deferral, Capacity = P (maps to \u2019DEAL\u2019) must be set. For RTS 1 and RTS 2 instruments, delayed publication/deferrals are ignored if the trade does not qualify for delayed publication.");

    private final short wire;

    private final String description;

    TradePublishInd(short wire, String description) {
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
    public static Optional<TradePublishInd> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DO_NOT_PUBLISH);
            case 1 -> Optional.of(PUBLISH_TRADE);
            case 2 -> Optional.of(DEFERRED_PUBLICATION);
            default -> Optional.empty();
        };
    }
}
