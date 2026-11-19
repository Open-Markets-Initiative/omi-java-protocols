package omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.ClientAccountField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.CustomerInfoField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.ExchangeInfoField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.ExistingOrderTokenField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.OpenCloseField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.PriceField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.QuantityField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.ReplacementOrderTokenField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Field;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Message;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.PrintOptions;

/**
 * Represents the ReplaceOrder message from the GeniumInet protocol.
 *
 * <p>Client-generated replace order request.</p>
 */
public final class ReplaceOrder implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 104;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replace Order";

    /**
     * References the order to be replaced. Must be the original order token or the most recent successful replacement order token.
     */
    private final ExistingOrderTokenField existingOrderToken = new ExistingOrderTokenField();

    /**
     * Client-generated replacement order identifier.
     */
    private final ReplacementOrderTokenField replacementOrderToken = new ReplacementOrderTokenField();

    /**
     * Order quantity.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Signed integer price.
     */
    private final PriceField price = new PriceField();

    /**
     * Position update indicator
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Pass-through client/account field
     */
    private final ClientAccountField clientAccount = new ClientAccountField();

    /**
     * Pass-through customer information
     */
    private final CustomerInfoField customerInfo = new CustomerInfoField();

    /**
     * The Exchange info field is formatted and validated
     */
    private final ExchangeInfoField exchangeInfo = new ExchangeInfoField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(existingOrderToken, replacementOrderToken, quantity, price, openClose, clientAccount, customerInfo, exchangeInfo);

    private byte[] buffer;

    private boolean decoded;

    /**
     * References the order to be replaced. Must be the original order token or the most recent successful replacement order token.
     *
     * @return the ExistingOrderToken field
     */
    public ExistingOrderTokenField existingOrderToken() {
        return existingOrderToken;
    }

    /**
     * Client-generated replacement order identifier.
     *
     * @return the ReplacementOrderToken field
     */
    public ReplacementOrderTokenField replacementOrderToken() {
        return replacementOrderToken;
    }

    /**
     * Order quantity.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Signed integer price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Position update indicator
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Pass-through client/account field
     *
     * @return the ClientAccount field
     */
    public ClientAccountField clientAccount() {
        return clientAccount;
    }

    /**
     * Pass-through customer information
     *
     * @return the CustomerInfo field
     */
    public CustomerInfoField customerInfo() {
        return customerInfo;
    }

    /**
     * The Exchange info field is formatted and validated
     *
     * @return the ExchangeInfo field
     */
    public ExchangeInfoField exchangeInfo() {
        return exchangeInfo;
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
        if (!existingOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += ExistingOrderTokenField.BYTE_LENGTH;
        if (!replacementOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += ReplacementOrderTokenField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!clientAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClientAccountField.BYTE_LENGTH;
        if (!customerInfo.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerInfoField.BYTE_LENGTH;
        return exchangeInfo.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = existingOrderToken.encode(data, cursor);
        cursor = replacementOrderToken.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = clientAccount.encode(data, cursor);
        cursor = customerInfo.encode(data, cursor);
        cursor = exchangeInfo.encode(data, cursor);
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
            case "ExistingOrderToken" -> Optional.of(existingOrderToken);
            case "ReplacementOrderToken" -> Optional.of(replacementOrderToken);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "OpenClose" -> Optional.of(openClose);
            case "ClientAccount" -> Optional.of(clientAccount);
            case "CustomerInfo" -> Optional.of(customerInfo);
            case "ExchangeInfo" -> Optional.of(exchangeInfo);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplaceOrder message)) {
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
        if (!(other instanceof ReplaceOrder message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
