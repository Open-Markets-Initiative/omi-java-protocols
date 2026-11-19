package omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.CurrencyField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.ExchangeSymbolField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.FlagsField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.IsinField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.MicField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.SecurityIdField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.TickTableIdField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.UmtfField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.structs.LotSizeComposite;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.Field;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.Message;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.PrintOptions;

/**
 * Represents the SecurityDefinitionMessage message from the RealTime protocol.
 *
 * <p>Security Definition messages are published to identify the securities traded on AsiaNext.</p>
 */
public final class SecurityDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\b';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 61;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Message";

    /**
     * Numeric identifier of the relevant security
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * This is used to represent the exchange Symbol
     */
    private final UmtfField umtf = new UmtfField();

    /**
     * ISIN for the security. This is not applicable to AsiaNext
     */
    private final IsinField isin = new IsinField();

    /**
     * Trading currency for the security
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * MIC for the security's market of listing
     */
    private final MicField mic = new MicField();

    /**
     * Numeric identifier for this tick table or static tick
     */
    private final TickTableIdField tickTableId = new TickTableIdField();

    /**
     * Security flags
     */
    private final FlagsField flags = new FlagsField();

    /**
     * Exchange symbol for the security
     */
    private final ExchangeSymbolField exchangeSymbol = new ExchangeSymbolField();

    /**
     * Lot size scaled at runtime by lotSizeDecimal
     */
    private final LotSizeComposite lotSizeComposite = new LotSizeComposite();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityId), List.<Field>of(umtf), List.<Field>of(isin), List.<Field>of(currency), List.<Field>of(mic), List.<Field>of(tickTableId), List.<Field>of(flags), List.<Field>of(exchangeSymbol), lotSizeComposite.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Numeric identifier of the relevant security
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * This is used to represent the exchange Symbol
     *
     * @return the Umtf field
     */
    public UmtfField umtf() {
        return umtf;
    }

    /**
     * ISIN for the security. This is not applicable to AsiaNext
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Trading currency for the security
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * MIC for the security's market of listing
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * Numeric identifier for this tick table or static tick
     *
     * @return the TickTableId field
     */
    public TickTableIdField tickTableId() {
        return tickTableId;
    }

    /**
     * Security flags
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
    }

    /**
     * Exchange symbol for the security
     *
     * @return the ExchangeSymbol field
     */
    public ExchangeSymbolField exchangeSymbol() {
        return exchangeSymbol;
    }

    /**
     * Lot size scaled at runtime by lotSizeDecimal
     *
     * @return the LotSizeComposite record
     */
    public LotSizeComposite lotSizeComposite() {
        return lotSizeComposite;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!umtf.parse(data, cursor)) {
            return false;
        }
        cursor += UmtfField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!tickTableId.parse(data, cursor)) {
            return false;
        }
        cursor += TickTableIdField.BYTE_LENGTH;
        if (!flags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsField.BYTE_LENGTH;
        if (!exchangeSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeSymbolField.BYTE_LENGTH;
        return lotSizeComposite.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = umtf.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = tickTableId.encode(data, cursor);
        cursor = flags.encode(data, cursor);
        cursor = exchangeSymbol.encode(data, cursor);
        cursor = lotSizeComposite.encode(data, cursor);
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
        lotSizeComposite.clear();
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
            case "SecurityId" -> Optional.of(securityId);
            case "Umtf" -> Optional.of(umtf);
            case "Isin" -> Optional.of(isin);
            case "Currency" -> Optional.of(currency);
            case "Mic" -> Optional.of(mic);
            case "TickTableId" -> Optional.of(tickTableId);
            case "Flags" -> Optional.of(flags);
            case "ExchangeSymbol" -> Optional.of(exchangeSymbol);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionMessage message)) {
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
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
