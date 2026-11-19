package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * participantId
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum ParticipantId {

    /**
     * Unset
     */
    UNSET(0x0L, "Unset"),

    /**
     * IEX
     */
    IEXG(0x47584549L, "IEX"),

    /**
     * NASDAQ NMS
     */
    XNMS(0x534D4E58L, "NASDAQ NMS"),

    /**
     * NASDAQ BX
     */
    XBOS(0x534F4258L, "NASDAQ BX"),

    /**
     * NASDAQ PSX
     */
    XPSX(0x58535058L, "NASDAQ PSX"),

    /**
     * CBOE BZX
     */
    BATS(0x53544142L, "CBOE BZX"),

    /**
     * CBOE BYX
     */
    BATY(0x59544142L, "CBOE BYX"),

    /**
     * CBOE EDGA
     */
    EDGA(0x41474445L, "CBOE EDGA"),

    /**
     * CBOE EDGX
     */
    EDGX(0x58474445L, "CBOE EDGX"),

    /**
     * NYSE
     */
    XNYS(0x53594E58L, "NYSE"),

    /**
     * NYSE Arca
     */
    ARCX(0x58435241L, "NYSE Arca"),

    /**
     * MIAX Pearl
     */
    EPRL(0x4C525045L, "MIAX Pearl"),

    /**
     * MEMX
     */
    MEMX(0x584D454DL, "MEMX"),

    /**
     * CME Globex
     */
    XCME(0x454D4358L, "CME Globex"),

    /**
     * CBOT
     */
    XCBT(0x54424358L, "CBOT"),

    /**
     * CME Currency Market
     */
    CBCM(0x4D434243L, "CME Currency Market"),

    /**
     * NYMEX
     */
    XNYM(0x4D594E58L, "NYMEX"),

    /**
     * COMEX
     */
    XCEC(0x43454358L, "COMEX"),

    /**
     * CME FX Spot
     */
    XFXS(0x53584658L, "CME FX Spot"),

    /**
     * CME Globex
     */
    GLBX(0x58424C47L, "CME Globex"),

    /**
     * OPRA NBBO
     */
    NBBO(0x4F42424EL, "OPRA NBBO"),

    /**
     * Bursa Malaysia
     */
    XKLS(0x534C4B58L, "Bursa Malaysia"),

    /**
     * Dubai Mercantile
     */
    DUMX(0x584D5544L, "Dubai Mercantile"),

    /**
     * Minneapolis Grain
     */
    XMGE(0x45474D58L, "Minneapolis Grain"),

    /**
     * Saudi Exchange (Tadawul)
     */
    XSAU(0x55415358L, "Saudi Exchange (Tadawul)");

    private final long wire;

    private final String description;

    ParticipantId(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<ParticipantId> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(UNSET);
        }
        if (wire == 1196967241L) {
            return Optional.of(IEXG);
        }
        if (wire == 1397575256L) {
            return Optional.of(XNMS);
        }
        if (wire == 1397703256L) {
            return Optional.of(XBOS);
        }
        if (wire == 1481855064L) {
            return Optional.of(XPSX);
        }
        if (wire == 1398030658L) {
            return Optional.of(BATS);
        }
        if (wire == 1498693954L) {
            return Optional.of(BATY);
        }
        if (wire == 1095189573L) {
            return Optional.of(EDGA);
        }
        if (wire == 1481065541L) {
            return Optional.of(EDGX);
        }
        if (wire == 1398361688L) {
            return Optional.of(XNYS);
        }
        if (wire == 1480806977L) {
            return Optional.of(ARCX);
        }
        if (wire == 1280462917L) {
            return Optional.of(EPRL);
        }
        if (wire == 1481459021L) {
            return Optional.of(MEMX);
        }
        if (wire == 1162691416L) {
            return Optional.of(XCME);
        }
        if (wire == 1413628760L) {
            return Optional.of(XCBT);
        }
        if (wire == 1296253507L) {
            return Optional.of(CBCM);
        }
        if (wire == 1297698392L) {
            return Optional.of(XNYM);
        }
        if (wire == 1128612696L) {
            return Optional.of(XCEC);
        }
        if (wire == 1398294104L) {
            return Optional.of(XFXS);
        }
        if (wire == 1480739911L) {
            return Optional.of(GLBX);
        }
        if (wire == 1329742414L) {
            return Optional.of(NBBO);
        }
        if (wire == 1397508952L) {
            return Optional.of(XKLS);
        }
        if (wire == 1481463108L) {
            return Optional.of(DUMX);
        }
        if (wire == 1162300760L) {
            return Optional.of(XMGE);
        }
        if (wire == 1430344536L) {
            return Optional.of(XSAU);
        }
        return Optional.empty();
    }
}
