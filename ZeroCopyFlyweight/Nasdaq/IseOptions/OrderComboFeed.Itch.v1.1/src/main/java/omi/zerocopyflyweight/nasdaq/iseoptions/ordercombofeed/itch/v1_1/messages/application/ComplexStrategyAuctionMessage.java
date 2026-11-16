package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.AuctionEvent;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.AuctionType;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.ExecFlag;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderCapacity;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OrderType;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Scope;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.Side;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.AuctionResponseEntry;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.AuctionResponseList;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.TextView;

/**
 * Represents the ComplexStrategyAuctionMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
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

    private final TextView ownerIdView = new TextView(6, (byte) ' ', false, true);

    private final TextView giveupView = new TextView(6, (byte) ' ', false, true);

    private final TextView cmtaView = new TextView(6, (byte) ' ', false, true);

    private final AuctionResponseList auctionResponseList = new AuctionResponseList();

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public ComplexStrategyAuctionMessage() {
    }

    @Override
    public String name() {
        return NAME;
    }

    /**
     * Gets the message's length: its fixed members and as many Auction Response entries as {@link #numberOfResponses()} counts.
     *
     * @return its length in bytes, or {@link Integer#MAX_VALUE} when the count reaches past what an array holds
     */
    @Override
    public int byteLength() {
        long length = AUCTION_RESPONSE_OFFSET + (long) numberOfResponses() * AuctionResponseEntry.BYTE_LENGTH;
        return length > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) length;
    }

    @Override
    protected int minimumByteLength() {
        return MINIMUM_BYTE_LENGTH;
    }

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the value
     */
    public long timestamp() {
        return Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the value
     */
    public long strategyId() {
        return Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Integer which uniquely identifies the auction.
     *
     * @return the value
     */
    public long auctionId() {
        return Codec.getIntBE(buffer, offset + AUCTION_ID_OFFSET) & 0xFFFFFFFFL;
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
        return (char) (buffer[offset + ORDER_TYPE_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + SIDE_OFFSET] & 0xFF);
    }

    /**
     * Price of the order in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public int price() {
        return Codec.getIntBE(buffer, offset + PRICE_OFFSET);
    }

    /**
     * Size of the order
     *
     * @return the value
     */
    public long size() {
        return Codec.getIntBE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
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
        return (char) (buffer[offset + EXEC_FLAG_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + ORDER_CAPACITY_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + SCOPE_OFFSET] & 0xFF);
    }

    /**
     * Spaces when not set
     *
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView ownerId() {
        return ownerIdView.wrap(buffer, offset + OWNER_ID_OFFSET);
    }

    /**
     * Spaces when not set
     *
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView giveup() {
        return giveupView.wrap(buffer, offset + GIVEUP_OFFSET);
    }

    /**
     * Spaces when not set
     *
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView cmta() {
        return cmtaView.wrap(buffer, offset + CMTA_OFFSET);
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
        return (char) (buffer[offset + AUCTION_EVENT_OFFSET] & 0xFF);
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
        return (char) (buffer[offset + AUCTION_TYPE_OFFSET] & 0xFF);
    }

    /**
     * Number of auction Responses. Next two fields repeat that number of times. Allowable values for this field are 0 or 1.
     *
     * @return the value
     */
    public short numberOfResponses() {
        return (short) (buffer[offset + NUMBER_OF_RESPONSES_OFFSET] & 0xFF);
    }

    /**
     * Auction Response information
     *
     * <p>The list is rewrapped at every call and is valid as long as this flyweight.</p>
     *
     * @return the entries, as many as {@link #numberOfResponses()} counts
     */
    public AuctionResponseList auctionResponse() {
        return auctionResponseList.wrap(buffer, offset + AUCTION_RESPONSE_OFFSET, (int) numberOfResponses());
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
