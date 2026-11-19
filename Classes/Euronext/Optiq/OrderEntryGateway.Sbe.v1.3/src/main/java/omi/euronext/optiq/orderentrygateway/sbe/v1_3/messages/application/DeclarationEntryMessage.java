package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountNumberCrossField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountNumberField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountTypeCrossField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.CentralisationDateField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClMsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClearingFirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientIdentificationShortCodeCrossField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientIdentificationShortcodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EndTimeVwapField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EnteringCounterpartyField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FreeTextCrossField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FreeTextField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.GrossTradeAmountField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.GuaranteeFlagField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.InvestmentDecisionWFirmShortCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MiCofSecondaryListingField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MifidIndicatorsField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OperationTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.PriceOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.PrincipalCodeCrossField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.PrincipalCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.QuantityField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SettlementFlagField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SettlementPeriodField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.StartTimeVwapField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradingCapacityCrossField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TradingCapacityField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.TransactionPriceTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the DeclarationEntryMessage message from the OrderEntryGateway protocol.
 *
 * <p>DeclarationEntryMessage</p>
 */
public final class DeclarationEntryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 198;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Declaration Entry Message";

    /**
     * clMsgSeqNum
     */
    private final ClMsgSeqNumField clMsgSeqNum = new ClMsgSeqNumField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * sendingTime
     */
    private final SendingTimeField sendingTime = new SendingTimeField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * operationType
     */
    private final OperationTypeField operationType = new OperationTypeField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * enteringCounterparty
     */
    private final EnteringCounterpartyField enteringCounterparty = new EnteringCounterpartyField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * price
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * executionWithinFirmShortCode
     */
    private final ExecutionWithinFirmShortCodeField executionWithinFirmShortCode = new ExecutionWithinFirmShortCodeField();

    /**
     * clientIdentificationShortcode
     */
    private final ClientIdentificationShortcodeField clientIdentificationShortcode = new ClientIdentificationShortcodeField();

    /**
     * mICofSecondaryListing
     */
    private final MiCofSecondaryListingField miCofSecondaryListing = new MiCofSecondaryListingField();

    /**
     * centralisationDate
     */
    private final CentralisationDateField centralisationDate = new CentralisationDateField();

    /**
     * clearingFirmID
     */
    private final ClearingFirmIdField clearingFirmId = new ClearingFirmIdField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * accountTypeCross
     */
    private final AccountTypeCrossField accountTypeCross = new AccountTypeCrossField();

    /**
     * tradingCapacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * tradingCapacityCross
     */
    private final TradingCapacityCrossField tradingCapacityCross = new TradingCapacityCrossField();

    /**
     * settlementPeriod
     */
    private final SettlementPeriodField settlementPeriod = new SettlementPeriodField();

    /**
     * settlementFlag
     */
    private final SettlementFlagField settlementFlag = new SettlementFlagField();

    /**
     * guaranteeFlag
     */
    private final GuaranteeFlagField guaranteeFlag = new GuaranteeFlagField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MifidIndicatorsField mifidIndicators = new MifidIndicatorsField();

    /**
     * transactionPriceType
     */
    private final TransactionPriceTypeField transactionPriceType = new TransactionPriceTypeField();

    /**
     * principalCode
     */
    private final PrincipalCodeField principalCode = new PrincipalCodeField();

    /**
     * principalCodeCross
     */
    private final PrincipalCodeCrossField principalCodeCross = new PrincipalCodeCrossField();

    /**
     * startTimeVwap
     */
    private final StartTimeVwapField startTimeVwap = new StartTimeVwapField();

    /**
     * endTimeVwap
     */
    private final EndTimeVwapField endTimeVwap = new EndTimeVwapField();

    /**
     * grossTradeAmount
     */
    private final GrossTradeAmountField grossTradeAmount = new GrossTradeAmountField();

    /**
     * accountNumber
     */
    private final AccountNumberField accountNumber = new AccountNumberField();

    /**
     * accountNumberCross
     */
    private final AccountNumberCrossField accountNumberCross = new AccountNumberCrossField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * freeTextCross
     */
    private final FreeTextCrossField freeTextCross = new FreeTextCrossField();

    /**
     * investmentDecisionWFirmShortCode
     */
    private final InvestmentDecisionWFirmShortCodeField investmentDecisionWFirmShortCode = new InvestmentDecisionWFirmShortCodeField();

    /**
     * clientIdentificationShortCodeCross
     */
    private final ClientIdentificationShortCodeCrossField clientIdentificationShortCodeCross = new ClientIdentificationShortCodeCrossField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clMsgSeqNum, firmId, sendingTime, clientOrderId, operationType, symbolIndex, emm, enteringCounterparty, side, quantity, priceOptional, executionWithinFirmShortCode, clientIdentificationShortcode, miCofSecondaryListing, centralisationDate, clearingFirmId, accountType, accountTypeCross, tradingCapacity, tradingCapacityCross, settlementPeriod, settlementFlag, guaranteeFlag, mifidIndicators, transactionPriceType, principalCode, principalCodeCross, startTimeVwap, endTimeVwap, grossTradeAmount, accountNumber, accountNumberCross, freeText, freeTextCross, investmentDecisionWFirmShortCode, clientIdentificationShortCodeCross);

    private byte[] buffer;

    private boolean decoded;

    /**
     * clMsgSeqNum
     *
     * @return the ClMsgSeqNum field
     */
    public ClMsgSeqNumField clMsgSeqNum() {
        return clMsgSeqNum;
    }

    /**
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * sendingTime
     *
     * @return the SendingTime field
     */
    public SendingTimeField sendingTime() {
        return sendingTime;
    }

    /**
     * clientOrderID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * operationType
     *
     * @return the OperationType field
     */
    public OperationTypeField operationType() {
        return operationType;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
    }

    /**
     * enteringCounterparty
     *
     * @return the EnteringCounterparty field
     */
    public EnteringCounterpartyField enteringCounterparty() {
        return enteringCounterparty;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * price
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * executionWithinFirmShortCode
     *
     * @return the ExecutionWithinFirmShortCode field
     */
    public ExecutionWithinFirmShortCodeField executionWithinFirmShortCode() {
        return executionWithinFirmShortCode;
    }

    /**
     * clientIdentificationShortcode
     *
     * @return the ClientIdentificationShortcode field
     */
    public ClientIdentificationShortcodeField clientIdentificationShortcode() {
        return clientIdentificationShortcode;
    }

    /**
     * mICofSecondaryListing
     *
     * @return the MiCofSecondaryListing field
     */
    public MiCofSecondaryListingField miCofSecondaryListing() {
        return miCofSecondaryListing;
    }

    /**
     * centralisationDate
     *
     * @return the CentralisationDate field
     */
    public CentralisationDateField centralisationDate() {
        return centralisationDate;
    }

    /**
     * clearingFirmID
     *
     * @return the ClearingFirmId field
     */
    public ClearingFirmIdField clearingFirmId() {
        return clearingFirmId;
    }

    /**
     * accountType
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * accountTypeCross
     *
     * @return the AccountTypeCross field
     */
    public AccountTypeCrossField accountTypeCross() {
        return accountTypeCross;
    }

    /**
     * tradingCapacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * tradingCapacityCross
     *
     * @return the TradingCapacityCross field
     */
    public TradingCapacityCrossField tradingCapacityCross() {
        return tradingCapacityCross;
    }

    /**
     * settlementPeriod
     *
     * @return the SettlementPeriod field
     */
    public SettlementPeriodField settlementPeriod() {
        return settlementPeriod;
    }

    /**
     * settlementFlag
     *
     * @return the SettlementFlag field
     */
    public SettlementFlagField settlementFlag() {
        return settlementFlag;
    }

    /**
     * guaranteeFlag
     *
     * @return the GuaranteeFlag field
     */
    public GuaranteeFlagField guaranteeFlag() {
        return guaranteeFlag;
    }

    /**
     * MiFIDIndicators_set bit set
     *
     * @return the MifidIndicators field
     */
    public MifidIndicatorsField mifidIndicators() {
        return mifidIndicators;
    }

    /**
     * transactionPriceType
     *
     * @return the TransactionPriceType field
     */
    public TransactionPriceTypeField transactionPriceType() {
        return transactionPriceType;
    }

    /**
     * principalCode
     *
     * @return the PrincipalCode field
     */
    public PrincipalCodeField principalCode() {
        return principalCode;
    }

    /**
     * principalCodeCross
     *
     * @return the PrincipalCodeCross field
     */
    public PrincipalCodeCrossField principalCodeCross() {
        return principalCodeCross;
    }

    /**
     * startTimeVwap
     *
     * @return the StartTimeVwap field
     */
    public StartTimeVwapField startTimeVwap() {
        return startTimeVwap;
    }

    /**
     * endTimeVwap
     *
     * @return the EndTimeVwap field
     */
    public EndTimeVwapField endTimeVwap() {
        return endTimeVwap;
    }

    /**
     * grossTradeAmount
     *
     * @return the GrossTradeAmount field
     */
    public GrossTradeAmountField grossTradeAmount() {
        return grossTradeAmount;
    }

    /**
     * accountNumber
     *
     * @return the AccountNumber field
     */
    public AccountNumberField accountNumber() {
        return accountNumber;
    }

    /**
     * accountNumberCross
     *
     * @return the AccountNumberCross field
     */
    public AccountNumberCrossField accountNumberCross() {
        return accountNumberCross;
    }

    /**
     * freeText
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * freeTextCross
     *
     * @return the FreeTextCross field
     */
    public FreeTextCrossField freeTextCross() {
        return freeTextCross;
    }

    /**
     * investmentDecisionWFirmShortCode
     *
     * @return the InvestmentDecisionWFirmShortCode field
     */
    public InvestmentDecisionWFirmShortCodeField investmentDecisionWFirmShortCode() {
        return investmentDecisionWFirmShortCode;
    }

    /**
     * clientIdentificationShortCodeCross
     *
     * @return the ClientIdentificationShortCodeCross field
     */
    public ClientIdentificationShortCodeCrossField clientIdentificationShortCodeCross() {
        return clientIdentificationShortCodeCross;
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
        return Optional.ofNullable(sendingTime.value());
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
        if (!clMsgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += ClMsgSeqNumField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!sendingTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!operationType.parse(data, cursor)) {
            return false;
        }
        cursor += OperationTypeField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!enteringCounterparty.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringCounterpartyField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!priceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOptionalField.BYTE_LENGTH;
        if (!executionWithinFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionWithinFirmShortCodeField.BYTE_LENGTH;
        if (!clientIdentificationShortcode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdentificationShortcodeField.BYTE_LENGTH;
        if (!miCofSecondaryListing.parse(data, cursor)) {
            return false;
        }
        cursor += MiCofSecondaryListingField.BYTE_LENGTH;
        if (!centralisationDate.parse(data, cursor)) {
            return false;
        }
        cursor += CentralisationDateField.BYTE_LENGTH;
        if (!clearingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmIdField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!accountTypeCross.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeCrossField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!tradingCapacityCross.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityCrossField.BYTE_LENGTH;
        if (!settlementPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPeriodField.BYTE_LENGTH;
        if (!settlementFlag.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementFlagField.BYTE_LENGTH;
        if (!guaranteeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += GuaranteeFlagField.BYTE_LENGTH;
        if (!mifidIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += MifidIndicatorsField.BYTE_LENGTH;
        if (!transactionPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionPriceTypeField.BYTE_LENGTH;
        if (!principalCode.parse(data, cursor)) {
            return false;
        }
        cursor += PrincipalCodeField.BYTE_LENGTH;
        if (!principalCodeCross.parse(data, cursor)) {
            return false;
        }
        cursor += PrincipalCodeCrossField.BYTE_LENGTH;
        if (!startTimeVwap.parse(data, cursor)) {
            return false;
        }
        cursor += StartTimeVwapField.BYTE_LENGTH;
        if (!endTimeVwap.parse(data, cursor)) {
            return false;
        }
        cursor += EndTimeVwapField.BYTE_LENGTH;
        if (!grossTradeAmount.parse(data, cursor)) {
            return false;
        }
        cursor += GrossTradeAmountField.BYTE_LENGTH;
        if (!accountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += AccountNumberField.BYTE_LENGTH;
        if (!accountNumberCross.parse(data, cursor)) {
            return false;
        }
        cursor += AccountNumberCrossField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!freeTextCross.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextCrossField.BYTE_LENGTH;
        if (!investmentDecisionWFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentDecisionWFirmShortCodeField.BYTE_LENGTH;
        return clientIdentificationShortCodeCross.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clMsgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = operationType.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = enteringCounterparty.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = executionWithinFirmShortCode.encode(data, cursor);
        cursor = clientIdentificationShortcode.encode(data, cursor);
        cursor = miCofSecondaryListing.encode(data, cursor);
        cursor = centralisationDate.encode(data, cursor);
        cursor = clearingFirmId.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = accountTypeCross.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = tradingCapacityCross.encode(data, cursor);
        cursor = settlementPeriod.encode(data, cursor);
        cursor = settlementFlag.encode(data, cursor);
        cursor = guaranteeFlag.encode(data, cursor);
        cursor = mifidIndicators.encode(data, cursor);
        cursor = transactionPriceType.encode(data, cursor);
        cursor = principalCode.encode(data, cursor);
        cursor = principalCodeCross.encode(data, cursor);
        cursor = startTimeVwap.encode(data, cursor);
        cursor = endTimeVwap.encode(data, cursor);
        cursor = grossTradeAmount.encode(data, cursor);
        cursor = accountNumber.encode(data, cursor);
        cursor = accountNumberCross.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = freeTextCross.encode(data, cursor);
        cursor = investmentDecisionWFirmShortCode.encode(data, cursor);
        cursor = clientIdentificationShortCodeCross.encode(data, cursor);
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
            case "ClMsgSeqNum" -> Optional.of(clMsgSeqNum);
            case "FirmId" -> Optional.of(firmId);
            case "SendingTime" -> Optional.of(sendingTime);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OperationType" -> Optional.of(operationType);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "EnteringCounterparty" -> Optional.of(enteringCounterparty);
            case "Side" -> Optional.of(side);
            case "Quantity" -> Optional.of(quantity);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "ExecutionWithinFirmShortCode" -> Optional.of(executionWithinFirmShortCode);
            case "ClientIdentificationShortcode" -> Optional.of(clientIdentificationShortcode);
            case "MiCofSecondaryListing" -> Optional.of(miCofSecondaryListing);
            case "CentralisationDate" -> Optional.of(centralisationDate);
            case "ClearingFirmId" -> Optional.of(clearingFirmId);
            case "AccountType" -> Optional.of(accountType);
            case "AccountTypeCross" -> Optional.of(accountTypeCross);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TradingCapacityCross" -> Optional.of(tradingCapacityCross);
            case "SettlementPeriod" -> Optional.of(settlementPeriod);
            case "SettlementFlag" -> Optional.of(settlementFlag);
            case "GuaranteeFlag" -> Optional.of(guaranteeFlag);
            case "MifidIndicators" -> Optional.of(mifidIndicators);
            case "TransactionPriceType" -> Optional.of(transactionPriceType);
            case "PrincipalCode" -> Optional.of(principalCode);
            case "PrincipalCodeCross" -> Optional.of(principalCodeCross);
            case "StartTimeVwap" -> Optional.of(startTimeVwap);
            case "EndTimeVwap" -> Optional.of(endTimeVwap);
            case "GrossTradeAmount" -> Optional.of(grossTradeAmount);
            case "AccountNumber" -> Optional.of(accountNumber);
            case "AccountNumberCross" -> Optional.of(accountNumberCross);
            case "FreeText" -> Optional.of(freeText);
            case "FreeTextCross" -> Optional.of(freeTextCross);
            case "InvestmentDecisionWFirmShortCode" -> Optional.of(investmentDecisionWFirmShortCode);
            case "ClientIdentificationShortCodeCross" -> Optional.of(clientIdentificationShortCodeCross);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DeclarationEntryMessage message)) {
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
        if (!(other instanceof DeclarationEntryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
