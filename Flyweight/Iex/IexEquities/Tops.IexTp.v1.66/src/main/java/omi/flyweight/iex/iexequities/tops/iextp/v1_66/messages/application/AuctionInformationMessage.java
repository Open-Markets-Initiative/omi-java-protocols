package omi.flyweight.iex.iexequities.tops.iextp.v1_66.messages.application;

import omi.flyweight.iex.iexequities.tops.iextp.v1_66.enums.AuctionType;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.enums.ImbalanceSide;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Codec;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Flyweight;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Message;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Text;

/**
 * Represents the AuctionInformationMessage message from the Tops protocol.
 *
 * <p>
 * Broadcasts an Auction Information Message every one second between the Lock-in Time and the auction match for Opening and Closing Auctions, and during the Display Only Period for IPO, Halt, and Volatility Auctions.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class AuctionInformationMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Auction Information Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 79;

    /**
     * Where {@link #auctionType()} starts, from the message's start.
     */
    public static final int AUCTION_TYPE_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #pairedShares()} starts, from the message's start.
     */
    public static final int PAIRED_SHARES_OFFSET = 17;

    /**
     * Where {@link #referencePrice()} starts, from the message's start.
     */
    public static final int REFERENCE_PRICE_OFFSET = 21;

    /**
     * The decimal places of {@link #referencePrice()}: its raw integer is the value times ten to this power.
     */
    public static final int REFERENCE_PRICE_DECIMALS = 4;

    /**
     * Where {@link #indicativeClearingPrice()} starts, from the message's start.
     */
    public static final int INDICATIVE_CLEARING_PRICE_OFFSET = 29;

    /**
     * The decimal places of {@link #indicativeClearingPrice()}: its raw integer is the value times ten to this power.
     */
    public static final int INDICATIVE_CLEARING_PRICE_DECIMALS = 4;

    /**
     * Where {@link #imbalanceShares()} starts, from the message's start.
     */
    public static final int IMBALANCE_SHARES_OFFSET = 37;

    /**
     * Where {@link #imbalanceSide()} starts, from the message's start.
     */
    public static final int IMBALANCE_SIDE_OFFSET = 41;

    /**
     * Where {@link #extensionNumber()} starts, from the message's start.
     */
    public static final int EXTENSION_NUMBER_OFFSET = 42;

    /**
     * Where {@link #scheduledAuctionTime()} starts, from the message's start.
     */
    public static final int SCHEDULED_AUCTION_TIME_OFFSET = 43;

    /**
     * Where {@link #auctionBookClearingPrice()} starts, from the message's start.
     */
    public static final int AUCTION_BOOK_CLEARING_PRICE_OFFSET = 47;

    /**
     * The decimal places of {@link #auctionBookClearingPrice()}: its raw integer is the value times ten to this power.
     */
    public static final int AUCTION_BOOK_CLEARING_PRICE_DECIMALS = 4;

    /**
     * Where {@link #collarReferencePrice()} starts, from the message's start.
     */
    public static final int COLLAR_REFERENCE_PRICE_OFFSET = 55;

    /**
     * The decimal places of {@link #collarReferencePrice()}: its raw integer is the value times ten to this power.
     */
    public static final int COLLAR_REFERENCE_PRICE_DECIMALS = 4;

    /**
     * Where {@link #lowerAuctionCollar()} starts, from the message's start.
     */
    public static final int LOWER_AUCTION_COLLAR_OFFSET = 63;

    /**
     * The decimal places of {@link #lowerAuctionCollar()}: its raw integer is the value times ten to this power.
     */
    public static final int LOWER_AUCTION_COLLAR_DECIMALS = 4;

    /**
     * Where {@link #upperAuctionCollar()} starts, from the message's start.
     */
    public static final int UPPER_AUCTION_COLLAR_OFFSET = 71;

    /**
     * The decimal places of {@link #upperAuctionCollar()}: its raw integer is the value times ten to this power.
     */
    public static final int UPPER_AUCTION_COLLAR_DECIMALS = 4;

    private char auctionType;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long pairedShares;

    private long referencePrice;

    private long indicativeClearingPrice;

    private long imbalanceShares;

    private char imbalanceSide;

    private short extensionNumber;

    private long scheduledAuctionTime;

    private long auctionBookClearingPrice;

    private long collarReferencePrice;

    private long lowerAuctionCollar;

    private long upperAuctionCollar;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public AuctionInformationMessage() {
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    protected void read(byte[] buffer, int offset) {
        auctionType = (char) (buffer[offset + AUCTION_TYPE_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        pairedShares = Codec.getIntLE(buffer, offset + PAIRED_SHARES_OFFSET) & 0xFFFFFFFFL;
        referencePrice = Codec.getLongLE(buffer, offset + REFERENCE_PRICE_OFFSET);
        indicativeClearingPrice = Codec.getLongLE(buffer, offset + INDICATIVE_CLEARING_PRICE_OFFSET);
        imbalanceShares = Codec.getIntLE(buffer, offset + IMBALANCE_SHARES_OFFSET) & 0xFFFFFFFFL;
        imbalanceSide = (char) (buffer[offset + IMBALANCE_SIDE_OFFSET] & 0xFF);
        extensionNumber = (short) (buffer[offset + EXTENSION_NUMBER_OFFSET] & 0xFF);
        scheduledAuctionTime = Codec.getIntLE(buffer, offset + SCHEDULED_AUCTION_TIME_OFFSET) & 0xFFFFFFFFL;
        auctionBookClearingPrice = Codec.getLongLE(buffer, offset + AUCTION_BOOK_CLEARING_PRICE_OFFSET);
        collarReferencePrice = Codec.getLongLE(buffer, offset + COLLAR_REFERENCE_PRICE_OFFSET);
        lowerAuctionCollar = Codec.getLongLE(buffer, offset + LOWER_AUCTION_COLLAR_OFFSET);
        upperAuctionCollar = Codec.getLongLE(buffer, offset + UPPER_AUCTION_COLLAR_OFFSET);
    }

    /**
     * Auction type identifier
     *
     * @return the value, or null when the protocol declares none for {@link #auctionTypeRaw()}
     */
    public AuctionType auctionType() {
        return AuctionType.get(auctionTypeRaw());
    }

    /**
     * Auction type identifier
     *
     * @return the value as it was sent
     */
    public char auctionTypeRaw() {
        return auctionType;
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return timestamp;
    }

    /**
     * Security identifier
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text symbol() {
        return symbol;
    }

    /**
     * Number of shares paired at the Reference Price using orders on the Auction Book
     *
     * @return the value
     */
    public long pairedShares() {
        return pairedShares;
    }

    /**
     * Clearing price at or within the Reference Price Range using orders on the Auction Book
     *
     * @return the raw integer, the value times ten to the power of REFERENCE_PRICE_DECIMALS
     */
    public long referencePrice() {
        return referencePrice;
    }

    /**
     * Clearing price using Eligible Auction Orders
     *
     * @return the raw integer, the value times ten to the power of INDICATIVE_CLEARING_PRICE_DECIMALS
     */
    public long indicativeClearingPrice() {
        return indicativeClearingPrice;
    }

    /**
     * Number of unpaired shares at the Reference Price using orders on the Auction Book
     *
     * @return the value
     */
    public long imbalanceShares() {
        return imbalanceShares;
    }

    /**
     * Side of the unpaired shares at the Reference Price using orders on the Auction Book
     *
     * @return the value, or null when the protocol declares none for {@link #imbalanceSideRaw()}
     */
    public ImbalanceSide imbalanceSide() {
        return ImbalanceSide.get(imbalanceSideRaw());
    }

    /**
     * Side of the unpaired shares at the Reference Price using orders on the Auction Book
     *
     * @return the value as it was sent
     */
    public char imbalanceSideRaw() {
        return imbalanceSide;
    }

    /**
     * Number of extensions an auction received
     *
     * @return the value
     */
    public short extensionNumber() {
        return extensionNumber;
    }

    /**
     * Projected time of the auction match
     *
     * @return the value
     */
    public long scheduledAuctionTime() {
        return scheduledAuctionTime;
    }

    /**
     * Clearing price using orders on the Auction Book
     *
     * @return the raw integer, the value times ten to the power of AUCTION_BOOK_CLEARING_PRICE_DECIMALS
     */
    public long auctionBookClearingPrice() {
        return auctionBookClearingPrice;
    }

    /**
     * Reference priced used for the auction collar, if any
     *
     * @return the raw integer, the value times ten to the power of COLLAR_REFERENCE_PRICE_DECIMALS
     */
    public long collarReferencePrice() {
        return collarReferencePrice;
    }

    /**
     * Lower threshold price of the auction collar, if any
     *
     * @return the raw integer, the value times ten to the power of LOWER_AUCTION_COLLAR_DECIMALS
     */
    public long lowerAuctionCollar() {
        return lowerAuctionCollar;
    }

    /**
     * Upper threshold price of the auction collar, if any
     *
     * @return the raw integer, the value times ten to the power of UPPER_AUCTION_COLLAR_DECIMALS
     */
    public long upperAuctionCollar() {
        return upperAuctionCollar;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        AuctionType auctionType = auctionType();
        if (auctionType == null) {
            builder.append("auctionType=").append(auctionTypeRaw());
        }
        else {
            builder.append("auctionType=").append(auctionType.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", pairedShares=").append(pairedShares());
        builder.append(", referencePrice=").append(referencePrice());
        builder.append(", indicativeClearingPrice=").append(indicativeClearingPrice());
        builder.append(", imbalanceShares=").append(imbalanceShares());
        ImbalanceSide imbalanceSide = imbalanceSide();
        if (imbalanceSide == null) {
            builder.append(", imbalanceSide=").append(imbalanceSideRaw());
        }
        else {
            builder.append(", imbalanceSide=").append(imbalanceSide.name());
        }
        builder.append(", extensionNumber=").append(extensionNumber());
        builder.append(", scheduledAuctionTime=").append(scheduledAuctionTime());
        builder.append(", auctionBookClearingPrice=").append(auctionBookClearingPrice());
        builder.append(", collarReferencePrice=").append(collarReferencePrice());
        builder.append(", lowerAuctionCollar=").append(lowerAuctionCollar());
        builder.append(", upperAuctionCollar=").append(upperAuctionCollar());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
