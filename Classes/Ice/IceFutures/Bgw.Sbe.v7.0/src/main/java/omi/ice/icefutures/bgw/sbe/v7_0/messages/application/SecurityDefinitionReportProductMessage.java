package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CrossingOrderFuturesAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CrossingOrderOptionsAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ListSeqNoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTypeIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MassQuotesAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidRegulatedMarketBooleanEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NoRptsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OptionsAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ProductIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ProductTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RfqFuturesAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RfqOptionsAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityReqIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityResponseIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityResponseTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SelfBlockAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StopsAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TestMarketIndicatorBooleanEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.UdsFuturesAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.UdsOptionsAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ProductDesc;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ProductGroup;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ProductName;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the SecurityDefinitionReportProductMessage message from the Bgw protocol.
 *
 * <p>SecurityDefinitionReport_ProductMessage</p>
 */
public final class SecurityDefinitionReportProductMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 55;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Report Product Message";

    /**
     * securityReqID
     */
    private final SecurityReqIdField securityReqId = new SecurityReqIdField();

    /**
     * securityResponseType
     */
    private final SecurityResponseTypeField securityResponseType = new SecurityResponseTypeField();

    /**
     * securityResponseID
     */
    private final SecurityResponseIdField securityResponseId = new SecurityResponseIdField();

    /**
     * marketTypeID
     */
    private final MarketTypeIDIntField marketTypeIDInt = new MarketTypeIDIntField();

    /**
     * noRpts
     */
    private final NoRptsField noRpts = new NoRptsField();

    /**
     * listSeqNo
     */
    private final ListSeqNoField listSeqNo = new ListSeqNoField();

    /**
     * productID
     */
    private final ProductIDIntField productIDInt = new ProductIDIntField();

    /**
     * productType
     */
    private final ProductTypeField productType = new ProductTypeField();

    /**
     * mifidRegulatedMarket
     */
    private final MifidRegulatedMarketBooleanEnumField mifidRegulatedMarketBooleanEnum = new MifidRegulatedMarketBooleanEnumField();

    /**
     * testMarketIndicator
     */
    private final TestMarketIndicatorBooleanEnumField testMarketIndicatorBooleanEnum = new TestMarketIndicatorBooleanEnumField();

    /**
     * stopsAllowed
     */
    private final StopsAllowedField stopsAllowed = new StopsAllowedField();

    /**
     * optionsAllowed
     */
    private final OptionsAllowedField optionsAllowed = new OptionsAllowedField();

    /**
     * udsOptionsAllowed
     */
    private final UdsOptionsAllowedField udsOptionsAllowed = new UdsOptionsAllowedField();

    /**
     * udsFuturesAllowed
     */
    private final UdsFuturesAllowedField udsFuturesAllowed = new UdsFuturesAllowedField();

    /**
     * massQuotesAllowed
     */
    private final MassQuotesAllowedField massQuotesAllowed = new MassQuotesAllowedField();

    /**
     * rfqFuturesAllowed
     */
    private final RfqFuturesAllowedField rfqFuturesAllowed = new RfqFuturesAllowedField();

    /**
     * rfqOptionsAllowed
     */
    private final RfqOptionsAllowedField rfqOptionsAllowed = new RfqOptionsAllowedField();

    /**
     * crossingOrderFuturesAllowed
     */
    private final CrossingOrderFuturesAllowedField crossingOrderFuturesAllowed = new CrossingOrderFuturesAllowedField();

    /**
     * crossingOrderOptionsAllowed
     */
    private final CrossingOrderOptionsAllowedField crossingOrderOptionsAllowed = new CrossingOrderOptionsAllowedField();

    /**
     * selfBlockAllowed
     */
    private final SelfBlockAllowedField selfBlockAllowed = new SelfBlockAllowedField();

    /**
     * productName data struct
     */
    private final ProductName productName = new ProductName();

    /**
     * productDesc data struct
     */
    private final ProductDesc productDesc = new ProductDesc();

    /**
     * productGroup data struct
     */
    private final ProductGroup productGroup = new ProductGroup();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityReqId), List.<Field>of(securityResponseType), List.<Field>of(securityResponseId), List.<Field>of(marketTypeIDInt), List.<Field>of(noRpts), List.<Field>of(listSeqNo), List.<Field>of(productIDInt), List.<Field>of(productType), List.<Field>of(mifidRegulatedMarketBooleanEnum), List.<Field>of(testMarketIndicatorBooleanEnum), List.<Field>of(stopsAllowed), List.<Field>of(optionsAllowed), List.<Field>of(udsOptionsAllowed), List.<Field>of(udsFuturesAllowed), List.<Field>of(massQuotesAllowed), List.<Field>of(rfqFuturesAllowed), List.<Field>of(rfqOptionsAllowed), List.<Field>of(crossingOrderFuturesAllowed), List.<Field>of(crossingOrderOptionsAllowed), List.<Field>of(selfBlockAllowed), productName.fields(), productDesc.fields(), productGroup.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityReqID
     *
     * @return the SecurityReqId field
     */
    public SecurityReqIdField securityReqId() {
        return securityReqId;
    }

    /**
     * securityResponseType
     *
     * @return the SecurityResponseType field
     */
    public SecurityResponseTypeField securityResponseType() {
        return securityResponseType;
    }

    /**
     * securityResponseID
     *
     * @return the SecurityResponseId field
     */
    public SecurityResponseIdField securityResponseId() {
        return securityResponseId;
    }

    /**
     * marketTypeID
     *
     * @return the MarketTypeIDInt field
     */
    public MarketTypeIDIntField marketTypeIDInt() {
        return marketTypeIDInt;
    }

    /**
     * noRpts
     *
     * @return the NoRpts field
     */
    public NoRptsField noRpts() {
        return noRpts;
    }

    /**
     * listSeqNo
     *
     * @return the ListSeqNo field
     */
    public ListSeqNoField listSeqNo() {
        return listSeqNo;
    }

    /**
     * productID
     *
     * @return the ProductIDInt field
     */
    public ProductIDIntField productIDInt() {
        return productIDInt;
    }

    /**
     * productType
     *
     * @return the ProductType field
     */
    public ProductTypeField productType() {
        return productType;
    }

    /**
     * mifidRegulatedMarket
     *
     * @return the MifidRegulatedMarketBooleanEnum field
     */
    public MifidRegulatedMarketBooleanEnumField mifidRegulatedMarketBooleanEnum() {
        return mifidRegulatedMarketBooleanEnum;
    }

    /**
     * testMarketIndicator
     *
     * @return the TestMarketIndicatorBooleanEnum field
     */
    public TestMarketIndicatorBooleanEnumField testMarketIndicatorBooleanEnum() {
        return testMarketIndicatorBooleanEnum;
    }

    /**
     * stopsAllowed
     *
     * @return the StopsAllowed field
     */
    public StopsAllowedField stopsAllowed() {
        return stopsAllowed;
    }

    /**
     * optionsAllowed
     *
     * @return the OptionsAllowed field
     */
    public OptionsAllowedField optionsAllowed() {
        return optionsAllowed;
    }

    /**
     * udsOptionsAllowed
     *
     * @return the UdsOptionsAllowed field
     */
    public UdsOptionsAllowedField udsOptionsAllowed() {
        return udsOptionsAllowed;
    }

    /**
     * udsFuturesAllowed
     *
     * @return the UdsFuturesAllowed field
     */
    public UdsFuturesAllowedField udsFuturesAllowed() {
        return udsFuturesAllowed;
    }

    /**
     * massQuotesAllowed
     *
     * @return the MassQuotesAllowed field
     */
    public MassQuotesAllowedField massQuotesAllowed() {
        return massQuotesAllowed;
    }

    /**
     * rfqFuturesAllowed
     *
     * @return the RfqFuturesAllowed field
     */
    public RfqFuturesAllowedField rfqFuturesAllowed() {
        return rfqFuturesAllowed;
    }

    /**
     * rfqOptionsAllowed
     *
     * @return the RfqOptionsAllowed field
     */
    public RfqOptionsAllowedField rfqOptionsAllowed() {
        return rfqOptionsAllowed;
    }

    /**
     * crossingOrderFuturesAllowed
     *
     * @return the CrossingOrderFuturesAllowed field
     */
    public CrossingOrderFuturesAllowedField crossingOrderFuturesAllowed() {
        return crossingOrderFuturesAllowed;
    }

    /**
     * crossingOrderOptionsAllowed
     *
     * @return the CrossingOrderOptionsAllowed field
     */
    public CrossingOrderOptionsAllowedField crossingOrderOptionsAllowed() {
        return crossingOrderOptionsAllowed;
    }

    /**
     * selfBlockAllowed
     *
     * @return the SelfBlockAllowed field
     */
    public SelfBlockAllowedField selfBlockAllowed() {
        return selfBlockAllowed;
    }

    /**
     * productName data struct
     *
     * @return the ProductName record
     */
    public ProductName productName() {
        return productName;
    }

    /**
     * productDesc data struct
     *
     * @return the ProductDesc record
     */
    public ProductDesc productDesc() {
        return productDesc;
    }

    /**
     * productGroup data struct
     *
     * @return the ProductGroup record
     */
    public ProductGroup productGroup() {
        return productGroup;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + productName.byteLength() - ProductName.MINIMUM_BYTE_LENGTH + productDesc.byteLength() - ProductDesc.MINIMUM_BYTE_LENGTH + productGroup.byteLength() - ProductGroup.MINIMUM_BYTE_LENGTH;
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
        if (!securityReqId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReqIdField.BYTE_LENGTH;
        if (!securityResponseType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseTypeField.BYTE_LENGTH;
        if (!securityResponseId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseIdField.BYTE_LENGTH;
        if (!marketTypeIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTypeIDIntField.BYTE_LENGTH;
        if (!noRpts.parse(data, cursor)) {
            return false;
        }
        cursor += NoRptsField.BYTE_LENGTH;
        if (!listSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += ListSeqNoField.BYTE_LENGTH;
        if (!productIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIDIntField.BYTE_LENGTH;
        if (!productType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductTypeField.BYTE_LENGTH;
        if (!mifidRegulatedMarketBooleanEnum.parse(data, cursor)) {
            return false;
        }
        cursor += MifidRegulatedMarketBooleanEnumField.BYTE_LENGTH;
        if (!testMarketIndicatorBooleanEnum.parse(data, cursor)) {
            return false;
        }
        cursor += TestMarketIndicatorBooleanEnumField.BYTE_LENGTH;
        if (!stopsAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += StopsAllowedField.BYTE_LENGTH;
        if (!optionsAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsAllowedField.BYTE_LENGTH;
        if (!udsOptionsAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += UdsOptionsAllowedField.BYTE_LENGTH;
        if (!udsFuturesAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += UdsFuturesAllowedField.BYTE_LENGTH;
        if (!massQuotesAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += MassQuotesAllowedField.BYTE_LENGTH;
        if (!rfqFuturesAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += RfqFuturesAllowedField.BYTE_LENGTH;
        if (!rfqOptionsAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += RfqOptionsAllowedField.BYTE_LENGTH;
        if (!crossingOrderFuturesAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += CrossingOrderFuturesAllowedField.BYTE_LENGTH;
        if (!crossingOrderOptionsAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += CrossingOrderOptionsAllowedField.BYTE_LENGTH;
        if (!selfBlockAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += SelfBlockAllowedField.BYTE_LENGTH;
        if (!productName.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += productName.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!productDesc.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += productDesc.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!productGroup.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += productGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = securityReqId.encode(data, cursor);
        cursor = securityResponseType.encode(data, cursor);
        cursor = securityResponseId.encode(data, cursor);
        cursor = marketTypeIDInt.encode(data, cursor);
        cursor = noRpts.encode(data, cursor);
        cursor = listSeqNo.encode(data, cursor);
        cursor = productIDInt.encode(data, cursor);
        cursor = productType.encode(data, cursor);
        cursor = mifidRegulatedMarketBooleanEnum.encode(data, cursor);
        cursor = testMarketIndicatorBooleanEnum.encode(data, cursor);
        cursor = stopsAllowed.encode(data, cursor);
        cursor = optionsAllowed.encode(data, cursor);
        cursor = udsOptionsAllowed.encode(data, cursor);
        cursor = udsFuturesAllowed.encode(data, cursor);
        cursor = massQuotesAllowed.encode(data, cursor);
        cursor = rfqFuturesAllowed.encode(data, cursor);
        cursor = rfqOptionsAllowed.encode(data, cursor);
        cursor = crossingOrderFuturesAllowed.encode(data, cursor);
        cursor = crossingOrderOptionsAllowed.encode(data, cursor);
        cursor = selfBlockAllowed.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = productDesc.encode(data, cursor);
        cursor = productGroup.encode(data, cursor);
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
        productName.clear();
        productDesc.clear();
        productGroup.clear();
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
            if (field != productName.productNameLength() && field != productDesc.productDescLength() && field != productGroup.productGroupLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != productName.productNameLength() && field != productDesc.productDescLength() && field != productGroup.productGroupLength() && !field.isValid()) {
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
            case "SecurityReqId" -> Optional.of(securityReqId);
            case "SecurityResponseType" -> Optional.of(securityResponseType);
            case "SecurityResponseId" -> Optional.of(securityResponseId);
            case "MarketTypeIDInt" -> Optional.of(marketTypeIDInt);
            case "NoRpts" -> Optional.of(noRpts);
            case "ListSeqNo" -> Optional.of(listSeqNo);
            case "ProductIDInt" -> Optional.of(productIDInt);
            case "ProductType" -> Optional.of(productType);
            case "MifidRegulatedMarketBooleanEnum" -> Optional.of(mifidRegulatedMarketBooleanEnum);
            case "TestMarketIndicatorBooleanEnum" -> Optional.of(testMarketIndicatorBooleanEnum);
            case "StopsAllowed" -> Optional.of(stopsAllowed);
            case "OptionsAllowed" -> Optional.of(optionsAllowed);
            case "UdsOptionsAllowed" -> Optional.of(udsOptionsAllowed);
            case "UdsFuturesAllowed" -> Optional.of(udsFuturesAllowed);
            case "MassQuotesAllowed" -> Optional.of(massQuotesAllowed);
            case "RfqFuturesAllowed" -> Optional.of(rfqFuturesAllowed);
            case "RfqOptionsAllowed" -> Optional.of(rfqOptionsAllowed);
            case "CrossingOrderFuturesAllowed" -> Optional.of(crossingOrderFuturesAllowed);
            case "CrossingOrderOptionsAllowed" -> Optional.of(crossingOrderOptionsAllowed);
            case "SelfBlockAllowed" -> Optional.of(selfBlockAllowed);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionReportProductMessage message)) {
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
        if (!(other instanceof SecurityDefinitionReportProductMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
