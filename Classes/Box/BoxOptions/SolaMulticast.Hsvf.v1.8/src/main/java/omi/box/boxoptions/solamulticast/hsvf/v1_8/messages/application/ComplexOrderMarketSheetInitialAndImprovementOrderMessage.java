package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AuctionTypeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.CmtaField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ComplexOrderInstrumentSymbolField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.EndOfTheExpositionField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.FirmIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ImprovementPhaseSequentialNumberField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LimitEnteredForAnOrderField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LimitEnteredForAnOrderSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LimitFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OrderQuantityField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OrderSequenceNumberField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OrderSideField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TypeOfClearingAccountField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TypeOfOrderField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the ComplexOrderMarketSheetInitialAndImprovementOrderMessage message from the SolaMulticast protocol.
 *
 * <p>Market Sheet Initial and Improvement Order (Complex Order) / Exposed Order (Complex Order)</p>
 */
public final class ComplexOrderMarketSheetInitialAndImprovementOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Market Sheet Initial And Improvement Order Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 62, 1 };

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     */
    private final ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol = new ComplexOrderInstrumentSymbolField();

    /**
     * The must be filled side
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * Type of limit entered
     */
    private final TypeOfOrderField typeOfOrder = new TypeOfOrderField();

    /**
     * + or - sign
     */
    private final LimitEnteredForAnOrderSignField limitEnteredForAnOrderSign = new LimitEnteredForAnOrderSignField();

    /**
     * For a buy order, represents the highest price that the order issuer is willing to pay For a sell order, represents the lowest price at which the order issuer is willing to sell
     */
    private final LimitEnteredForAnOrderField limitEnteredForAnOrder = new LimitEnteredForAnOrderField();

    /**
     * Fraction Indicator Code
     */
    private final LimitFractionIndicatorField limitFractionIndicator = new LimitFractionIndicatorField();

    /**
     * Indicator Code
     */
    private final OrderQuantityField orderQuantity = new OrderQuantityField();

    /**
     * Allocated by the Central trading engine at each valid order entry
     */
    private final OrderSequenceNumberField orderSequenceNumber = new OrderSequenceNumberField();

    /**
     * Indicates the number of an Improvement Phase. Sequential number unique per Instrument and per trading day
     */
    private final ImprovementPhaseSequentialNumberField improvementPhaseSequentialNumber = new ImprovementPhaseSequentialNumberField();

    /**
     * Indicates the account type for which an order was entered using the clearing house member's account typology.
     */
    private final TypeOfClearingAccountField typeOfClearingAccount = new TypeOfClearingAccountField();

    /**
     * HHMMSSCC - '0' filled for PIP messages
     */
    private final EndOfTheExpositionField endOfTheExposition = new EndOfTheExpositionField();

    /**
     * Indicating the auction type
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Indicates the FirmId
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Indicates the CMTA
     */
    private final CmtaField cmta = new CmtaField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, complexOrderInstrumentSymbol, orderSide, typeOfOrder, limitEnteredForAnOrderSign, limitEnteredForAnOrder, limitFractionIndicator, orderQuantity, orderSequenceNumber, improvementPhaseSequentialNumber, typeOfClearingAccount, endOfTheExposition, auctionType, firmId, cmta);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Q by default
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     *
     * @return the ComplexOrderInstrumentSymbol field
     */
    public ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol() {
        return complexOrderInstrumentSymbol;
    }

    /**
     * The must be filled side
     *
     * @return the OrderSide field
     */
    public OrderSideField orderSide() {
        return orderSide;
    }

    /**
     * Type of limit entered
     *
     * @return the TypeOfOrder field
     */
    public TypeOfOrderField typeOfOrder() {
        return typeOfOrder;
    }

    /**
     * + or - sign
     *
     * @return the LimitEnteredForAnOrderSign field
     */
    public LimitEnteredForAnOrderSignField limitEnteredForAnOrderSign() {
        return limitEnteredForAnOrderSign;
    }

    /**
     * For a buy order, represents the highest price that the order issuer is willing to pay For a sell order, represents the lowest price at which the order issuer is willing to sell
     *
     * @return the LimitEnteredForAnOrder field
     */
    public LimitEnteredForAnOrderField limitEnteredForAnOrder() {
        return limitEnteredForAnOrder;
    }

    /**
     * Fraction Indicator Code
     *
     * @return the LimitFractionIndicator field
     */
    public LimitFractionIndicatorField limitFractionIndicator() {
        return limitFractionIndicator;
    }

    /**
     * Indicator Code
     *
     * @return the OrderQuantity field
     */
    public OrderQuantityField orderQuantity() {
        return orderQuantity;
    }

    /**
     * Allocated by the Central trading engine at each valid order entry
     *
     * @return the OrderSequenceNumber field
     */
    public OrderSequenceNumberField orderSequenceNumber() {
        return orderSequenceNumber;
    }

    /**
     * Indicates the number of an Improvement Phase. Sequential number unique per Instrument and per trading day
     *
     * @return the ImprovementPhaseSequentialNumber field
     */
    public ImprovementPhaseSequentialNumberField improvementPhaseSequentialNumber() {
        return improvementPhaseSequentialNumber;
    }

    /**
     * Indicates the account type for which an order was entered using the clearing house member's account typology.
     *
     * @return the TypeOfClearingAccount field
     */
    public TypeOfClearingAccountField typeOfClearingAccount() {
        return typeOfClearingAccount;
    }

    /**
     * HHMMSSCC - '0' filled for PIP messages
     *
     * @return the EndOfTheExposition field
     */
    public EndOfTheExpositionField endOfTheExposition() {
        return endOfTheExposition;
    }

    /**
     * Indicating the auction type
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Indicates the FirmId
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Indicates the CMTA
     *
     * @return the Cmta field
     */
    public CmtaField cmta() {
        return cmta;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!complexOrderInstrumentSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexOrderInstrumentSymbolField.BYTE_LENGTH;
        if (!orderSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideField.BYTE_LENGTH;
        if (!typeOfOrder.parse(data, cursor)) {
            return false;
        }
        cursor += TypeOfOrderField.BYTE_LENGTH;
        if (!limitEnteredForAnOrderSign.parse(data, cursor)) {
            return false;
        }
        cursor += LimitEnteredForAnOrderSignField.BYTE_LENGTH;
        if (!limitEnteredForAnOrder.parse(data, cursor)) {
            return false;
        }
        cursor += LimitEnteredForAnOrderField.BYTE_LENGTH;
        if (!limitFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LimitFractionIndicatorField.BYTE_LENGTH;
        if (!orderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQuantityField.BYTE_LENGTH;
        if (!orderSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSequenceNumberField.BYTE_LENGTH;
        if (!improvementPhaseSequentialNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ImprovementPhaseSequentialNumberField.BYTE_LENGTH;
        if (!typeOfClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += TypeOfClearingAccountField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!endOfTheExposition.parse(data, cursor)) {
            return false;
        }
        cursor += EndOfTheExpositionField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!cmta.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = complexOrderInstrumentSymbol.encode(data, cursor);
        cursor = orderSide.encode(data, cursor);
        cursor = typeOfOrder.encode(data, cursor);
        cursor = limitEnteredForAnOrderSign.encode(data, cursor);
        cursor = limitEnteredForAnOrder.encode(data, cursor);
        cursor = limitFractionIndicator.encode(data, cursor);
        cursor = orderQuantity.encode(data, cursor);
        cursor = orderSequenceNumber.encode(data, cursor);
        cursor = improvementPhaseSequentialNumber.encode(data, cursor);
        cursor = typeOfClearingAccount.encode(data, cursor);
        if (buffer != null && buffer.length >= 62 + 1) {
            System.arraycopy(buffer, 62, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = endOfTheExposition.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = cmta.encode(data, cursor);
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "ComplexOrderInstrumentSymbol" -> Optional.of(complexOrderInstrumentSymbol);
            case "OrderSide" -> Optional.of(orderSide);
            case "TypeOfOrder" -> Optional.of(typeOfOrder);
            case "LimitEnteredForAnOrderSign" -> Optional.of(limitEnteredForAnOrderSign);
            case "LimitEnteredForAnOrder" -> Optional.of(limitEnteredForAnOrder);
            case "LimitFractionIndicator" -> Optional.of(limitFractionIndicator);
            case "OrderQuantity" -> Optional.of(orderQuantity);
            case "OrderSequenceNumber" -> Optional.of(orderSequenceNumber);
            case "ImprovementPhaseSequentialNumber" -> Optional.of(improvementPhaseSequentialNumber);
            case "TypeOfClearingAccount" -> Optional.of(typeOfClearingAccount);
            case "EndOfTheExposition" -> Optional.of(endOfTheExposition);
            case "AuctionType" -> Optional.of(auctionType);
            case "FirmId" -> Optional.of(firmId);
            case "Cmta" -> Optional.of(cmta);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderMarketSheetInitialAndImprovementOrderMessage message)) {
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
        if (!(other instanceof ComplexOrderMarketSheetInitialAndImprovementOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
