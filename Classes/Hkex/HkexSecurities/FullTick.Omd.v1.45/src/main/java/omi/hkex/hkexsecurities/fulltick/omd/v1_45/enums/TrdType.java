package omi.hkex.hkexsecurities.fulltick.omd.v1_45.enums;

import java.util.Optional;

/**
 * Public trade type.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TrdType {

    /**
     * Automatch Normal Public Trade Type Space
     */
    AUTOMATCH_NORMAL_PUBLIC_TRADE_TYPE_SPACE((short) 0, "Automatch Normal Public Trade Type Space"),

    /**
     * Late Trade Off Exchange Previous Day Public Trade Type P
     */
    LATE_TRADE_OFF_EXCHANGE_PREVIOUS_DAY_PUBLIC_TRADE_TYPE_P((short) 4, "Late Trade Off Exchange Previous Day Public Trade Type P"),

    /**
     * Non Direct Off Exchange Trade Public Trade Type M
     */
    NON_DIRECT_OFF_EXCHANGE_TRADE_PUBLIC_TRADE_TYPE_M((short) 22, "Non Direct Off Exchange Trade Public Trade Type M"),

    /**
     * Automatch Internalized Public Trade Type Y
     */
    AUTOMATCH_INTERNALIZED_PUBLIC_TRADE_TYPE_Y((short) 100, "Automatch Internalized Public Trade Type Y"),

    /**
     * Direct Off Exchange Trade Public Trade Type X
     */
    DIRECT_OFF_EXCHANGE_TRADE_PUBLIC_TRADE_TYPE_X((short) 101, "Direct Off Exchange Trade Public Trade Type X"),

    /**
     * Odd Lot Trade Public Trade Type D
     */
    ODD_LOT_TRADE_PUBLIC_TRADE_TYPE_D((short) 102, "Odd Lot Trade Public Trade Type D"),

    /**
     * Auction Trade Public Trade Type U
     */
    AUCTION_TRADE_PUBLIC_TRADE_TYPE_U((short) 103, "Auction Trade Public Trade Type U"),

    /**
     * Overseas Trade
     */
    OVERSEAS_TRADE((short) 104, "Overseas Trade");

    private final short wire;

    private final String description;

    TrdType(short wire, String description) {
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
    public static Optional<TrdType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(AUTOMATCH_NORMAL_PUBLIC_TRADE_TYPE_SPACE);
            case 4 -> Optional.of(LATE_TRADE_OFF_EXCHANGE_PREVIOUS_DAY_PUBLIC_TRADE_TYPE_P);
            case 22 -> Optional.of(NON_DIRECT_OFF_EXCHANGE_TRADE_PUBLIC_TRADE_TYPE_M);
            case 100 -> Optional.of(AUTOMATCH_INTERNALIZED_PUBLIC_TRADE_TYPE_Y);
            case 101 -> Optional.of(DIRECT_OFF_EXCHANGE_TRADE_PUBLIC_TRADE_TYPE_X);
            case 102 -> Optional.of(ODD_LOT_TRADE_PUBLIC_TRADE_TYPE_D);
            case 103 -> Optional.of(AUCTION_TRADE_PUBLIC_TRADE_TYPE_U);
            case 104 -> Optional.of(OVERSEAS_TRADE);
            default -> Optional.empty();
        };
    }
}
