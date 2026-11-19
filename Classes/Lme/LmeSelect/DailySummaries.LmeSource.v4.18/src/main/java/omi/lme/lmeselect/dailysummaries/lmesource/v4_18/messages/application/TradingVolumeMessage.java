package omi.lme.lmeselect.dailysummaries.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.BusinessDateField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.CalculationTypeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.ContractTypeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.InstrumentIdField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.TradeDateField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.fields.VolumeField;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.dailysummaries.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the TradingVolumeMessage message from the DailySummaries protocol.
 *
 * <p>Provides the traded volume in lots for matched trades in futures and options instruments. All trades resulting from Cross Order execution, whether off-book or not, are included in the trading volume calculation.</p>
 */
public final class TradingVolumeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Volume Message";

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
     */
    private final BusinessDateField businessDate = new BusinessDateField();

    /**
     * The trade date for which the trading volume is being reported, as YYYYMMDD.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Trading volume calculation type.
     */
    private final CalculationTypeField calculationType = new CalculationTypeField();

    /**
     * Instrument to which the open interest applies.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * The product code. This identifies the metal for the instrument.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Contract to which the instrument belongs.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Constant contract type.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * Number of open positions expressed in lots.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(businessDate, tradeDate, calculationType, instrumentId, productCode, contractCode, contractType, volume);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The business date for which the open interest is being reported, as YYYYMMDD.
     *
     * @return the BusinessDate field
     */
    public BusinessDateField businessDate() {
        return businessDate;
    }

    /**
     * The trade date for which the trading volume is being reported, as YYYYMMDD.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Trading volume calculation type.
     *
     * @return the CalculationType field
     */
    public CalculationTypeField calculationType() {
        return calculationType;
    }

    /**
     * Instrument to which the open interest applies.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * The product code. This identifies the metal for the instrument.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Contract to which the instrument belongs.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Constant contract type.
     *
     * @return the ContractType field
     */
    public ContractTypeField contractType() {
        return contractType;
    }

    /**
     * Number of open positions expressed in lots.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
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
        if (!businessDate.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDateField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!calculationType.parse(data, cursor)) {
            return false;
        }
        cursor += CalculationTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
        return volume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = businessDate.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = calculationType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = volume.encode(data, cursor);
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
            case "BusinessDate" -> Optional.of(businessDate);
            case "TradeDate" -> Optional.of(tradeDate);
            case "CalculationType" -> Optional.of(calculationType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ProductCode" -> Optional.of(productCode);
            case "ContractCode" -> Optional.of(contractCode);
            case "ContractType" -> Optional.of(contractType);
            case "Volume" -> Optional.of(volume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingVolumeMessage message)) {
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
        if (!(other instanceof TradingVolumeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
