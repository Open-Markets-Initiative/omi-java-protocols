package omi.bme.bmefixedincome.topofbook.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.AccruedInterestCalculationProcedureField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.AccruedInterestRateRField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.AdmissionRequestedByIssuerField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.AliveVolumeField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.BenchmarkCurvePointsUnitsField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.BenchmarkCurvePointsValueField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.BenchmarkField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.BenchmarkSecurityIdField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.BondSeniorityField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CalculationMethodField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CfiCodeField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.ContractMultiplierField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CouponPaymentDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CouponPeriodicityField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CouponQuotationField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CouponRateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CouponTypeField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.CurrencyField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.DateLastCouponWasPaidField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.FacialField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.FirstTradingDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.FisnField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.InterestAccrualDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.IssueDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.IssuerField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.IssuerLeiField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.LiSpostField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.LiSpreField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.LiquidInstrumentField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.MarketIdField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.MaturityDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.MaturityField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.MinPriceIncrementField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.MinTradeVolField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.ModalityMaskBField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.NextRedemptionDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.NumberOfDecimalsField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.OrderNumberOfDecimalsField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.PriceTypeField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.RoundLotField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SecurityDescriptionField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SecurityGroupField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SecurityNameField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SecurityStatusField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SecurityTypeField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SettlementSystemField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SpreadToIndexField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SstIpostField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SstIpreField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.StartDateField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.StrippableField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SymbolField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.SymbolIsinField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.TradingObligationField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.TradingScopeBField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.TypeOfRedemptionField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.fields.VolumeIssuedField;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.types.Field;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.types.Message;
import omi.bme.bmefixedincome.topofbook.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the SecurityListMessage message from the TopOfBook protocol.
 *
 * <p>Message sent by the server to provide the definition of one security. It shares the same layout as the Security List Update Report message, but with a different Message Type</p>
 */
