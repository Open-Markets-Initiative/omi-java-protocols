package omi.bme.meff.topofbook5.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskOrders1Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskOrders2Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskOrders3Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskOrders4Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskOrders5Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskPx1Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskPx2Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskPx3Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskPx4Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskPx5Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskSize1Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskSize2Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskSize3Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskSize4Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.AskSize5Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidOrders1Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidOrders2Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidOrders3Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidOrders4Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidOrders5Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidPx1Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidPx2Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidPx3Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidPx4Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidPx5Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidSize1Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidSize2Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidSize3Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidSize4Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BidSize5Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.BuyRfQsNumberField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.MidBuyPriceField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.MidBuyVolumeField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.MidSellPriceField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.MidSellVolumeField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.RfqidField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.SellRfQsNumberField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.TradingSessionIdField;
import omi.bme.meff.topofbook5.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.meff.topofbook5.bmegate.v1_6.types.Field;
import omi.bme.meff.topofbook5.bmegate.v1_6.types.Message;
import omi.bme.meff.topofbook5.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the RfqMarketPreTransparencyInformationMessage message from the TopOfBook5 protocol.
 *
 * <p>Used by the server to communicate price information about RFQs. The contents of the RFQID field match those of the field IOIID in the corresponding Indication of Interest message</p>
 */
public final class RfqMarketPreTransparencyInformationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 189;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Rfq Market Pre Transparency Information Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * RFQ identifier
     */
    private final RfqidField rfqid = new RfqidField();

    /**
     * Trading mode
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * Mid price of buying RFQs
     */
    private final MidBuyPriceField midBuyPrice = new MidBuyPriceField();

    /**
     * Mid volume of buying RFQs
     */
    private final MidBuyVolumeField midBuyVolume = new MidBuyVolumeField();

    /**
     * Number of buying RFQs
     */
    private final BuyRfQsNumberField buyRfQsNumber = new BuyRfQsNumberField();

    /**
     * Mid price of selling RFQs
     */
    private final MidSellPriceField midSellPrice = new MidSellPriceField();

    /**
     * Mid volume of selling RFQs
     */
    private final MidSellVolumeField midSellVolume = new MidSellVolumeField();

    /**
     * Number of selling RFQs
     */
    private final SellRfQsNumberField sellRfQsNumber = new SellRfQsNumberField();

    /**
     * Buy number of orders
     */
    private final BidOrders1Field bidOrders1 = new BidOrders1Field();

    /**
     * Buy volume
     */
    private final BidSize1Field bidSize1 = new BidSize1Field();

    /**
     * Buy price
     */
    private final BidPx1Field bidPx1 = new BidPx1Field();

    /**
     * Sell number of orders
     */
    private final AskOrders1Field askOrders1 = new AskOrders1Field();

    /**
     * Sell volume
     */
    private final AskSize1Field askSize1 = new AskSize1Field();

    /**
     * Sell price
     */
    private final AskPx1Field askPx1 = new AskPx1Field();

    /**
     * Buy number of orders level 2
     */
    private final BidOrders2Field bidOrders2 = new BidOrders2Field();

    /**
     * Buy volume level 2
     */
    private final BidSize2Field bidSize2 = new BidSize2Field();

    /**
     * Buy price level 2
     */
    private final BidPx2Field bidPx2 = new BidPx2Field();

    /**
     * Sell number of orders level 2
     */
    private final AskOrders2Field askOrders2 = new AskOrders2Field();

    /**
     * Sell volume level 2
     */
    private final AskSize2Field askSize2 = new AskSize2Field();

    /**
     * Sell price level 2
     */
    private final AskPx2Field askPx2 = new AskPx2Field();

    /**
     * Buy number of orders level 3
     */
    private final BidOrders3Field bidOrders3 = new BidOrders3Field();

    /**
     * Buy volume level 3
     */
    private final BidSize3Field bidSize3 = new BidSize3Field();

    /**
     * Buy price level 3
     */
    private final BidPx3Field bidPx3 = new BidPx3Field();

    /**
     * Sell number of orders level 3
     */
    private final AskOrders3Field askOrders3 = new AskOrders3Field();

    /**
     * Sell volume level 3
     */
    private final AskSize3Field askSize3 = new AskSize3Field();

    /**
     * Sell price level 3
     */
    private final AskPx3Field askPx3 = new AskPx3Field();

    /**
     * Buy number of orders level 4
     */
    private final BidOrders4Field bidOrders4 = new BidOrders4Field();

    /**
     * Buy volume level 4
     */
    private final BidSize4Field bidSize4 = new BidSize4Field();

    /**
     * Buy price level 4
     */
    private final BidPx4Field bidPx4 = new BidPx4Field();

    /**
     * Sell number of orders level 4
     */
    private final AskOrders4Field askOrders4 = new AskOrders4Field();

    /**
     * Sell volume level 4
     */
    private final AskSize4Field askSize4 = new AskSize4Field();

    /**
     * Sell price level 4
     */
    private final AskPx4Field askPx4 = new AskPx4Field();

    /**
     * Buy number of orders level 5
     */
    private final BidOrders5Field bidOrders5 = new BidOrders5Field();

    /**
     * Buy volume level 5
     */
    private final BidSize5Field bidSize5 = new BidSize5Field();

    /**
     * Buy price level 5
     */
    private final BidPx5Field bidPx5 = new BidPx5Field();

    /**
     * Sell number of orders level 5
     */
    private final AskOrders5Field askOrders5 = new AskOrders5Field();

    /**
     * Sell volume level 5
     */
    private final AskSize5Field askSize5 = new AskSize5Field();

    /**
     * Sell price level 5
     */
    private final AskPx5Field askPx5 = new AskPx5Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, rfqid, tradingSessionId, securityCode, transactionDateAndTime, midBuyPrice, midBuyVolume, buyRfQsNumber, midSellPrice, midSellVolume, sellRfQsNumber, bidOrders1, bidSize1, bidPx1, askOrders1, askSize1, askPx1, bidOrders2, bidSize2, bidPx2, askOrders2, askSize2, askPx2, bidOrders3, bidSize3, bidPx3, askOrders3, askSize3, askPx3, bidOrders4, bidSize4, bidPx4, askOrders4, askSize4, askPx4, bidOrders5, bidSize5, bidPx5, askOrders5, askSize5, askPx5);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * RFQ identifier
     *
     * @return the Rfqid field
     */
    public RfqidField rfqid() {
        return rfqid;
    }

    /**
     * Trading mode
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Mid price of buying RFQs
     *
     * @return the MidBuyPrice field
     */
    public MidBuyPriceField midBuyPrice() {
        return midBuyPrice;
    }

    /**
     * Mid volume of buying RFQs
     *
     * @return the MidBuyVolume field
     */
    public MidBuyVolumeField midBuyVolume() {
        return midBuyVolume;
    }

    /**
     * Number of buying RFQs
     *
     * @return the BuyRfQsNumber field
     */
    public BuyRfQsNumberField buyRfQsNumber() {
        return buyRfQsNumber;
    }

    /**
     * Mid price of selling RFQs
     *
     * @return the MidSellPrice field
     */
    public MidSellPriceField midSellPrice() {
        return midSellPrice;
    }

    /**
     * Mid volume of selling RFQs
     *
     * @return the MidSellVolume field
     */
    public MidSellVolumeField midSellVolume() {
        return midSellVolume;
    }

    /**
     * Number of selling RFQs
     *
     * @return the SellRfQsNumber field
     */
    public SellRfQsNumberField sellRfQsNumber() {
        return sellRfQsNumber;
    }

    /**
     * Buy number of orders
     *
     * @return the BidOrders1 field
     */
    public BidOrders1Field bidOrders1() {
        return bidOrders1;
    }

    /**
     * Buy volume
     *
     * @return the BidSize1 field
     */
    public BidSize1Field bidSize1() {
        return bidSize1;
    }

    /**
     * Buy price
     *
     * @return the BidPx1 field
     */
    public BidPx1Field bidPx1() {
        return bidPx1;
    }

    /**
     * Sell number of orders
     *
     * @return the AskOrders1 field
     */
    public AskOrders1Field askOrders1() {
        return askOrders1;
    }

    /**
     * Sell volume
     *
     * @return the AskSize1 field
     */
    public AskSize1Field askSize1() {
        return askSize1;
    }

    /**
     * Sell price
     *
     * @return the AskPx1 field
     */
    public AskPx1Field askPx1() {
        return askPx1;
    }

    /**
     * Buy number of orders level 2
     *
     * @return the BidOrders2 field
     */
    public BidOrders2Field bidOrders2() {
        return bidOrders2;
    }

    /**
     * Buy volume level 2
     *
     * @return the BidSize2 field
     */
    public BidSize2Field bidSize2() {
        return bidSize2;
    }

    /**
     * Buy price level 2
     *
     * @return the BidPx2 field
     */
    public BidPx2Field bidPx2() {
        return bidPx2;
    }

    /**
     * Sell number of orders level 2
     *
     * @return the AskOrders2 field
     */
    public AskOrders2Field askOrders2() {
        return askOrders2;
    }

    /**
     * Sell volume level 2
     *
     * @return the AskSize2 field
     */
    public AskSize2Field askSize2() {
        return askSize2;
    }

    /**
     * Sell price level 2
     *
     * @return the AskPx2 field
     */
    public AskPx2Field askPx2() {
        return askPx2;
    }

    /**
     * Buy number of orders level 3
     *
     * @return the BidOrders3 field
     */
    public BidOrders3Field bidOrders3() {
        return bidOrders3;
    }

    /**
     * Buy volume level 3
     *
     * @return the BidSize3 field
     */
    public BidSize3Field bidSize3() {
        return bidSize3;
    }

    /**
     * Buy price level 3
     *
     * @return the BidPx3 field
     */
    public BidPx3Field bidPx3() {
        return bidPx3;
    }

    /**
     * Sell number of orders level 3
     *
     * @return the AskOrders3 field
     */
    public AskOrders3Field askOrders3() {
        return askOrders3;
    }

    /**
     * Sell volume level 3
     *
     * @return the AskSize3 field
     */
    public AskSize3Field askSize3() {
        return askSize3;
    }

    /**
     * Sell price level 3
     *
     * @return the AskPx3 field
     */
    public AskPx3Field askPx3() {
        return askPx3;
    }

    /**
     * Buy number of orders level 4
     *
     * @return the BidOrders4 field
     */
    public BidOrders4Field bidOrders4() {
        return bidOrders4;
    }

    /**
     * Buy volume level 4
     *
     * @return the BidSize4 field
     */
    public BidSize4Field bidSize4() {
        return bidSize4;
    }

    /**
     * Buy price level 4
     *
     * @return the BidPx4 field
     */
    public BidPx4Field bidPx4() {
        return bidPx4;
    }

    /**
     * Sell number of orders level 4
     *
     * @return the AskOrders4 field
     */
    public AskOrders4Field askOrders4() {
        return askOrders4;
    }

    /**
     * Sell volume level 4
     *
     * @return the AskSize4 field
     */
    public AskSize4Field askSize4() {
        return askSize4;
    }

    /**
     * Sell price level 4
     *
     * @return the AskPx4 field
     */
    public AskPx4Field askPx4() {
        return askPx4;
    }

    /**
     * Buy number of orders level 5
     *
     * @return the BidOrders5 field
     */
    public BidOrders5Field bidOrders5() {
        return bidOrders5;
    }

    /**
     * Buy volume level 5
     *
     * @return the BidSize5 field
     */
    public BidSize5Field bidSize5() {
        return bidSize5;
    }

    /**
     * Buy price level 5
     *
     * @return the BidPx5 field
     */
    public BidPx5Field bidPx5() {
        return bidPx5;
    }

    /**
     * Sell number of orders level 5
     *
     * @return the AskOrders5 field
     */
    public AskOrders5Field askOrders5() {
        return askOrders5;
    }

    /**
     * Sell volume level 5
     *
     * @return the AskSize5 field
     */
    public AskSize5Field askSize5() {
        return askSize5;
    }

    /**
     * Sell price level 5
     *
     * @return the AskPx5 field
     */
    public AskPx5Field askPx5() {
        return askPx5;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionDateAndTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!rfqid.parse(data, cursor)) {
            return false;
        }
        cursor += RfqidField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!midBuyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MidBuyPriceField.BYTE_LENGTH;
        if (!midBuyVolume.parse(data, cursor)) {
            return false;
        }
        cursor += MidBuyVolumeField.BYTE_LENGTH;
        if (!buyRfQsNumber.parse(data, cursor)) {
            return false;
        }
        cursor += BuyRfQsNumberField.BYTE_LENGTH;
        if (!midSellPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MidSellPriceField.BYTE_LENGTH;
        if (!midSellVolume.parse(data, cursor)) {
            return false;
        }
        cursor += MidSellVolumeField.BYTE_LENGTH;
        if (!sellRfQsNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SellRfQsNumberField.BYTE_LENGTH;
        if (!bidOrders1.parse(data, cursor)) {
            return false;
        }
        cursor += BidOrders1Field.BYTE_LENGTH;
        if (!bidSize1.parse(data, cursor)) {
            return false;
        }
        cursor += BidSize1Field.BYTE_LENGTH;
        if (!bidPx1.parse(data, cursor)) {
            return false;
        }
        cursor += BidPx1Field.BYTE_LENGTH;
        if (!askOrders1.parse(data, cursor)) {
            return false;
        }
        cursor += AskOrders1Field.BYTE_LENGTH;
        if (!askSize1.parse(data, cursor)) {
            return false;
        }
        cursor += AskSize1Field.BYTE_LENGTH;
        if (!askPx1.parse(data, cursor)) {
            return false;
        }
        cursor += AskPx1Field.BYTE_LENGTH;
        if (!bidOrders2.parse(data, cursor)) {
            return false;
        }
        cursor += BidOrders2Field.BYTE_LENGTH;
        if (!bidSize2.parse(data, cursor)) {
            return false;
        }
        cursor += BidSize2Field.BYTE_LENGTH;
        if (!bidPx2.parse(data, cursor)) {
            return false;
        }
        cursor += BidPx2Field.BYTE_LENGTH;
        if (!askOrders2.parse(data, cursor)) {
            return false;
        }
        cursor += AskOrders2Field.BYTE_LENGTH;
        if (!askSize2.parse(data, cursor)) {
            return false;
        }
        cursor += AskSize2Field.BYTE_LENGTH;
        if (!askPx2.parse(data, cursor)) {
            return false;
        }
        cursor += AskPx2Field.BYTE_LENGTH;
        if (!bidOrders3.parse(data, cursor)) {
            return false;
        }
        cursor += BidOrders3Field.BYTE_LENGTH;
        if (!bidSize3.parse(data, cursor)) {
            return false;
        }
        cursor += BidSize3Field.BYTE_LENGTH;
        if (!bidPx3.parse(data, cursor)) {
            return false;
        }
        cursor += BidPx3Field.BYTE_LENGTH;
        if (!askOrders3.parse(data, cursor)) {
            return false;
        }
        cursor += AskOrders3Field.BYTE_LENGTH;
        if (!askSize3.parse(data, cursor)) {
            return false;
        }
        cursor += AskSize3Field.BYTE_LENGTH;
        if (!askPx3.parse(data, cursor)) {
            return false;
        }
        cursor += AskPx3Field.BYTE_LENGTH;
        if (!bidOrders4.parse(data, cursor)) {
            return false;
        }
        cursor += BidOrders4Field.BYTE_LENGTH;
        if (!bidSize4.parse(data, cursor)) {
            return false;
        }
        cursor += BidSize4Field.BYTE_LENGTH;
        if (!bidPx4.parse(data, cursor)) {
            return false;
        }
        cursor += BidPx4Field.BYTE_LENGTH;
        if (!askOrders4.parse(data, cursor)) {
            return false;
        }
        cursor += AskOrders4Field.BYTE_LENGTH;
        if (!askSize4.parse(data, cursor)) {
            return false;
        }
        cursor += AskSize4Field.BYTE_LENGTH;
        if (!askPx4.parse(data, cursor)) {
            return false;
        }
        cursor += AskPx4Field.BYTE_LENGTH;
        if (!bidOrders5.parse(data, cursor)) {
            return false;
        }
        cursor += BidOrders5Field.BYTE_LENGTH;
        if (!bidSize5.parse(data, cursor)) {
            return false;
        }
        cursor += BidSize5Field.BYTE_LENGTH;
        if (!bidPx5.parse(data, cursor)) {
            return false;
        }
        cursor += BidPx5Field.BYTE_LENGTH;
        if (!askOrders5.parse(data, cursor)) {
            return false;
        }
        cursor += AskOrders5Field.BYTE_LENGTH;
        if (!askSize5.parse(data, cursor)) {
            return false;
        }
        cursor += AskSize5Field.BYTE_LENGTH;
        return askPx5.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = rfqid.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = midBuyPrice.encode(data, cursor);
        cursor = midBuyVolume.encode(data, cursor);
        cursor = buyRfQsNumber.encode(data, cursor);
        cursor = midSellPrice.encode(data, cursor);
        cursor = midSellVolume.encode(data, cursor);
        cursor = sellRfQsNumber.encode(data, cursor);
        cursor = bidOrders1.encode(data, cursor);
        cursor = bidSize1.encode(data, cursor);
        cursor = bidPx1.encode(data, cursor);
        cursor = askOrders1.encode(data, cursor);
        cursor = askSize1.encode(data, cursor);
        cursor = askPx1.encode(data, cursor);
        cursor = bidOrders2.encode(data, cursor);
        cursor = bidSize2.encode(data, cursor);
        cursor = bidPx2.encode(data, cursor);
        cursor = askOrders2.encode(data, cursor);
        cursor = askSize2.encode(data, cursor);
        cursor = askPx2.encode(data, cursor);
        cursor = bidOrders3.encode(data, cursor);
        cursor = bidSize3.encode(data, cursor);
        cursor = bidPx3.encode(data, cursor);
        cursor = askOrders3.encode(data, cursor);
        cursor = askSize3.encode(data, cursor);
        cursor = askPx3.encode(data, cursor);
        cursor = bidOrders4.encode(data, cursor);
        cursor = bidSize4.encode(data, cursor);
        cursor = bidPx4.encode(data, cursor);
        cursor = askOrders4.encode(data, cursor);
        cursor = askSize4.encode(data, cursor);
        cursor = askPx4.encode(data, cursor);
        cursor = bidOrders5.encode(data, cursor);
        cursor = bidSize5.encode(data, cursor);
        cursor = bidPx5.encode(data, cursor);
        cursor = askOrders5.encode(data, cursor);
        cursor = askSize5.encode(data, cursor);
        cursor = askPx5.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "Rfqid" -> Optional.of(rfqid);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "MidBuyPrice" -> Optional.of(midBuyPrice);
            case "MidBuyVolume" -> Optional.of(midBuyVolume);
            case "BuyRfQsNumber" -> Optional.of(buyRfQsNumber);
            case "MidSellPrice" -> Optional.of(midSellPrice);
            case "MidSellVolume" -> Optional.of(midSellVolume);
            case "SellRfQsNumber" -> Optional.of(sellRfQsNumber);
            case "BidOrders1" -> Optional.of(bidOrders1);
            case "BidSize1" -> Optional.of(bidSize1);
            case "BidPx1" -> Optional.of(bidPx1);
            case "AskOrders1" -> Optional.of(askOrders1);
            case "AskSize1" -> Optional.of(askSize1);
            case "AskPx1" -> Optional.of(askPx1);
            case "BidOrders2" -> Optional.of(bidOrders2);
            case "BidSize2" -> Optional.of(bidSize2);
            case "BidPx2" -> Optional.of(bidPx2);
            case "AskOrders2" -> Optional.of(askOrders2);
            case "AskSize2" -> Optional.of(askSize2);
            case "AskPx2" -> Optional.of(askPx2);
            case "BidOrders3" -> Optional.of(bidOrders3);
            case "BidSize3" -> Optional.of(bidSize3);
            case "BidPx3" -> Optional.of(bidPx3);
            case "AskOrders3" -> Optional.of(askOrders3);
            case "AskSize3" -> Optional.of(askSize3);
            case "AskPx3" -> Optional.of(askPx3);
            case "BidOrders4" -> Optional.of(bidOrders4);
            case "BidSize4" -> Optional.of(bidSize4);
            case "BidPx4" -> Optional.of(bidPx4);
            case "AskOrders4" -> Optional.of(askOrders4);
            case "AskSize4" -> Optional.of(askSize4);
            case "AskPx4" -> Optional.of(askPx4);
            case "BidOrders5" -> Optional.of(bidOrders5);
            case "BidSize5" -> Optional.of(bidSize5);
            case "BidPx5" -> Optional.of(bidPx5);
            case "AskOrders5" -> Optional.of(askOrders5);
            case "AskSize5" -> Optional.of(askSize5);
            case "AskPx5" -> Optional.of(askPx5);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RfqMarketPreTransparencyInformationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RfqMarketPreTransparencyInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
