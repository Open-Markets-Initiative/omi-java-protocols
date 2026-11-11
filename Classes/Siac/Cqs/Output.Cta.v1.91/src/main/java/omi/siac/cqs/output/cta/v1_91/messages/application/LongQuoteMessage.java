package omi.siac.cqs.output.cta.v1_91.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cqs.output.cta.v1_91.fields.BidPriceLowerLimitPriceBandField;
import omi.siac.cqs.output.cta.v1_91.fields.BidSizeLongField;
import omi.siac.cqs.output.cta.v1_91.fields.FinancialStatusIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.FinraBboIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.FinraMarketMakerIdField;
import omi.siac.cqs.output.cta.v1_91.fields.InstrumentTypeField;
import omi.siac.cqs.output.cta.v1_91.fields.LuldIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.MarketConditionField;
import omi.siac.cqs.output.cta.v1_91.fields.MessageIdField;
import omi.siac.cqs.output.cta.v1_91.fields.NationalBboIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.NationalBboLuldIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.OfferPriceUpperLimitPriceBandField;
import omi.siac.cqs.output.cta.v1_91.fields.OfferSizeLongField;
import omi.siac.cqs.output.cta.v1_91.fields.ParticipantIdField;
import omi.siac.cqs.output.cta.v1_91.fields.ParticipantReferenceNumberField;
import omi.siac.cqs.output.cta.v1_91.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cqs.output.cta.v1_91.fields.QuoteConditionField;
import omi.siac.cqs.output.cta.v1_91.fields.RetailInterestIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.SecurityStatusIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.SecuritySymbolLongField;
import omi.siac.cqs.output.cta.v1_91.fields.SettlementConditionField;
import omi.siac.cqs.output.cta.v1_91.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cqs.output.cta.v1_91.fields.SipGeneratedMessageIdentifierField;
import omi.siac.cqs.output.cta.v1_91.fields.TransactionIdField;
import omi.siac.cqs.output.cta.v1_91.structs.AdfTimestamp;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestBidLongAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestBidShortAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestOfferLongAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.NationalBestOfferShortAppendage;
import omi.siac.cqs.output.cta.v1_91.structs.ParticipantTimestamp;
import omi.siac.cqs.output.cta.v1_91.types.Field;
import omi.siac.cqs.output.cta.v1_91.types.Message;
import omi.siac.cqs.output.cta.v1_91.types.PrintOptions;

/**
 * Represents the LongQuoteMessage message from the Output protocol.
 *
 * <p>The Long Quote message is used to report quote data for a Cta eligible Equity, Local Issue or Bonds.</p>
 */
