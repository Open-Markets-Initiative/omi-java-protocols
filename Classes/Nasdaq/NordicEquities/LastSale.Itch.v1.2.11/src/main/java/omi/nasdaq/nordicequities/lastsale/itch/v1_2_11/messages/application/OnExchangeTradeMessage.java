package omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.AgreementDateField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.AgreementTimeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.ExecutionDateField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.ExecutionTimeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.MmtTradeFlagsField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.MpidBuyerField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.MpidSellerField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.OrderBookField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.PriceOnExchangeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.QuantityField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TimestampField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TrackingNumberField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TradeTypeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TransactionIdentifierCodeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TransactionToBeClearedField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.VenueOfExecutionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.types.Field;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.types.Message;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.types.PrintOptions;

/**
 * Represents the OnExchangeTradeMessage message from the LastSale protocol.
 *
 * <p>Relays on exchange trade transactions executed or deferred to the current business day</p>
 */
public final class OnExchangeTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 92;

    /**
     * This message's declared name.
     */
    public static final String NAME = "On Exchange Trade Message";

    /**
     * Nanoseconds since midnight, the publication time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Nasdaq Nordic internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Order book id
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Date of execution
     */
    private final ExecutionDateField executionDate = new ExecutionDateField();

    /**
     * Time of execution
     */
    private final ExecutionTimeField executionTime = new ExecutionTimeField();

    /**
     * Date of agreement
     */
    private final AgreementDateField agreementDate = new AgreementDateField();

    /**
     * Time of agreement
     */
    private final AgreementTimeField agreementTime = new AgreementTimeField();

    /**
     * Execution price
     */
    private final PriceOnExchangeField priceOnExchange = new PriceOnExchangeField();

    /**
     * Execution quantity with runtime decimal places
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Mic code of the execution venue
     */
    private final VenueOfExecutionField venueOfExecution = new VenueOfExecutionField();

    /**
     * Trade match id assigned to each trade
     */
    private final TransactionIdentifierCodeField transactionIdentifierCode = new TransactionIdentifierCodeField();

    /**
     * Market model typology trade flags
     */
    private final MmtTradeFlagsField mmtTradeFlags = new MmtTradeFlagsField();

    /**
     * Type of negotiated trade
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * The Mpid of the buyer, if public
     */
    private final MpidBuyerField mpidBuyer = new MpidBuyerField();

    /**
     * The Mpid of the seller, if public
     */
    private final MpidSellerField mpidSeller = new MpidSellerField();

    /**
     * Whether the transaction is to be cleared
     */
    private final TransactionToBeClearedField transactionToBeCleared = new TransactionToBeClearedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, trackingNumber, orderBook, executionDate, executionTime, agreementDate, agreementTime, priceOnExchange, quantity, venueOfExecution, transactionIdentifierCode, mmtTradeFlags, tradeType, mpidBuyer, mpidSeller, transactionToBeCleared);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight, the publication time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Nasdaq Nordic internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Order book id
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Date of execution
     *
     * @return the ExecutionDate field
     */
    public ExecutionDateField executionDate() {
        return executionDate;
    }

    /**
     * Time of execution
     *
     * @return the ExecutionTime field
     */
    public ExecutionTimeField executionTime() {
        return executionTime;
    }

    /**
     * Date of agreement
     *
     * @return the AgreementDate field
     */
    public AgreementDateField agreementDate() {
        return agreementDate;
    }

    /**
     * Time of agreement
     *
     * @return the AgreementTime field
     */
    public AgreementTimeField agreementTime() {
        return agreementTime;
    }

    /**
     * Execution price
     *
     * @return the PriceOnExchange field
     */
    public PriceOnExchangeField priceOnExchange() {
        return priceOnExchange;
    }

    /**
     * Execution quantity with runtime decimal places
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Mic code of the execution venue
     *
     * @return the VenueOfExecution field
     */
    public VenueOfExecutionField venueOfExecution() {
        return venueOfExecution;
    }

    /**
     * Trade match id assigned to each trade
     *
     * @return the TransactionIdentifierCode field
     */
    public TransactionIdentifierCodeField transactionIdentifierCode() {
        return transactionIdentifierCode;
    }

    /**
     * Market model typology trade flags
     *
     * @return the MmtTradeFlags field
     */
    public MmtTradeFlagsField mmtTradeFlags() {
        return mmtTradeFlags;
    }

    /**
     * Type of negotiated trade
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * The Mpid of the buyer, if public
     *
     * @return the MpidBuyer field
     */
    public MpidBuyerField mpidBuyer() {
        return mpidBuyer;
    }

    /**
     * The Mpid of the seller, if public
     *
     * @return the MpidSeller field
     */
    public MpidSellerField mpidSeller() {
        return mpidSeller;
    }

    /**
     * Whether the transaction is to be cleared
     *
     * @return the TransactionToBeCleared field
     */
    public TransactionToBeClearedField transactionToBeCleared() {
        return transactionToBeCleared;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!executionDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionDateField.BYTE_LENGTH;
        if (!executionTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionTimeField.BYTE_LENGTH;
        if (!agreementDate.parse(data, cursor)) {
            return false;
        }
        cursor += AgreementDateField.BYTE_LENGTH;
        if (!agreementTime.parse(data, cursor)) {
            return false;
        }
        cursor += AgreementTimeField.BYTE_LENGTH;
        if (!priceOnExchange.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOnExchangeField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!venueOfExecution.parse(data, cursor)) {
            return false;
        }
        cursor += VenueOfExecutionField.BYTE_LENGTH;
        if (!transactionIdentifierCode.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdentifierCodeField.BYTE_LENGTH;
        if (!mmtTradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += MmtTradeFlagsField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!mpidBuyer.parse(data, cursor)) {
            return false;
        }
        cursor += MpidBuyerField.BYTE_LENGTH;
        if (!mpidSeller.parse(data, cursor)) {
            return false;
        }
        cursor += MpidSellerField.BYTE_LENGTH;
        return transactionToBeCleared.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = executionDate.encode(data, cursor);
        cursor = executionTime.encode(data, cursor);
        cursor = agreementDate.encode(data, cursor);
        cursor = agreementTime.encode(data, cursor);
        cursor = priceOnExchange.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = venueOfExecution.encode(data, cursor);
        cursor = transactionIdentifierCode.encode(data, cursor);
        cursor = mmtTradeFlags.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = mpidBuyer.encode(data, cursor);
        cursor = mpidSeller.encode(data, cursor);
        cursor = transactionToBeCleared.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "OrderBook" -> Optional.of(orderBook);
            case "ExecutionDate" -> Optional.of(executionDate);
            case "ExecutionTime" -> Optional.of(executionTime);
            case "AgreementDate" -> Optional.of(agreementDate);
            case "AgreementTime" -> Optional.of(agreementTime);
            case "PriceOnExchange" -> Optional.of(priceOnExchange);
            case "Quantity" -> Optional.of(quantity);
            case "VenueOfExecution" -> Optional.of(venueOfExecution);
            case "TransactionIdentifierCode" -> Optional.of(transactionIdentifierCode);
            case "MmtTradeFlags" -> Optional.of(mmtTradeFlags);
            case "TradeType" -> Optional.of(tradeType);
            case "MpidBuyer" -> Optional.of(mpidBuyer);
            case "MpidSeller" -> Optional.of(mpidSeller);
            case "TransactionToBeCleared" -> Optional.of(transactionToBeCleared);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OnExchangeTradeMessage message)) {
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
        if (!(other instanceof OnExchangeTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
