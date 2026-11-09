package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.AuctionTimeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.AuctionTypeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.CusipIsinField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.ExchangeCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.FlatPricingField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.MarketImbalanceField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.MatchQuantityField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.NyseBondSymbolField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PriceField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PriceScaleCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.QuoteConditionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SecurityTypeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SequenceNumberField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SystemCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.TimeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.TotalImbalanceField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.TradingActionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Field;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.PrintOptions;

/**
 * Represents the ImbalanceMessage message from the DepthOfBook protocol.
 *
 * <p>Sent in response to orders submitted during pending auctions, at the conclusion of the Opening, Market Order and Closing Auctions, and for Halt Auctions. Total and market imbalance volumes are negative for a sell imbalance.</p>
 */
public final class ImbalanceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'W';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Imbalance Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Message creation timestamp in milliseconds since midnight.
     */
    private final TimeField time = new TimeField();

    /**
     * Message sequence number, 1 to 2147483647.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * The indicative match volume.
     */
    private final MatchQuantityField matchQuantity = new MatchQuantityField();

    /**
     * The total imbalance volume.
     */
    private final TotalImbalanceField totalImbalance = new TotalImbalanceField();

    /**
     * The market imbalance volume.
     */
    private final MarketImbalanceField marketImbalance = new MarketImbalanceField();

    /**
     * The limit price of the bond order. See Bond Price Types.
     */
    private final PriceField price = new PriceField();

    /**
     * The power of ten dividing the price fields in this message.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * Whether this is a Nyse listed bond.
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * Which order book this order belongs to.
     */
    private final SystemCodeField systemCode = new SystemCodeField();

    /**
     * Which auction this imbalance is for.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Whether flat pricing or interest pricing is in effect.
     */
    private final FlatPricingField flatPricing = new FlatPricingField();

    /**
     * The current state of trading for this bond.
     */
    private final TradingActionField tradingAction = new TradingActionField();

    /**
     * The type of bond. Additional types will be supported in future releases.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Reserved for future use.
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * A Nyse Bonds specific identity for this bond.
     */
    private final NyseBondSymbolField nyseBondSymbol = new NyseBondSymbolField();

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     */
    private final CusipIsinField cusipIsin = new CusipIsinField();

    /**
     * Projected auction time, formatted hhmm.
     */
    private final AuctionTimeField auctionTime = new AuctionTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, sequenceNumber, matchQuantity, totalImbalance, marketImbalance, price, priceScaleCode, exchangeCode, systemCode, auctionType, flatPricing, tradingAction, securityType, quoteCondition, nyseBondSymbol, cusipIsin, auctionTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message creation timestamp in milliseconds since midnight.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Message sequence number, 1 to 2147483647.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * The indicative match volume.
     *
     * @return the MatchQuantity field
     */
    public MatchQuantityField matchQuantity() {
        return matchQuantity;
    }

    /**
     * The total imbalance volume.
     *
     * @return the TotalImbalance field
     */
    public TotalImbalanceField totalImbalance() {
        return totalImbalance;
    }

    /**
     * The market imbalance volume.
     *
     * @return the MarketImbalance field
     */
    public MarketImbalanceField marketImbalance() {
        return marketImbalance;
    }

    /**
     * The limit price of the bond order. See Bond Price Types.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The power of ten dividing the price fields in this message.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * Whether this is a Nyse listed bond.
     *
     * @return the ExchangeCode field
     */
    public ExchangeCodeField exchangeCode() {
        return exchangeCode;
    }

    /**
     * Which order book this order belongs to.
     *
     * @return the SystemCode field
     */
    public SystemCodeField systemCode() {
        return systemCode;
    }

    /**
     * Which auction this imbalance is for.
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
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
     * The type of bond. Additional types will be supported in future releases.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Reserved for future use.
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * A Nyse Bonds specific identity for this bond.
     *
     * @return the NyseBondSymbol field
     */
    public NyseBondSymbolField nyseBondSymbol() {
        return nyseBondSymbol;
    }

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     *
     * @return the CusipIsin field
     */
    public CusipIsinField cusipIsin() {
        return cusipIsin;
    }

    /**
     * Projected auction time, formatted hhmm.
     *
     * @return the AuctionTime field
     */
    public AuctionTimeField auctionTime() {
        return auctionTime;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!matchQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MatchQuantityField.BYTE_LENGTH;
        if (!totalImbalance.parse(data, cursor)) {
            return false;
        }
        cursor += TotalImbalanceField.BYTE_LENGTH;
        if (!marketImbalance.parse(data, cursor)) {
            return false;
        }
        cursor += MarketImbalanceField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        if (!systemCode.parse(data, cursor)) {
            return false;
        }
        cursor += SystemCodeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!flatPricing.parse(data, cursor)) {
            return false;
        }
        cursor += FlatPricingField.BYTE_LENGTH;
        if (!tradingAction.parse(data, cursor)) {
            return false;
        }
        cursor += TradingActionField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!nyseBondSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NyseBondSymbolField.BYTE_LENGTH;
        if (!cusipIsin.parse(data, cursor)) {
            return false;
        }
        cursor += CusipIsinField.BYTE_LENGTH;
        if (!auctionTime.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTimeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = matchQuantity.encode(data, cursor);
        cursor = totalImbalance.encode(data, cursor);
        cursor = marketImbalance.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = systemCode.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = flatPricing.encode(data, cursor);
        cursor = tradingAction.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = nyseBondSymbol.encode(data, cursor);
        cursor = cusipIsin.encode(data, cursor);
        cursor = auctionTime.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "MatchQuantity" -> Optional.of(matchQuantity);
            case "TotalImbalance" -> Optional.of(totalImbalance);
            case "MarketImbalance" -> Optional.of(marketImbalance);
            case "Price" -> Optional.of(price);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "SystemCode" -> Optional.of(systemCode);
            case "AuctionType" -> Optional.of(auctionType);
            case "FlatPricing" -> Optional.of(flatPricing);
            case "TradingAction" -> Optional.of(tradingAction);
            case "SecurityType" -> Optional.of(securityType);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "NyseBondSymbol" -> Optional.of(nyseBondSymbol);
            case "CusipIsin" -> Optional.of(cusipIsin);
            case "AuctionTime" -> Optional.of(auctionTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ImbalanceMessage message)) {
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
        if (!(other instanceof ImbalanceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
