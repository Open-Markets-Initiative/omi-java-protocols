package omi.nse.nsecd.orderentry.nnf.v6_3.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AdditionalOrderFlagsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuySellField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedVolField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedVolRemainingField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillerYField2;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillerxField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MinFillAonField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OpBrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OrderTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.PriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.StOrderFlagsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TokenField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TotalVolRemainingField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TriggerPriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolumeFilledTodayField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.ContractDesc;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.GroupEntry;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * The MsSpdLegInfoLeg3 record a message holds.
 *
 * <p>MS_SPD_LEG_INFO Leg 3</p>
 */
public final class MsSpdLegInfoLeg3 implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MsSpdLegInfoLeg3";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 78, 1 };

    /**
     * Token number of leg 2 contract of the spread combination
     */
    private final TokenField token = new TokenField();

    /**
     * OpBrokerId2
     */
    private final OpBrokerIdField opBrokerId = new OpBrokerIdField();

    /**
     * Fillerx2
     */
    private final FillerxField fillerx = new FillerxField();

    /**
     * OrderType2
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * BuySell2
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * DisclosedVol2
     */
    private final DisclosedVolField disclosedVol = new DisclosedVolField();

    /**
     * DisclosedVolRemaining2
     */
    private final DisclosedVolRemainingField disclosedVolRemaining = new DisclosedVolRemainingField();

    /**
     * TotalVolRemaining2
     */
    private final TotalVolRemainingField totalVolRemaining = new TotalVolRemainingField();

    /**
     * This field should contain the quantity of order placed
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This is not used
     */
    private final VolumeFilledTodayField volumeFilledToday = new VolumeFilledTodayField();

    /**
     * This is not used
     */
    private final PriceField price = new PriceField();

    /**
     * This is not used
     */
    private final TriggerPriceField triggerPrice = new TriggerPriceField();

    /**
     * MinFillAon2
     */
    private final MinFillAonField minFillAon = new MinFillAonField();

    /**
     * St Order Flags
     */
    private final StOrderFlagsField stOrderFlags = new StOrderFlagsField();

    /**
     * OpenClose2
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
     */
    private final AdditionalOrderFlagsField additionalOrderFlags = new AdditionalOrderFlagsField();

    /**
     * FillerY
     */
    private final FillerYField2 fillerY = new FillerYField2();

    /**
     * CONTRACT_DESC
     */
    private final ContractDesc contractDesc = new ContractDesc();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(token), contractDesc.fields(), List.<Field>of(opBrokerId), List.<Field>of(fillerx), List.<Field>of(orderType), List.<Field>of(buySell), List.<Field>of(disclosedVol), List.<Field>of(disclosedVolRemaining), List.<Field>of(totalVolRemaining), List.<Field>of(volume), List.<Field>of(volumeFilledToday), List.<Field>of(price), List.<Field>of(triggerPrice), List.<Field>of(minFillAon), List.<Field>of(stOrderFlags), List.<Field>of(openClose), List.<Field>of(additionalOrderFlags), List.<Field>of(fillerY)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Token number of leg 2 contract of the spread combination
     *
     * @return the Token field
     */
    public TokenField token() {
        return token;
    }

    /**
     * OpBrokerId2
     *
     * @return the OpBrokerId field
     */
    public OpBrokerIdField opBrokerId() {
        return opBrokerId;
    }

    /**
     * Fillerx2
     *
     * @return the Fillerx field
     */
    public FillerxField fillerx() {
        return fillerx;
    }

    /**
     * OrderType2
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * BuySell2
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * DisclosedVol2
     *
     * @return the DisclosedVol field
     */
    public DisclosedVolField disclosedVol() {
        return disclosedVol;
    }

    /**
     * DisclosedVolRemaining2
     *
     * @return the DisclosedVolRemaining field
     */
    public DisclosedVolRemainingField disclosedVolRemaining() {
        return disclosedVolRemaining;
    }

    /**
     * TotalVolRemaining2
     *
     * @return the TotalVolRemaining field
     */
    public TotalVolRemainingField totalVolRemaining() {
        return totalVolRemaining;
    }

    /**
     * This field should contain the quantity of order placed
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * This is not used
     *
     * @return the VolumeFilledToday field
     */
    public VolumeFilledTodayField volumeFilledToday() {
        return volumeFilledToday;
    }

    /**
     * This is not used
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * This is not used
     *
     * @return the TriggerPrice field
     */
    public TriggerPriceField triggerPrice() {
        return triggerPrice;
    }

    /**
     * MinFillAon2
     *
     * @return the MinFillAon field
     */
    public MinFillAonField minFillAon() {
        return minFillAon;
    }

    /**
     * St Order Flags
     *
     * @return the StOrderFlags field
     */
    public StOrderFlagsField stOrderFlags() {
        return stOrderFlags;
    }

    /**
     * OpenClose2
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
     *
     * @return the AdditionalOrderFlags field
     */
    public AdditionalOrderFlagsField additionalOrderFlags() {
        return additionalOrderFlags;
    }

    /**
     * FillerY
     *
     * @return the FillerY field
     */
    public FillerYField2 fillerY() {
        return fillerY;
    }

    /**
     * CONTRACT_DESC
     *
     * @return the ContractDesc record
     */
    public ContractDesc contractDesc() {
        return contractDesc;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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
        if (!token.parse(data, cursor)) {
            return false;
        }
        cursor += TokenField.BYTE_LENGTH;
        if (!contractDesc.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += contractDesc.byteLength();
        if (!opBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += OpBrokerIdField.BYTE_LENGTH;
        if (!fillerx.parse(data, cursor)) {
            return false;
        }
        cursor += FillerxField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!disclosedVol.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolField.BYTE_LENGTH;
        if (!disclosedVolRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolRemainingField.BYTE_LENGTH;
        if (!totalVolRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolRemainingField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!volumeFilledToday.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeFilledTodayField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!triggerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TriggerPriceField.BYTE_LENGTH;
        if (!minFillAon.parse(data, cursor)) {
            return false;
        }
        cursor += MinFillAonField.BYTE_LENGTH;
        if (!stOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += StOrderFlagsField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!additionalOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalOrderFlagsField.BYTE_LENGTH;
        cursor += 1; // padding
        return fillerY.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = token.encode(data, cursor);
        cursor = contractDesc.encode(data, cursor);
        cursor = opBrokerId.encode(data, cursor);
        cursor = fillerx.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = disclosedVol.encode(data, cursor);
        cursor = disclosedVolRemaining.encode(data, cursor);
        cursor = totalVolRemaining.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = volumeFilledToday.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = triggerPrice.encode(data, cursor);
        cursor = minFillAon.encode(data, cursor);
        cursor = stOrderFlags.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = additionalOrderFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 79) {
            System.arraycopy(buffer, 78, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = fillerY.encode(data, cursor);
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
        contractDesc.clear();
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "Token" -> Optional.of(token);
            case "OpBrokerId" -> Optional.of(opBrokerId);
            case "Fillerx" -> Optional.of(fillerx);
            case "OrderType" -> Optional.of(orderType);
            case "BuySell" -> Optional.of(buySell);
            case "DisclosedVol" -> Optional.of(disclosedVol);
            case "DisclosedVolRemaining" -> Optional.of(disclosedVolRemaining);
            case "TotalVolRemaining" -> Optional.of(totalVolRemaining);
            case "Volume" -> Optional.of(volume);
            case "VolumeFilledToday" -> Optional.of(volumeFilledToday);
            case "Price" -> Optional.of(price);
            case "TriggerPrice" -> Optional.of(triggerPrice);
            case "MinFillAon" -> Optional.of(minFillAon);
            case "StOrderFlags" -> Optional.of(stOrderFlags);
            case "OpenClose" -> Optional.of(openClose);
            case "AdditionalOrderFlags" -> Optional.of(additionalOrderFlags);
            case "FillerY" -> Optional.of(fillerY);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MsSpdLegInfoLeg3 message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof MsSpdLegInfoLeg3 message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
