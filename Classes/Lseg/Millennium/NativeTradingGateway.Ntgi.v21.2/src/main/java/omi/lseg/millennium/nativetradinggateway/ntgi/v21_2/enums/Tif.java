package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Time qualifier of the order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Tif {

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * Immediate Or Cancel Ioc
     */
    IMMEDIATE_OR_CANCEL_IOC((short) 3, "Immediate Or Cancel Ioc"),

    /**
     * Fill Or Kill Fok
     */
    FILL_OR_KILL_FOK((short) 4, "Fill Or Kill Fok"),

    /**
     * At The Opening Opg
     */
    AT_THE_OPENING_OPG((short) 5, "At The Opening Opg"),

    /**
     * Good Till Date Gtd
     */
    GOOD_TILL_DATE_GTD((short) 6, "Good Till Date Gtd"),

    /**
     * Good Till Time Gtt
     */
    GOOD_TILL_TIME_GTT((short) 8, "Good Till Time Gtt"),

    /**
     * At The Close Atc
     */
    AT_THE_CLOSE_ATC((short) 10, "At The Close Atc"),

    /**
     * Closing Price Cross Cpx
     */
    CLOSING_PRICE_CROSS_CPX((short) 12, "Closing Price Cross Cpx"),

    /**
     * Good For Auction Gfa
     */
    GOOD_FOR_AUCTION_GFA((short) 50, "Good For Auction Gfa"),

    /**
     * Good For Intraday Auction Gfx
     */
    GOOD_FOR_INTRADAY_AUCTION_GFX((short) 51, "Good For Intraday Auction Gfx"),

    /**
     * Good For Scheduled Auction Gfs
     */
    GOOD_FOR_SCHEDULED_AUCTION_GFS((short) 52, "Good For Scheduled Auction Gfs"),

    /**
     * Auction Volume Discovery Avd
     */
    AUCTION_VOLUME_DISCOVERY_AVD((short) 54, "Auction Volume Discovery Avd"),

    /**
     * Auction Volume Close Avc
     */
    AUCTION_VOLUME_CLOSE_AVC((short) 55, "Auction Volume Close Avc");

    private final short wire;

    private final String description;

    Tif(short wire, String description) {
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
    public static Optional<Tif> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 3 -> Optional.of(IMMEDIATE_OR_CANCEL_IOC);
            case 4 -> Optional.of(FILL_OR_KILL_FOK);
            case 5 -> Optional.of(AT_THE_OPENING_OPG);
            case 6 -> Optional.of(GOOD_TILL_DATE_GTD);
            case 8 -> Optional.of(GOOD_TILL_TIME_GTT);
            case 10 -> Optional.of(AT_THE_CLOSE_ATC);
            case 12 -> Optional.of(CLOSING_PRICE_CROSS_CPX);
            case 50 -> Optional.of(GOOD_FOR_AUCTION_GFA);
            case 51 -> Optional.of(GOOD_FOR_INTRADAY_AUCTION_GFX);
            case 52 -> Optional.of(GOOD_FOR_SCHEDULED_AUCTION_GFS);
            case 54 -> Optional.of(AUCTION_VOLUME_DISCOVERY_AVD);
            case 55 -> Optional.of(AUCTION_VOLUME_CLOSE_AVC);
            default -> Optional.empty();
        };
    }
}
