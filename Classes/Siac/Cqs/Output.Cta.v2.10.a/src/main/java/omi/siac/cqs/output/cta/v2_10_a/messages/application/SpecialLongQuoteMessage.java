package omi.siac.cqs.output.cta.v2_10_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cqs.output.cta.v2_10_a.fields.BidPriceLongField;
import omi.siac.cqs.output.cta.v2_10_a.fields.BidSizeLongField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinancialStatusIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBboLuldIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestBidMarketMakerIdField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestBidPriceField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestBidQuoteConditionField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestBidSizeField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestOfferMarketMakerIdField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestOfferPriceField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestOfferQuoteConditionField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraBestOfferSizeField;
import omi.siac.cqs.output.cta.v2_10_a.fields.FinraMarketMakerIdField;
import omi.siac.cqs.output.cta.v2_10_a.fields.InstrumentTypeField;
import omi.siac.cqs.output.cta.v2_10_a.fields.MarketConditionField;
import omi.siac.cqs.output.cta.v2_10_a.fields.MessageIdField;
import omi.siac.cqs.output.cta.v2_10_a.fields.NationalBboIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.NationalBboLuldIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.OfferPriceLongField;
import omi.siac.cqs.output.cta.v2_10_a.fields.OfferSizeLongField;
import omi.siac.cqs.output.cta.v2_10_a.fields.ParticipantIdField;
import omi.siac.cqs.output.cta.v2_10_a.fields.ParticipantReferenceNumberField;
import omi.siac.cqs.output.cta.v2_10_a.fields.PrimaryListingMarketParticipantIdField;
import omi.siac.cqs.output.cta.v2_10_a.fields.QuoteConditionField;
import omi.siac.cqs.output.cta.v2_10_a.fields.RetailInterestIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.SecurityStatusIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.SecuritySymbolField;
import omi.siac.cqs.output.cta.v2_10_a.fields.SettlementConditionField;
import omi.siac.cqs.output.cta.v2_10_a.fields.ShortSaleRestrictionIndicatorField;
import omi.siac.cqs.output.cta.v2_10_a.fields.SipGeneratedMessageIdentifierField;
import omi.siac.cqs.output.cta.v2_10_a.fields.TransactionIdField;
import omi.siac.cqs.output.cta.v2_10_a.structs.NationalBestBidAndOfferLongAppendage;
import omi.siac.cqs.output.cta.v2_10_a.structs.NationalBestBidAndOfferShortAppendage;
import omi.siac.cqs.output.cta.v2_10_a.structs.NationalBestBidLongAppendage;
import omi.siac.cqs.output.cta.v2_10_a.structs.NationalBestBidShortAppendage;
import omi.siac.cqs.output.cta.v2_10_a.structs.NationalBestOfferLongAppendage;
import omi.siac.cqs.output.cta.v2_10_a.structs.NationalBestOfferShortAppendage;
import omi.siac.cqs.output.cta.v2_10_a.structs.Timestamp1;
import omi.siac.cqs.output.cta.v2_10_a.structs.Timestamp2;
import omi.siac.cqs.output.cta.v2_10_a.types.Field;
import omi.siac.cqs.output.cta.v2_10_a.types.Message;
import omi.siac.cqs.output.cta.v2_10_a.types.PrintOptions;

/**
 * Represents the SpecialLongQuoteMessage message from the Output protocol.
 *
 * <p>Used only by FINRA to report the FINRA Best Bid and FINRA Best Offer for their Market Makers for CTA eligible Equity, Local Issue or Bond information inclusive of changes to any existing FINRA BBO</p>
 */
