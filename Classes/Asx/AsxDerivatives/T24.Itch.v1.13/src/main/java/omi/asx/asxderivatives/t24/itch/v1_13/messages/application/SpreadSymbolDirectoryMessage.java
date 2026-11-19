package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractTypeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ExchangeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.FirstLegContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriceDecimalPositionField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriceFractionalDenominatorField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriceMinimumTickField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PrimaryRatioField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SecondLegContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SecondaryRatioField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the SpreadSymbolDirectoryMessage message from the T24 protocol.
 *
 * <p>As each product moves to the new Trade Date, ASX Trade24 will disseminate the spread symbol messages defining the available calendar spread and inter-spread contracts. For contracts that are inter-spreads, the underlying legs are in the same Trade Date.</p>
 */
public final class SpreadSymbolDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'g';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Spread Symbol Directory Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Contract Number Field Element Identifier
     */
    private final ContractNumberField contractNumber = new ContractNumberField();

    /**
     * Denotes the exchange identifier of the contract
     */
    private final ExchangeField exchange = new ExchangeField();

    /**
     * Indicates the type of contract.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * Underlying Contract Number Field Element Identifier of the first contract leg.
     */
    private final FirstLegContractNumberField firstLegContractNumber = new FirstLegContractNumberField();

    /**
     * Underlying Contract Number Field Element Identifier of the second contract leg.
     */
    private final SecondLegContractNumberField secondLegContractNumber = new SecondLegContractNumberField();

    /**
     * Ratio of the first contract leg.
     */
    private final PrimaryRatioField primaryRatio = new PrimaryRatioField();

    /**
     * Ratio of the second contract leg.
     */
    private final SecondaryRatioField secondaryRatio = new SecondaryRatioField();

    /**
     * Position of the decimal point in the price
     */
    private final PriceDecimalPositionField priceDecimalPosition = new PriceDecimalPositionField();

    /**
     * Denominator of the fractional part
     */
    private final PriceFractionalDenominatorField priceFractionalDenominator = new PriceFractionalDenominatorField();

    /**
     * Minimum tick size
     */
    private final PriceMinimumTickField priceMinimumTick = new PriceMinimumTickField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, contractNumber, exchange, contractType, firstLegContractNumber, secondLegContractNumber, primaryRatio, secondaryRatio, priceDecimalPosition, priceFractionalDenominator, priceMinimumTick);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Contract Number Field Element Identifier
     *
     * @return the ContractNumber field
     */
    public ContractNumberField contractNumber() {
        return contractNumber;
    }

    /**
     * Denotes the exchange identifier of the contract
     *
     * @return the Exchange field
     */
    public ExchangeField exchange() {
        return exchange;
    }

    /**
     * Indicates the type of contract.
     *
     * @return the ContractType field
     */
    public ContractTypeField contractType() {
        return contractType;
    }

    /**
     * Underlying Contract Number Field Element Identifier of the first contract leg.
     *
     * @return the FirstLegContractNumber field
     */
    public FirstLegContractNumberField firstLegContractNumber() {
        return firstLegContractNumber;
    }

    /**
     * Underlying Contract Number Field Element Identifier of the second contract leg.
     *
     * @return the SecondLegContractNumber field
     */
    public SecondLegContractNumberField secondLegContractNumber() {
        return secondLegContractNumber;
    }

    /**
     * Ratio of the first contract leg.
     *
     * @return the PrimaryRatio field
     */
    public PrimaryRatioField primaryRatio() {
        return primaryRatio;
    }

    /**
     * Ratio of the second contract leg.
     *
     * @return the SecondaryRatio field
     */
    public SecondaryRatioField secondaryRatio() {
        return secondaryRatio;
    }

    /**
     * Position of the decimal point in the price
     *
     * @return the PriceDecimalPosition field
     */
    public PriceDecimalPositionField priceDecimalPosition() {
        return priceDecimalPosition;
    }

    /**
     * Denominator of the fractional part
     *
     * @return the PriceFractionalDenominator field
     */
    public PriceFractionalDenominatorField priceFractionalDenominator() {
        return priceFractionalDenominator;
    }

    /**
     * Minimum tick size
     *
     * @return the PriceMinimumTick field
     */
    public PriceMinimumTickField priceMinimumTick() {
        return priceMinimumTick;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!contractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContractNumberField.BYTE_LENGTH;
        if (!exchange.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
        if (!firstLegContractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += FirstLegContractNumberField.BYTE_LENGTH;
        if (!secondLegContractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SecondLegContractNumberField.BYTE_LENGTH;
        if (!primaryRatio.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryRatioField.BYTE_LENGTH;
        if (!secondaryRatio.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryRatioField.BYTE_LENGTH;
        if (!priceDecimalPosition.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimalPositionField.BYTE_LENGTH;
        if (!priceFractionalDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += PriceFractionalDenominatorField.BYTE_LENGTH;
        return priceMinimumTick.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = contractNumber.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = firstLegContractNumber.encode(data, cursor);
        cursor = secondLegContractNumber.encode(data, cursor);
        cursor = primaryRatio.encode(data, cursor);
        cursor = secondaryRatio.encode(data, cursor);
        cursor = priceDecimalPosition.encode(data, cursor);
        cursor = priceFractionalDenominator.encode(data, cursor);
        cursor = priceMinimumTick.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ContractNumber" -> Optional.of(contractNumber);
            case "Exchange" -> Optional.of(exchange);
            case "ContractType" -> Optional.of(contractType);
            case "FirstLegContractNumber" -> Optional.of(firstLegContractNumber);
            case "SecondLegContractNumber" -> Optional.of(secondLegContractNumber);
            case "PrimaryRatio" -> Optional.of(primaryRatio);
            case "SecondaryRatio" -> Optional.of(secondaryRatio);
            case "PriceDecimalPosition" -> Optional.of(priceDecimalPosition);
            case "PriceFractionalDenominator" -> Optional.of(priceFractionalDenominator);
            case "PriceMinimumTick" -> Optional.of(priceMinimumTick);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SpreadSymbolDirectoryMessage message)) {
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
        if (!(other instanceof SpreadSymbolDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
