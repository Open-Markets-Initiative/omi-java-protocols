package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AdrLevelField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AdrRatioField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AssetClassField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.CallableDateMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.CouponField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.CusipField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.DisclosureStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ExtendedSecurityFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.LastUpdateMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.MaturityDateMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.OtcIssuerIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ParValueField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.PrimaryMarketField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ReportingStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityActionField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityDescField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityTypeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ShortNameField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SymbolField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TierField;
import omi.otcmarkets.linkats.multicast.link.v4_3.structs.Issuer;
import omi.otcmarkets.linkats.multicast.link.v4_3.structs.SecurityDetail;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the ExtendedSecurityMessage message from the Multicast protocol.
 *
 * <p>Extended Security message providing additional security and issuer attributes.</p>
 */
public final class ExtendedSecurityMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000F';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 162;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Extended Security Message";

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Ticker symbol. Fixed income symbols may not have a symbol. For these securities, the security ID or CUSIP (Reference Data Security Message) must be used as an identifier.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Milliseconds from UTC epoch.
     */
    private final LastUpdateMilliField lastUpdateMilli = new LastUpdateMilliField();

    /**
     * Security action indicator.
     */
    private final SecurityActionField securityAction = new SecurityActionField();

    /**
     * Unique issuer ID.
     */
    private final OtcIssuerIdField otcIssuerId = new OtcIssuerIdField();

    /**
     * Security description.
     */
    private final SecurityDescField securityDesc = new SecurityDescField();

    /**
     * Short name of the security.
     */
    private final ShortNameField shortName = new ShortNameField();

    /**
     * Asset class indicator.
     */
    private final AssetClassField assetClass = new AssetClassField();

    /**
     * Indicates the type of security.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Primary trading market or exchange.
     */
    private final PrimaryMarketField primaryMarket = new PrimaryMarketField();

    /**
     * Unique security ID issued by OTC Markets.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Notes security level attributes
     */
    private final ExtendedSecurityFlagsField extendedSecurityFlags = new ExtendedSecurityFlagsField();

    /**
     * The market tier assigned by OTC Markets Group.
     */
    private final TierField tier = new TierField();

    /**
     * Reporting status.
     */
    private final ReportingStatusField reportingStatus = new ReportingStatusField();

    /**
     * Current disclosure status of the issuer.
     */
    private final DisclosureStatusField disclosureStatus = new DisclosureStatusField();

    /**
     * Security status.
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Par value with 6 decimal places assumed. 0 indicates not available.
     */
    private final ParValueField parValue = new ParValueField();

    /**
     * Coupon with 6 decimal places assumed. Applies to fixed income securities only.
     */
    private final CouponField coupon = new CouponField();

    /**
     * Maturity date in milliseconds from UTC epoch. Applies to fixed income securities only.
     */
    private final MaturityDateMilliField maturityDateMilli = new MaturityDateMilliField();

    /**
     * Callable date in milliseconds from UTC epoch. Applies to fixed income securities only.
     */
    private final CallableDateMilliField callableDateMilli = new CallableDateMilliField();

    /**
     * ADR ratio with 6 decimal places assumed. Applies to ADR/GDR/NYRS securities only.
     */
    private final AdrRatioField adrRatio = new AdrRatioField();

    /**
     * ADR level. Applies to ADR/GDR/NYRS securities only.
     */
    private final AdrLevelField adrLevel = new AdrLevelField();

    /**
     * CUSIP identifier.
     */
    private final CusipField cusip = new CusipField();

    /**
     * SecurityDetail
     */
    private final SecurityDetail securityDetail = new SecurityDetail();

    /**
     * Issuer
     */
    private final Issuer issuer = new Issuer();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(channelSeqNum), List.<Field>of(symbol), List.<Field>of(lastUpdateMilli), List.<Field>of(securityAction), List.<Field>of(otcIssuerId), List.<Field>of(securityDesc), List.<Field>of(shortName), List.<Field>of(assetClass), List.<Field>of(securityType), List.<Field>of(primaryMarket), List.<Field>of(securityId), List.<Field>of(extendedSecurityFlags), List.<Field>of(tier), List.<Field>of(reportingStatus), List.<Field>of(disclosureStatus), List.<Field>of(securityStatus), List.<Field>of(parValue), List.<Field>of(coupon), List.<Field>of(maturityDateMilli), List.<Field>of(callableDateMilli), List.<Field>of(adrRatio), List.<Field>of(adrLevel), securityDetail.fields(), issuer.fields(), List.<Field>of(cusip)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Monotonically increasing message sequence number at the channel level.
     *
     * @return the ChannelSeqNum field
     */
    public ChannelSeqNumField channelSeqNum() {
        return channelSeqNum;
    }

    /**
     * Ticker symbol. Fixed income symbols may not have a symbol. For these securities, the security ID or CUSIP (Reference Data Security Message) must be used as an identifier.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Milliseconds from UTC epoch.
     *
     * @return the LastUpdateMilli field
     */
    public LastUpdateMilliField lastUpdateMilli() {
        return lastUpdateMilli;
    }

    /**
     * Security action indicator.
     *
     * @return the SecurityAction field
     */
    public SecurityActionField securityAction() {
        return securityAction;
    }

    /**
     * Unique issuer ID.
     *
     * @return the OtcIssuerId field
     */
    public OtcIssuerIdField otcIssuerId() {
        return otcIssuerId;
    }

    /**
     * Security description.
     *
     * @return the SecurityDesc field
     */
    public SecurityDescField securityDesc() {
        return securityDesc;
    }

    /**
     * Short name of the security.
     *
     * @return the ShortName field
     */
    public ShortNameField shortName() {
        return shortName;
    }

    /**
     * Asset class indicator.
     *
     * @return the AssetClass field
     */
    public AssetClassField assetClass() {
        return assetClass;
    }

    /**
     * Indicates the type of security.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Primary trading market or exchange.
     *
     * @return the PrimaryMarket field
     */
    public PrimaryMarketField primaryMarket() {
        return primaryMarket;
    }

    /**
     * Unique security ID issued by OTC Markets.
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Notes security level attributes
     *
     * @return the ExtendedSecurityFlags field
     */
    public ExtendedSecurityFlagsField extendedSecurityFlags() {
        return extendedSecurityFlags;
    }

    /**
     * The market tier assigned by OTC Markets Group.
     *
     * @return the Tier field
     */
    public TierField tier() {
        return tier;
    }

    /**
     * Reporting status.
     *
     * @return the ReportingStatus field
     */
    public ReportingStatusField reportingStatus() {
        return reportingStatus;
    }

    /**
     * Current disclosure status of the issuer.
     *
     * @return the DisclosureStatus field
     */
    public DisclosureStatusField disclosureStatus() {
        return disclosureStatus;
    }

    /**
     * Security status.
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Par value with 6 decimal places assumed. 0 indicates not available.
     *
     * @return the ParValue field
     */
    public ParValueField parValue() {
        return parValue;
    }

    /**
     * Coupon with 6 decimal places assumed. Applies to fixed income securities only.
     *
     * @return the Coupon field
     */
    public CouponField coupon() {
        return coupon;
    }

    /**
     * Maturity date in milliseconds from UTC epoch. Applies to fixed income securities only.
     *
     * @return the MaturityDateMilli field
     */
    public MaturityDateMilliField maturityDateMilli() {
        return maturityDateMilli;
    }

    /**
     * Callable date in milliseconds from UTC epoch. Applies to fixed income securities only.
     *
     * @return the CallableDateMilli field
     */
    public CallableDateMilliField callableDateMilli() {
        return callableDateMilli;
    }

    /**
     * ADR ratio with 6 decimal places assumed. Applies to ADR/GDR/NYRS securities only.
     *
     * @return the AdrRatio field
     */
    public AdrRatioField adrRatio() {
        return adrRatio;
    }

    /**
     * ADR level. Applies to ADR/GDR/NYRS securities only.
     *
     * @return the AdrLevel field
     */
    public AdrLevelField adrLevel() {
        return adrLevel;
    }

    /**
     * CUSIP identifier.
     *
     * @return the Cusip field
     */
    public CusipField cusip() {
        return cusip;
    }

    /**
     * SecurityDetail
     *
     * @return the SecurityDetail record
     */
    public SecurityDetail securityDetail() {
        return securityDetail;
    }

    /**
     * Issuer
     *
     * @return the Issuer record
     */
    public Issuer issuer() {
        return issuer;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityDetail.byteLength() - SecurityDetail.MINIMUM_BYTE_LENGTH + issuer.byteLength() - Issuer.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 4;
        cursor += 10;
        cursor += 8;
        cursor += 1;
        cursor += 4;
        cursor += 25;
        cursor += 25;
        cursor += 1;
        cursor += 5;
        cursor += 3;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 15;
        cursor = securityDetail.padding(runs, cursor);
        cursor = issuer.padding(runs, cursor);
        cursor += 9;
        return cursor;
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
        if (!channelSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelSeqNumField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!lastUpdateMilli.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateMilliField.BYTE_LENGTH;
        if (!securityAction.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityActionField.BYTE_LENGTH;
        if (!otcIssuerId.parse(data, cursor)) {
            return false;
        }
        cursor += OtcIssuerIdField.BYTE_LENGTH;
        if (!securityDesc.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityDescField.BYTE_LENGTH;
        if (!shortName.parse(data, cursor)) {
            return false;
        }
        cursor += ShortNameField.BYTE_LENGTH;
        if (!assetClass.parse(data, cursor)) {
            return false;
        }
        cursor += AssetClassField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!primaryMarket.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryMarketField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!extendedSecurityFlags.parse(data, cursor)) {
            return false;
        }
        cursor += ExtendedSecurityFlagsField.BYTE_LENGTH;
        if (!tier.parse(data, cursor)) {
            return false;
        }
        cursor += TierField.BYTE_LENGTH;
        if (!reportingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += ReportingStatusField.BYTE_LENGTH;
        if (!disclosureStatus.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosureStatusField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!parValue.parse(data, cursor)) {
            return false;
        }
        cursor += ParValueField.BYTE_LENGTH;
        if (!coupon.parse(data, cursor)) {
            return false;
        }
        cursor += CouponField.BYTE_LENGTH;
        if (!maturityDateMilli.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateMilliField.BYTE_LENGTH;
        if (!callableDateMilli.parse(data, cursor)) {
            return false;
        }
        cursor += CallableDateMilliField.BYTE_LENGTH;
        if (!adrRatio.parse(data, cursor)) {
            return false;
        }
        cursor += AdrRatioField.BYTE_LENGTH;
        if (!adrLevel.parse(data, cursor)) {
            return false;
        }
        cursor += AdrLevelField.BYTE_LENGTH;
        if (!securityDetail.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += securityDetail.byteLength();
        if (end - cursor < 10) {
            return false;
        }
        if (!issuer.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += issuer.byteLength();
        if (end - cursor < 9) {
            return false;
        }
        if (!cusip.parse(data, cursor)) {
            return false;
        }
        cursor += CusipField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = lastUpdateMilli.encode(data, cursor);
        cursor = securityAction.encode(data, cursor);
        cursor = otcIssuerId.encode(data, cursor);
        cursor = securityDesc.encode(data, cursor);
        cursor = shortName.encode(data, cursor);
        cursor = assetClass.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = primaryMarket.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = extendedSecurityFlags.encode(data, cursor);
        cursor = tier.encode(data, cursor);
        cursor = reportingStatus.encode(data, cursor);
        cursor = disclosureStatus.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = parValue.encode(data, cursor);
        cursor = coupon.encode(data, cursor);
        cursor = maturityDateMilli.encode(data, cursor);
        cursor = callableDateMilli.encode(data, cursor);
        cursor = adrRatio.encode(data, cursor);
        cursor = adrLevel.encode(data, cursor);
        cursor = securityDetail.encode(data, cursor);
        cursor = issuer.encode(data, cursor);
        cursor = cusip.encode(data, cursor);
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
        securityDetail.clear();
        issuer.clear();
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
            if (field != securityDetail.securityDetailSize() && field != issuer.issuerSize() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != securityDetail.securityDetailSize() && field != issuer.issuerSize() && !field.isValid()) {
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
            case "ChannelSeqNum" -> Optional.of(channelSeqNum);
            case "Symbol" -> Optional.of(symbol);
            case "LastUpdateMilli" -> Optional.of(lastUpdateMilli);
            case "SecurityAction" -> Optional.of(securityAction);
            case "OtcIssuerId" -> Optional.of(otcIssuerId);
            case "SecurityDesc" -> Optional.of(securityDesc);
            case "ShortName" -> Optional.of(shortName);
            case "AssetClass" -> Optional.of(assetClass);
            case "SecurityType" -> Optional.of(securityType);
            case "PrimaryMarket" -> Optional.of(primaryMarket);
            case "SecurityId" -> Optional.of(securityId);
            case "ExtendedSecurityFlags" -> Optional.of(extendedSecurityFlags);
            case "Tier" -> Optional.of(tier);
            case "ReportingStatus" -> Optional.of(reportingStatus);
            case "DisclosureStatus" -> Optional.of(disclosureStatus);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "ParValue" -> Optional.of(parValue);
            case "Coupon" -> Optional.of(coupon);
            case "MaturityDateMilli" -> Optional.of(maturityDateMilli);
            case "CallableDateMilli" -> Optional.of(callableDateMilli);
            case "AdrRatio" -> Optional.of(adrRatio);
            case "AdrLevel" -> Optional.of(adrLevel);
            case "Cusip" -> Optional.of(cusip);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExtendedSecurityMessage message)) {
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
        if (!(other instanceof ExtendedSecurityMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
