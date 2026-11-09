package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * Contains the Strategy Code for defined market where applicable. See Appendix E for list of codes.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecuritySubType {

    /**
     * Na
     */
    NONE((short) 0, "Na"),

    /**
     * Call
     */
    CALL((short) 1, "Call"),

    /**
     * Put
     */
    PUT((short) 2, "Put"),

    /**
     * Ffly
     */
    FUTURES_BUTTERFLY((short) 3, "Ffly"),

    /**
     * Callfly
     */
    CALL_BUTTERFLY((short) 4, "Callfly"),

    /**
     * Putfly
     */
    PUT_BUTTERFLY((short) 5, "Putfly"),

    /**
     * Callspr
     */
    CALL_SPREAD((short) 6, "Callspr"),

    /**
     * Putspr
     */
    PUT_SPREAD((short) 7, "Putspr"),

    /**
     * Calldiagsp
     */
    DIAGONAL_CALL_SPREAD((short) 9, "Calldiagsp"),

    /**
     * Putdiagsp
     */
    DIAGONAL_PUT_SPREAD((short) 10, "Putdiagsp"),

    /**
     * Gut
     */
    GUT_STRANGLE((short) 11, "Gut"),

    /**
     * Ratiocspr
     */
    ONE_BY_TWO_CALL_SPREAD_TO_THE_TWO((short) 12, "Ratiocspr"),

    /**
     * Ratiopspr
     */
    ONE_BY_TWO_PUT_SPREAD_TO_THE_TWO((short) 13, "Ratiopspr"),

    /**
     * Ifly
     */
    IRON_BUTTERFLY((short) 14, "Ifly"),

    /**
     * Strangle
     */
    STRANGLE((short) 16, "Strangle"),

    /**
     * Callladr
     */
    CALL_LADDER_TREE((short) 17, "Callladr"),

    /**
     * Putladr
     */
    PUT_LADDER_TREE((short) 18, "Putladr"),

    /**
     * Calstrd
     */
    STRADDLE_SPREAD((short) 19, "Calstrd"),

    /**
     * Revcon
     */
    REVERSAL_CONVERSION((short) 21, "Revcon"),

    /**
     * Straddle
     */
    STRADDLE((short) 22, "Straddle"),

    /**
     * Fcondr
     */
    FUTURES_CONDOR((short) 23, "Fcondr"),

    /**
     * Callcondr
     */
    CALL_CONDOR((short) 24, "Callcondr"),

    /**
     * Putcondr
     */
    PUT_CONDOR((short) 25, "Putcondr"),

    /**
     * Box
     */
    BOX((short) 26, "Box"),

    /**
     * Syn
     */
    SYNTHETIC_UNDERLYING((short) 33, "Syn"),

    /**
     * Callsprp
     */
    CALL_SPREAD_VS_PUT_3_WAY((short) 34, "Callsprp"),

    /**
     * Putsprc
     */
    PUT_SPREAD_VS_CALL_3_WAY((short) 35, "Putsprc"),

    /**
     * Call 3 Way
     */
    STRADDLE_VS_CALL_3_WAY((short) 36, "Call 3 Way"),

    /**
     * Put 3 Way
     */
    STRADDLE_VS_PUT_3_WAY((short) 37, "Put 3 Way"),

    /**
     * Callcalspr
     */
    CALL_CALENDAR_SPREAD((short) 38, "Callcalspr"),

    /**
     * Putcalspr
     */
    PUT_CALENDAR_SPREAD((short) 39, "Putcalspr"),

    /**
     * Icondr
     */
    IRON_CONDOR((short) 40, "Icondr"),

    /**
     * Jroll
     */
    JELLY_ROLL((short) 41, "Jroll"),

    /**
     * Ratiocsprx
     */
    HEDGED_ONE_BY_TWO_CALL_SPREAD_TO_THE_TWO((short) 42, "Ratiocsprx"),

    /**
     * Ratiopsprx
     */
    HEDGED_ONE_BY_TWO_PUT_SPREAD_TO_THE_TWO((short) 43, "Ratiopsprx"),

    /**
     * Sprvspx
     */
    CALL_SPREAD_VERSUS_SELL_PUT_HEDGE((short) 44, "Sprvspx"),

    /**
     * Sprvscx
     */
    PUT_SPREAD_VERSUS_SELL_CALL_HEDGE((short) 45, "Sprvscx"),

    /**
     * Callcalx
     */
    HEDGED_CALL_CALENDAR((short) 46, "Callcalx"),

    /**
     * Putcalx
     */
    HEDGED_PUT_CALENDAR((short) 47, "Putcalx"),

    /**
     * Callladrx
     */
    HEDGED_CALL_LADDER_TREE((short) 48, "Callladrx"),

    /**
     * Putladrx
     */
    HEDGED_PUT_LADDER_TREE((short) 49, "Putladrx"),

    /**
     * Callsprx
     */
    HEDGED_CALL_SPREAD((short) 50, "Callsprx"),

    /**
     * Putsprx
     */
    HEDGED_PUT_SPREAD((short) 51, "Putsprx"),

    /**
     * Strdx
     */
    HEDGED_STRADDLE((short) 53, "Strdx"),

    /**
     * Strgx
     */
    HEDGED_STRANGLE((short) 54, "Strgx"),

    /**
     * Callx
     */
    HEDGED_CALL((short) 55, "Callx"),

    /**
     * Putx
     */
    HEDGED_PUT((short) 56, "Putx"),

    /**
     * Cust
     */
    CUSTOM((short) 58, "Cust"),

    /**
     * Calstrdx
     */
    HEDGED_STRADDLE_SPREAD((short) 59, "Calstrdx"),

    /**
     * Ccondrx
     */
    HEDGED_CALL_CONDOR((short) 60, "Ccondrx"),

    /**
     * Pcondrx
     */
    HEDGED_PUT_CONDOR((short) 61, "Pcondrx"),

    /**
     * Cdiagx
     */
    HEDGED_DIAGONAL_CALL_SPREAD((short) 63, "Cdiagx"),

    /**
     * Pdiagx
     */
    HEDGED_DIAGONAL_PUT_SPREAD((short) 64, "Pdiagx"),

    /**
     * Cflyx
     */
    HEDGED_CALL_BUTTERLFY((short) 65, "Cflyx"),

    /**
     * Pflyx
     */
    HEDGED_PUT_BUTTERLFY((short) 66, "Pflyx"),

    /**
     * Gutx
     */
    HEDGED_GUTS_STRANGLE((short) 67, "Gutx"),

    /**
     * Icondrx
     */
    HEDGED_IRON_CONDOR((short) 68, "Icondrx"),

    /**
     * Iflyx
     */
    HEDGED_IRON_BUTTERFLY((short) 69, "Iflyx"),

    /**
     * Fencecall
     */
    FENCE_TO_THE_CALL((short) 70, "Fencecall"),

    /**
     * Fenceput
     */
    FENCE_TO_THE_PUT((short) 71, "Fenceput"),

    /**
     * Fencecallx
     */
    HEDGED_FENCE_TO_THE_CALL((short) 72, "Fencecallx"),

    /**
     * Fenceputx
     */
    HEDGED_FENCE_TO_THE_PUT((short) 73, "Fenceputx"),

    /**
     * Ratio C Spr 1
     */
    ONE_BY_TWO_CALL_SPREAD_TO_THE_ONE((short) 74, "Ratio C Spr 1"),

    /**
     * Ratio P Spr 1
     */
    ONE_BY_TWO_PUT_SPREAD_TO_THE_ONE((short) 75, "Ratio P Spr 1"),

    /**
     * Ratio C Spr 1x
     */
    HEDGED_ONE_BY_TWO_CALL_SPREAD_TO_THE_ONE((short) 76, "Ratio C Spr 1x"),

    /**
     * Ratio P Spr 1x
     */
    HEDGED_ONE_BY_TWO_PUT_SPREAD_TO_THE_ONE((short) 77, "Ratio P Spr 1x"),

    /**
     * Discspr
     */
    DISCOUNT_SPREADS((short) 88, "Discspr"),

    /**
     * Locspr
     */
    LOCATION_SPREADS((short) 89, "Locspr"),

    /**
     * Platdifspr
     */
    PLATTS_DIFF_SPREAD((short) 90, "Platdifspr"),

    /**
     * Plattspr
     */
    PLATTS_SPREAD((short) 91, "Plattspr"),

    /**
     * Oilcrack
     */
    OTC_GAS_OIL_CRACK((short) 92, "Oilcrack"),

    /**
     * Balmospr
     */
    BALMO_OVER_MONTH((short) 93, "Balmospr"),

    /**
     * Ratiospr
     */
    RATIO_SPREAD((short) 94, "Ratiospr"),

    /**
     * Volspr
     */
    VOLUMETRIC_SPREAD((short) 95, "Volspr"),

    /**
     * Heatrate
     */
    HEAT_RATE((short) 96, "Heatrate"),

    /**
     * Crack
     */
    CRACK_SPREAD((short) 97, "Crack"),

    /**
     * Combospr
     */
    COMBO_SPREAD((short) 98, "Combospr"),

    /**
     * Spr
     */
    SPREAD_S((short) 99, "Spr"),

    /**
     * Pack
     */
    PACKNO_COLOR((short) 100, "Pack"),

    /**
     * Whtpack
     */
    PACK_WHITE((short) 101, "Whtpack"),

    /**
     * Redpack
     */
    PACK_RED((short) 102, "Redpack"),

    /**
     * Grnpack
     */
    PACK_GREEN((short) 103, "Grnpack"),

    /**
     * Blupack
     */
    PACK_BLUE((short) 104, "Blupack"),

    /**
     * Gldpack
     */
    PACK_GOLD((short) 105, "Gldpack"),

    /**
     * Purpack
     */
    PACK_PURPLE((short) 106, "Purpack"),

    /**
     * Ornpack
     */
    PACK_ORANGE((short) 107, "Ornpack"),

    /**
     * Pnkpack
     */
    PACK_PINK((short) 108, "Pnkpack"),

    /**
     * Silpack
     */
    PACK_SILVER((short) 109, "Silpack"),

    /**
     * Coppack
     */
    PACK_COPPER((short) 110, "Coppack"),

    /**
     * Bndl
     */
    BUNDLE_NO_COLOR((short) 200, "Bndl"),

    /**
     * Bndly 2
     */
    BUNDLE_2_YR((short) 201, "Bndly 2"),

    /**
     * Bndly 3
     */
    BUNDLE_3_YR((short) 202, "Bndly 3"),

    /**
     * Bndly 4
     */
    BUNDLE_4_YR((short) 203, "Bndly 4"),

    /**
     * Bndly 5
     */
    BUNDLE_5_YR((short) 204, "Bndly 5"),

    /**
     * Bndly 6
     */
    BUNDLE_6_YR((short) 205, "Bndly 6"),

    /**
     * Bndly 7
     */
    BUNDLE_7_YR((short) 206, "Bndly 7"),

    /**
     * Bndly 8
     */
    BUNDLE_8_YR((short) 207, "Bndly 8"),

    /**
     * Bndly 9
     */
    BUNDLE_9_YR((short) 208, "Bndly 9"),

    /**
     * Bndly 10
     */
    BUNDLE_10_YR((short) 209, "Bndly 10"),

    /**
     * Balmo
     */
    BALMO((short) 400, "Balmo"),

    /**
     * Nextday
     */
    NEXT_DAY((short) 410, "Nextday"),

    /**
     * Cfd
     */
    CFD((short) 411, "Cfd"),

    /**
     * Wknd
     */
    WEEKEND((short) 412, "Wknd"),

    /**
     * Singleday
     */
    SINGLE_DAY((short) 413, "Singleday"),

    /**
     * Custdaily
     */
    CUSTOM_DAILY((short) 414, "Custdaily"),

    /**
     * Hourly
     */
    HOURLY((short) 415, "Hourly"),

    /**
     * Month
     */
    MONTH((short) 416, "Month"),

    /**
     * Balwk
     */
    BALWEEK((short) 450, "Balwk"),

    /**
     * Kyoto
     */
    BASKET((short) 500, "Kyoto"),

    /**
     * Custmonthly
     */
    CUSTOM_MONTHLY((short) 550, "Custmonthly"),

    /**
     * Nextwk
     */
    NEXT_WEEK((short) 600, "Nextwk"),

    /**
     * Period
     */
    PERIOD((short) 700, "Period"),

    /**
     * Cust Daily Cfd
     */
    CUSTOM_DAILY_CFD((short) 711, "Cust Daily Cfd"),

    /**
     * Cust Daily 7x 8
     */
    CUSTOM_DAILY_7X8((short) 712, "Cust Daily 7x 8"),

    /**
     * Cust Daily 7x 16
     */
    CUSTOM_DAILY_7X16((short) 713, "Cust Daily 7x 16"),

    /**
     * Cust Daily 7x 6
     */
    CUSTOM_DAILY_7X6((short) 714, "Cust Daily 7x 6"),

    /**
     * Cust Daily Opx 16
     */
    CUSTOM_DAILY_OFF_PEAK_X16((short) 715, "Cust Daily Opx 16"),

    /**
     * Qtr
     */
    QUARTER((short) 800, "Qtr"),

    /**
     * Year
     */
    YEAR((short) 900, "Year");

    private final short wire;

    private final String description;

    SecuritySubType(short wire, String description) {
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
    public static Optional<SecuritySubType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(CALL);
            case 2 -> Optional.of(PUT);
            case 3 -> Optional.of(FUTURES_BUTTERFLY);
            case 4 -> Optional.of(CALL_BUTTERFLY);
            case 5 -> Optional.of(PUT_BUTTERFLY);
            case 6 -> Optional.of(CALL_SPREAD);
            case 7 -> Optional.of(PUT_SPREAD);
            case 9 -> Optional.of(DIAGONAL_CALL_SPREAD);
            case 10 -> Optional.of(DIAGONAL_PUT_SPREAD);
            case 11 -> Optional.of(GUT_STRANGLE);
            case 12 -> Optional.of(ONE_BY_TWO_CALL_SPREAD_TO_THE_TWO);
            case 13 -> Optional.of(ONE_BY_TWO_PUT_SPREAD_TO_THE_TWO);
            case 14 -> Optional.of(IRON_BUTTERFLY);
            case 16 -> Optional.of(STRANGLE);
            case 17 -> Optional.of(CALL_LADDER_TREE);
            case 18 -> Optional.of(PUT_LADDER_TREE);
            case 19 -> Optional.of(STRADDLE_SPREAD);
            case 21 -> Optional.of(REVERSAL_CONVERSION);
            case 22 -> Optional.of(STRADDLE);
            case 23 -> Optional.of(FUTURES_CONDOR);
            case 24 -> Optional.of(CALL_CONDOR);
            case 25 -> Optional.of(PUT_CONDOR);
            case 26 -> Optional.of(BOX);
            case 33 -> Optional.of(SYNTHETIC_UNDERLYING);
            case 34 -> Optional.of(CALL_SPREAD_VS_PUT_3_WAY);
            case 35 -> Optional.of(PUT_SPREAD_VS_CALL_3_WAY);
            case 36 -> Optional.of(STRADDLE_VS_CALL_3_WAY);
            case 37 -> Optional.of(STRADDLE_VS_PUT_3_WAY);
            case 38 -> Optional.of(CALL_CALENDAR_SPREAD);
            case 39 -> Optional.of(PUT_CALENDAR_SPREAD);
            case 40 -> Optional.of(IRON_CONDOR);
            case 41 -> Optional.of(JELLY_ROLL);
            case 42 -> Optional.of(HEDGED_ONE_BY_TWO_CALL_SPREAD_TO_THE_TWO);
            case 43 -> Optional.of(HEDGED_ONE_BY_TWO_PUT_SPREAD_TO_THE_TWO);
            case 44 -> Optional.of(CALL_SPREAD_VERSUS_SELL_PUT_HEDGE);
            case 45 -> Optional.of(PUT_SPREAD_VERSUS_SELL_CALL_HEDGE);
            case 46 -> Optional.of(HEDGED_CALL_CALENDAR);
            case 47 -> Optional.of(HEDGED_PUT_CALENDAR);
            case 48 -> Optional.of(HEDGED_CALL_LADDER_TREE);
            case 49 -> Optional.of(HEDGED_PUT_LADDER_TREE);
            case 50 -> Optional.of(HEDGED_CALL_SPREAD);
            case 51 -> Optional.of(HEDGED_PUT_SPREAD);
            case 53 -> Optional.of(HEDGED_STRADDLE);
            case 54 -> Optional.of(HEDGED_STRANGLE);
            case 55 -> Optional.of(HEDGED_CALL);
            case 56 -> Optional.of(HEDGED_PUT);
            case 58 -> Optional.of(CUSTOM);
            case 59 -> Optional.of(HEDGED_STRADDLE_SPREAD);
            case 60 -> Optional.of(HEDGED_CALL_CONDOR);
            case 61 -> Optional.of(HEDGED_PUT_CONDOR);
            case 63 -> Optional.of(HEDGED_DIAGONAL_CALL_SPREAD);
            case 64 -> Optional.of(HEDGED_DIAGONAL_PUT_SPREAD);
            case 65 -> Optional.of(HEDGED_CALL_BUTTERLFY);
            case 66 -> Optional.of(HEDGED_PUT_BUTTERLFY);
            case 67 -> Optional.of(HEDGED_GUTS_STRANGLE);
            case 68 -> Optional.of(HEDGED_IRON_CONDOR);
            case 69 -> Optional.of(HEDGED_IRON_BUTTERFLY);
            case 70 -> Optional.of(FENCE_TO_THE_CALL);
            case 71 -> Optional.of(FENCE_TO_THE_PUT);
            case 72 -> Optional.of(HEDGED_FENCE_TO_THE_CALL);
            case 73 -> Optional.of(HEDGED_FENCE_TO_THE_PUT);
            case 74 -> Optional.of(ONE_BY_TWO_CALL_SPREAD_TO_THE_ONE);
            case 75 -> Optional.of(ONE_BY_TWO_PUT_SPREAD_TO_THE_ONE);
            case 76 -> Optional.of(HEDGED_ONE_BY_TWO_CALL_SPREAD_TO_THE_ONE);
            case 77 -> Optional.of(HEDGED_ONE_BY_TWO_PUT_SPREAD_TO_THE_ONE);
            case 88 -> Optional.of(DISCOUNT_SPREADS);
            case 89 -> Optional.of(LOCATION_SPREADS);
            case 90 -> Optional.of(PLATTS_DIFF_SPREAD);
            case 91 -> Optional.of(PLATTS_SPREAD);
            case 92 -> Optional.of(OTC_GAS_OIL_CRACK);
            case 93 -> Optional.of(BALMO_OVER_MONTH);
            case 94 -> Optional.of(RATIO_SPREAD);
            case 95 -> Optional.of(VOLUMETRIC_SPREAD);
            case 96 -> Optional.of(HEAT_RATE);
            case 97 -> Optional.of(CRACK_SPREAD);
            case 98 -> Optional.of(COMBO_SPREAD);
            case 99 -> Optional.of(SPREAD_S);
            case 100 -> Optional.of(PACKNO_COLOR);
            case 101 -> Optional.of(PACK_WHITE);
            case 102 -> Optional.of(PACK_RED);
            case 103 -> Optional.of(PACK_GREEN);
            case 104 -> Optional.of(PACK_BLUE);
            case 105 -> Optional.of(PACK_GOLD);
            case 106 -> Optional.of(PACK_PURPLE);
            case 107 -> Optional.of(PACK_ORANGE);
            case 108 -> Optional.of(PACK_PINK);
            case 109 -> Optional.of(PACK_SILVER);
            case 110 -> Optional.of(PACK_COPPER);
            case 200 -> Optional.of(BUNDLE_NO_COLOR);
            case 201 -> Optional.of(BUNDLE_2_YR);
            case 202 -> Optional.of(BUNDLE_3_YR);
            case 203 -> Optional.of(BUNDLE_4_YR);
            case 204 -> Optional.of(BUNDLE_5_YR);
            case 205 -> Optional.of(BUNDLE_6_YR);
            case 206 -> Optional.of(BUNDLE_7_YR);
            case 207 -> Optional.of(BUNDLE_8_YR);
            case 208 -> Optional.of(BUNDLE_9_YR);
            case 209 -> Optional.of(BUNDLE_10_YR);
            case 400 -> Optional.of(BALMO);
            case 410 -> Optional.of(NEXT_DAY);
            case 411 -> Optional.of(CFD);
            case 412 -> Optional.of(WEEKEND);
            case 413 -> Optional.of(SINGLE_DAY);
            case 414 -> Optional.of(CUSTOM_DAILY);
            case 415 -> Optional.of(HOURLY);
            case 416 -> Optional.of(MONTH);
            case 450 -> Optional.of(BALWEEK);
            case 500 -> Optional.of(BASKET);
            case 550 -> Optional.of(CUSTOM_MONTHLY);
            case 600 -> Optional.of(NEXT_WEEK);
            case 700 -> Optional.of(PERIOD);
            case 711 -> Optional.of(CUSTOM_DAILY_CFD);
            case 712 -> Optional.of(CUSTOM_DAILY_7X8);
            case 713 -> Optional.of(CUSTOM_DAILY_7X16);
            case 714 -> Optional.of(CUSTOM_DAILY_7X6);
            case 715 -> Optional.of(CUSTOM_DAILY_OFF_PEAK_X16);
            case 800 -> Optional.of(QUARTER);
            case 900 -> Optional.of(YEAR);
            default -> Optional.empty();
        };
    }
}
