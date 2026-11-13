package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.messages.application;

import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums.LuldTier;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Codec;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Flyweight;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Message;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.TextView;

/**
 * Represents the SecurityDirectoryMessage message from the Deep protocol.
 *
 * <p>
 * The System Event Message is used to indicate events that apply to the market or the data feed.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class SecurityDirectoryMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Security Directory Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * Where {@link #securityDirectoryFlags()} starts, from the message's start.
     */
    public static final int SECURITY_DIRECTORY_FLAGS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #roundLotSize()} starts, from the message's start.
     */
    public static final int ROUND_LOT_SIZE_OFFSET = 17;

    /**
     * Where {@link #adjustedPocPrice()} starts, from the message's start.
     */
    public static final int ADJUSTED_POC_PRICE_OFFSET = 21;

    /**
     * The decimal places of {@link #adjustedPocPrice()}: its raw integer is the value times ten to this power.
     */
    public static final int ADJUSTED_POC_PRICE_DECIMALS = 4;

    /**
     * Where {@link #luldTier()} starts, from the message's start.
     */
    public static final int LULD_TIER_OFFSET = 29;

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public SecurityDirectoryMessage() {
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Security Directory Flags
     *
     * @return the whole container; prefer the named bit accessors
     */
    public byte securityDirectoryFlags() {
        return buffer[offset + SECURITY_DIRECTORY_FLAGS_OFFSET];
    }

    /**
     * Unused
     *
     * @return bits 0 through 4 of {@link #securityDirectoryFlags()}
     */
    public int securityDirectoryFlagsUnused() {
        return (int) (securityDirectoryFlags() & 0x1FL);
    }

    /**
     * Symbol is an ETP
     *
     * @return bit 5 of {@link #securityDirectoryFlags()}
     */
    public boolean securityDirectoryFlagsEtp() {
        return ((securityDirectoryFlags() >>> 5) & 1L) != 0L;
    }

    /**
     * Symbol is a when issued security
     *
     * @return bit 6 of {@link #securityDirectoryFlags()}
     */
    public boolean securityDirectoryFlagsWhenIssued() {
        return ((securityDirectoryFlags() >>> 6) & 1L) != 0L;
    }

    /**
     * Symbol is a test security
     *
     * @return bit 7 of {@link #securityDirectoryFlags()}
     */
    public boolean securityDirectoryFlagsTestSecurity() {
        return ((securityDirectoryFlags() >>> 7) & 1L) != 0L;
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
    }

    /**
     * Security identifier
     *
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView symbol() {
        return symbolView.wrap(buffer, offset + SYMBOL_OFFSET);
    }

    /**
     * Number of shares that represent a round lot
     *
     * @return the value
     */
    public long roundLotSize() {
        return Codec.getIntLE(buffer, offset + ROUND_LOT_SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Corporate action adjusted previous official closing price
     *
     * @return the raw integer, the value times ten to the power of ADJUSTED_POC_PRICE_DECIMALS
     */
    public long adjustedPocPrice() {
        return Codec.getLongLE(buffer, offset + ADJUSTED_POC_PRICE_OFFSET);
    }

    /**
     * Indicates which Limit Up-Limit Down price band calculation parameter is to be used
     *
     * @return the value, or null when the protocol declares none for {@link #luldTierRaw()}
     */
    public LuldTier luldTier() {
        return LuldTier.get(luldTierRaw());
    }

    /**
     * Indicates which Limit Up-Limit Down price band calculation parameter is to be used
     *
     * @return the value as it was sent
     */
    public short luldTierRaw() {
        return (short) (buffer[offset + LULD_TIER_OFFSET] & 0xFF);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("securityDirectoryFlags=").append(securityDirectoryFlags());
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", roundLotSize=").append(roundLotSize());
        builder.append(", adjustedPocPrice=").append(adjustedPocPrice());
        LuldTier luldTier = luldTier();
        if (luldTier == null) {
            builder.append(", luldTier=").append(luldTierRaw());
        }
        else {
            builder.append(", luldTier=").append(luldTier.name());
        }
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
