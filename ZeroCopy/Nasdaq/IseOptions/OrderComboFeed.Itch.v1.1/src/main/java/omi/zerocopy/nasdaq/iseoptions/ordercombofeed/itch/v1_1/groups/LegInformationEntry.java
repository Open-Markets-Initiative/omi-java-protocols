package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.LegSide;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OptionType;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.TextView;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.View;

/**
 * One entry of Leg Information.
 *
 * <p>
 * Leg information
 * </p>
 *
 * <p>An immutable view, valid for as long as the bytes viewed are unchanged.</p>
 */
public final class LegInformationEntry extends View {

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

    /**
     * Views an entry.
     *
     * @param buffer the bytes holding the entry
     * @param offset where the entry starts
     * @param end where the bytes the entry may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public LegInformationEntry(byte[] buffer, int offset, int end) {
        super(buffer, offset, end, BYTE_LENGTH);
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * ISE’s Option ID for this leg, valid for the trading day. The same ID as the corresponding Option in the Options Directory Message. Zero (0) for Stock Leg.
     *
     * @return the value
     */
    public long optionId() {
        return Codec.getIntBE(buffer, offset + OPTION_ID_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Denotes the option root symbol (security symbol)
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView securitySymbol() {
        return new TextView(buffer, offset + SECURITY_SYMBOL_OFFSET, 6, (byte) ' ', false, true);
    }

    /**
     * Leg identifier within this strategy. This is an exchange-assigned 0-based index. E.g. Nth leg has LegId=N-1.
     *
     * @return the value
     */
    public short legId() {
        return (short) (buffer[offset + LEG_ID_OFFSET] & 0xFF);
    }

    /**
     * Last two digits of the year of the option expiration
     *
     * @return the value
     */
    public short expirationYear() {
        return (short) (buffer[offset + EXPIRATION_YEAR_OFFSET] & 0xFF);
    }

    /**
     * Expiration Month of the option (1-12)
     *
     * @return the value
     */
    public short expirationMonth() {
        return (short) (buffer[offset + EXPIRATION_MONTH_OFFSET] & 0xFF);
    }

    /**
     * Day of the Month of expiration (1-31)
     *
     * @return the value
     */
    public short expirationDay() {
        return (short) (buffer[offset + EXPIRATION_DAY_OFFSET] & 0xFF);
    }

    /**
     * Denotes the explicit strike price of the option. Refer to Data Types for field processing notes.
     *
     * @return the raw integer, the value times ten to the power of EXPLICIT_STRIKE_PRICE_DECIMALS
     */
    public long explicitStrikePrice() {
        return Codec.getLongBE(buffer, offset + EXPLICIT_STRIKE_PRICE_OFFSET);
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
        return (char) (buffer[offset + OPTION_TYPE_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + LEG_SIDE_OFFSET] & 0xFF);
    }

    /**
     * Leg Ratio
     *
     * @return the value
     */
    public long legRatio() {
        return Codec.getIntBE(buffer, offset + LEG_RATIO_OFFSET) & 0xFFFFFFFFL;
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
