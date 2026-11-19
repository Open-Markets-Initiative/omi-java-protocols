package omi.nyse.nysebonds.trades.abp.v1_07_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.CusipIsinField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.EventCodeField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.ExchangeCodeField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.LastSaleTimeField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.NyseBondSymbolField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.PaddingAsciiField3;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.PriceField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.PriceScaleCodeField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.QuantityField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.SecurityTypeField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.SequenceNumberField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.SystemCodeField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.TradeConditionField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.fields.TradeReferenceNumberField;
import omi.nyse.nysebonds.trades.abp.v1_07_a.types.Field;
import omi.nyse.nysebonds.trades.abp.v1_07_a.types.Message;
import omi.nyse.nysebonds.trades.abp.v1_07_a.types.PrintOptions;

/**
 * Represents the TradeBustOrCorrectionMessage message from the Trades protocol.
 *
 * <p>Sent when trades are busted or corrected. The Event Code field says which.</p>
 */
public final class TradeBustOrCorrectionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Bust Or Correction Message";

    /**
     * Time the trade occurred, in milliseconds since midnight.
     */
    private final LastSaleTimeField lastSaleTime = new LastSaleTimeField();

    /**
     * Message sequence number, 1 to 2147483647.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * The unique reference number per trading platform (system code) assigned to this trade.
     */
    private final TradeReferenceNumberField tradeReferenceNumber = new TradeReferenceNumberField();

    /**
     * Number of bonds traded.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Trade price. Divide by the denominator the Price Scale Code names.
     */
    private final PriceField price = new PriceField();

    /**
     * The power of ten dividing the price fields in this message.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * The trading platform that produced this trade.
     */
    private final SystemCodeField systemCode = new SystemCodeField();

    /**
     * Whether the trade was busted or corrected.
     */
    private final EventCodeField eventCode = new EventCodeField();

    /**
     * Whether this is a Nyse listed bond.
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * Reserved for future use.
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * The type of bond. Additional types will be supported in future releases.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * A Nyse Arca specific identity for this bond.
     */
    private final NyseBondSymbolField nyseBondSymbol = new NyseBondSymbolField();

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     */
    private final CusipIsinField cusipIsin = new CusipIsinField();

    /**
     * Not used.
     */
    private final PaddingAsciiField3 paddingAscii = new PaddingAsciiField3();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(lastSaleTime, sequenceNumber, tradeReferenceNumber, quantity, price, priceScaleCode, systemCode, eventCode, exchangeCode, tradeCondition, securityType, nyseBondSymbol, cusipIsin, paddingAscii);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the trade occurred, in milliseconds since midnight.
     *
     * @return the LastSaleTime field
     */
    public LastSaleTimeField lastSaleTime() {
        return lastSaleTime;
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
     * The unique reference number per trading platform (system code) assigned to this trade.
     *
     * @return the TradeReferenceNumber field
     */
    public TradeReferenceNumberField tradeReferenceNumber() {
        return tradeReferenceNumber;
    }

    /**
     * Number of bonds traded.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Trade price. Divide by the denominator the Price Scale Code names.
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
     * The trading platform that produced this trade.
     *
     * @return the SystemCode field
     */
    public SystemCodeField systemCode() {
        return systemCode;
    }

    /**
     * Whether the trade was busted or corrected.
     *
     * @return the EventCode field
     */
    public EventCodeField eventCode() {
        return eventCode;
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
     * Reserved for future use.
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
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
     * A Nyse Arca specific identity for this bond.
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
     * Not used.
     *
     * @return the PaddingAscii field
     */
    public PaddingAsciiField3 paddingAscii() {
        return paddingAscii;
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
        if (!lastSaleTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastSaleTimeField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!tradeReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReferenceNumberField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!systemCode.parse(data, cursor)) {
            return false;
        }
        cursor += SystemCodeField.BYTE_LENGTH;
        if (!eventCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventCodeField.BYTE_LENGTH;
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!nyseBondSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NyseBondSymbolField.BYTE_LENGTH;
        if (!cusipIsin.parse(data, cursor)) {
            return false;
        }
        cursor += CusipIsinField.BYTE_LENGTH;
        return paddingAscii.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = lastSaleTime.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = tradeReferenceNumber.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = systemCode.encode(data, cursor);
        cursor = eventCode.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = nyseBondSymbol.encode(data, cursor);
        cursor = cusipIsin.encode(data, cursor);
        cursor = paddingAscii.encode(data, cursor);
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
            case "LastSaleTime" -> Optional.of(lastSaleTime);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "TradeReferenceNumber" -> Optional.of(tradeReferenceNumber);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "SystemCode" -> Optional.of(systemCode);
            case "EventCode" -> Optional.of(eventCode);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "SecurityType" -> Optional.of(securityType);
            case "NyseBondSymbol" -> Optional.of(nyseBondSymbol);
            case "CusipIsin" -> Optional.of(cusipIsin);
            case "PaddingAscii" -> Optional.of(paddingAscii);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeBustOrCorrectionMessage message)) {
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
        if (!(other instanceof TradeBustOrCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
