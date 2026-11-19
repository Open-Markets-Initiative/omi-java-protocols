package omi.hkex.hkexsecurities.fulltick.omd.v1_45.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.fields.NoLiquidityProvidersField;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.fields.SecurityCodeField;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.groups.LiquidityProviderEntry;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.groups.LiquidityProviderList;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.types.Field;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.types.Message;
import omi.hkex.hkexsecurities.fulltick.omd.v1_45.types.PrintOptions;

/**
 * Represents the LiquidityProviderMessage message from the FullTick protocol.
 *
 * <p>The Liquidity Provider message is generated at the start of the business day for securities that have at least one liquidity provider.</p>
 */
public final class LiquidityProviderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 6;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Liquidity Provider Message";

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Number of liquidity providers within this message. 1 to 50.
     */
    private final NoLiquidityProvidersField noLiquidityProviders = new NoLiquidityProvidersField();

    /**
     * Repeating group of liquidity providers.
     */
    private final LiquidityProviderList liquidityProvider = new LiquidityProviderList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityCode, noLiquidityProviders);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Number of liquidity providers within this message. 1 to 50.
     *
     * @return the NoLiquidityProviders field
     */
    public NoLiquidityProvidersField noLiquidityProviders() {
        return noLiquidityProviders;
    }

    /**
     * Repeating group of liquidity providers.
     *
     * <p>Encode writes this list's size to the NoLiquidityProviders field.</p>
     *
     * @return the LiquidityProvider entries
     */
    public LiquidityProviderList liquidityProvider() {
        return liquidityProvider;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + liquidityProvider.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!noLiquidityProviders.parse(data, cursor)) {
            return false;
        }
        cursor += NoLiquidityProvidersField.BYTE_LENGTH;
        if (!liquidityProvider.parse(data, cursor, end, noLiquidityProviders.value())) {
            return false;
        }
        cursor += liquidityProvider.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (liquidityProvider.size() > 65535) {
            throw new IllegalStateException("liquidityProvider holds " + liquidityProvider.size() + " entries, more than its count field can state");
        }
        noLiquidityProviders.value(liquidityProvider.size());
        int cursor = offset;
        cursor = securityCode.encode(data, cursor);
        cursor = noLiquidityProviders.encode(data, cursor);
        cursor = liquidityProvider.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        liquidityProvider.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLiquidityProviders && !field.isRecognized()) {
                return false;
            }
        }
        return liquidityProvider.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLiquidityProviders && !field.isValid()) {
                return false;
            }
        }
        if (!liquidityProvider.isValid()) {
            return false;
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
        if (!securityCode.isDecoded()) {
            return Optional.of(securityCode);
        }
        if (!noLiquidityProviders.isDecoded()) {
            return Optional.of(noLiquidityProviders);
        }
        if (!liquidityProvider.isDecoded()) {
            return Optional.of(liquidityProvider.failedEntry().flatMap(LiquidityProviderEntry::failedAt).orElse(noLiquidityProviders));
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
            case "SecurityCode" -> Optional.of(securityCode);
            case "NoLiquidityProviders" -> Optional.of(noLiquidityProviders);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LiquidityProviderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(liquidityProvider.diffFields(message.liquidityProvider));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            liquidityProvider.toFormattedString(builder, options);
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
        liquidityProvider.toFormattedString(builder, nested);
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
        if (!(other instanceof LiquidityProviderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && liquidityProvider.equals(message.liquidityProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, liquidityProvider);
    }
}
