package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.LegSide;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OptionType;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Text;

/**
 * One entry of Leg Information.
 *
 * <p>
 * Leg information
 * </p>
 *
 * <p>A flyweight its list decodes into again for each message, holding copies of its fields, so it is valid until
 * its message decodes the next one.</p>
 */
public final class LegInformationEntry extends Flyweight {

    /**
     * The fixed length of one entry in bytes.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * Where {@link #optionId()} starts, from the entry's start.
     */
    public static final int OPTION_ID_OFFSET = 0;

    /**
     * Where {@link #securitySymbol()} starts, from the entry's start.
     */
    public static final int SECURITY_SYMBOL_OFFSET = 4;

    /**
     * Where {@link #legId()} starts, from the entry's start.
     */
    public static final int LEG_ID_OFFSET = 10;

    /**
     * Where {@link #expirationYear()} starts, from the entry's start.
     */
    public static final int EXPIRATION_YEAR_OFFSET = 11;

    /**
     * Where {@link #expirationMonth()} starts, from the entry's start.
     */
    public static final int EXPIRATION_MONTH_OFFSET = 12;

    /**
     * Where {@link #expirationDay()} starts, from the entry's start.
     */
    public static final int EXPIRATION_DAY_OFFSET = 13;

    /**
     * Where {@link #explicitStrikePrice()} starts, from the entry's start.
     */
    public static final int EXPLICIT_STRIKE_PRICE_OFFSET = 14;

    /**
     * The decimal places of {@link #explicitStrikePrice()}: its raw integer is the value times ten to this power.
     */
    public static final int EXPLICIT_STRIKE_PRICE_DECIMALS = 8;

    /**
     * Where {@link #optionType()} starts, from the entry's start.
     */
    public static final int OPTION_TYPE_OFFSET = 22;

    /**
     * Where {@link #legSide()} starts, from the entry's start.
     */
    public static final int LEG_SIDE_OFFSET = 23;

    /**
     * Where {@link #legRatio()} starts, from the entry's start.
     */
    public static final int LEG_RATIO_OFFSET = 24;

    private long optionId;

    private final Text securitySymbol = new Text(6, (byte) ' ', false, true);

    private short legId;

    private short expirationYear;

    private short expirationMonth;

    private short expirationDay;

    private long explicitStrikePrice;

    private char optionType;

    private char legSide;

    private long legRatio;

    /**
     * Creates an entry holding nothing decoded; its list decodes into it.
     */
    public LegInformationEntry() {
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    protected void read(byte[] buffer, int offset) {
        optionId = Codec.getIntBE(buffer, offset + OPTION_ID_OFFSET) & 0xFFFFFFFFL;
        securitySymbol.copy(buffer, offset + SECURITY_SYMBOL_OFFSET);
        legId = (short) (buffer[offset + LEG_ID_OFFSET] & 0xFF);
        expirationYear = (short) (buffer[offset + EXPIRATION_YEAR_OFFSET] & 0xFF);
        expirationMonth = (short) (buffer[offset + EXPIRATION_MONTH_OFFSET] & 0xFF);
        expirationDay = (short) (buffer[offset + EXPIRATION_DAY_OFFSET] & 0xFF);
        explicitStrikePrice = Codec.getLongBE(buffer, offset + EXPLICIT_STRIKE_PRICE_OFFSET);
        optionType = (char) (buffer[offset + OPTION_TYPE_OFFSET] & 0xFF);
        legSide = (char) (buffer[offset + LEG_SIDE_OFFSET] & 0xFF);
        legRatio = Codec.getIntBE(buffer, offset + LEG_RATIO_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * ISE’s Option ID for this leg, valid for the trading day. The same ID as the corresponding Option in the Options Directory Message. Zero (0) for Stock Leg.
     *
     * @return the value
     */
    public long optionId() {
        return optionId;
    }

    /**
     * Denotes the option root symbol (security symbol)
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text securitySymbol() {
        return securitySymbol;
    }

    /**
     * Leg identifier within this strategy. This is an exchange-assigned 0-based index. E.g. Nth leg has LegId=N-1.
     *
     * @return the value
     */
    public short legId() {
        return legId;
    }

    /**
     * Last two digits of the year of the option expiration
     *
     * @return the value
     */
    public short expirationYear() {
        return expirationYear;
    }

    /**
     * Expiration Month of the option (1-12)
     *
     * @return the value
     */
    public short expirationMonth() {
        return expirationMonth;
    }

    /**
     * Day of the Month of expiration (1-31)
     *
     * @return the value
     */
    public short expirationDay() {
        return expirationDay;
    }

    /**
     * Denotes the explicit strike price of the option. Refer to Data Types for field processing notes.
     *
     * @return the raw integer, the value times ten to the power of EXPLICIT_STRIKE_PRICE_DECIMALS
     */
    public long explicitStrikePrice() {
        return explicitStrikePrice;
    }

    /**
     * Option Type:
     *
     * @return the value, or null when the protocol declares none for {@link #optionTypeRaw()}
     */
    public OptionType optionType() {
        return OptionType.get(optionTypeRaw());
    }

    /**
     * Option Type:
     *
     * @return the value as it was sent
     */
    public char optionTypeRaw() {
        return optionType;
    }

    /**
     * Indicates the side of the leg
     *
     * @return the value, or null when the protocol declares none for {@link #legSideRaw()}
     */
    public LegSide legSide() {
        return LegSide.get(legSideRaw());
    }

    /**
     * Indicates the side of the leg
     *
     * @return the value as it was sent
     */
    public char legSideRaw() {
        return legSide;
    }

    /**
     * Leg Ratio
     *
     * @return the value
     */
    public long legRatio() {
        return legRatio;
    }

    /**
     * Appends the entry's fields, allocating nothing beyond what the builder grows by.
     *
     * @param builder where the fields are appended
     * @return the builder
     */
    public StringBuilder dump(StringBuilder builder) {
        builder.append('{');
        builder.append("optionId=").append(optionId());
        builder.append(", securitySymbol=").append(securitySymbol());
        builder.append(", legId=").append(legId());
        builder.append(", expirationYear=").append(expirationYear());
        builder.append(", expirationMonth=").append(expirationMonth());
        builder.append(", expirationDay=").append(expirationDay());
        builder.append(", explicitStrikePrice=").append(explicitStrikePrice());
        OptionType optionType = optionType();
        if (optionType == null) {
            builder.append(", optionType=").append(optionTypeRaw());
        }
        else {
            builder.append(", optionType=").append(optionType.name());
        }
        LegSide legSide = legSide();
        if (legSide == null) {
            builder.append(", legSide=").append(legSideRaw());
        }
        else {
            builder.append(", legSide=").append(legSide.name());
        }
        builder.append(", legRatio=").append(legRatio());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
