package omi.siac.cqs.snapshot.cta.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.siac.cqs.snapshot.cta.v1_0.fields.AuctionCollarLowerThresholdPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.AuctionCollarReferencePriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.AuctionCollarUpperThresholdPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.FinancialStatusIndicatorField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.FinraBestBidMarketMakerIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.FinraBestOfferMarketMakerIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.FutureField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.HaltReasonField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.InstrumentTypeField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.LowerLimitPriceBandField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBboLuldIndicatorField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestBidParticipantIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestBidPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestBidQuoteConditionField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestBidSizeField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestOfferParticipantIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestOfferPriceField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestOfferQuoteConditionField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NationalBestOfferSizeField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.NumberOfExtensionsField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.ParticipantIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.SecuritySymbolField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cqs.snapshot.cta.v1_0.fields.UpperLimitPriceBandField;
import omi.siac.cqs.snapshot.cta.v1_0.types.Field;
import omi.siac.cqs.snapshot.cta.v1_0.types.Message;
import omi.siac.cqs.snapshot.cta.v1_0.types.PrintOptions;

/**
 * Represents the ConsolidatedSnapshotMessage message from the Snapshot protocol.
 *
 * <p>a SIP Generated Message used to report information for each Security Symbol</p>
 */
public final class ConsolidatedSnapshotMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 96;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Consolidated Snapshot Message";

    /**
     * Participant or Processor that generated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * Contains the security symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Identifies the instrument type relevant to the quote
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * It represents the lower price band value for a security.
     */
    private final LowerLimitPriceBandField lowerLimitPriceBand = new LowerLimitPriceBandField();

    /**
     * It represents the upper price band value for a security
     */
    private final UpperLimitPriceBandField upperLimitPriceBand = new UpperLimitPriceBandField();

    /**
     * The Auction Collar Reference Price represents the price used by the exchange to establish the Auction Collar.
     */
    private final AuctionCollarReferencePriceField auctionCollarReferencePrice = new AuctionCollarReferencePriceField();

    /**
     * Represents the latest upper threshold price of the Auction Collar
     */
    private final AuctionCollarUpperThresholdPriceField auctionCollarUpperThresholdPrice = new AuctionCollarUpperThresholdPriceField();

    /**
     * Represents the latest lower threshold price of the Auction Collar
     */
    private final AuctionCollarLowerThresholdPriceField auctionCollarLowerThresholdPrice = new AuctionCollarLowerThresholdPriceField();

    /**
     * Identifies the number of manual or automatic extensions the applicable auction has received
     */
    private final NumberOfExtensionsField numberOfExtensions = new NumberOfExtensionsField();

    /**
     * Identifies the Participant that submitted the Best Bid on a consolidated basis
     */
    private final NationalBestBidParticipantIdField nationalBestBidParticipantId = new NationalBestBidParticipantIdField();

    /**
     * Identifies the Quote Condition associated with the Best Bid Price on a consolidated basis
     */
    private final NationalBestBidQuoteConditionField nationalBestBidQuoteCondition = new NationalBestBidQuoteConditionField();

    /**
     * Represents the Best Bid Price on a consolidated basis
     */
    private final NationalBestBidPriceField nationalBestBidPrice = new NationalBestBidPriceField();

    /**
     * Represents the Best Bid Size associated with the Best Bid Price on a consolidated basis
     */
    private final NationalBestBidSizeField nationalBestBidSize = new NationalBestBidSizeField();

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Market Maker identifier of the Market Maker that had the FINRA Best Bid (FBBO).
     */
    private final FinraBestBidMarketMakerIdField finraBestBidMarketMakerId = new FinraBestBidMarketMakerIdField();

    /**
     * Identifies the Participant that submitted the Best Offer on a consolidated basis
     */
    private final NationalBestOfferParticipantIdField nationalBestOfferParticipantId = new NationalBestOfferParticipantIdField();

    /**
     * Identifies the Quote Condition associated with the Best Offer Price on a consolidated basis
     */
    private final NationalBestOfferQuoteConditionField nationalBestOfferQuoteCondition = new NationalBestOfferQuoteConditionField();

    /**
     * Represents the Best Bid Price on a consolidated basis
     */
    private final NationalBestOfferPriceField nationalBestOfferPrice = new NationalBestOfferPriceField();

    /**
     * Represents the Best Offer Size associated with the Best Bid Price on a consolidated basis
     */
    private final NationalBestOfferSizeField nationalBestOfferSize = new NationalBestOfferSizeField();

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Market Maker identifier of the Market Maker that had the FINRA Best Offer
     */
    private final FinraBestOfferMarketMakerIdField finraBestOfferMarketMakerId = new FinraBestOfferMarketMakerIdField();

    /**
     * Indicates the affect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
     */
    private final NationalBboLuldIndicatorField nationalBboLuldIndicator = new NationalBboLuldIndicatorField();

    /**
     * Identifies the Primary Listing Market for a security
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the financial status of the security.
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Denotes the reason for the Trading Halt
     */
    private final HaltReasonField haltReason = new HaltReasonField();

    /**
     * Field is reserved for future use.
     */
    private final FutureField future = new FutureField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(participantId, securitySymbol, instrumentType, lowerLimitPriceBand, upperLimitPriceBand, auctionCollarReferencePrice, auctionCollarUpperThresholdPrice, auctionCollarLowerThresholdPrice, numberOfExtensions, nationalBestBidParticipantId, nationalBestBidQuoteCondition, nationalBestBidPrice, nationalBestBidSize, finraBestBidMarketMakerId, nationalBestOfferParticipantId, nationalBestOfferQuoteCondition, nationalBestOfferPrice, nationalBestOfferSize, finraBestOfferMarketMakerId, nationalBboLuldIndicator, primaryListingMarketParticipantId, financialStatusIndicator, shortSaleRestrictionIndicator, haltReason, future);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Participant or Processor that generated the message
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * Contains the security symbol
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Identifies the instrument type relevant to the quote
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * It represents the lower price band value for a security.
     *
     * @return the LowerLimitPriceBand field
     */
    public LowerLimitPriceBandField lowerLimitPriceBand() {
        return lowerLimitPriceBand;
    }

    /**
     * It represents the upper price band value for a security
     *
     * @return the UpperLimitPriceBand field
     */
    public UpperLimitPriceBandField upperLimitPriceBand() {
        return upperLimitPriceBand;
    }

    /**
     * The Auction Collar Reference Price represents the price used by the exchange to establish the Auction Collar.
     *
     * @return the AuctionCollarReferencePrice field
     */
    public AuctionCollarReferencePriceField auctionCollarReferencePrice() {
        return auctionCollarReferencePrice;
    }

    /**
     * Represents the latest upper threshold price of the Auction Collar
     *
     * @return the AuctionCollarUpperThresholdPrice field
     */
    public AuctionCollarUpperThresholdPriceField auctionCollarUpperThresholdPrice() {
        return auctionCollarUpperThresholdPrice;
    }

    /**
     * Represents the latest lower threshold price of the Auction Collar
     *
     * @return the AuctionCollarLowerThresholdPrice field
     */
    public AuctionCollarLowerThresholdPriceField auctionCollarLowerThresholdPrice() {
        return auctionCollarLowerThresholdPrice;
    }

    /**
     * Identifies the number of manual or automatic extensions the applicable auction has received
     *
     * @return the NumberOfExtensions field
     */
    public NumberOfExtensionsField numberOfExtensions() {
        return numberOfExtensions;
    }

    /**
     * Identifies the Participant that submitted the Best Bid on a consolidated basis
     *
     * @return the NationalBestBidParticipantId field
     */
    public NationalBestBidParticipantIdField nationalBestBidParticipantId() {
        return nationalBestBidParticipantId;
    }

    /**
     * Identifies the Quote Condition associated with the Best Bid Price on a consolidated basis
     *
     * @return the NationalBestBidQuoteCondition field
     */
    public NationalBestBidQuoteConditionField nationalBestBidQuoteCondition() {
        return nationalBestBidQuoteCondition;
    }

    /**
     * Represents the Best Bid Price on a consolidated basis
     *
     * @return the NationalBestBidPrice field
     */
    public NationalBestBidPriceField nationalBestBidPrice() {
        return nationalBestBidPrice;
    }

    /**
     * Represents the Best Bid Size associated with the Best Bid Price on a consolidated basis
     *
     * @return the NationalBestBidSize field
     */
    public NationalBestBidSizeField nationalBestBidSize() {
        return nationalBestBidSize;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Market Maker identifier of the Market Maker that had the FINRA Best Bid (FBBO).
     *
     * @return the FinraBestBidMarketMakerId field
     */
    public FinraBestBidMarketMakerIdField finraBestBidMarketMakerId() {
        return finraBestBidMarketMakerId;
    }

    /**
     * Identifies the Participant that submitted the Best Offer on a consolidated basis
     *
     * @return the NationalBestOfferParticipantId field
     */
    public NationalBestOfferParticipantIdField nationalBestOfferParticipantId() {
        return nationalBestOfferParticipantId;
    }

    /**
     * Identifies the Quote Condition associated with the Best Offer Price on a consolidated basis
     *
     * @return the NationalBestOfferQuoteCondition field
     */
    public NationalBestOfferQuoteConditionField nationalBestOfferQuoteCondition() {
        return nationalBestOfferQuoteCondition;
    }

    /**
     * Represents the Best Bid Price on a consolidated basis
     *
     * @return the NationalBestOfferPrice field
     */
    public NationalBestOfferPriceField nationalBestOfferPrice() {
        return nationalBestOfferPrice;
    }

    /**
     * Represents the Best Offer Size associated with the Best Bid Price on a consolidated basis
     *
     * @return the NationalBestOfferSize field
     */
    public NationalBestOfferSizeField nationalBestOfferSize() {
        return nationalBestOfferSize;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Market Maker identifier of the Market Maker that had the FINRA Best Offer
     *
     * @return the FinraBestOfferMarketMakerId field
     */
    public FinraBestOfferMarketMakerIdField finraBestOfferMarketMakerId() {
        return finraBestOfferMarketMakerId;
    }

    /**
     * Indicates the affect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
     *
     * @return the NationalBboLuldIndicator field
     */
    public NationalBboLuldIndicatorField nationalBboLuldIndicator() {
        return nationalBboLuldIndicator;
    }

    /**
     * Identifies the Primary Listing Market for a security
     *
     * @return the PrimaryListingMarketParticipantId field
     */
    public PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId() {
        return primaryListingMarketParticipantId;
    }

    /**
     * Identifies the financial status of the security.
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
    }

    /**
     * Identifies whether or not a Short Sale Restriction is in effect
     *
     * @return the ShortSaleRestrictionIndicator field
     */
    public ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator() {
        return shortSaleRestrictionIndicator;
    }

    /**
     * Denotes the reason for the Trading Halt
     *
     * @return the HaltReason field
     */
    public HaltReasonField haltReason() {
        return haltReason;
    }

    /**
     * Field is reserved for future use.
     *
     * @return the Future field
     */
    public FutureField future() {
        return future;
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
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!lowerLimitPriceBand.parse(data, cursor)) {
            return false;
        }
        cursor += LowerLimitPriceBandField.BYTE_LENGTH;
        if (!upperLimitPriceBand.parse(data, cursor)) {
            return false;
        }
        cursor += UpperLimitPriceBandField.BYTE_LENGTH;
        if (!auctionCollarReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionCollarReferencePriceField.BYTE_LENGTH;
        if (!auctionCollarUpperThresholdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionCollarUpperThresholdPriceField.BYTE_LENGTH;
        if (!auctionCollarLowerThresholdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionCollarLowerThresholdPriceField.BYTE_LENGTH;
        if (!numberOfExtensions.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfExtensionsField.BYTE_LENGTH;
        if (!nationalBestBidParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidParticipantIdField.BYTE_LENGTH;
        if (!nationalBestBidQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidQuoteConditionField.BYTE_LENGTH;
        if (!nationalBestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidPriceField.BYTE_LENGTH;
        if (!nationalBestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestBidSizeField.BYTE_LENGTH;
        if (!finraBestBidMarketMakerId.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestBidMarketMakerIdField.BYTE_LENGTH;
        if (!nationalBestOfferParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestOfferParticipantIdField.BYTE_LENGTH;
        if (!nationalBestOfferQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestOfferQuoteConditionField.BYTE_LENGTH;
        if (!nationalBestOfferPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestOfferPriceField.BYTE_LENGTH;
        if (!nationalBestOfferSize.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBestOfferSizeField.BYTE_LENGTH;
        if (!finraBestOfferMarketMakerId.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestOfferMarketMakerIdField.BYTE_LENGTH;
        if (!nationalBboLuldIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBboLuldIndicatorField.BYTE_LENGTH;
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!shortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        if (!haltReason.parse(data, cursor)) {
            return false;
        }
        cursor += HaltReasonField.BYTE_LENGTH;
        return future.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = lowerLimitPriceBand.encode(data, cursor);
        cursor = upperLimitPriceBand.encode(data, cursor);
        cursor = auctionCollarReferencePrice.encode(data, cursor);
        cursor = auctionCollarUpperThresholdPrice.encode(data, cursor);
        cursor = auctionCollarLowerThresholdPrice.encode(data, cursor);
        cursor = numberOfExtensions.encode(data, cursor);
        cursor = nationalBestBidParticipantId.encode(data, cursor);
        cursor = nationalBestBidQuoteCondition.encode(data, cursor);
        cursor = nationalBestBidPrice.encode(data, cursor);
        cursor = nationalBestBidSize.encode(data, cursor);
        cursor = finraBestBidMarketMakerId.encode(data, cursor);
        cursor = nationalBestOfferParticipantId.encode(data, cursor);
        cursor = nationalBestOfferQuoteCondition.encode(data, cursor);
        cursor = nationalBestOfferPrice.encode(data, cursor);
        cursor = nationalBestOfferSize.encode(data, cursor);
        cursor = finraBestOfferMarketMakerId.encode(data, cursor);
        cursor = nationalBboLuldIndicator.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = haltReason.encode(data, cursor);
        cursor = future.encode(data, cursor);
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
            case "ParticipantId" -> Optional.of(participantId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "LowerLimitPriceBand" -> Optional.of(lowerLimitPriceBand);
            case "UpperLimitPriceBand" -> Optional.of(upperLimitPriceBand);
            case "AuctionCollarReferencePrice" -> Optional.of(auctionCollarReferencePrice);
            case "AuctionCollarUpperThresholdPrice" -> Optional.of(auctionCollarUpperThresholdPrice);
            case "AuctionCollarLowerThresholdPrice" -> Optional.of(auctionCollarLowerThresholdPrice);
            case "NumberOfExtensions" -> Optional.of(numberOfExtensions);
            case "NationalBestBidParticipantId" -> Optional.of(nationalBestBidParticipantId);
            case "NationalBestBidQuoteCondition" -> Optional.of(nationalBestBidQuoteCondition);
            case "NationalBestBidPrice" -> Optional.of(nationalBestBidPrice);
            case "NationalBestBidSize" -> Optional.of(nationalBestBidSize);
            case "FinraBestBidMarketMakerId" -> Optional.of(finraBestBidMarketMakerId);
            case "NationalBestOfferParticipantId" -> Optional.of(nationalBestOfferParticipantId);
            case "NationalBestOfferQuoteCondition" -> Optional.of(nationalBestOfferQuoteCondition);
            case "NationalBestOfferPrice" -> Optional.of(nationalBestOfferPrice);
            case "NationalBestOfferSize" -> Optional.of(nationalBestOfferSize);
            case "FinraBestOfferMarketMakerId" -> Optional.of(finraBestOfferMarketMakerId);
            case "NationalBboLuldIndicator" -> Optional.of(nationalBboLuldIndicator);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "HaltReason" -> Optional.of(haltReason);
            case "Future" -> Optional.of(future);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ConsolidatedSnapshotMessage message)) {
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
        if (!(other instanceof ConsolidatedSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