public final class SpecialLongQuoteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'S';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 116;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Special Long Quote Message";

    /**
     * Identifies the Participant or Processor that generated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * The Transaction ID will be populated by CQS and is Reserved for Internal Use only
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Participant Reference Number is a pass-thru of the inbound Participant Reference number assigned to a transaction
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Contains the security symbol. Left justified, space-filled
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Identifies the instrument type relevant to the quote
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Denotes a particular condition applicable to the quote used to determine whether a quote qualifies for the Best Bid and Best Offer calculation
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Reports trading suspensions, price indications, trading range indications, LULD Price Bands and Market Wide Circuit Breaker activity
     */
    private final SecurityStatusIndicatorField securityStatusIndicator = new SecurityStatusIndicatorField();

    /**
     * Represents the highest price a prospective buyer is prepared to pay at a particular time for a security. Has implied 6 decimal places
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * Identifies the number of shares for a symbol rounded down to the nearest multiple of its Round Lot Size
     */
    private final BidSizeLongField bidSizeLong = new BidSizeLongField();

    /**
     * Represents the lowest price acceptable to a prospective seller at a particular time for a security. Has implied 6 decimal places
     */
    private final OfferPriceLongField offerPriceLong = new OfferPriceLongField();

    /**
     * Identifies the number of shares for a symbol rounded down to the nearest multiple of its Round Lot Size
     */
    private final OfferSizeLongField offerSizeLong = new OfferSizeLongField();

    /**
     * Identifies Retail Price Improvement interest priced better than the Protected Best Bid or Offer by a minimum of $0.001
     */
    private final RetailInterestIndicatorField retailInterestIndicator = new RetailInterestIndicatorField();

    /**
     * Identifies the settlement condition for a security
     */
    private final SettlementConditionField settlementCondition = new SettlementConditionField();

    /**
     * Identifies the market condition of a quote for a security
     */
    private final MarketConditionField marketCondition = new MarketConditionField();

    /**
     * Contains the FINRA Market Maker ID of the quoting participant on FINRA's Alternative Display Facility or the FINRA ADF Identifier 'FNRA'
     */
    private final FinraMarketMakerIdField finraMarketMakerId = new FinraMarketMakerIdField();

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Quote Condition associated with the FINRA Best Bid Price that had the FINRA Best Bid
     */
    private final FinraBestBidQuoteConditionField finraBestBidQuoteCondition = new FinraBestBidQuoteConditionField();

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Price that is the FINRA Best Bid
     */
    private final FinraBestBidPriceField finraBestBidPrice = new FinraBestBidPriceField();

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Size associated with the FINRA Best Bid Price that had the FINRA Best Bid
     */
    private final FinraBestBidSizeField finraBestBidSize = new FinraBestBidSizeField();

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Market Maker identifier of the Market Maker that had the FINRA Best Bid
     */
    private final FinraBestBidMarketMakerIdField finraBestBidMarketMakerId = new FinraBestBidMarketMakerIdField();

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Quote Condition associated with the FINRA Best Offer Price that had the FINRA Best Offer
     */
    private final FinraBestOfferQuoteConditionField finraBestOfferQuoteCondition = new FinraBestOfferQuoteConditionField();

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Price that is the FINRA Best Offer
     */
    private final FinraBestOfferPriceField finraBestOfferPrice = new FinraBestOfferPriceField();

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Size associated with the FINRA Best Offer Price that had the FINRA Best Offer
     */
    private final FinraBestOfferSizeField finraBestOfferSize = new FinraBestOfferSizeField();

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Market Maker identifier of the Market Maker that had the FINRA Best Offer
     */
    private final FinraBestOfferMarketMakerIdField finraBestOfferMarketMakerId = new FinraBestOfferMarketMakerIdField();

    /**
     * Identifies whether or not a Short Sale Restriction is in effect
     */
    private final ShortSaleRestrictionIndicatorField shortSaleRestrictionIndicator = new ShortSaleRestrictionIndicatorField();

    /**
     * Identifies the Primary Listing Market for a security
     */
    private final PrimaryListingMarketParticipantIdField primaryListingMarketParticipantId = new PrimaryListingMarketParticipantIdField();

    /**
     * Identifies the financial status of the security
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Identifies CQS as the originator of a message
     */
    private final SipGeneratedMessageIdentifierField sipGeneratedMessageIdentifier = new SipGeneratedMessageIdentifierField();

    /**
     * Indicates the effect that the Limit Up-Limit Down Price Bands have on the FINRA Best Bid and FINRA Best Offer
     */
    private final FinraBboLuldIndicatorField finraBboLuldIndicator = new FinraBboLuldIndicatorField();

    /**
     * Indicates the effect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
     */
    private final NationalBboLuldIndicatorField nationalBboLuldIndicator = new NationalBboLuldIndicatorField();

    /**
     * Indicates the effect the new quote has on the National BBO
     */
    private final NationalBboIndicatorField nationalBboIndicator = new NationalBboIndicatorField();

    /**
     * Timestamp 1
     */
    private final Timestamp1 timestamp1 = new Timestamp1();

    /**
     * Timestamp 2
     */
    private final Timestamp2 timestamp2 = new Timestamp2();

    /**
     * National Best Bid Long Appendage
     */
    private final NationalBestBidLongAppendage nationalBestBidLongAppendage = new NationalBestBidLongAppendage();

    /**
     * National Best Offer Long Appendage
     */
    private final NationalBestOfferLongAppendage nationalBestOfferLongAppendage = new NationalBestOfferLongAppendage();

    /**
     * National Best Bid And Offer Long Appendage
     */
    private final NationalBestBidAndOfferLongAppendage nationalBestBidAndOfferLongAppendage = new NationalBestBidAndOfferLongAppendage();

    /**
     * National Best Bid Short Appendage
     */
    private final NationalBestBidShortAppendage nationalBestBidShortAppendage = new NationalBestBidShortAppendage();

    /**
     * National Best Offer Short Appendage
     */
    private final NationalBestOfferShortAppendage nationalBestOfferShortAppendage = new NationalBestOfferShortAppendage();

    /**
     * National Best Bid And Offer Short Appendage
     */
    private final NationalBestBidAndOfferShortAppendage nationalBestBidAndOfferShortAppendage = new NationalBestBidAndOfferShortAppendage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestamp1.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(securitySymbol), List.<Field>of(instrumentType), List.<Field>of(quoteCondition), List.<Field>of(securityStatusIndicator), List.<Field>of(bidPriceLong), List.<Field>of(bidSizeLong), List.<Field>of(offerPriceLong), List.<Field>of(offerSizeLong), List.<Field>of(retailInterestIndicator), List.<Field>of(settlementCondition), List.<Field>of(marketCondition), List.<Field>of(finraMarketMakerId), List.<Field>of(finraBestBidQuoteCondition), List.<Field>of(finraBestBidPrice), List.<Field>of(finraBestBidSize), List.<Field>of(finraBestBidMarketMakerId), List.<Field>of(finraBestOfferQuoteCondition), List.<Field>of(finraBestOfferPrice), List.<Field>of(finraBestOfferSize), List.<Field>of(finraBestOfferMarketMakerId), timestamp2.fields(), List.<Field>of(shortSaleRestrictionIndicator), List.<Field>of(primaryListingMarketParticipantId), List.<Field>of(financialStatusIndicator), List.<Field>of(sipGeneratedMessageIdentifier), List.<Field>of(finraBboLuldIndicator), List.<Field>of(nationalBboLuldIndicator), List.<Field>of(nationalBboIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the Participant or Processor that generated the message
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
     * The Transaction ID will be populated by CQS and is Reserved for Internal Use only
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
     * Contains the security symbol. Left justified, space-filled
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
     * Denotes a particular condition applicable to the quote used to determine whether a quote qualifies for the Best Bid and Best Offer calculation
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Reports trading suspensions, price indications, trading range indications, LULD Price Bands and Market Wide Circuit Breaker activity
     *
     * @return the SecurityStatusIndicator field
     */
    public SecurityStatusIndicatorField securityStatusIndicator() {
        return securityStatusIndicator;
    }

    /**
     * Represents the highest price a prospective buyer is prepared to pay at a particular time for a security. Has implied 6 decimal places
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * Identifies the number of shares for a symbol rounded down to the nearest multiple of its Round Lot Size
     *
     * @return the BidSizeLong field
     */
    public BidSizeLongField bidSizeLong() {
        return bidSizeLong;
    }

    /**
     * Represents the lowest price acceptable to a prospective seller at a particular time for a security. Has implied 6 decimal places
     *
     * @return the OfferPriceLong field
     */
    public OfferPriceLongField offerPriceLong() {
        return offerPriceLong;
    }

    /**
     * Identifies the number of shares for a symbol rounded down to the nearest multiple of its Round Lot Size
     *
     * @return the OfferSizeLong field
     */
    public OfferSizeLongField offerSizeLong() {
        return offerSizeLong;
    }

    /**
     * Identifies Retail Price Improvement interest priced better than the Protected Best Bid or Offer by a minimum of $0.001
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
     * Identifies the market condition of a quote for a security
     *
     * @return the MarketCondition field
     */
    public MarketConditionField marketCondition() {
        return marketCondition;
    }

    /**
     * Contains the FINRA Market Maker ID of the quoting participant on FINRA's Alternative Display Facility or the FINRA ADF Identifier 'FNRA'
     *
     * @return the FinraMarketMakerId field
     */
    public FinraMarketMakerIdField finraMarketMakerId() {
        return finraMarketMakerId;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Quote Condition associated with the FINRA Best Bid Price that had the FINRA Best Bid
     *
     * @return the FinraBestBidQuoteCondition field
     */
    public FinraBestBidQuoteConditionField finraBestBidQuoteCondition() {
        return finraBestBidQuoteCondition;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Price that is the FINRA Best Bid
     *
     * @return the FinraBestBidPrice field
     */
    public FinraBestBidPriceField finraBestBidPrice() {
        return finraBestBidPrice;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Size associated with the FINRA Best Bid Price that had the FINRA Best Bid
     *
     * @return the FinraBestBidSize field
     */
    public FinraBestBidSizeField finraBestBidSize() {
        return finraBestBidSize;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Bid Market Maker identifier of the Market Maker that had the FINRA Best Bid
     *
     * @return the FinraBestBidMarketMakerId field
     */
    public FinraBestBidMarketMakerIdField finraBestBidMarketMakerId() {
        return finraBestBidMarketMakerId;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Quote Condition associated with the FINRA Best Offer Price that had the FINRA Best Offer
     *
     * @return the FinraBestOfferQuoteCondition field
     */
    public FinraBestOfferQuoteConditionField finraBestOfferQuoteCondition() {
        return finraBestOfferQuoteCondition;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Price that is the FINRA Best Offer
     *
     * @return the FinraBestOfferPrice field
     */
    public FinraBestOfferPriceField finraBestOfferPrice() {
        return finraBestOfferPrice;
    }

    /**
     * Contains the FINRA ADF provided FINRA Best Offer Size associated with the FINRA Best Offer Price that had the FINRA Best Offer
     *
     * @return the FinraBestOfferSize field
     */
    public FinraBestOfferSizeField finraBestOfferSize() {
        return finraBestOfferSize;
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
     * Identifies the financial status of the security
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
     * Indicates the effect that the Limit Up-Limit Down Price Bands have on the FINRA Best Bid and FINRA Best Offer
     *
     * @return the FinraBboLuldIndicator field
     */
    public FinraBboLuldIndicatorField finraBboLuldIndicator() {
        return finraBboLuldIndicator;
    }

    /**
     * Indicates the effect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
     *
     * @return the NationalBboLuldIndicator field
     */
    public NationalBboLuldIndicatorField nationalBboLuldIndicator() {
        return nationalBboLuldIndicator;
    }

    /**
     * Indicates the effect the new quote has on the National BBO
     *
     * @return the NationalBboIndicator field
     */
    public NationalBboIndicatorField nationalBboIndicator() {
        return nationalBboIndicator;
    }

    /**
     * Timestamp 1
     *
     * @return the Timestamp1 record
     */
    public Timestamp1 timestamp1() {
        return timestamp1;
    }

    /**
     * Timestamp 2
     *
     * @return the Timestamp2 record
     */
    public Timestamp2 timestamp2() {
        return timestamp2;
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
     * National Best Bid And Offer Long Appendage
     *
     * @return the NationalBestBidAndOfferLongAppendage record
     */
    public NationalBestBidAndOfferLongAppendage nationalBestBidAndOfferLongAppendage() {
        return nationalBestBidAndOfferLongAppendage;
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
     * National Best Bid And Offer Short Appendage
     *
     * @return the NationalBestBidAndOfferShortAppendage record
     */
    public NationalBestBidAndOfferShortAppendage nationalBestBidAndOfferShortAppendage() {
        return nationalBestBidAndOfferShortAppendage;
    }

    /**
     * Returns whether the fields before the NationalBestBidLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidLongAppendage is on the wire
     */
    public boolean nationalBestBidLongAppendagePresent() {
        return (nationalBboIndicator.rawValue() == 'Q') || (nationalBboIndicator.rawValue() == 'S') || (nationalBboIndicator.rawValue() == 'W');
    }

    /**
     * Returns whether the fields before the NationalBestOfferLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestOfferLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestOfferLongAppendage is on the wire
     */
    public boolean nationalBestOfferLongAppendagePresent() {
        return (nationalBboIndicator.rawValue() == 'I') || (nationalBboIndicator.rawValue() == 'N');
    }

    /**
     * Returns whether the fields before the NationalBestBidAndOfferLongAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidAndOfferLongAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidAndOfferLongAppendage is on the wire
     */
    public boolean nationalBestBidAndOfferLongAppendagePresent() {
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
        return (nationalBboIndicator.rawValue() == 'P') || (nationalBboIndicator.rawValue() == 'R') || (nationalBboIndicator.rawValue() == 'V');
    }

    /**
     * Returns whether the fields before the NationalBestOfferShortAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestOfferShortAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestOfferShortAppendage is on the wire
     */
    public boolean nationalBestOfferShortAppendagePresent() {
        return (nationalBboIndicator.rawValue() == 'H') || (nationalBboIndicator.rawValue() == 'M');
    }

    /**
     * Returns whether the fields before the NationalBestBidAndOfferShortAppendage put it on the wire.
     *
     * <p>Decode reads the NationalBestBidAndOfferShortAppendage where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NationalBestBidAndOfferShortAppendage is on the wire
     */
    public boolean nationalBestBidAndOfferShortAppendagePresent() {
        return nationalBboIndicator.rawValue() == 'T';
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (nationalBestBidLongAppendagePresent() ? nationalBestBidLongAppendage.byteLength() : 0) + (nationalBestOfferLongAppendagePresent() ? nationalBestOfferLongAppendage.byteLength() : 0) + (nationalBestBidAndOfferLongAppendagePresent() ? nationalBestBidAndOfferLongAppendage.byteLength() : 0) + (nationalBestBidShortAppendagePresent() ? nationalBestBidShortAppendage.byteLength() : 0) + (nationalBestOfferShortAppendagePresent() ? nationalBestOfferShortAppendage.byteLength() : 0) + (nationalBestBidAndOfferShortAppendagePresent() ? nationalBestBidAndOfferShortAppendage.byteLength() : 0);
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
        if (!timestamp1.parseFrom(data, cursor, end - 107)) {
            return false;
        }
        cursor += timestamp1.byteLength();
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
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
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
        if (!bidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLongField.BYTE_LENGTH;
        if (!bidSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeLongField.BYTE_LENGTH;
        if (!offerPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceLongField.BYTE_LENGTH;
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
        if (!finraBestBidQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestBidQuoteConditionField.BYTE_LENGTH;
        if (!finraBestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestBidPriceField.BYTE_LENGTH;
        if (!finraBestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestBidSizeField.BYTE_LENGTH;
        if (!finraBestBidMarketMakerId.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestBidMarketMakerIdField.BYTE_LENGTH;
        if (!finraBestOfferQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestOfferQuoteConditionField.BYTE_LENGTH;
        if (!finraBestOfferPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestOfferPriceField.BYTE_LENGTH;
        if (!finraBestOfferSize.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestOfferSizeField.BYTE_LENGTH;
        if (!finraBestOfferMarketMakerId.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBestOfferMarketMakerIdField.BYTE_LENGTH;
        if (!timestamp2.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += timestamp2.byteLength();
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
        if (!finraBboLuldIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinraBboLuldIndicatorField.BYTE_LENGTH;
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
        if (nationalBestBidAndOfferLongAppendagePresent()) {
            if (!nationalBestBidAndOfferLongAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestBidAndOfferLongAppendage.byteLength();
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
        if (end - cursor < 0) {
            return false;
        }
        if (nationalBestBidAndOfferShortAppendagePresent()) {
            if (!nationalBestBidAndOfferShortAppendage.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += nationalBestBidAndOfferShortAppendage.byteLength();
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = timestamp1.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = securityStatusIndicator.encode(data, cursor);
        cursor = bidPriceLong.encode(data, cursor);
        cursor = bidSizeLong.encode(data, cursor);
        cursor = offerPriceLong.encode(data, cursor);
        cursor = offerSizeLong.encode(data, cursor);
        cursor = retailInterestIndicator.encode(data, cursor);
        cursor = settlementCondition.encode(data, cursor);
        cursor = marketCondition.encode(data, cursor);
        cursor = finraMarketMakerId.encode(data, cursor);
        cursor = finraBestBidQuoteCondition.encode(data, cursor);
        cursor = finraBestBidPrice.encode(data, cursor);
        cursor = finraBestBidSize.encode(data, cursor);
        cursor = finraBestBidMarketMakerId.encode(data, cursor);
        cursor = finraBestOfferQuoteCondition.encode(data, cursor);
        cursor = finraBestOfferPrice.encode(data, cursor);
        cursor = finraBestOfferSize.encode(data, cursor);
        cursor = finraBestOfferMarketMakerId.encode(data, cursor);
        cursor = timestamp2.encode(data, cursor);
        cursor = shortSaleRestrictionIndicator.encode(data, cursor);
        cursor = primaryListingMarketParticipantId.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = sipGeneratedMessageIdentifier.encode(data, cursor);
        cursor = finraBboLuldIndicator.encode(data, cursor);
        cursor = nationalBboLuldIndicator.encode(data, cursor);
        cursor = nationalBboIndicator.encode(data, cursor);
        if (nationalBestBidLongAppendagePresent()) {
            cursor = nationalBestBidLongAppendage.encode(data, cursor);
        }
        if (nationalBestOfferLongAppendagePresent()) {
            cursor = nationalBestOfferLongAppendage.encode(data, cursor);
        }
        if (nationalBestBidAndOfferLongAppendagePresent()) {
            cursor = nationalBestBidAndOfferLongAppendage.encode(data, cursor);
        }
        if (nationalBestBidShortAppendagePresent()) {
            cursor = nationalBestBidShortAppendage.encode(data, cursor);
        }
        if (nationalBestOfferShortAppendagePresent()) {
            cursor = nationalBestOfferShortAppendage.encode(data, cursor);
        }
        if (nationalBestBidAndOfferShortAppendagePresent()) {
            cursor = nationalBestBidAndOfferShortAppendage.encode(data, cursor);
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
        timestamp1.clear();
        timestamp2.clear();
        nationalBestBidLongAppendage.clear();
        nationalBestOfferLongAppendage.clear();
        nationalBestBidAndOfferLongAppendage.clear();
        nationalBestBidShortAppendage.clear();
        nationalBestOfferShortAppendage.clear();
        nationalBestBidAndOfferShortAppendage.clear();
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
        if (nationalBestBidAndOfferLongAppendagePresent() && !nationalBestBidAndOfferLongAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent() && !nationalBestBidShortAppendage.isRecognized()) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent() && !nationalBestOfferShortAppendage.isRecognized()) {
            return false;
        }
        return !nationalBestBidAndOfferShortAppendagePresent() || nationalBestBidAndOfferShortAppendage.isRecognized();
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
        if (nationalBestBidAndOfferLongAppendagePresent() && !nationalBestBidAndOfferLongAppendage.isValid()) {
            return false;
        }
        if (nationalBestBidShortAppendagePresent() && !nationalBestBidShortAppendage.isValid()) {
            return false;
        }
        if (nationalBestOfferShortAppendagePresent() && !nationalBestOfferShortAppendage.isValid()) {
            return false;
        }
        if (nationalBestBidAndOfferShortAppendagePresent() && !nationalBestBidAndOfferShortAppendage.isValid()) {
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
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "SecurityStatusIndicator" -> Optional.of(securityStatusIndicator);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidSizeLong" -> Optional.of(bidSizeLong);
            case "OfferPriceLong" -> Optional.of(offerPriceLong);
            case "OfferSizeLong" -> Optional.of(offerSizeLong);
            case "RetailInterestIndicator" -> Optional.of(retailInterestIndicator);
            case "SettlementCondition" -> Optional.of(settlementCondition);
            case "MarketCondition" -> Optional.of(marketCondition);
            case "FinraMarketMakerId" -> Optional.of(finraMarketMakerId);
            case "FinraBestBidQuoteCondition" -> Optional.of(finraBestBidQuoteCondition);
            case "FinraBestBidPrice" -> Optional.of(finraBestBidPrice);
            case "FinraBestBidSize" -> Optional.of(finraBestBidSize);
            case "FinraBestBidMarketMakerId" -> Optional.of(finraBestBidMarketMakerId);
            case "FinraBestOfferQuoteCondition" -> Optional.of(finraBestOfferQuoteCondition);
            case "FinraBestOfferPrice" -> Optional.of(finraBestOfferPrice);
            case "FinraBestOfferSize" -> Optional.of(finraBestOfferSize);
            case "FinraBestOfferMarketMakerId" -> Optional.of(finraBestOfferMarketMakerId);
            case "ShortSaleRestrictionIndicator" -> Optional.of(shortSaleRestrictionIndicator);
            case "PrimaryListingMarketParticipantId" -> Optional.of(primaryListingMarketParticipantId);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "SipGeneratedMessageIdentifier" -> Optional.of(sipGeneratedMessageIdentifier);
            case "FinraBboLuldIndicator" -> Optional.of(finraBboLuldIndicator);
            case "NationalBboLuldIndicator" -> Optional.of(nationalBboLuldIndicator);
            case "NationalBboIndicator" -> Optional.of(nationalBboIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SpecialLongQuoteMessage message)) {
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
        changed.addAll(nationalBestBidAndOfferLongAppendage.diffFields(message.nationalBestBidAndOfferLongAppendage));
        changed.addAll(nationalBestBidShortAppendage.diffFields(message.nationalBestBidShortAppendage));
        changed.addAll(nationalBestOfferShortAppendage.diffFields(message.nationalBestOfferShortAppendage));
        changed.addAll(nationalBestBidAndOfferShortAppendage.diffFields(message.nationalBestBidAndOfferShortAppendage));
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
            if (nationalBestBidAndOfferLongAppendagePresent()) {
                builder.append(", ");
                nationalBestBidAndOfferLongAppendage.toFormattedString(builder, options);
            }
            if (nationalBestBidShortAppendagePresent()) {
                builder.append(", ");
                nationalBestBidShortAppendage.toFormattedString(builder, options);
            }
            if (nationalBestOfferShortAppendagePresent()) {
                builder.append(", ");
                nationalBestOfferShortAppendage.toFormattedString(builder, options);
            }
            if (nationalBestBidAndOfferShortAppendagePresent()) {
                builder.append(", ");
                nationalBestBidAndOfferShortAppendage.toFormattedString(builder, options);
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
        if (nationalBestBidAndOfferLongAppendagePresent()) {
            nationalBestBidAndOfferLongAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestBidShortAppendagePresent()) {
            nationalBestBidShortAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestOfferShortAppendagePresent()) {
            nationalBestOfferShortAppendage.toFormattedString(builder, nested);
        }
        if (nationalBestBidAndOfferShortAppendagePresent()) {
            nationalBestBidAndOfferShortAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof SpecialLongQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && nationalBestBidLongAppendage.equals(message.nationalBestBidLongAppendage) && nationalBestOfferLongAppendage.equals(message.nationalBestOfferLongAppendage) && nationalBestBidAndOfferLongAppendage.equals(message.nationalBestBidAndOfferLongAppendage) && nationalBestBidShortAppendage.equals(message.nationalBestBidShortAppendage) && nationalBestOfferShortAppendage.equals(message.nationalBestOfferShortAppendage) && nationalBestBidAndOfferShortAppendage.equals(message.nationalBestBidAndOfferShortAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, nationalBestBidLongAppendage, nationalBestOfferLongAppendage, nationalBestBidAndOfferLongAppendage, nationalBestBidShortAppendage, nationalBestOfferShortAppendage, nationalBestBidAndOfferShortAppendage);
    }
}
