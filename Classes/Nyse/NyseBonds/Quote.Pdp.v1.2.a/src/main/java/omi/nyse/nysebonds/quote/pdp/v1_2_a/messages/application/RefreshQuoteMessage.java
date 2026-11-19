package omi.nyse.nysebonds.quote.pdp.v1_2_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.AskPriceNumeratorField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.AskSizeField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.BidPriceNumeratorField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.BidSizeField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.CusipField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.ExchangeIdField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.FillerAsciiField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.FlatPricingField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.PriceScaleCodeField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.QuoteConditionField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.QuoteLinkIdField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.SecurityTypeField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.SourceTimeField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.SymbolField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.SymbolIndexField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.fields.TradingActionField;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.types.Field;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.types.Message;
import omi.nyse.nysebonds.quote.pdp.v1_2_a.types.PrintOptions;

/**
 * Represents the RefreshQuoteMessage message from the Quote protocol.
 *
 * <p>Sent in response to a Refresh Quote Request, and automatically when there are intraday symbol additions. The same body as a Quote message with the symbol and Cusip appended.</p>
 */
public final class RefreshQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Refresh Quote Message";

    /**
     * The numerical representation of the symbol.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The quote generation time, in milliseconds since midnight of the same day.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * Identifies a unique quote, allowing quotes to be correlated to the last sale. For future use.
     */
    private final QuoteLinkIdField quoteLinkId = new QuoteLinkIdField();

    /**
     * Ask price for the quote, scaled by the PriceScaleCode.
     */
    private final AskPriceNumeratorField askPriceNumerator = new AskPriceNumeratorField();

    /**
     * Size of the quote on the ask side, in shares.
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Bid price for the quote, scaled by the PriceScaleCode.
     */
    private final BidPriceNumeratorField bidPriceNumerator = new BidPriceNumeratorField();

    /**
     * Size of the quote on the bid side, in shares.
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * The power of ten that is the common denominator for the price numerators in this message. A price of 27.56 is a numerator of 2756 with a PriceScaleCode of 2.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * The originating exchange of the quote.
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * The security type for this message.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * The condition of the quote. Nyse Arca will only send quote condition R.
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Whether flat pricing or interest pricing is in effect.
     */
    private final FlatPricingField flatPricing = new FlatPricingField();

    /**
     * The current state of trading for this bond.
     */
    private final TradingActionField tradingAction = new TradingActionField();

    /**
     * Reserved for future use.
     */
    private final FillerAsciiField fillerAscii = new FillerAsciiField();

    /**
     * The bond symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The bond Cusip.
     */
    private final CusipField cusip = new CusipField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolIndex, sourceTime, quoteLinkId, askPriceNumerator, askSize, bidPriceNumerator, bidSize, priceScaleCode, exchangeId, securityType, quoteCondition, flatPricing, tradingAction, fillerAscii, symbol, cusip);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The numerical representation of the symbol.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The quote generation time, in milliseconds since midnight of the same day.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * Identifies a unique quote, allowing quotes to be correlated to the last sale. For future use.
     *
     * @return the QuoteLinkId field
     */
    public QuoteLinkIdField quoteLinkId() {
        return quoteLinkId;
    }

    /**
     * Ask price for the quote, scaled by the PriceScaleCode.
     *
     * @return the AskPriceNumerator field
     */
    public AskPriceNumeratorField askPriceNumerator() {
        return askPriceNumerator;
    }

    /**
     * Size of the quote on the ask side, in shares.
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Bid price for the quote, scaled by the PriceScaleCode.
     *
     * @return the BidPriceNumerator field
     */
    public BidPriceNumeratorField bidPriceNumerator() {
        return bidPriceNumerator;
    }

    /**
     * Size of the quote on the bid side, in shares.
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * The power of ten that is the common denominator for the price numerators in this message. A price of 27.56 is a numerator of 2756 with a PriceScaleCode of 2.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * The originating exchange of the quote.
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * The security type for this message.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * The condition of the quote. Nyse Arca will only send quote condition R.
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Whether flat pricing or interest pricing is in effect.
     *
     * @return the FlatPricing field
     */
    public FlatPricingField flatPricing() {
        return flatPricing;
    }

    /**
     * The current state of trading for this bond.
     *
     * @return the TradingAction field
     */
    public TradingActionField tradingAction() {
        return tradingAction;
    }

    /**
     * Reserved for future use.
     *
     * @return the FillerAscii field
     */
    public FillerAsciiField fillerAscii() {
        return fillerAscii;
    }

    /**
     * The bond symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * The bond Cusip.
     *
     * @return the Cusip field
     */
    public CusipField cusip() {
        return cusip;
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
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!quoteLinkId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteLinkIdField.BYTE_LENGTH;
        if (!askPriceNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceNumeratorField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!bidPriceNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceNumeratorField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!flatPricing.parse(data, cursor)) {
            return false;
        }
        cursor += FlatPricingField.BYTE_LENGTH;
        if (!tradingAction.parse(data, cursor)) {
            return false;
        }
        cursor += TradingActionField.BYTE_LENGTH;
        if (!fillerAscii.parse(data, cursor)) {
            return false;
        }
        cursor += FillerAsciiField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        return cusip.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolIndex.encode(data, cursor);
        cursor = sourceTime.encode(data, cursor);
        cursor = quoteLinkId.encode(data, cursor);
        cursor = askPriceNumerator.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = bidPriceNumerator.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = flatPricing.encode(data, cursor);
        cursor = tradingAction.encode(data, cursor);
        cursor = fillerAscii.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = cusip.encode(data, cursor);
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
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SourceTime" -> Optional.of(sourceTime);
            case "QuoteLinkId" -> Optional.of(quoteLinkId);
            case "AskPriceNumerator" -> Optional.of(askPriceNumerator);
            case "AskSize" -> Optional.of(askSize);
            case "BidPriceNumerator" -> Optional.of(bidPriceNumerator);
            case "BidSize" -> Optional.of(bidSize);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "ExchangeId" -> Optional.of(exchangeId);
            case "SecurityType" -> Optional.of(securityType);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "FlatPricing" -> Optional.of(flatPricing);
            case "TradingAction" -> Optional.of(tradingAction);
            case "FillerAscii" -> Optional.of(fillerAscii);
            case "Symbol" -> Optional.of(symbol);
            case "Cusip" -> Optional.of(cusip);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RefreshQuoteMessage message)) {
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
        if (!(other instanceof RefreshQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
