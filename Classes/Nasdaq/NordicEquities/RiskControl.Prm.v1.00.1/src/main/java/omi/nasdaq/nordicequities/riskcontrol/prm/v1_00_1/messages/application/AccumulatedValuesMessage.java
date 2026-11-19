package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.CurrencyField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.LastUpdateTimeField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.OrdersBuyValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.OrdersSellValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.OrdersTotalValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.PrmAccountField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.RiskTotalValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TradesBuyValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TradesSellValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TradesTotalValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Field;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Message;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.PrintOptions;

/**
 * Represents the AccumulatedValuesMessage message from the RiskControl protocol.
 *
 * <p>Indicates the current Accumulated Values for a PRM Account and Currency, sent after order or trade updates</p>
 */
public final class AccumulatedValuesMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'V';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Accumulated Values Message";

    /**
     * PRM Account in which the settings apply
     */
    private final PrmAccountField prmAccount = new PrmAccountField();

    /**
     * Currency in which the settings apply
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Last update time
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Risk total value
     */
    private final RiskTotalValueField riskTotalValue = new RiskTotalValueField();

    /**
     * Trades buy value
     */
    private final TradesBuyValueField tradesBuyValue = new TradesBuyValueField();

    /**
     * Trades sell value
     */
    private final TradesSellValueField tradesSellValue = new TradesSellValueField();

    /**
     * Trades total value
     */
    private final TradesTotalValueField tradesTotalValue = new TradesTotalValueField();

    /**
     * Orders buy value
     */
    private final OrdersBuyValueField ordersBuyValue = new OrdersBuyValueField();

    /**
     * Orders sell value
     */
    private final OrdersSellValueField ordersSellValue = new OrdersSellValueField();

    /**
     * Orders total value
     */
    private final OrdersTotalValueField ordersTotalValue = new OrdersTotalValueField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(prmAccount, currency, lastUpdateTime, riskTotalValue, tradesBuyValue, tradesSellValue, tradesTotalValue, ordersBuyValue, ordersSellValue, ordersTotalValue);

    private byte[] buffer;

    private boolean decoded;

    /**
     * PRM Account in which the settings apply
     *
     * @return the PrmAccount field
     */
    public PrmAccountField prmAccount() {
        return prmAccount;
    }

    /**
     * Currency in which the settings apply
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Last update time
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Risk total value
     *
     * @return the RiskTotalValue field
     */
    public RiskTotalValueField riskTotalValue() {
        return riskTotalValue;
    }

    /**
     * Trades buy value
     *
     * @return the TradesBuyValue field
     */
    public TradesBuyValueField tradesBuyValue() {
        return tradesBuyValue;
    }

    /**
     * Trades sell value
     *
     * @return the TradesSellValue field
     */
    public TradesSellValueField tradesSellValue() {
        return tradesSellValue;
    }

    /**
     * Trades total value
     *
     * @return the TradesTotalValue field
     */
    public TradesTotalValueField tradesTotalValue() {
        return tradesTotalValue;
    }

    /**
     * Orders buy value
     *
     * @return the OrdersBuyValue field
     */
    public OrdersBuyValueField ordersBuyValue() {
        return ordersBuyValue;
    }

    /**
     * Orders sell value
     *
     * @return the OrdersSellValue field
     */
    public OrdersSellValueField ordersSellValue() {
        return ordersSellValue;
    }

    /**
     * Orders total value
     *
     * @return the OrdersTotalValue field
     */
    public OrdersTotalValueField ordersTotalValue() {
        return ordersTotalValue;
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
        if (!prmAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrmAccountField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!lastUpdateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimeField.BYTE_LENGTH;
        if (!riskTotalValue.parse(data, cursor)) {
            return false;
        }
        cursor += RiskTotalValueField.BYTE_LENGTH;
        if (!tradesBuyValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradesBuyValueField.BYTE_LENGTH;
        if (!tradesSellValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradesSellValueField.BYTE_LENGTH;
        if (!tradesTotalValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradesTotalValueField.BYTE_LENGTH;
        if (!ordersBuyValue.parse(data, cursor)) {
            return false;
        }
        cursor += OrdersBuyValueField.BYTE_LENGTH;
        if (!ordersSellValue.parse(data, cursor)) {
            return false;
        }
        cursor += OrdersSellValueField.BYTE_LENGTH;
        return ordersTotalValue.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = prmAccount.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = riskTotalValue.encode(data, cursor);
        cursor = tradesBuyValue.encode(data, cursor);
        cursor = tradesSellValue.encode(data, cursor);
        cursor = tradesTotalValue.encode(data, cursor);
        cursor = ordersBuyValue.encode(data, cursor);
        cursor = ordersSellValue.encode(data, cursor);
        cursor = ordersTotalValue.encode(data, cursor);
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
            case "PrmAccount" -> Optional.of(prmAccount);
            case "Currency" -> Optional.of(currency);
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "RiskTotalValue" -> Optional.of(riskTotalValue);
            case "TradesBuyValue" -> Optional.of(tradesBuyValue);
            case "TradesSellValue" -> Optional.of(tradesSellValue);
            case "TradesTotalValue" -> Optional.of(tradesTotalValue);
            case "OrdersBuyValue" -> Optional.of(ordersBuyValue);
            case "OrdersSellValue" -> Optional.of(ordersSellValue);
            case "OrdersTotalValue" -> Optional.of(ordersTotalValue);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AccumulatedValuesMessage message)) {
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
        if (!(other instanceof AccumulatedValuesMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
