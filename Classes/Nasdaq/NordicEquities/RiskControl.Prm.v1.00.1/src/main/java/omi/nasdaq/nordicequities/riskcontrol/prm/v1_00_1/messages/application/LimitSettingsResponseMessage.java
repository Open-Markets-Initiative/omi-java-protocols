package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.CurrencyField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.MaxQuantityAuctionField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.MaxQuantityField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.MaxValueAuctionField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.MaxValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.OpenOrderBuyValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.OpenOrderNetValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.OpenOrderSellValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.PrmAccountField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TotalRiskValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TradeBuyValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TradeNetValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TradeSellValueField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.UnusedField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.UserRefNumField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Field;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Message;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.PrintOptions;

/**
 * Represents the LimitSettingsResponseMessage message from the RiskControl protocol.
 *
 * <p>Indicates that the Limit settings for a given PRM Account and Currency have been updated</p>
 */
public final class LimitSettingsResponseMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'L';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 109;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Limit Settings Response Message";

    /**
     * A unique sequential number starting from 1 at start of day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * PRM Account in which the settings apply
     */
    private final PrmAccountField prmAccount = new PrmAccountField();

    /**
     * Currency in which the settings apply
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Maximum number of shares allowed on a per order basis, previous value kept if -1
     */
    private final MaxQuantityField maxQuantity = new MaxQuantityField();

    /**
     * Maximum order value (price * quantity) allowed on a per order basis, previous value kept if -1
     */
    private final MaxValueField maxValue = new MaxValueField();

    /**
     * Field reserved for future use
     */
    private final UnusedField unused = new UnusedField();

    /**
     * Total risk value (open orders plus trades), previous value kept if -1
     */
    private final TotalRiskValueField totalRiskValue = new TotalRiskValueField();

    /**
     * Trades buy value, previous value kept if -1
     */
    private final TradeBuyValueField tradeBuyValue = new TradeBuyValueField();

    /**
     * Trades sell value, previous value kept if -1
     */
    private final TradeSellValueField tradeSellValue = new TradeSellValueField();

    /**
     * Trades net value, previous value kept if -1
     */
    private final TradeNetValueField tradeNetValue = new TradeNetValueField();

    /**
     * Open orders buy value, previous value kept if -1
     */
    private final OpenOrderBuyValueField openOrderBuyValue = new OpenOrderBuyValueField();

    /**
     * Open orders sell value, previous value kept if -1
     */
    private final OpenOrderSellValueField openOrderSellValue = new OpenOrderSellValueField();

    /**
     * Open orders net value, previous value kept if -1
     */
    private final OpenOrderNetValueField openOrderNetValue = new OpenOrderNetValueField();

    /**
     * Maximum number of shares allowed on a per order basis specific to auctions, previous value kept if -1
     */
    private final MaxQuantityAuctionField maxQuantityAuction = new MaxQuantityAuctionField();

    /**
     * Maximum order value (price * quantity) allowed on a per order basis specific to auctions, previous value kept if -1
     */
    private final MaxValueAuctionField maxValueAuction = new MaxValueAuctionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userRefNum, prmAccount, currency, maxQuantity, maxValue, unused, totalRiskValue, tradeBuyValue, tradeSellValue, tradeNetValue, openOrderBuyValue, openOrderSellValue, openOrderNetValue, maxQuantityAuction, maxValueAuction);

    private byte[] buffer;

    private boolean decoded;

    /**
     * A unique sequential number starting from 1 at start of day
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

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
     * Maximum number of shares allowed on a per order basis, previous value kept if -1
     *
     * @return the MaxQuantity field
     */
    public MaxQuantityField maxQuantity() {
        return maxQuantity;
    }

    /**
     * Maximum order value (price * quantity) allowed on a per order basis, previous value kept if -1
     *
     * @return the MaxValue field
     */
    public MaxValueField maxValue() {
        return maxValue;
    }

    /**
     * Field reserved for future use
     *
     * @return the Unused field
     */
    public UnusedField unused() {
        return unused;
    }

    /**
     * Total risk value (open orders plus trades), previous value kept if -1
     *
     * @return the TotalRiskValue field
     */
    public TotalRiskValueField totalRiskValue() {
        return totalRiskValue;
    }

    /**
     * Trades buy value, previous value kept if -1
     *
     * @return the TradeBuyValue field
     */
    public TradeBuyValueField tradeBuyValue() {
        return tradeBuyValue;
    }

    /**
     * Trades sell value, previous value kept if -1
     *
     * @return the TradeSellValue field
     */
    public TradeSellValueField tradeSellValue() {
        return tradeSellValue;
    }

    /**
     * Trades net value, previous value kept if -1
     *
     * @return the TradeNetValue field
     */
    public TradeNetValueField tradeNetValue() {
        return tradeNetValue;
    }

    /**
     * Open orders buy value, previous value kept if -1
     *
     * @return the OpenOrderBuyValue field
     */
    public OpenOrderBuyValueField openOrderBuyValue() {
        return openOrderBuyValue;
    }

    /**
     * Open orders sell value, previous value kept if -1
     *
     * @return the OpenOrderSellValue field
     */
    public OpenOrderSellValueField openOrderSellValue() {
        return openOrderSellValue;
    }

    /**
     * Open orders net value, previous value kept if -1
     *
     * @return the OpenOrderNetValue field
     */
    public OpenOrderNetValueField openOrderNetValue() {
        return openOrderNetValue;
    }

    /**
     * Maximum number of shares allowed on a per order basis specific to auctions, previous value kept if -1
     *
     * @return the MaxQuantityAuction field
     */
    public MaxQuantityAuctionField maxQuantityAuction() {
        return maxQuantityAuction;
    }

    /**
     * Maximum order value (price * quantity) allowed on a per order basis specific to auctions, previous value kept if -1
     *
     * @return the MaxValueAuction field
     */
    public MaxValueAuctionField maxValueAuction() {
        return maxValueAuction;
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
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!prmAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrmAccountField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!maxQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MaxQuantityField.BYTE_LENGTH;
        if (!maxValue.parse(data, cursor)) {
            return false;
        }
        cursor += MaxValueField.BYTE_LENGTH;
        if (!unused.parse(data, cursor)) {
            return false;
        }
        cursor += UnusedField.BYTE_LENGTH;
        if (!totalRiskValue.parse(data, cursor)) {
            return false;
        }
        cursor += TotalRiskValueField.BYTE_LENGTH;
        if (!tradeBuyValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradeBuyValueField.BYTE_LENGTH;
        if (!tradeSellValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSellValueField.BYTE_LENGTH;
        if (!tradeNetValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradeNetValueField.BYTE_LENGTH;
        if (!openOrderBuyValue.parse(data, cursor)) {
            return false;
        }
        cursor += OpenOrderBuyValueField.BYTE_LENGTH;
        if (!openOrderSellValue.parse(data, cursor)) {
            return false;
        }
        cursor += OpenOrderSellValueField.BYTE_LENGTH;
        if (!openOrderNetValue.parse(data, cursor)) {
            return false;
        }
        cursor += OpenOrderNetValueField.BYTE_LENGTH;
        if (!maxQuantityAuction.parse(data, cursor)) {
            return false;
        }
        cursor += MaxQuantityAuctionField.BYTE_LENGTH;
        return maxValueAuction.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = userRefNum.encode(data, cursor);
        cursor = prmAccount.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = maxQuantity.encode(data, cursor);
        cursor = maxValue.encode(data, cursor);
        cursor = unused.encode(data, cursor);
        cursor = totalRiskValue.encode(data, cursor);
        cursor = tradeBuyValue.encode(data, cursor);
        cursor = tradeSellValue.encode(data, cursor);
        cursor = tradeNetValue.encode(data, cursor);
        cursor = openOrderBuyValue.encode(data, cursor);
        cursor = openOrderSellValue.encode(data, cursor);
        cursor = openOrderNetValue.encode(data, cursor);
        cursor = maxQuantityAuction.encode(data, cursor);
        cursor = maxValueAuction.encode(data, cursor);
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
            case "UserRefNum" -> Optional.of(userRefNum);
            case "PrmAccount" -> Optional.of(prmAccount);
            case "Currency" -> Optional.of(currency);
            case "MaxQuantity" -> Optional.of(maxQuantity);
            case "MaxValue" -> Optional.of(maxValue);
            case "Unused" -> Optional.of(unused);
            case "TotalRiskValue" -> Optional.of(totalRiskValue);
            case "TradeBuyValue" -> Optional.of(tradeBuyValue);
            case "TradeSellValue" -> Optional.of(tradeSellValue);
            case "TradeNetValue" -> Optional.of(tradeNetValue);
            case "OpenOrderBuyValue" -> Optional.of(openOrderBuyValue);
            case "OpenOrderSellValue" -> Optional.of(openOrderSellValue);
            case "OpenOrderNetValue" -> Optional.of(openOrderNetValue);
            case "MaxQuantityAuction" -> Optional.of(maxQuantityAuction);
            case "MaxValueAuction" -> Optional.of(maxValueAuction);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LimitSettingsResponseMessage message)) {
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
        if (!(other instanceof LimitSettingsResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
