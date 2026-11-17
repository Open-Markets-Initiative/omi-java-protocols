package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.AuctionEvent;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.AuctionType;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.ExecFlag;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderCapacity;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderType;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Scope;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Side;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.AuctionResponseEntry;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.AuctionResponseList;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Text;

/**
 * Represents the ComplexStrategyAuctionMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class ComplexStrategyAuctionMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Complex Strategy Auction Message";

    /**
     * The least length of the message in bytes, with no Auction Response entries.
     */
    public static final int MINIMUM_BYTE_LENGTH = 48;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 0;

    /**
     * Where {@link #strategyId()} starts, from the message's start.
     */
    public static final int STRATEGY_ID_OFFSET = 6;

    /**
     * Where {@link #auctionId()} starts, from the message's start.
     */
    public static final int AUCTION_ID_OFFSET = 10;

    /**
     * Where {@link #orderType()} starts, from the message's start.
     */
    public static final int ORDER_TYPE_OFFSET = 14;

    /**
     * Where {@link #side()} starts, from the message's start.
     */
    public static final int SIDE_OFFSET = 15;

    /**
     * Where {@link #price()} starts, from the message's start.
     */
    public static final int PRICE_OFFSET = 16;

    /**
     * The decimal places of {@link #price()}: its raw integer is the value times ten to this power.
     */
    public static final int PRICE_DECIMALS = 4;

    /**
     * Where {@link #size()} starts, from the message's start.
     */
    public static final int SIZE_OFFSET = 20;

    /**
     * Where {@link #execFlag()} starts, from the message's start.
     */
    public static final int EXEC_FLAG_OFFSET = 24;

    /**
     * Where {@link #orderCapacity()} starts, from the message's start.
     */
    public static final int ORDER_CAPACITY_OFFSET = 25;

    /**
     * Where {@link #scope()} starts, from the message's start.
     */
    public static final int SCOPE_OFFSET = 26;

    /**
     * Where {@link #ownerId()} starts, from the message's start.
     */
    public static final int OWNER_ID_OFFSET = 27;

    /**
     * Where {@link #giveup()} starts, from the message's start.
     */
    public static final int GIVEUP_OFFSET = 33;

    /**
     * Where {@link #cmta()} starts, from the message's start.
     */
    public static final int CMTA_OFFSET = 39;

    /**
     * Where {@link #auctionEvent()} starts, from the message's start.
     */
    public static final int AUCTION_EVENT_OFFSET = 45;

    /**
     * Where {@link #auctionType()} starts, from the message's start.
     */
    public static final int AUCTION_TYPE_OFFSET = 46;

    /**
     * Where {@link #numberOfResponses()} starts, from the message's start.
     */
    public static final int NUMBER_OF_RESPONSES_OFFSET = 47;

    /**
     * Where {@link #auctionResponse()} starts, from the message's start.
     */
    public static final int AUCTION_RESPONSE_OFFSET = 48;

    private long timestamp;

    private long strategyId;

    private long auctionId;

    private char orderType;

    private char side;

    private int price;

    private long size;

    private char execFlag;

    private char orderCapacity;

    private char scope;

    private final Text ownerId = new Text(6, (byte) ' ', false, true);

    private final Text giveup = new Text(6, (byte) ' ', false, true);

    private final Text cmta = new Text(6, (byte) ' ', false, true);

    private char auctionEvent;

    private char auctionType;

    private short numberOfResponses;

    private final AuctionResponseList auctionResponseList = new AuctionResponseList();

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public ComplexStrategyAuctionMessage() {
    }

    @Override
    public String name() {
        return NAME;
    }

    /**
     * Gets the message's length: its fixed members and the Auction Response entries it holds.
     *
     * @return its length in bytes
     */
    @Override
    public int byteLength() {
        return AUCTION_RESPONSE_OFFSET + auctionResponseList.count() * AuctionResponseEntry.BYTE_LENGTH;
    }

    @Override
    protected int minimumByteLength() {
        return MINIMUM_BYTE_LENGTH;
    }

    @Override
    protected int lengthAt(byte[] buffer, int offset) {
        long count = (short) (buffer[offset + NUMBER_OF_RESPONSES_OFFSET] & 0xFF);
        long length = AUCTION_RESPONSE_OFFSET + count * AuctionResponseEntry.BYTE_LENGTH;
        return length > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) length;
    }

    @Override
    protected void read(byte[] buffer, int offset) {
        timestamp = Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
        strategyId = Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
        auctionId = Codec.getIntBE(buffer, offset + AUCTION_ID_OFFSET) & 0xFFFFFFFFL;
        orderType = (char) (buffer[offset + ORDER_TYPE_OFFSET] & 0xFF);
        side = (char) (buffer[offset + SIDE_OFFSET] & 0xFF);
        price = Codec.getIntBE(buffer, offset + PRICE_OFFSET);
        size = Codec.getIntBE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
        execFlag = (char) (buffer[offset + EXEC_FLAG_OFFSET] & 0xFF);
        orderCapacity = (char) (buffer[offset + ORDER_CAPACITY_OFFSET] & 0xFF);
        scope = (char) (buffer[offset + SCOPE_OFFSET] & 0xFF);
        ownerId.copy(buffer, offset + OWNER_ID_OFFSET);
        giveup.copy(buffer, offset + GIVEUP_OFFSET);
        cmta.copy(buffer, offset + CMTA_OFFSET);
        auctionEvent = (char) (buffer[offset + AUCTION_EVENT_OFFSET] & 0xFF);
        auctionType = (char) (buffer[offset + AUCTION_TYPE_OFFSET] & 0xFF);
        numberOfResponses = (short) (buffer[offset + NUMBER_OF_RESPONSES_OFFSET] & 0xFF);
        auctionResponseList.read(buffer, offset + AUCTION_RESPONSE_OFFSET, (int) numberOfResponses);
    }

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the value
     */
    public long timestamp() {
        return timestamp;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the value
     */
    public long strategyId() {
        return strategyId;
    }

    /**
     * Integer which uniquely identifies the auction.
     *
     * @return the value
     */
    public long auctionId() {
        return auctionId;
    }

    /**
     * Order Type
     *
     * @return the value, or null when the protocol declares none for {@link #orderTypeRaw()}
     */
    public OrderType orderType() {
        return OrderType.get(orderTypeRaw());
    }

    /**
     * Order Type
     *
     * @return the value as it was sent
     */
    public char orderTypeRaw() {
        return orderType;
    }

    /**
     * ‘B’ = Bid ‘A’ = Offer (Ask) ‘ ’ (blank) = not set (hidden)
     *
     * @return the value, or null when the protocol declares none for {@link #sideRaw()}
     */
    public Side side() {
        return Side.get(sideRaw());
    }

    /**
     * ‘B’ = Bid ‘A’ = Offer (Ask) ‘ ’ (blank) = not set (hidden)
     *
     * @return the value as it was sent
     */
    public char sideRaw() {
        return side;
    }

    /**
     * Price of the order in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public int price() {
        return price;
    }

    /**
     * Size of the order
     *
     * @return the value
     */
    public long size() {
        return size;
    }

    /**
     * ‘N’ = None ‘A’ = AON
     *
     * @return the value, or null when the protocol declares none for {@link #execFlagRaw()}
     */
    public ExecFlag execFlag() {
        return ExecFlag.get(execFlagRaw());
    }

    /**
     * ‘N’ = None ‘A’ = AON
     *
     * @return the value as it was sent
     */
    public char execFlagRaw() {
        return execFlag;
    }

    /**
     * Order Capacity value
     *
     * @return the value, or null when the protocol declares none for {@link #orderCapacityRaw()}
     */
    public OrderCapacity orderCapacity() {
        return OrderCapacity.get(orderCapacityRaw());
    }

    /**
     * Order Capacity value
     *
     * @return the value as it was sent
     */
    public char orderCapacityRaw() {
        return orderCapacity;
    }

    /**
     * Scope value
     *
     * @return the value, or null when the protocol declares none for {@link #scopeRaw()}
     */
    public Scope scope() {
        return Scope.get(scopeRaw());
    }

    /**
     * Scope value
     *
     * @return the value as it was sent
     */
    public char scopeRaw() {
        return scope;
    }

    /**
     * Spaces when not set
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text ownerId() {
        return ownerId;
    }

    /**
     * Spaces when not set
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text giveup() {
        return giveup;
    }

    /**
     * Spaces when not set
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text cmta() {
        return cmta;
    }

    /**
     * ‘S’ = Start ‘U’ = Auction Update ‘E’ = End of Auction
     *
     * @return the value, or null when the protocol declares none for {@link #auctionEventRaw()}
     */
    public AuctionEvent auctionEvent() {
        return AuctionEvent.get(auctionEventRaw());
    }

    /**
     * ‘S’ = Start ‘U’ = Auction Update ‘E’ = End of Auction
     *
     * @return the value as it was sent
     */
    public char auctionEventRaw() {
        return auctionEvent;
    }

    /**
     * ‘E’ = Exposure ‘C’ = Facilitation ‘S’ = Solicitation ‘P’ = PIM
     *
     * @return the value, or null when the protocol declares none for {@link #auctionTypeRaw()}
     */
    public AuctionType auctionType() {
        return AuctionType.get(auctionTypeRaw());
    }

    /**
     * ‘E’ = Exposure ‘C’ = Facilitation ‘S’ = Solicitation ‘P’ = PIM
     *
     * @return the value as it was sent
     */
    public char auctionTypeRaw() {
        return auctionType;
    }

    /**
     * Number of auction Responses. Next two fields repeat that number of times. Allowable values for this field are 0 or 1.
     *
     * @return the value
     */
    public short numberOfResponses() {
        return numberOfResponses;
    }

    /**
     * Auction Response information
     *
     * <p>The list and its entries are the message's own, decoded into again at every decode.</p>
     *
     * @return the entries, as many as {@link #numberOfResponses()} counts
     */
    public AuctionResponseList auctionResponse() {
        return auctionResponseList;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("timestamp=").append(timestamp());
        builder.append(", strategyId=").append(strategyId());
        builder.append(", auctionId=").append(auctionId());
        OrderType orderType = orderType();
        if (orderType == null) {
            builder.append(", orderType=").append(orderTypeRaw());
        }
        else {
            builder.append(", orderType=").append(orderType.name());
        }
        Side side = side();
        if (side == null) {
            builder.append(", side=").append(sideRaw());
        }
        else {
            builder.append(", side=").append(side.name());
        }
        builder.append(", price=").append(price());
        builder.append(", size=").append(size());
        ExecFlag execFlag = execFlag();
        if (execFlag == null) {
            builder.append(", execFlag=").append(execFlagRaw());
        }
        else {
            builder.append(", execFlag=").append(execFlag.name());
        }
        OrderCapacity orderCapacity = orderCapacity();
        if (orderCapacity == null) {
            builder.append(", orderCapacity=").append(orderCapacityRaw());
        }
        else {
            builder.append(", orderCapacity=").append(orderCapacity.name());
        }
        Scope scope = scope();
        if (scope == null) {
            builder.append(", scope=").append(scopeRaw());
        }
        else {
            builder.append(", scope=").append(scope.name());
        }
        builder.append(", ownerId=").append(ownerId());
        builder.append(", giveup=").append(giveup());
        builder.append(", cmta=").append(cmta());
        AuctionEvent auctionEvent = auctionEvent();
        if (auctionEvent == null) {
            builder.append(", auctionEvent=").append(auctionEventRaw());
        }
        else {
            builder.append(", auctionEvent=").append(auctionEvent.name());
        }
        AuctionType auctionType = auctionType();
        if (auctionType == null) {
            builder.append(", auctionType=").append(auctionTypeRaw());
        }
        else {
            builder.append(", auctionType=").append(auctionType.name());
        }
        builder.append(", numberOfResponses=").append(numberOfResponses());
        builder.append(", auctionResponse=[");
        AuctionResponseList entries = auctionResponse();
        for (int index = 0; index < entries.count(); index++) {
            if (index > 0) {
                builder.append(", ");
            }
            entries.get(index).dump(builder);
        }
        builder.append(']');
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