public final class LongQuoteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'L';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Quote Message";

    /**
     * Participant or Processor that generated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * The Transaction Id will be populated by CQS and is Reserved for Internal Use only
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Contains the security symbol
     */
    private final SecuritySymbolLongField securitySymbolLong = new SecuritySymbolLongField();

    /**
     * Identifies the instrument type relevant to the quote
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Denotes a particular condition applicable to the quote.
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * The Security Status Indicator field is used to report trading suspensions in a security, price indications, trading range indications, LULD Price Bands and Market Wide Circuit Breaker activity
     */
    private final SecurityStatusIndicatorField securityStatusIndicator = new SecurityStatusIndicatorField();

    /**
     * Represents the lower price band value for a security.
     */
    private final BidPriceLowerLimitPriceBandField bidPriceLowerLimitPriceBand = new BidPriceLowerLimitPriceBandField();

    /**
     * The Bid Size identifies the number of round-lots, for a security
     */
    private final BidSizeLongField bidSizeLong = new BidSizeLongField();

    /**
     * represents the upper price band value for a security.
     */
    private final OfferPriceUpperLimitPriceBandField offerPriceUpperLimitPriceBand = new OfferPriceUpperLimitPriceBandField();

    /**
     * The Offer Size identifies the number of round-lots, for a security
     */
    private final OfferSizeLongField offerSizeLong = new OfferSizeLongField();

    /**
     * When Retail Price Improvement (RPI) interest is priced better than the Protected Best Bid or Offer (PBBO) by a minimum of $0.001, an indication of interest on the Bid, Offer, or both the Bid and Offer will identify that interest will be eligible to interact with incoming Retail Order interest.
     */
    private final RetailInterestIndicatorField retailInterestIndicator = new RetailInterestIndicatorField();

    /**
     * Identifies the settlement condition for a security
     */
    private final SettlementConditionField settlementCondition = new SettlementConditionField();

    /**
     * Identifies the market condition of a quote for a security.
     */
    private final MarketConditionField marketCondition = new MarketConditionField();

    /**
     * Contains the FINRA Market Maker ID of the quoting participant on FINRA's Alternative Display Facility (ADF) or the FINRA ADF Identifier
     */
    private final FinraMarketMakerIdField finraMarketMakerId = new FinraMarketMakerIdField();

    /**
     * For FINRA ADF, represents the FINRA BBO state of the FINRA ADF quote
     */
    private final FinraBboIndicatorField finraBboIndicator = new FinraBboIndicatorField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Identifies the Primary Listing Market for a security
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the financial status of the security.
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Identifies CQS as the originator of a message
     */
    private final SipGeneratedMessageIdentifierField sipGeneratedMessageIdentifier = new SipGeneratedMessageIdentifierField();

    /**
     * Indicates the affect the Quote has on the Limit Up-Limit Down Price Band range.
     */
    private final LuldIndicatorField luldIndicator = new LuldIndicatorField();

    /**
     * Indicates the affect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
     */
    private final NationalBboLuldIndicatorField nationalBboLuldIndicator = new NationalBboLuldIndicatorField();

    /**
     * Indicates the affect the new quote has on the National BBO.
     */
    private final NationalBboIndicatorField nationalBboIndicator = new NationalBboIndicatorField();

    /**
     * Participant Timestamp
     */
    private final ParticipantTimestamp participantTimestamp = new ParticipantTimestamp();

    /**
     * Adf Timestamp
     */
    private final AdfTimestamp adfTimestamp = new AdfTimestamp();

    /**
     * National Best Bid Long Appendage
     */
    private final NationalBestBidLongAppendage nationalBestBidLongAppendage = new NationalBestBidLongAppendage();

    /**
     * National Best Offer Long Appendage
     */
    private final NationalBestOfferLongAppendage nationalBestOfferLongAppendage = new NationalBestOfferLongAppendage();

    /**
     * National Best Bid Short Appendage
     */
    private final NationalBestBidShortAppendage nationalBestBidShortAppendage = new NationalBestBidShortAppendage();

    /**
     * National Best Offer Short Appendage
     */
    private final NationalBestOfferShortAppendage nationalBestOfferShortAppendage = new NationalBestOfferShortAppendage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), participantTimestamp.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbolLong), List.<Field>of(instrumentType), List.<Field>of(quoteCondition), List.<Field>of(securityStatusIndicator), List.<Field>of(bidPriceLowerLimitPriceBand), List.<Field>of(bidSizeLong), List.<Field>of(offerPriceUpperLimitPriceBand), List.<Field>of(offerSizeLong), List.<Field>of(retailInterestIndicator), List.<Field>of(settlementCondition), List.<Field>of(marketCondition), List.<Field>of(finraMarketMakerId), List.<Field>of(finraBboIndicator), adfTimestamp.fields(), List.<Field>of(shortSaleRestrictionIndicator), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(financialStatusIndicator), List.<Field>of(sipGeneratedMessageIdentifier), List.<Field>of(luldIndicator), List.<Field>of(nationalBboLuldIndicator), List.<Field>of(nationalBboIndicator)).flatMap(List::stream).toList();

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
     * The Message ID identifies the individual message within the block beginning with number one
     *
     * @return the MessageId field
     */
    public MessageIdField messageId() {
        return messageId;
    }

    /**
     * The Transaction Id will be populated by CQS and is Reserved for Internal Use only
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Contains the security symbol
     *
     * @return the SecuritySymbolLong field
     */
    public SecuritySymbolLongField securitySymbolLong() {
        return securitySymbolLong;
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
     * Denotes a particular condition applicable to the quote.
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * The Security Status Indicator field is used to report trading suspensions in a security, price indications, trading range indications, LULD Price Bands and Market Wide Circuit Breaker activity
     *
     * @return the SecurityStatusIndicator field
     */
    public SecurityStatusIndicatorField securityStatusIndicator() {
        return securityStatusIndicator;
    }

    /**
     * Represents the lower price band value for a security.
     *
     * @return the BidPriceLowerLimitPriceBand field
     */
    public BidPriceLowerLimitPriceBandField bidPriceLowerLimitPriceBand() {
        return bidPriceLowerLimitPriceBand;
    }

    /**
     * The Bid Size identifies the number of round-lots, for a security
     *
     * @return the BidSizeLong field
     */
    public BidSizeLongField bidSizeLong() {
        return bidSizeLong;
    }

    /**
     * represents the upper price band value for a security.
     *
     * @return the OfferPriceUpperLimitPriceBand field
     */
    public OfferPriceUpperLimitPriceBandField offerPriceUpperLimitPriceBand() {
        return offerPriceUpperLimitPriceBand;
    }

    /**
     * The Offer Size identifies the number of round-lots, for a security
     *
     * @return the OfferSizeLong field
     */
    public OfferSizeLongField offerSizeLong() {
        return offerSizeLong;
    }

    /**
     * When Retail Price Improvement (RPI) interest is priced better than the Protected Best Bid or Offer (PBBO) by a minimum of $0.001, an indication of interest on the Bid, Offer, or both the Bid and Offer will identify that interest will be eligible to interact with incoming Retail Order interest.
     *
     * @return the RetailInterestIndicator field
     */
    public RetailInterestIndicatorField retailInterestIndicator() {
        return retailInterestIndicator;
    }

    /**
     * Identifies the settlement condition for a security
     *
     * @return the SettlementCondition field
     */
    public SettlementConditionField settlementCondition() {
        return settlementCondition;
    }

    /**
     * Identifies the market condition of a quote for a security.
     *
     * @return the MarketCondition field
     */
    public MarketConditionField marketCondition() {
        return marketCondition;
    }

    /**
     * Contains the FINRA Market Maker ID of the quoting participant on FINRA's Alternative Display Facility (ADF) or the FINRA ADF Identifier
     *
     * @return the FinraMarketMakerId field
     */
    public FinraMarketMakerIdField finraMarketMakerId() {
        return finraMarketMakerId;
    }

    /**
     * For FINRA ADF, represents the FINRA BBO state of the FINRA ADF quote
     *
     * @return the FinraBboIndicator field
     */
    public FinraBboIndicatorField finraBboIndicator() {
        return finraBboIndicator;
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
     * Identifies CQS as the originator of a message
     *
     * @return the SipGeneratedMessageIdentifier field
     */
    public SipGeneratedMessageIdentifierField sipGeneratedMessageIdentifier() {
        return sipGeneratedMessageIdentifier;
    }

    /**
     * Indicates the affect the Quote has on the Limit Up-Limit Down Price Band range.
     *
     * @return the LuldIndicator field
     */
    public LuldIndicatorField luldIndicator() {
        return luldIndicator;
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
     * Indicates the affect the new quote has on the National BBO.
     *
     * @return the NationalBboIndicator field
     */
    public NationalBboIndicatorField nationalBboIndicator() {
        return nationalBboIndicator;
    }

    /**
     * Participant Timestamp
     *
     * @return the ParticipantTimestamp record
     */
    public ParticipantTimestamp participantTimestamp() {
        return participantTimestamp;
    }

    /**
     * Adf Timestamp
     *
     * @return the AdfTimestamp record
     */
    public AdfTimestamp adfTimestamp() {
        return adfTimestamp;
    }

    /**
     * National Best Bid Long Appendage
     *
     * @return the NationalBestBidLongAppendage record
     */
    public NationalBestBidLongAppendage nationalBestBidLongAppendage() {
        return nationalBestBidLongAppendage;
    }

    /**
     * National Best Offer Long Appendage
     *
     * @return the NationalBestOfferLongAppendage record
     */
    public NationalBestOfferLongAppendage nationalBestOfferLongAppendage() {
        return nationalBestOfferLongAppendage;
    }

    /**
     * National Best Bid Short Appendage
     *
     * @return the NationalBestBidShortAppendage record
     */
    public NationalBestBidShortAppendage nationalBestBidShortAppendage() {
        return nationalBestBidShortAppendage;
    }

    /**
     * National Best Offer Short Appendage
     *
     * @return the NationalBestOfferShortAppendage record
     */
    public NationalBestOfferShortAppendage nationalBestOfferShortAppendage() {
        return nationalBestOfferShortAppendage;
    }

    /**
     * Returns whether the fields before the NationalBestBidLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidLongAppendage is on the wire
     */
    public boolean nationalBestBidLongAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'U';
    }

    /**
     * Returns whether the fields before the NationalBestOfferLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestOfferLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestOfferLongAppendage is on the wire
     */
    public boolean nationalBestOfferLongAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'U';
    }

    /**
     * Returns whether the fields before the NationalBestBidShortAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidShortAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidShortAppendage is on the wire
     */
    public boolean nationalBestBidShortAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'T';
    }

    /**
     * Returns whether the fields before the NationalBestOfferShortAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestOfferShortAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestOfferShortAppendage is on the wire
     */
    public boolean nationalBestOfferShortAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'T';
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (nationalBestBidLongAppendagePresent() ? nationalBestBidLongAppendage.byteLength() : 0) + (nationalBestOfferLongAppendagePresent() ? nationalBestOfferLongAppendage.byteLength() : 0) + (nationalBestBidShortAppendagePresent() ? nationalBestBidShortAppendage.byteLength() : 0) + (nationalBestOfferShortAppendagePresent() ? nationalBestOfferShortAppendage.byteLength() : 0);
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
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!participantTimestamp.parseFrom(data, cursor, end - 74)) {
            return false;
        }
        cursor += participantTimestamp.byteLength();
        if (!messageId.parse(data, cursor)) {
            return false;
        }
        cursor += MessageIdField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        if (!participantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantReferenceNumberField.BYTE_LENGTH;
        if (!securitySymbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolLongField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!securityStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusIndicatorField.BYTE_LENGTH;
        if (!bidPriceLowerLimitPriceBand.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLowerLimitPriceBandField.BYTE_LENGTH;
        if (!bidSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeLongField.BYTE_LENGTH;
        if (!offerPriceUpperLimitPriceBand.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceUpperLimitPriceBandField.BYTE_LENGTH;
        if (!offerSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += OfferSizeLongField.BYTE_LENGTH;
        if (!retailInterestIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RetailInterestIndicatorField.BYTE_LENGTH;
        if (!settlementCondition.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementConditionField.BYTE_LENGTH;
        if (!marketCondition.parse(data, cursor)) {
            return false;
        }
        cursor += MarketConditionField.BYTE_LENGTH;
        if (!finraMarketMakerId.parse(data, cursor)) {
            return false;
        }
        cursor += FinraMarketMakerIdField.BYTE_LENGTH;
        if (!finraBboIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBboIndicatorField.BYTE_LENGTH;
        if (!adfTimestamp.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += adfTimestamp.byteLength();
        if (!shortSaleRestrictionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionIndicatorField.BYTE_LENGTH;
        if (!primaryListingMarketParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryListingMarketParticipantIdField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!sipGeneratedMessageIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += SipGeneratedMessageIdentifierField.BYTE_LENGTH;
        if (!luldIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LuldIndicatorField.BYTE_LENGTH;
        if (!nationalBboLuldIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBboLuldIndicatorField.BYTE_LENGTH;
        if (!nationalBboIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NationalBboIndicatorField.BYTE_LENGTH;
        if (nationalBestBidLongAppendagePresent()) {
            if (!nationalBestBidLongAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestBidLongAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestOfferLongAppendagePresent()) {
            if (!nationalBestOfferLongAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestOfferLongAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent()) {
            if (!nationalBestBidShortAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestBidShortAppendage.byteLength();
        }
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent()) {
            if (!nationalBestOfferShortAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestOfferShortAppendage.byteLength();
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = participantTimestamp.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbolLong.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = securityStatusIndicator.encode(data, cursor);
        cursor = bidPriceLowerLimitPriceBand.encode(data, cursor);
        cursor = bidSizeLong.encode(data, cursor);
        cursor = offerPriceUpperLimitPriceBand.encode(data, cursor);
        cursor = offerSizeLong.encode(data, cursor);
        cursor = retailInterestIndicator.encode(data, cursor);
        cursor = settlementCondition.encode(data, cursor);
        cursor = marketCondition.encode(data, cursor);
        cursor = finraMarketMakerId.encode(data, cursor);
        cursor = finraBboIndicator.encode(data, cursor);
        cursor = adfTimestamp.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = sipGeneratedMessageIdentifier.encode(data, cursor);
        cursor = luldIndicator.encode(data, cursor);
        cursor = nationalBboLuldIndicator.encode(data, cursor);
        cursor = nationalBboIndicator.encode(data, cursor);
        if (nationalBestBidLongAppendagePresent()) {
            cursor = nationalBestBidLongAppendage.encode(data, cursor);
        }
        if (nationalBestOfferLongAppendagePresent()) {
            cursor = nationalBestOfferLongAppendage.encode(data, cursor);
        }
        if (nationalBestBidShortAppendagePresent()) {
            cursor = nationalBestBidShortAppendage.encode(data, cursor);
        }
        if (nationalBestOfferShortAppendagePresent()) {
            cursor = nationalBestOfferShortAppendage.encode(data, cursor);
        }
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
        participantTimestamp.clear();
        adfTimestamp.clear();
        nationalBestBidLongAppendage.clear();
        nationalBestOfferLongAppendage.clear();
        nationalBestBidShortAppendage.clear();
        nationalBestOfferShortAppendage.clear();
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
        if (nationalBestBidLongAppendagePresent() && !nationalBestBidLongAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestOfferLongAppendagePresent() && !nationalBestOfferLongAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent() && !nationalBestBidShortAppendage.isRecognized()) {
            return false;
        }
        return !nationalBestOfferShortAppendagePresent() || nationalBestOfferShortAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (nationalBestBidLongAppendagePresent() && !nationalBestBidLongAppendage.isValid()) {
            return false;
        }
        if (nationalBestOfferLongAppendagePresent() && !nationalBestOfferLongAppendage.isValid()) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent() && !nationalBestBidShortAppendage.isValid()) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent() && !nationalBestOfferShortAppendage.isValid()) {
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
            case "MessageId" -> Optional.of(messageId);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "SecuritySymbolLong" -> Optional.of(securitySymbolLong);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "SecurityStatusIndicator" -> Optional.of(securityStatusIndicator);
            case "BidPriceLowerLimitPriceBand" -> Optional.of(bidPriceLowerLimitPriceBand);
            case "BidSizeLong" -> Optional.of(bidSizeLong);
            case "OfferPriceUpperLimitPriceBand" -> Optional.of(offerPriceUpperLimitPriceBand);
            case "OfferSizeLong" -> Optional.of(offerSizeLong);
            case "RetailInterestIndicator" -> Optional.of(retailInterestIndicator);
            case "SettlementCondition" -> Optional.of(settlementCondition);
            case "MarketCondition" -> Optional.of(marketCondition);
            case "FinraMarketMakerId" -> Optional.of(finraMarketMakerId);
            case "FinraBboIndicator" -> Optional.of(finraBboIndicator);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "SipGeneratedMessageIdentifier" -> Optional.of(sipGeneratedMessageIdentifier);
            case "LuldIndicator" -> Optional.of(luldIndicator);
            case "NationalBboLuldIndicator" -> Optional.of(nationalBboLuldIndicator);
            case "NationalBboIndicator" -> Optional.of(nationalBboIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LongQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(nationalBestBidLongAppendage.diffFields(message.nationalBestBidLongAppendage));
        changed.addAll(nationalBestOfferLongAppendage.diffFields(message.nationalBestOfferLongAppendage));
        changed.addAll(nationalBestBidShortAppendage.diffFields(message.nationalBestBidShortAppendage));
        changed.addAll(nationalBestOfferShortAppendage.diffFields(message.nationalBestOfferShortAppendage));
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
            if (nationalBestBidLongAppendagePresent()) {
                builder.append(", ");
                nationalBestBidLongAppendage.toFormattedString(builder, options);
            }
            if (nationalBestOfferLongAppendagePresent()) {
                builder.append(", ");
                nationalBestOfferLongAppendage.toFormattedString(builder, options);
            }
            if (nationalBestBidShortAppendagePresent()) {
                builder.append(", ");
                nationalBestBidShortAppendage.toFormattedString(builder, options);
            }
            if (nationalBestOfferShortAppendagePresent()) {
                builder.append(", ");
                nationalBestOfferShortAppendage.toFormattedString(builder, options);
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
        if (nationalBestBidLongAppendagePresent()) {
            nationalBestBidLongAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestOfferLongAppendagePresent()) {
            nationalBestOfferLongAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestBidShortAppendagePresent()) {
            nationalBestBidShortAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestOfferShortAppendagePresent()) {
            nationalBestOfferShortAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof LongQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && nationalBestBidLongAppendage.equals(message.nationalBestBidLongAppendage) && nationalBestOfferLongAppendage.equals(message.nationalBestOfferLongAppendage) && nationalBestBidShortAppendage.equals(message.nationalBestBidShortAppendage) && nationalBestOfferShortAppendage.equals(message.nationalBestOfferShortAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, nationalBestBidLongAppendage, nationalBestOfferLongAppendage, nationalBestBidShortAppendage, nationalBestOfferShortAppendage);
    }
}