public final class SecurityListMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 450;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security List Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Operating MIC Code
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Segment MIC Code
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Instrument ISIN
     */
    private final SymbolIsinField symbolIsin = new SymbolIsinField();

    /**
     * FISN
     */
    private final FisnField fisn = new FisnField();

    /**
     * Issuer LEI
     */
    private final IssuerLeiField issuerLei = new IssuerLeiField();

    /**
     * Security group
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * CFICode
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Security type
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Expiration date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Date security issued
     */
    private final IssueDateField issueDate = new IssueDateField();

    /**
     * Conversion factor between price units and monetary units
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * LIS pretransparency threshold
     */
    private final LiSpreField liSpre = new LiSpreField();

    /**
     * SSTI pretransparency threshold
     */
    private final SstIpreField sstIpre = new SstIpreField();

    /**
     * LIS posttransparency threshold
     */
    private final LiSpostField liSpost = new LiSpostField();

    /**
     * SSTI posttransparency threshold
     */
    private final SstIpostField sstIpost = new SstIpostField();

    /**
     * Liquid Instrument
     */
    private final LiquidInstrumentField liquidInstrument = new LiquidInstrumentField();

    /**
     * Security request for admission to trading by the issuer
     */
    private final AdmissionRequestedByIssuerField admissionRequestedByIssuer = new AdmissionRequestedByIssuerField();

    /**
     * Minimum Tradeable Volume
     */
    private final MinTradeVolField minTradeVol = new MinTradeVolField();

    /**
     * Lot Size
     */
    private final RoundLotField roundLot = new RoundLotField();

    /**
     * Currency code
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Modality mask ∑ 2^(ModalityCode - 100) ModalityCode valid values are the TradingSessionID values listed in Table 25 - TradingSessionID in “BMEGate Codification Tables”
     */
    private final ModalityMaskBField modalityMaskB = new ModalityMaskBField();

    /**
     * Security Description
     */
    private final SecurityDescriptionField securityDescription = new SecurityDescriptionField();

    /**
     * Trading obligation. Indicates whether the security has to be traded in a regulated exchange
     */
    private final TradingObligationField tradingObligation = new TradingObligationField();

    /**
     * Security Name
     */
    private final SecurityNameField securityName = new SecurityNameField();

    /**
     * Security Status
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Coupon Payment Date
     */
    private final CouponPaymentDateField couponPaymentDate = new CouponPaymentDateField();

    /**
     * Minimum Price Increment
     */
    private final MinPriceIncrementField minPriceIncrement = new MinPriceIncrementField();

    /**
     * Number of Decimals
     */
    private final NumberOfDecimalsField numberOfDecimals = new NumberOfDecimalsField();

    /**
     * Number of Decimals in Order Entry
     */
    private final OrderNumberOfDecimalsField orderNumberOfDecimals = new OrderNumberOfDecimalsField();

    /**
     * Coupon Rate
     */
    private final CouponRateField couponRate = new CouponRateField();

    /**
     * Issuer
     */
    private final IssuerField issuer = new IssuerField();

    /**
     * Trading Scope
     */
    private final TradingScopeBField tradingScopeB = new TradingScopeBField();

    /**
     * First Trading Date
     */
    private final FirstTradingDateField firstTradingDate = new FirstTradingDateField();

    /**
     * Settlement System
     */
    private final SettlementSystemField settlementSystem = new SettlementSystemField();

    /**
     * Maturity Price
     */
    private final MaturityField maturity = new MaturityField();

    /**
     * Coupon Periodicity in Number of Months
     */
    private final CouponPeriodicityField couponPeriodicity = new CouponPeriodicityField();

    /**
     * Benchmark
     */
    private final BenchmarkField benchmark = new BenchmarkField();

    /**
     * Strippable
     */
    private final StrippableField strippable = new StrippableField();

    /**
     * Volume Issued
     */
    private final VolumeIssuedField volumeIssued = new VolumeIssuedField();

    /**
     * Alive Volume
     */
    private final AliveVolumeField aliveVolume = new AliveVolumeField();

    /**
     * Coupon Type
     */
    private final CouponTypeField couponType = new CouponTypeField();

    /**
     * Coupon Quotation
     */
    private final CouponQuotationField couponQuotation = new CouponQuotationField();

    /**
     * Accrued Interest Calculation Procedure
     */
    private final AccruedInterestCalculationProcedureField accruedInterestCalculationProcedure = new AccruedInterestCalculationProcedureField();

    /**
     * Next Redemption Date
     */
    private final NextRedemptionDateField nextRedemptionDate = new NextRedemptionDateField();

    /**
     * Type Of Redemption
     */
    private final TypeOfRedemptionField typeOfRedemption = new TypeOfRedemptionField();

    /**
     * Facial
     */
    private final FacialField facial = new FacialField();

    /**
     * Calculation Method
     */
    private final CalculationMethodField calculationMethod = new CalculationMethodField();

    /**
     * Date Last Coupon Was Paid
     */
    private final DateLastCouponWasPaidField dateLastCouponWasPaid = new DateLastCouponWasPaidField();

    /**
     * Bond Seniority
     */
    private final BondSeniorityField bondSeniority = new BondSeniorityField();

    /**
     * Start date for the coupon yield
     */
    private final InterestAccrualDateField interestAccrualDate = new InterestAccrualDateField();

    /**
     * Value date
     */
    private final StartDateField startDate = new StartDateField();

    /**
     * Price Type
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Spread To Index
     */
    private final SpreadToIndexField spreadToIndex = new SpreadToIndexField();

    /**
     * Benchmark Curve Point for Index term
     */
    private final BenchmarkCurvePointsUnitsField benchmarkCurvePointsUnits = new BenchmarkCurvePointsUnitsField();

    /**
     * Benchmark Curve Point for Index term
     */
    private final BenchmarkCurvePointsValueField benchmarkCurvePointsValue = new BenchmarkCurvePointsValueField();

    /**
     * Benchmark Security ID
     */
    private final BenchmarkSecurityIdField benchmarkSecurityId = new BenchmarkSecurityIdField();

    /**
     * Accrued Interest Rate
     */
    private final AccruedInterestRateRField accruedInterestRateR = new AccruedInterestRateRField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, marketId, marketSegmentId, securityCode, symbol, symbolIsin, fisn, issuerLei, securityGroup, cfiCode, securityType, maturityDate, issueDate, contractMultiplier, liSpre, sstIpre, liSpost, sstIpost, liquidInstrument, admissionRequestedByIssuer, minTradeVol, roundLot, currency, modalityMaskB, securityDescription, tradingObligation, securityName, securityStatus, couponPaymentDate, minPriceIncrement, numberOfDecimals, orderNumberOfDecimals, couponRate, issuer, tradingScopeB, firstTradingDate, settlementSystem, maturity, couponPeriodicity, benchmark, strippable, volumeIssued, aliveVolume, couponType, couponQuotation, accruedInterestCalculationProcedure, nextRedemptionDate, typeOfRedemption, facial, calculationMethod, dateLastCouponWasPaid, bondSeniority, interestAccrualDate, startDate, priceType, spreadToIndex, benchmarkCurvePointsUnits, benchmarkCurvePointsValue, benchmarkSecurityId, accruedInterestRateR);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Operating MIC Code
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Segment MIC Code
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Instrument ISIN
     *
     * @return the SymbolIsin field
     */
    public SymbolIsinField symbolIsin() {
        return symbolIsin;
    }

    /**
     * FISN
     *
     * @return the Fisn field
     */
    public FisnField fisn() {
        return fisn;
    }

    /**
     * Issuer LEI
     *
     * @return the IssuerLei field
     */
    public IssuerLeiField issuerLei() {
        return issuerLei;
    }

    /**
     * Security group
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * CFICode
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Security type
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Expiration date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Date security issued
     *
     * @return the IssueDate field
     */
    public IssueDateField issueDate() {
        return issueDate;
    }

    /**
     * Conversion factor between price units and monetary units
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * LIS pretransparency threshold
     *
     * @return the LiSpre field
     */
    public LiSpreField liSpre() {
        return liSpre;
    }

    /**
     * SSTI pretransparency threshold
     *
     * @return the SstIpre field
     */
    public SstIpreField sstIpre() {
        return sstIpre;
    }

    /**
     * LIS posttransparency threshold
     *
     * @return the LiSpost field
     */
    public LiSpostField liSpost() {
        return liSpost;
    }

    /**
     * SSTI posttransparency threshold
     *
     * @return the SstIpost field
     */
    public SstIpostField sstIpost() {
        return sstIpost;
    }

    /**
     * Liquid Instrument
     *
     * @return the LiquidInstrument field
     */
    public LiquidInstrumentField liquidInstrument() {
        return liquidInstrument;
    }

    /**
     * Security request for admission to trading by the issuer
     *
     * @return the AdmissionRequestedByIssuer field
     */
    public AdmissionRequestedByIssuerField admissionRequestedByIssuer() {
        return admissionRequestedByIssuer;
    }

    /**
     * Minimum Tradeable Volume
     *
     * @return the MinTradeVol field
     */
    public MinTradeVolField minTradeVol() {
        return minTradeVol;
    }

    /**
     * Lot Size
     *
     * @return the RoundLot field
     */
    public RoundLotField roundLot() {
        return roundLot;
    }

    /**
     * Currency code
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Modality mask ∑ 2^(ModalityCode - 100) ModalityCode valid values are the TradingSessionID values listed in Table 25 - TradingSessionID in “BMEGate Codification Tables”
     *
     * @return the ModalityMaskB field
     */
    public ModalityMaskBField modalityMaskB() {
        return modalityMaskB;
    }

    /**
     * Security Description
     *
     * @return the SecurityDescription field
     */
    public SecurityDescriptionField securityDescription() {
        return securityDescription;
    }

    /**
     * Trading obligation. Indicates whether the security has to be traded in a regulated exchange
     *
     * @return the TradingObligation field
     */
    public TradingObligationField tradingObligation() {
        return tradingObligation;
    }

    /**
     * Security Name
     *
     * @return the SecurityName field
     */
    public SecurityNameField securityName() {
        return securityName;
    }

    /**
     * Security Status
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Coupon Payment Date
     *
     * @return the CouponPaymentDate field
     */
    public CouponPaymentDateField couponPaymentDate() {
        return couponPaymentDate;
    }

    /**
     * Minimum Price Increment
     *
     * @return the MinPriceIncrement field
     */
    public MinPriceIncrementField minPriceIncrement() {
        return minPriceIncrement;
    }

    /**
     * Number of Decimals
     *
     * @return the NumberOfDecimals field
     */
    public NumberOfDecimalsField numberOfDecimals() {
        return numberOfDecimals;
    }

    /**
     * Number of Decimals in Order Entry
     *
     * @return the OrderNumberOfDecimals field
     */
    public OrderNumberOfDecimalsField orderNumberOfDecimals() {
        return orderNumberOfDecimals;
    }

    /**
     * Coupon Rate
     *
     * @return the CouponRate field
     */
    public CouponRateField couponRate() {
        return couponRate;
    }

    /**
     * Issuer
     *
     * @return the Issuer field
     */
    public IssuerField issuer() {
        return issuer;
    }

    /**
     * Trading Scope
     *
     * @return the TradingScopeB field
     */
    public TradingScopeBField tradingScopeB() {
        return tradingScopeB;
    }

    /**
     * First Trading Date
     *
     * @return the FirstTradingDate field
     */
    public FirstTradingDateField firstTradingDate() {
        return firstTradingDate;
    }

    /**
     * Settlement System
     *
     * @return the SettlementSystem field
     */
    public SettlementSystemField settlementSystem() {
        return settlementSystem;
    }

    /**
     * Maturity Price
     *
     * @return the Maturity field
     */
    public MaturityField maturity() {
        return maturity;
    }

    /**
     * Coupon Periodicity in Number of Months
     *
     * @return the CouponPeriodicity field
     */
    public CouponPeriodicityField couponPeriodicity() {
        return couponPeriodicity;
    }

    /**
     * Benchmark
     *
     * @return the Benchmark field
     */
    public BenchmarkField benchmark() {
        return benchmark;
    }

    /**
     * Strippable
     *
     * @return the Strippable field
     */
    public StrippableField strippable() {
        return strippable;
    }

    /**
     * Volume Issued
     *
     * @return the VolumeIssued field
     */
    public VolumeIssuedField volumeIssued() {
        return volumeIssued;
    }

    /**
     * Alive Volume
     *
     * @return the AliveVolume field
     */
    public AliveVolumeField aliveVolume() {
        return aliveVolume;
    }

    /**
     * Coupon Type
     *
     * @return the CouponType field
     */
    public CouponTypeField couponType() {
        return couponType;
    }

    /**
     * Coupon Quotation
     *
     * @return the CouponQuotation field
     */
    public CouponQuotationField couponQuotation() {
        return couponQuotation;
    }

    /**
     * Accrued Interest Calculation Procedure
     *
     * @return the AccruedInterestCalculationProcedure field
     */
    public AccruedInterestCalculationProcedureField accruedInterestCalculationProcedure() {
        return accruedInterestCalculationProcedure;
    }

    /**
     * Next Redemption Date
     *
     * @return the NextRedemptionDate field
     */
    public NextRedemptionDateField nextRedemptionDate() {
        return nextRedemptionDate;
    }

    /**
     * Type Of Redemption
     *
     * @return the TypeOfRedemption field
     */
    public TypeOfRedemptionField typeOfRedemption() {
        return typeOfRedemption;
    }

    /**
     * Facial
     *
     * @return the Facial field
     */
    public FacialField facial() {
        return facial;
    }

    /**
     * Calculation Method
     *
     * @return the CalculationMethod field
     */
    public CalculationMethodField calculationMethod() {
        return calculationMethod;
    }

    /**
     * Date Last Coupon Was Paid
     *
     * @return the DateLastCouponWasPaid field
     */
    public DateLastCouponWasPaidField dateLastCouponWasPaid() {
        return dateLastCouponWasPaid;
    }

    /**
     * Bond Seniority
     *
     * @return the BondSeniority field
     */
    public BondSeniorityField bondSeniority() {
        return bondSeniority;
    }

    /**
     * Start date for the coupon yield
     *
     * @return the InterestAccrualDate field
     */
    public InterestAccrualDateField interestAccrualDate() {
        return interestAccrualDate;
    }

    /**
     * Value date
     *
     * @return the StartDate field
     */
    public StartDateField startDate() {
        return startDate;
    }

    /**
     * Price Type
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * Spread To Index
     *
     * @return the SpreadToIndex field
     */
    public SpreadToIndexField spreadToIndex() {
        return spreadToIndex;
    }

    /**
     * Benchmark Curve Point for Index term
     *
     * @return the BenchmarkCurvePointsUnits field
     */
    public BenchmarkCurvePointsUnitsField benchmarkCurvePointsUnits() {
        return benchmarkCurvePointsUnits;
    }

    /**
     * Benchmark Curve Point for Index term
     *
     * @return the BenchmarkCurvePointsValue field
     */
    public BenchmarkCurvePointsValueField benchmarkCurvePointsValue() {
        return benchmarkCurvePointsValue;
    }

    /**
     * Benchmark Security ID
     *
     * @return the BenchmarkSecurityId field
     */
    public BenchmarkSecurityIdField benchmarkSecurityId() {
        return benchmarkSecurityId;
    }

    /**
     * Accrued Interest Rate
     *
     * @return the AccruedInterestRateR field
     */
    public AccruedInterestRateRField accruedInterestRateR() {
        return accruedInterestRateR;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!symbolIsin.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIsinField.BYTE_LENGTH;
        if (!fisn.parse(data, cursor)) {
            return false;
        }
        cursor += FisnField.BYTE_LENGTH;
        if (!issuerLei.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerLeiField.BYTE_LENGTH;
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!issueDate.parse(data, cursor)) {
            return false;
        }
        cursor += IssueDateField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!liSpre.parse(data, cursor)) {
            return false;
        }
        cursor += LiSpreField.BYTE_LENGTH;
        if (!sstIpre.parse(data, cursor)) {
            return false;
        }
        cursor += SstIpreField.BYTE_LENGTH;
        if (!liSpost.parse(data, cursor)) {
            return false;
        }
        cursor += LiSpostField.BYTE_LENGTH;
        if (!sstIpost.parse(data, cursor)) {
            return false;
        }
        cursor += SstIpostField.BYTE_LENGTH;
        if (!liquidInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidInstrumentField.BYTE_LENGTH;
        if (!admissionRequestedByIssuer.parse(data, cursor)) {
            return false;
        }
        cursor += AdmissionRequestedByIssuerField.BYTE_LENGTH;
        if (!minTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MinTradeVolField.BYTE_LENGTH;
        if (!roundLot.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!modalityMaskB.parse(data, cursor)) {
            return false;
        }
        cursor += ModalityMaskBField.BYTE_LENGTH;
        if (!securityDescription.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityDescriptionField.BYTE_LENGTH;
        if (!tradingObligation.parse(data, cursor)) {
            return false;
        }
        cursor += TradingObligationField.BYTE_LENGTH;
        if (!securityName.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityNameField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!couponPaymentDate.parse(data, cursor)) {
            return false;
        }
        cursor += CouponPaymentDateField.BYTE_LENGTH;
        if (!minPriceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementField.BYTE_LENGTH;
        if (!numberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDecimalsField.BYTE_LENGTH;
        if (!orderNumberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberOfDecimalsField.BYTE_LENGTH;
        if (!couponRate.parse(data, cursor)) {
            return false;
        }
        cursor += CouponRateField.BYTE_LENGTH;
        if (!issuer.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerField.BYTE_LENGTH;
        if (!tradingScopeB.parse(data, cursor)) {
            return false;
        }
        cursor += TradingScopeBField.BYTE_LENGTH;
        if (!firstTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradingDateField.BYTE_LENGTH;
        if (!settlementSystem.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementSystemField.BYTE_LENGTH;
        if (!maturity.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityField.BYTE_LENGTH;
        if (!couponPeriodicity.parse(data, cursor)) {
            return false;
        }
        cursor += CouponPeriodicityField.BYTE_LENGTH;
        if (!benchmark.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkField.BYTE_LENGTH;
        if (!strippable.parse(data, cursor)) {
            return false;
        }
        cursor += StrippableField.BYTE_LENGTH;
        if (!volumeIssued.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeIssuedField.BYTE_LENGTH;
        if (!aliveVolume.parse(data, cursor)) {
            return false;
        }
        cursor += AliveVolumeField.BYTE_LENGTH;
        if (!couponType.parse(data, cursor)) {
            return false;
        }
        cursor += CouponTypeField.BYTE_LENGTH;
        if (!couponQuotation.parse(data, cursor)) {
            return false;
        }
        cursor += CouponQuotationField.BYTE_LENGTH;
        if (!accruedInterestCalculationProcedure.parse(data, cursor)) {
            return false;
        }
        cursor += AccruedInterestCalculationProcedureField.BYTE_LENGTH;
        if (!nextRedemptionDate.parse(data, cursor)) {
            return false;
        }
        cursor += NextRedemptionDateField.BYTE_LENGTH;
        if (!typeOfRedemption.parse(data, cursor)) {
            return false;
        }
        cursor += TypeOfRedemptionField.BYTE_LENGTH;
        if (!facial.parse(data, cursor)) {
            return false;
        }
        cursor += FacialField.BYTE_LENGTH;
        if (!calculationMethod.parse(data, cursor)) {
            return false;
        }
        cursor += CalculationMethodField.BYTE_LENGTH;
        if (!dateLastCouponWasPaid.parse(data, cursor)) {
            return false;
        }
        cursor += DateLastCouponWasPaidField.BYTE_LENGTH;
        if (!bondSeniority.parse(data, cursor)) {
            return false;
        }
        cursor += BondSeniorityField.BYTE_LENGTH;
        if (!interestAccrualDate.parse(data, cursor)) {
            return false;
        }
        cursor += InterestAccrualDateField.BYTE_LENGTH;
        if (!startDate.parse(data, cursor)) {
            return false;
        }
        cursor += StartDateField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!spreadToIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SpreadToIndexField.BYTE_LENGTH;
        if (!benchmarkCurvePointsUnits.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkCurvePointsUnitsField.BYTE_LENGTH;
        if (!benchmarkCurvePointsValue.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkCurvePointsValueField.BYTE_LENGTH;
        if (!benchmarkSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkSecurityIdField.BYTE_LENGTH;
        return accruedInterestRateR.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = symbolIsin.encode(data, cursor);
        cursor = fisn.encode(data, cursor);
        cursor = issuerLei.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = issueDate.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = liSpre.encode(data, cursor);
        cursor = sstIpre.encode(data, cursor);
        cursor = liSpost.encode(data, cursor);
        cursor = sstIpost.encode(data, cursor);
        cursor = liquidInstrument.encode(data, cursor);
        cursor = admissionRequestedByIssuer.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = roundLot.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = modalityMaskB.encode(data, cursor);
        cursor = securityDescription.encode(data, cursor);
        cursor = tradingObligation.encode(data, cursor);
        cursor = securityName.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = couponPaymentDate.encode(data, cursor);
        cursor = minPriceIncrement.encode(data, cursor);
        cursor = numberOfDecimals.encode(data, cursor);
        cursor = orderNumberOfDecimals.encode(data, cursor);
        cursor = couponRate.encode(data, cursor);
        cursor = issuer.encode(data, cursor);
        cursor = tradingScopeB.encode(data, cursor);
        cursor = firstTradingDate.encode(data, cursor);
        cursor = settlementSystem.encode(data, cursor);
        cursor = maturity.encode(data, cursor);
        cursor = couponPeriodicity.encode(data, cursor);
        cursor = benchmark.encode(data, cursor);
        cursor = strippable.encode(data, cursor);
        cursor = volumeIssued.encode(data, cursor);
        cursor = aliveVolume.encode(data, cursor);
        cursor = couponType.encode(data, cursor);
        cursor = couponQuotation.encode(data, cursor);
        cursor = accruedInterestCalculationProcedure.encode(data, cursor);
        cursor = nextRedemptionDate.encode(data, cursor);
        cursor = typeOfRedemption.encode(data, cursor);
        cursor = facial.encode(data, cursor);
        cursor = calculationMethod.encode(data, cursor);
        cursor = dateLastCouponWasPaid.encode(data, cursor);
        cursor = bondSeniority.encode(data, cursor);
        cursor = interestAccrualDate.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = spreadToIndex.encode(data, cursor);
        cursor = benchmarkCurvePointsUnits.encode(data, cursor);
        cursor = benchmarkCurvePointsValue.encode(data, cursor);
        cursor = benchmarkSecurityId.encode(data, cursor);
        cursor = accruedInterestRateR.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "MarketId" -> Optional.of(marketId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "SecurityCode" -> Optional.of(securityCode);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolIsin" -> Optional.of(symbolIsin);
            case "Fisn" -> Optional.of(fisn);
            case "IssuerLei" -> Optional.of(issuerLei);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "CfiCode" -> Optional.of(cfiCode);
            case "SecurityType" -> Optional.of(securityType);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "IssueDate" -> Optional.of(issueDate);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "LiSpre" -> Optional.of(liSpre);
            case "SstIpre" -> Optional.of(sstIpre);
            case "LiSpost" -> Optional.of(liSpost);
            case "SstIpost" -> Optional.of(sstIpost);
            case "LiquidInstrument" -> Optional.of(liquidInstrument);
            case "AdmissionRequestedByIssuer" -> Optional.of(admissionRequestedByIssuer);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "RoundLot" -> Optional.of(roundLot);
            case "Currency" -> Optional.of(currency);
            case "ModalityMaskB" -> Optional.of(modalityMaskB);
            case "SecurityDescription" -> Optional.of(securityDescription);
            case "TradingObligation" -> Optional.of(tradingObligation);
            case "SecurityName" -> Optional.of(securityName);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "CouponPaymentDate" -> Optional.of(couponPaymentDate);
            case "MinPriceIncrement" -> Optional.of(minPriceIncrement);
            case "NumberOfDecimals" -> Optional.of(numberOfDecimals);
            case "OrderNumberOfDecimals" -> Optional.of(orderNumberOfDecimals);
            case "CouponRate" -> Optional.of(couponRate);
            case "Issuer" -> Optional.of(issuer);
            case "TradingScopeB" -> Optional.of(tradingScopeB);
            case "FirstTradingDate" -> Optional.of(firstTradingDate);
            case "SettlementSystem" -> Optional.of(settlementSystem);
            case "Maturity" -> Optional.of(maturity);
            case "CouponPeriodicity" -> Optional.of(couponPeriodicity);
            case "Benchmark" -> Optional.of(benchmark);
            case "Strippable" -> Optional.of(strippable);
            case "VolumeIssued" -> Optional.of(volumeIssued);
            case "AliveVolume" -> Optional.of(aliveVolume);
            case "CouponType" -> Optional.of(couponType);
            case "CouponQuotation" -> Optional.of(couponQuotation);
            case "AccruedInterestCalculationProcedure" -> Optional.of(accruedInterestCalculationProcedure);
            case "NextRedemptionDate" -> Optional.of(nextRedemptionDate);
            case "TypeOfRedemption" -> Optional.of(typeOfRedemption);
            case "Facial" -> Optional.of(facial);
            case "CalculationMethod" -> Optional.of(calculationMethod);
            case "DateLastCouponWasPaid" -> Optional.of(dateLastCouponWasPaid);
            case "BondSeniority" -> Optional.of(bondSeniority);
            case "InterestAccrualDate" -> Optional.of(interestAccrualDate);
            case "StartDate" -> Optional.of(startDate);
            case "PriceType" -> Optional.of(priceType);
            case "SpreadToIndex" -> Optional.of(spreadToIndex);
            case "BenchmarkCurvePointsUnits" -> Optional.of(benchmarkCurvePointsUnits);
            case "BenchmarkCurvePointsValue" -> Optional.of(benchmarkCurvePointsValue);
            case "BenchmarkSecurityId" -> Optional.of(benchmarkSecurityId);
            case "AccruedInterestRateR" -> Optional.of(accruedInterestRateR);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityListMessage message)) {
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
        if (!(other instanceof SecurityListMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
