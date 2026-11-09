package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ConsolidatedVolumeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.NavOffsetAmountField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.NextSharesSymbolField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.OriginatingMarketCenterIdentifierField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.ProxyPriceField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.SecurityClassField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.TradeControlNumberField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.TradeSizeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.structs.SaleConditionModifier;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Field;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Message;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.PrintOptions;

/**
 * Represents the NextSharesTradeReportMessage message from the NlsPlus protocol.
 *
 * <p>Relays trade transactions for NextShares exchange traded managed funds, reported as a proxy price with the Nav offset to apply to it.</p>
 */
public final class NextSharesTradeReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 44;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Next Shares Trade Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Denotes the Nasdaq market system that generated the trade report message
     */
    private final OriginatingMarketCenterIdentifierField originatingMarketCenterIdentifier = new OriginatingMarketCenterIdentifierField();

    /**
     * Denotes the NextShares symbol for which the trade report is being generated
     */
    private final NextSharesSymbolField nextSharesSymbol = new NextSharesSymbolField();

    /**
     * Indicates the primary listing market for the issue
     */
    private final SecurityClassField securityClass = new SecurityClassField();

    /**
     * Indicates the source's internal control number associated with the given trade transaction
     */
    private final TradeControlNumberField tradeControlNumber = new TradeControlNumberField();

    /**
     * Reported proxy price for the transaction
     */
    private final ProxyPriceField proxyPrice = new ProxyPriceField();

    /**
     * Indicates the reported number of shares on the trade transaction
     */
    private final TradeSizeField tradeSize = new TradeSizeField();

    /**
     * The Nav offset that should be applied to the Proxy Price
     */
    private final NavOffsetAmountField navOffsetAmount = new NavOffsetAmountField();

    /**
     * Reflects the volume for the Issue Symbol as reported on the consolidated market data feed at the time the trade message was generated
     */
    private final ConsolidatedVolumeField consolidatedVolume = new ConsolidatedVolumeField();

    /**
     * Sale condition modifier, consisting of four levels
     */
    private final SaleConditionModifier saleConditionModifier = new SaleConditionModifier();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(originatingMarketCenterIdentifier), List.<Field>of(nextSharesSymbol), List.<Field>of(securityClass), List.<Field>of(tradeControlNumber), List.<Field>of(proxyPrice), List.<Field>of(tradeSize), List.<Field>of(navOffsetAmount), saleConditionModifier.fields(), List.<Field>of(consolidatedVolume)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Denotes the Nasdaq market system that generated the trade report message
     *
     * @return the OriginatingMarketCenterIdentifier field
     */
    public OriginatingMarketCenterIdentifierField originatingMarketCenterIdentifier() {
        return originatingMarketCenterIdentifier;
    }

    /**
     * Denotes the NextShares symbol for which the trade report is being generated
     *
     * @return the NextSharesSymbol field
     */
    public NextSharesSymbolField nextSharesSymbol() {
        return nextSharesSymbol;
    }

    /**
     * Indicates the primary listing market for the issue
     *
     * @return the SecurityClass field
     */
    public SecurityClassField securityClass() {
        return securityClass;
    }

    /**
     * Indicates the source's internal control number associated with the given trade transaction
     *
     * @return the TradeControlNumber field
     */
    public TradeControlNumberField tradeControlNumber() {
        return tradeControlNumber;
    }

    /**
     * Reported proxy price for the transaction
     *
     * @return the ProxyPrice field
     */
    public ProxyPriceField proxyPrice() {
        return proxyPrice;
    }

    /**
     * Indicates the reported number of shares on the trade transaction
     *
     * @return the TradeSize field
     */
    public TradeSizeField tradeSize() {
        return tradeSize;
    }

    /**
     * The Nav offset that should be applied to the Proxy Price
     *
     * @return the NavOffsetAmount field
     */
    public NavOffsetAmountField navOffsetAmount() {
        return navOffsetAmount;
    }

    /**
     * Reflects the volume for the Issue Symbol as reported on the consolidated market data feed at the time the trade message was generated
     *
     * @return the ConsolidatedVolume field
     */
    public ConsolidatedVolumeField consolidatedVolume() {
        return consolidatedVolume;
    }

    /**
     * Sale condition modifier, consisting of four levels
     *
     * @return the SaleConditionModifier record
     */
    public SaleConditionModifier saleConditionModifier() {
        return saleConditionModifier;
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
        if (!originatingMarketCenterIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatingMarketCenterIdentifierField.BYTE_LENGTH;
        if (!nextSharesSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NextSharesSymbolField.BYTE_LENGTH;
        if (!securityClass.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityClassField.BYTE_LENGTH;
        if (!tradeControlNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradeControlNumberField.BYTE_LENGTH;
        if (!proxyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ProxyPriceField.BYTE_LENGTH;
        if (!tradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeField.BYTE_LENGTH;
        if (!navOffsetAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NavOffsetAmountField.BYTE_LENGTH;
        if (!saleConditionModifier.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += saleConditionModifier.byteLength();
        if (!consolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedVolumeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = originatingMarketCenterIdentifier.encode(data, cursor);
        cursor = nextSharesSymbol.encode(data, cursor);
        cursor = securityClass.encode(data, cursor);
        cursor = tradeControlNumber.encode(data, cursor);
        cursor = proxyPrice.encode(data, cursor);
        cursor = tradeSize.encode(data, cursor);
        cursor = navOffsetAmount.encode(data, cursor);
        cursor = saleConditionModifier.encode(data, cursor);
        cursor = consolidatedVolume.encode(data, cursor);
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
        saleConditionModifier.clear();
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
            case "OriginatingMarketCenterIdentifier" -> Optional.of(originatingMarketCenterIdentifier);
            case "NextSharesSymbol" -> Optional.of(nextSharesSymbol);
            case "SecurityClass" -> Optional.of(securityClass);
            case "TradeControlNumber" -> Optional.of(tradeControlNumber);
            case "ProxyPrice" -> Optional.of(proxyPrice);
            case "TradeSize" -> Optional.of(tradeSize);
            case "NavOffsetAmount" -> Optional.of(navOffsetAmount);
            case "ConsolidatedVolume" -> Optional.of(consolidatedVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NextSharesTradeReportMessage message)) {
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
        if (!(other instanceof NextSharesTradeReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
