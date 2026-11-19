package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AskBestOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidBestOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BidaskTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BranchNameField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataSeqNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.OriginalPriceCompareRemainingQuantityOfOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.OriginalQuoteNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.OriginalQuotePriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PriceCompareRemainingQuantityOfOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.PriceField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ProcessTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.QuantityField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.QuoteNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.RemainingQuantityOfAskBestOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.RemainingQuantityOfBidBestOrderField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SecuritiesCompanyNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SubscriptionTimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalRemainingQuantityOfAskField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalRemainingQuantityOfBidField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the KOtcQuoteMessage message from the Koscom protocol.
 *
 * <p>K-OTC Quote. Bid/ask quote with remaining quantity at the best price.</p>
 */
public final class KOtcQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 195;

    /**
     * This message's declared name.
     */
    public static final String NAME = "K Otc Quote Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 161, 33 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * Transmission seq. number.
     */
    private final DataSeqNumberField dataSeqNumber = new DataSeqNumberField();

    /**
     * 1: normal 2: correction 3: cancellation.
     */
    private final ProcessTypeField processType = new ProcessTypeField();

    /**
     * Quote number in case of normal process.
     */
    private final QuoteNumberField quoteNumber = new QuoteNumberField();

    /**
     * Normal: 0, in case of correction/cancellation, relevant original quote is number.
     */
    private final OriginalQuoteNumberField originalQuoteNumber = new OriginalQuoteNumberField();

    /**
     * Normal: 0, in case of correction/cancellation, original price.
     */
    private final OriginalQuotePriceField originalQuotePrice = new OriginalQuotePriceField();

    /**
     * 1: ask, 2:bid.
     */
    private final BidaskTypeField bidaskType = new BidaskTypeField();

    /**
     * Normal: order price Correction: correction price.
     */
    private final PriceField price = new PriceField();

    /**
     * Normal: order quantity Correction/cancellation: actual correction/cancellation quantity.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Subscription time.
     */
    private final SubscriptionTimeField subscriptionTime = new SubscriptionTimeField();

    /**
     * Total remaining quantity of ask.
     */
    private final TotalRemainingQuantityOfAskField totalRemainingQuantityOfAsk = new TotalRemainingQuantityOfAskField();

    /**
     * Total remaining quantity of bid.
     */
    private final TotalRemainingQuantityOfBidField totalRemainingQuantityOfBid = new TotalRemainingQuantityOfBidField();

    /**
     * Ask best order.
     */
    private final AskBestOrderField askBestOrder = new AskBestOrderField();

    /**
     * Remaining quantity of ask best order.
     */
    private final RemainingQuantityOfAskBestOrderField remainingQuantityOfAskBestOrder = new RemainingQuantityOfAskBestOrderField();

    /**
     * Bid best order.
     */
    private final BidBestOrderField bidBestOrder = new BidBestOrderField();

    /**
     * Remaining quantity of bid best order.
     */
    private final RemainingQuantityOfBidBestOrderField remainingQuantityOfBidBestOrder = new RemainingQuantityOfBidBestOrderField();

    /**
     * Normal: remaining quantity of order Correction: remaining quantity of correction.
     */
    private final PriceCompareRemainingQuantityOfOrderField priceCompareRemainingQuantityOfOrder = new PriceCompareRemainingQuantityOfOrderField();

    /**
     * Normal: 0, in case of correction/cancellation, original remaining quantity.
     */
    private final OriginalPriceCompareRemainingQuantityOfOrderField originalPriceCompareRemainingQuantityOfOrder = new OriginalPriceCompareRemainingQuantityOfOrderField();

    /**
     * Refer to trading original type code.
     */
    private final SecuritiesCompanyNumberField securitiesCompanyNumber = new SecuritiesCompanyNumberField();

    /**
     * SPACE.
     */
    private final BranchNameField branchName = new BranchNameField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, dataSeqNumber, processType, quoteNumber, originalQuoteNumber, originalQuotePrice, bidaskType, price, quantity, subscriptionTime, totalRemainingQuantityOfAsk, totalRemainingQuantityOfBid, askBestOrder, remainingQuantityOfAskBestOrder, bidBestOrder, remainingQuantityOfBidBestOrder, priceCompareRemainingQuantityOfOrder, originalPriceCompareRemainingQuantityOfOrder, securitiesCompanyNumber, branchName, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Transmission seq. number.
     *
     * @return the DataSeqNumber field
     */
    public DataSeqNumberField dataSeqNumber() {
        return dataSeqNumber;
    }

    /**
     * 1: normal 2: correction 3: cancellation.
     *
     * @return the ProcessType field
     */
    public ProcessTypeField processType() {
        return processType;
    }

    /**
     * Quote number in case of normal process.
     *
     * @return the QuoteNumber field
     */
    public QuoteNumberField quoteNumber() {
        return quoteNumber;
    }

    /**
     * Normal: 0, in case of correction/cancellation, relevant original quote is number.
     *
     * @return the OriginalQuoteNumber field
     */
    public OriginalQuoteNumberField originalQuoteNumber() {
        return originalQuoteNumber;
    }

    /**
     * Normal: 0, in case of correction/cancellation, original price.
     *
     * @return the OriginalQuotePrice field
     */
    public OriginalQuotePriceField originalQuotePrice() {
        return originalQuotePrice;
    }

    /**
     * 1: ask, 2:bid.
     *
     * @return the BidaskType field
     */
    public BidaskTypeField bidaskType() {
        return bidaskType;
    }

    /**
     * Normal: order price Correction: correction price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Normal: order quantity Correction/cancellation: actual correction/cancellation quantity.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Subscription time.
     *
     * @return the SubscriptionTime field
     */
    public SubscriptionTimeField subscriptionTime() {
        return subscriptionTime;
    }

    /**
     * Total remaining quantity of ask.
     *
     * @return the TotalRemainingQuantityOfAsk field
     */
    public TotalRemainingQuantityOfAskField totalRemainingQuantityOfAsk() {
        return totalRemainingQuantityOfAsk;
    }

    /**
     * Total remaining quantity of bid.
     *
     * @return the TotalRemainingQuantityOfBid field
     */
    public TotalRemainingQuantityOfBidField totalRemainingQuantityOfBid() {
        return totalRemainingQuantityOfBid;
    }

    /**
     * Ask best order.
     *
     * @return the AskBestOrder field
     */
    public AskBestOrderField askBestOrder() {
        return askBestOrder;
    }

    /**
     * Remaining quantity of ask best order.
     *
     * @return the RemainingQuantityOfAskBestOrder field
     */
    public RemainingQuantityOfAskBestOrderField remainingQuantityOfAskBestOrder() {
        return remainingQuantityOfAskBestOrder;
    }

    /**
     * Bid best order.
     *
     * @return the BidBestOrder field
     */
    public BidBestOrderField bidBestOrder() {
        return bidBestOrder;
    }

    /**
     * Remaining quantity of bid best order.
     *
     * @return the RemainingQuantityOfBidBestOrder field
     */
    public RemainingQuantityOfBidBestOrderField remainingQuantityOfBidBestOrder() {
        return remainingQuantityOfBidBestOrder;
    }

    /**
     * Normal: remaining quantity of order Correction: remaining quantity of correction.
     *
     * @return the PriceCompareRemainingQuantityOfOrder field
     */
    public PriceCompareRemainingQuantityOfOrderField priceCompareRemainingQuantityOfOrder() {
        return priceCompareRemainingQuantityOfOrder;
    }

    /**
     * Normal: 0, in case of correction/cancellation, original remaining quantity.
     *
     * @return the OriginalPriceCompareRemainingQuantityOfOrder field
     */
    public OriginalPriceCompareRemainingQuantityOfOrderField originalPriceCompareRemainingQuantityOfOrder() {
        return originalPriceCompareRemainingQuantityOfOrder;
    }

    /**
     * Refer to trading original type code.
     *
     * @return the SecuritiesCompanyNumber field
     */
    public SecuritiesCompanyNumberField securitiesCompanyNumber() {
        return securitiesCompanyNumber;
    }

    /**
     * SPACE.
     *
     * @return the BranchName field
     */
    public BranchNameField branchName() {
        return branchName;
    }

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     *
     * @return the EndKeyword field
     */
    public EndKeywordField endKeyword() {
        return endKeyword;
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
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!dataSeqNumber.parse(data, cursor)) {
            return false;
        }
        cursor += DataSeqNumberField.BYTE_LENGTH;
        if (!processType.parse(data, cursor)) {
            return false;
        }
        cursor += ProcessTypeField.BYTE_LENGTH;
        if (!quoteNumber.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteNumberField.BYTE_LENGTH;
        if (!originalQuoteNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalQuoteNumberField.BYTE_LENGTH;
        if (!originalQuotePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalQuotePriceField.BYTE_LENGTH;
        if (!bidaskType.parse(data, cursor)) {
            return false;
        }
        cursor += BidaskTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!subscriptionTime.parse(data, cursor)) {
            return false;
        }
        cursor += SubscriptionTimeField.BYTE_LENGTH;
        if (!totalRemainingQuantityOfAsk.parse(data, cursor)) {
            return false;
        }
        cursor += TotalRemainingQuantityOfAskField.BYTE_LENGTH;
        if (!totalRemainingQuantityOfBid.parse(data, cursor)) {
            return false;
        }
        cursor += TotalRemainingQuantityOfBidField.BYTE_LENGTH;
        if (!askBestOrder.parse(data, cursor)) {
            return false;
        }
        cursor += AskBestOrderField.BYTE_LENGTH;
        if (!remainingQuantityOfAskBestOrder.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingQuantityOfAskBestOrderField.BYTE_LENGTH;
        if (!bidBestOrder.parse(data, cursor)) {
            return false;
        }
        cursor += BidBestOrderField.BYTE_LENGTH;
        if (!remainingQuantityOfBidBestOrder.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingQuantityOfBidBestOrderField.BYTE_LENGTH;
        if (!priceCompareRemainingQuantityOfOrder.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCompareRemainingQuantityOfOrderField.BYTE_LENGTH;
        if (!originalPriceCompareRemainingQuantityOfOrder.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalPriceCompareRemainingQuantityOfOrderField.BYTE_LENGTH;
        if (!securitiesCompanyNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritiesCompanyNumberField.BYTE_LENGTH;
        if (!branchName.parse(data, cursor)) {
            return false;
        }
        cursor += BranchNameField.BYTE_LENGTH;
        cursor += 33; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = dataSeqNumber.encode(data, cursor);
        cursor = processType.encode(data, cursor);
        cursor = quoteNumber.encode(data, cursor);
        cursor = originalQuoteNumber.encode(data, cursor);
        cursor = originalQuotePrice.encode(data, cursor);
        cursor = bidaskType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = subscriptionTime.encode(data, cursor);
        cursor = totalRemainingQuantityOfAsk.encode(data, cursor);
        cursor = totalRemainingQuantityOfBid.encode(data, cursor);
        cursor = askBestOrder.encode(data, cursor);
        cursor = remainingQuantityOfAskBestOrder.encode(data, cursor);
        cursor = bidBestOrder.encode(data, cursor);
        cursor = remainingQuantityOfBidBestOrder.encode(data, cursor);
        cursor = priceCompareRemainingQuantityOfOrder.encode(data, cursor);
        cursor = originalPriceCompareRemainingQuantityOfOrder.encode(data, cursor);
        cursor = securitiesCompanyNumber.encode(data, cursor);
        cursor = branchName.encode(data, cursor);
        if (buffer != null && buffer.length >= 194) {
            System.arraycopy(buffer, 161, data, cursor, 33); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 33, (byte) 0); // padding
        }
        cursor += 33;
        cursor = endKeyword.encode(data, cursor);
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
            case "Isin" -> Optional.of(isin);
            case "DataSeqNumber" -> Optional.of(dataSeqNumber);
            case "ProcessType" -> Optional.of(processType);
            case "QuoteNumber" -> Optional.of(quoteNumber);
            case "OriginalQuoteNumber" -> Optional.of(originalQuoteNumber);
            case "OriginalQuotePrice" -> Optional.of(originalQuotePrice);
            case "BidaskType" -> Optional.of(bidaskType);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "SubscriptionTime" -> Optional.of(subscriptionTime);
            case "TotalRemainingQuantityOfAsk" -> Optional.of(totalRemainingQuantityOfAsk);
            case "TotalRemainingQuantityOfBid" -> Optional.of(totalRemainingQuantityOfBid);
            case "AskBestOrder" -> Optional.of(askBestOrder);
            case "RemainingQuantityOfAskBestOrder" -> Optional.of(remainingQuantityOfAskBestOrder);
            case "BidBestOrder" -> Optional.of(bidBestOrder);
            case "RemainingQuantityOfBidBestOrder" -> Optional.of(remainingQuantityOfBidBestOrder);
            case "PriceCompareRemainingQuantityOfOrder" -> Optional.of(priceCompareRemainingQuantityOfOrder);
            case "OriginalPriceCompareRemainingQuantityOfOrder" -> Optional.of(originalPriceCompareRemainingQuantityOfOrder);
            case "SecuritiesCompanyNumber" -> Optional.of(securitiesCompanyNumber);
            case "BranchName" -> Optional.of(branchName);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof KOtcQuoteMessage message)) {
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
        if (!(other instanceof KOtcQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
