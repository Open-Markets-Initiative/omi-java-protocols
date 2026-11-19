package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums;

/**
 * Identifies event processing by the System
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventFlags {

    /**
     * Order Book Is Processing An Event
     */
    ORDER_BOOK_IS_PROCESSING_AN_EVENT((short) 0),

    /**
     * Event Processing Complete
     */
    EVENT_PROCESSING_COMPLETE((short) 1);

    private static final EventFlags[] BY_WIRE = new EventFlags[256];

    static {
        for (EventFlags value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final short wire;

    EventFlags(short wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public short wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static EventFlags get(short wire) {
        return wire >= 0 && wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
