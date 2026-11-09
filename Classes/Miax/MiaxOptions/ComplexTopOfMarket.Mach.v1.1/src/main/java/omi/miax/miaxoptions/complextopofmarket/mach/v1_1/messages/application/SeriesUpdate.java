package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.ActiveOnMiaxField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.CallOrPutField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.ClosingTimeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.ExpirationDateField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.LiquidityAcceptanceIncrementIndicatorField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.LongTermOptionField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.MiaxBboPostingIncrementIndicatorField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.NanosecondsField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.OpeningTimeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.OpeningUnderlyingMarketCodeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.PriorityQuoteWidthField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.ProductIdField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.RestrictedOptionField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.SecuritySymbolField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.StrikePriceField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.UnderlyingSymbolField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Field;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Message;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.PrintOptions;

/**
 * Represents the SeriesUpdate message from the ComplexTopOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate all Option series traded on MIAX for the current session. The product ID sent in this message is what will be disseminated in Top of Market BBO and Last Sale messages.</p>
 */
public final class SeriesUpdate implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Series Update";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 64, 8 };

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * MIAX Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Stock Symbol for the option.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Option Security Symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Expiration date of the option in YYYYMMDD format
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Explicit strike price of the option. Refer to data types for field processing notes
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Option Type: “C” = Call, “P” = Put
     */
    private final CallOrPutField callOrPut = new CallOrPutField();

    /**
     * Expressed in HH:MM:SS format. Eg: 09:30:00
     */
    private final OpeningTimeField openingTime = new OpeningTimeField();

    /**
     * Expressed in HH:MM:SS format. Eg: 16:15:00
     */
    private final ClosingTimeField closingTime = new ClosingTimeField();

    /**
     * Restricted Option
     */
    private final RestrictedOptionField restrictedOption = new RestrictedOptionField();

    /**
     * Long Term Option
     */
    private final LongTermOptionField longTermOption = new LongTermOptionField();

    /**
     * Indicates if this symbol is tradable on MIAX in the current session: “A” = Active (tradable) on MIAX “I” = Inactive (not tradable) on MIAX
     */
    private final ActiveOnMiaxField activeOnMiax = new ActiveOnMiaxField();

    /**
     * This is the Minimum Price Variation as agreed to by the Options industry (penny pilot program) and as published by MIAX
     */
    private final MiaxBboPostingIncrementIndicatorField miaxBboPostingIncrementIndicator = new MiaxBboPostingIncrementIndicatorField();

    /**
     * This is the Minimum Price Variation for Quote/Order acceptance as per MIAX rules
     */
    private final LiquidityAcceptanceIncrementIndicatorField liquidityAcceptanceIncrementIndicator = new LiquidityAcceptanceIncrementIndicatorField();

    /**
     * Options opening will be triggered on receipt of Opening quote/trade from this Underlying market:
     */
    private final OpeningUnderlyingMarketCodeField openingUnderlyingMarketCode = new OpeningUnderlyingMarketCodeField();

    /**
     * Maximum allowable width for a quote for this Option during regular trading in order to be considered as Priority Quote. 0 when Priority Quote Width is not applicable.
     */
    private final PriorityQuoteWidthField priorityQuoteWidth = new PriorityQuoteWidthField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, productId, underlyingSymbol, securitySymbol, expirationDate, strikePrice, callOrPut, openingTime, closingTime, restrictedOption, longTermOption, activeOnMiax, miaxBboPostingIncrementIndicator, liquidityAcceptanceIncrementIndicator, openingUnderlyingMarketCode, priorityQuoteWidth);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on MIAX system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * MIAX Product ID mapped to a given option. It is assigned per trading session and is valid for that session.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * Stock Symbol for the option.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Option Security Symbol
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Expiration date of the option in YYYYMMDD format
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Explicit strike price of the option. Refer to data types for field processing notes
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Option Type: “C” = Call, “P” = Put
     *
     * @return the CallOrPut field
     */
    public CallOrPutField callOrPut() {
        return callOrPut;
    }

    /**
     * Expressed in HH:MM:SS format. Eg: 09:30:00
     *
     * @return the OpeningTime field
     */
    public OpeningTimeField openingTime() {
        return openingTime;
    }

    /**
     * Expressed in HH:MM:SS format. Eg: 16:15:00
     *
     * @return the ClosingTime field
     */
    public ClosingTimeField closingTime() {
        return closingTime;
    }

    /**
     * Restricted Option
     *
     * @return the RestrictedOption field
     */
    public RestrictedOptionField restrictedOption() {
        return restrictedOption;
    }

    /**
     * Long Term Option
     *
     * @return the LongTermOption field
     */
    public LongTermOptionField longTermOption() {
        return longTermOption;
    }

    /**
     * Indicates if this symbol is tradable on MIAX in the current session: “A” = Active (tradable) on MIAX “I” = Inactive (not tradable) on MIAX
     *
     * @return the ActiveOnMiax field
     */
    public ActiveOnMiaxField activeOnMiax() {
        return activeOnMiax;
    }

    /**
     * This is the Minimum Price Variation as agreed to by the Options industry (penny pilot program) and as published by MIAX
     *
     * @return the MiaxBboPostingIncrementIndicator field
     */
    public MiaxBboPostingIncrementIndicatorField miaxBboPostingIncrementIndicator() {
        return miaxBboPostingIncrementIndicator;
    }

    /**
     * This is the Minimum Price Variation for Quote/Order acceptance as per MIAX rules
     *
     * @return the LiquidityAcceptanceIncrementIndicator field
     */
    public LiquidityAcceptanceIncrementIndicatorField liquidityAcceptanceIncrementIndicator() {
        return liquidityAcceptanceIncrementIndicator;
    }

    /**
     * Options opening will be triggered on receipt of Opening quote/trade from this Underlying market:
     *
     * @return the OpeningUnderlyingMarketCode field
     */
    public OpeningUnderlyingMarketCodeField openingUnderlyingMarketCode() {
        return openingUnderlyingMarketCode;
    }

    /**
     * Maximum allowable width for a quote for this Option during regular trading in order to be considered as Priority Quote. 0 when Priority Quote Width is not applicable.
     *
     * @return the PriorityQuoteWidth field
     */
    public PriorityQuoteWidthField priorityQuoteWidth() {
        return priorityQuoteWidth;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!callOrPut.parse(data, cursor)) {
            return false;
        }
        cursor += CallOrPutField.BYTE_LENGTH;
        if (!openingTime.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningTimeField.BYTE_LENGTH;
        if (!closingTime.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingTimeField.BYTE_LENGTH;
        if (!restrictedOption.parse(data, cursor)) {
            return false;
        }
        cursor += RestrictedOptionField.BYTE_LENGTH;
        if (!longTermOption.parse(data, cursor)) {
            return false;
        }
        cursor += LongTermOptionField.BYTE_LENGTH;
        if (!activeOnMiax.parse(data, cursor)) {
            return false;
        }
        cursor += ActiveOnMiaxField.BYTE_LENGTH;
        if (!miaxBboPostingIncrementIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MiaxBboPostingIncrementIndicatorField.BYTE_LENGTH;
        if (!liquidityAcceptanceIncrementIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityAcceptanceIncrementIndicatorField.BYTE_LENGTH;
        if (!openingUnderlyingMarketCode.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningUnderlyingMarketCodeField.BYTE_LENGTH;
        if (!priorityQuoteWidth.parse(data, cursor)) {
            return false;
        }
        cursor += PriorityQuoteWidthField.BYTE_LENGTH;
        cursor += 8; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = callOrPut.encode(data, cursor);
        cursor = openingTime.encode(data, cursor);
        cursor = closingTime.encode(data, cursor);
        cursor = restrictedOption.encode(data, cursor);
        cursor = longTermOption.encode(data, cursor);
        cursor = activeOnMiax.encode(data, cursor);
        cursor = miaxBboPostingIncrementIndicator.encode(data, cursor);
        cursor = liquidityAcceptanceIncrementIndicator.encode(data, cursor);
        cursor = openingUnderlyingMarketCode.encode(data, cursor);
        cursor = priorityQuoteWidth.encode(data, cursor);
        if (buffer != null && buffer.length >= 64 + 8) {
            System.arraycopy(buffer, 64, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
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
            case "ProductId" -> Optional.of(productId);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "CallOrPut" -> Optional.of(callOrPut);
            case "OpeningTime" -> Optional.of(openingTime);
            case "ClosingTime" -> Optional.of(closingTime);
            case "RestrictedOption" -> Optional.of(restrictedOption);
            case "LongTermOption" -> Optional.of(longTermOption);
            case "ActiveOnMiax" -> Optional.of(activeOnMiax);
            case "MiaxBboPostingIncrementIndicator" -> Optional.of(miaxBboPostingIncrementIndicator);
            case "LiquidityAcceptanceIncrementIndicator" -> Optional.of(liquidityAcceptanceIncrementIndicator);
            case "OpeningUnderlyingMarketCode" -> Optional.of(openingUnderlyingMarketCode);
            case "PriorityQuoteWidth" -> Optional.of(priorityQuoteWidth);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SeriesUpdate message)) {
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
        if (!(other instanceof SeriesUpdate message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
