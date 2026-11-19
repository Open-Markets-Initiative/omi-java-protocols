package omi.nse.nsecd.orderentry.nnf.v6_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AccountNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ActivityTimeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ActivityTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AdditionalOrderFlagsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AlgoIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BookTypeCharField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuySellIndicatorField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CounterBrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CounterTraderOrderNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedVolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedVolumeRemainingField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillPriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillQuantityField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.GoodTillDateField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.LastActivityReferenceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OldAccountNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OldOpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OldPanField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OldParticipantField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OriginalVolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.PanField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ParticipantField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.PriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.RemainingVolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ResponseOrderNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.StOrderFlagsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TokenField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TraderNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolumeFilledTodayField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.ContractDesc;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Represents the TradeModifyConfirmMessage message from the OrderEntry protocol.
 *
 * <p>2287 MS_TRADE_MODIFY_CONFIRM 296 I, carried in the MS_TRADE_MODIFY_CONFIRM structure</p>
 */
public final class TradeModifyConfirmMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 256;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Modify Confirm Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 13, 1, 91, 1, 127, 1, 128, 4, 167, 1, 168, 1, 169, 1, 194, 2, 204, 52 };

    /**
     * ResponseOrderNumber
     */
    private final ResponseOrderNumberField responseOrderNumber = new ResponseOrderNumberField();

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * TraderNumber This field contains the trader or user ID
     */
    private final TraderNumberField traderNumber = new TraderNumberField();

    /**
     * If the order is entered on behalf of a trader, the Trader Account Number should be specified in this field
     */
    private final AccountNumberField accountNumber = new AccountNumberField();

    /**
     * Buy/SellIndicator
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * OriginalVolume This field contains the original traded volume
     */
    private final OriginalVolumeField originalVolume = new OriginalVolumeField();

    /**
     * This field should contain the quantity that has to be disclosed to the market
     */
    private final DisclosedVolumeField disclosedVolume = new DisclosedVolumeField();

    /**
     * This field contains the volume remaining after trade(s)
     */
    private final RemainingVolumeField remainingVolume = new RemainingVolumeField();

    /**
     * DisclosedVolumeRemaining
     */
    private final DisclosedVolumeRemainingField disclosedVolumeRemaining = new DisclosedVolumeRemainingField();

    /**
     * This field should contain the price at which the order is placed
     */
    private final PriceField price = new PriceField();

    /**
     * St Order Flags
     */
    private final StOrderFlagsField stOrderFlags = new StOrderFlagsField();

    /**
     * This field should contain the number of days for a GTD order
     */
    private final GoodTillDateField goodTillDate = new GoodTillDateField();

    /**
     * This field should contain the trade number of the trade to be modified
     */
    private final FillNumberField fillNumber = new FillNumberField();

    /**
     * This field should contain the quantity that has been traded
     */
    private final FillQuantityField fillQuantity = new FillQuantityField();

    /**
     * This field should contain the price at which the trade took place
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * VolumeFilledToday
     */
    private final VolumeFilledTodayField volumeFilledToday = new VolumeFilledTodayField();

    /**
     * This field contains one of the following values to denote the activity type. • ‘B’ for Buy • ‘S’ for Sell
     */
    private final ActivityTypeField activityType = new ActivityTypeField();

    /**
     * This field contains the time when the activity has taken place
     */
    private final ActivityTimeField activityTime = new ActivityTimeField();

    /**
     * CounterTraderOrderNumber
     */
    private final CounterTraderOrderNumberField counterTraderOrderNumber = new CounterTraderOrderNumberField();

    /**
     * This field contains the Trading Member ID of the counter party taking part in the trade
     */
    private final CounterBrokerIdField counterBrokerId = new CounterBrokerIdField();

    /**
     * This field contains the token number of the Asset
     */
    private final TokenField token = new TokenField();

    /**
     * Open/Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * For trade confirmation both Open Close and Old Open Close fields are same
     */
    private final OldOpenCloseField oldOpenClose = new OldOpenCloseField();

    /**
     * This field should contain the type of order
     */
    private final BookTypeCharField bookTypeChar = new BookTypeCharField();

    /**
     * OldAccountNumber
     */
    private final OldAccountNumberField oldAccountNumber = new OldAccountNumberField();

    /**
     * No NA
     */
    private final ParticipantField participant = new ParticipantField();

    /**
     * This field contains the participant id same as that of original trade confirmation message
     */
    private final OldParticipantField oldParticipant = new OldParticipantField();

    /**
     * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
     */
    private final AdditionalOrderFlagsField additionalOrderFlags = new AdditionalOrderFlagsField();

    /**
     * This field shall contain the PAN (Permanent Account Number/PAN_EXEMPT)
     */
    private final PanField pan = new PanField();

    /**
     * In case of trade modification this field shall contain the old PAN else it will be blank
     */
    private final OldPanField oldPan = new OldPanField();

    /**
     * For Algo order this field shall contain the Algo ID issued by the exchange
     */
    private final AlgoIdField algoId = new AlgoIdField();

    /**
     * In case of order entry response, this field will contain a unique value
     */
    private final LastActivityReferenceField lastActivityReference = new LastActivityReferenceField();

    /**
     * CONTRACT_DESC
     */
    private final ContractDesc contractDesc = new ContractDesc();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(responseOrderNumber), List.<Field>of(brokerId), List.<Field>of(traderNumber), List.<Field>of(accountNumber), List.<Field>of(buySellIndicator), List.<Field>of(originalVolume), List.<Field>of(disclosedVolume), List.<Field>of(remainingVolume), List.<Field>of(disclosedVolumeRemaining), List.<Field>of(price), List.<Field>of(stOrderFlags), List.<Field>of(goodTillDate), List.<Field>of(fillNumber), List.<Field>of(fillQuantity), List.<Field>of(fillPrice), List.<Field>of(volumeFilledToday), List.<Field>of(activityType), List.<Field>of(activityTime), List.<Field>of(counterTraderOrderNumber), List.<Field>of(counterBrokerId), List.<Field>of(token), contractDesc.fields(), List.<Field>of(openClose), List.<Field>of(oldOpenClose), List.<Field>of(bookTypeChar), List.<Field>of(oldAccountNumber), List.<Field>of(participant), List.<Field>of(oldParticipant), List.<Field>of(additionalOrderFlags), List.<Field>of(pan), List.<Field>of(oldPan), List.<Field>of(algoId), List.<Field>of(lastActivityReference)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * ResponseOrderNumber
     *
     * @return the ResponseOrderNumber field
     */
    public ResponseOrderNumberField responseOrderNumber() {
        return responseOrderNumber;
    }

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * TraderNumber This field contains the trader or user ID
     *
     * @return the TraderNumber field
     */
    public TraderNumberField traderNumber() {
        return traderNumber;
    }

    /**
     * If the order is entered on behalf of a trader, the Trader Account Number should be specified in this field
     *
     * @return the AccountNumber field
     */
    public AccountNumberField accountNumber() {
        return accountNumber;
    }

    /**
     * Buy/SellIndicator
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * OriginalVolume This field contains the original traded volume
     *
     * @return the OriginalVolume field
     */
    public OriginalVolumeField originalVolume() {
        return originalVolume;
    }

    /**
     * This field should contain the quantity that has to be disclosed to the market
     *
     * @return the DisclosedVolume field
     */
    public DisclosedVolumeField disclosedVolume() {
        return disclosedVolume;
    }

    /**
     * This field contains the volume remaining after trade(s)
     *
     * @return the RemainingVolume field
     */
    public RemainingVolumeField remainingVolume() {
        return remainingVolume;
    }

    /**
     * DisclosedVolumeRemaining
     *
     * @return the DisclosedVolumeRemaining field
     */
    public DisclosedVolumeRemainingField disclosedVolumeRemaining() {
        return disclosedVolumeRemaining;
    }

    /**
     * This field should contain the price at which the order is placed
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * This field should contain the number of days for a GTD order
     *
     * @return the GoodTillDate field
     */
    public GoodTillDateField goodTillDate() {
        return goodTillDate;
    }

    /**
     * This field should contain the trade number of the trade to be modified
     *
     * @return the FillNumber field
     */
    public FillNumberField fillNumber() {
        return fillNumber;
    }

    /**
     * This field should contain the quantity that has been traded
     *
     * @return the FillQuantity field
     */
    public FillQuantityField fillQuantity() {
        return fillQuantity;
    }

    /**
     * This field should contain the price at which the trade took place
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * VolumeFilledToday
     *
     * @return the VolumeFilledToday field
     */
    public VolumeFilledTodayField volumeFilledToday() {
        return volumeFilledToday;
    }

    /**
     * This field contains one of the following values to denote the activity type. • ‘B’ for Buy • ‘S’ for Sell
     *
     * @return the ActivityType field
     */
    public ActivityTypeField activityType() {
        return activityType;
    }

    /**
     * This field contains the time when the activity has taken place
     *
     * @return the ActivityTime field
     */
    public ActivityTimeField activityTime() {
        return activityTime;
    }

    /**
     * CounterTraderOrderNumber
     *
     * @return the CounterTraderOrderNumber field
     */
    public CounterTraderOrderNumberField counterTraderOrderNumber() {
        return counterTraderOrderNumber;
    }

    /**
     * This field contains the Trading Member ID of the counter party taking part in the trade
     *
     * @return the CounterBrokerId field
     */
    public CounterBrokerIdField counterBrokerId() {
        return counterBrokerId;
    }

    /**
     * This field contains the token number of the Asset
     *
     * @return the Token field
     */
    public TokenField token() {
        return token;
    }

    /**
     * Open/Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * For trade confirmation both Open Close and Old Open Close fields are same
     *
     * @return the OldOpenClose field
     */
    public OldOpenCloseField oldOpenClose() {
        return oldOpenClose;
    }

    /**
     * This field should contain the type of order
     *
     * @return the BookTypeChar field
     */
    public BookTypeCharField bookTypeChar() {
        return bookTypeChar;
    }

    /**
     * OldAccountNumber
     *
     * @return the OldAccountNumber field
     */
    public OldAccountNumberField oldAccountNumber() {
        return oldAccountNumber;
    }

    /**
     * No NA
     *
     * @return the Participant field
     */
    public ParticipantField participant() {
        return participant;
    }

    /**
     * This field contains the participant id same as that of original trade confirmation message
     *
     * @return the OldParticipant field
     */
    public OldParticipantField oldParticipant() {
        return oldParticipant;
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
     * This field shall contain the PAN (Permanent Account Number/PAN_EXEMPT)
     *
     * @return the Pan field
     */
    public PanField pan() {
        return pan;
    }

    /**
     * In case of trade modification this field shall contain the old PAN else it will be blank
     *
     * @return the OldPan field
     */
    public OldPanField oldPan() {
        return oldPan;
    }

    /**
     * For Algo order this field shall contain the Algo ID issued by the exchange
     *
     * @return the AlgoId field
     */
    public AlgoIdField algoId() {
        return algoId;
    }

    /**
     * In case of order entry response, this field will contain a unique value
     *
     * @return the LastActivityReference field
     */
    public LastActivityReferenceField lastActivityReference() {
        return lastActivityReference;
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
        return PADDING.clone();
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
        if (!responseOrderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ResponseOrderNumberField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!traderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TraderNumberField.BYTE_LENGTH;
        if (!accountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += AccountNumberField.BYTE_LENGTH;
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!originalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalVolumeField.BYTE_LENGTH;
        if (!disclosedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolumeField.BYTE_LENGTH;
        if (!remainingVolume.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingVolumeField.BYTE_LENGTH;
        if (!disclosedVolumeRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolumeRemainingField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += StOrderFlagsField.BYTE_LENGTH;
        if (!goodTillDate.parse(data, cursor)) {
            return false;
        }
        cursor += GoodTillDateField.BYTE_LENGTH;
        if (!fillNumber.parse(data, cursor)) {
            return false;
        }
        cursor += FillNumberField.BYTE_LENGTH;
        if (!fillQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += FillQuantityField.BYTE_LENGTH;
        if (!fillPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FillPriceField.BYTE_LENGTH;
        if (!volumeFilledToday.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeFilledTodayField.BYTE_LENGTH;
        if (!activityType.parse(data, cursor)) {
            return false;
        }
        cursor += ActivityTypeField.BYTE_LENGTH;
        if (!activityTime.parse(data, cursor)) {
            return false;
        }
        cursor += ActivityTimeField.BYTE_LENGTH;
        if (!counterTraderOrderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CounterTraderOrderNumberField.BYTE_LENGTH;
        if (!counterBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += CounterBrokerIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!token.parse(data, cursor)) {
            return false;
        }
        cursor += TokenField.BYTE_LENGTH;
        if (!contractDesc.parseFrom(data, cursor, end - 132)) {
            return false;
        }
        cursor += contractDesc.byteLength();
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!oldOpenClose.parse(data, cursor)) {
            return false;
        }
        cursor += OldOpenCloseField.BYTE_LENGTH;
        if (!bookTypeChar.parse(data, cursor)) {
            return false;
        }
        cursor += BookTypeCharField.BYTE_LENGTH;
        cursor += 5; // padding
        if (!oldAccountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OldAccountNumberField.BYTE_LENGTH;
        if (!participant.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantField.BYTE_LENGTH;
        if (!oldParticipant.parse(data, cursor)) {
            return false;
        }
        cursor += OldParticipantField.BYTE_LENGTH;
        if (!additionalOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalOrderFlagsField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!pan.parse(data, cursor)) {
            return false;
        }
        cursor += PanField.BYTE_LENGTH;
        if (!oldPan.parse(data, cursor)) {
            return false;
        }
        cursor += OldPanField.BYTE_LENGTH;
        if (!algoId.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!lastActivityReference.parse(data, cursor)) {
            return false;
        }
        cursor += LastActivityReferenceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = responseOrderNumber.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 14) {
            System.arraycopy(buffer, 13, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = traderNumber.encode(data, cursor);
        cursor = accountNumber.encode(data, cursor);
        cursor = buySellIndicator.encode(data, cursor);
        cursor = originalVolume.encode(data, cursor);
        cursor = disclosedVolume.encode(data, cursor);
        cursor = remainingVolume.encode(data, cursor);
        cursor = disclosedVolumeRemaining.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stOrderFlags.encode(data, cursor);
        cursor = goodTillDate.encode(data, cursor);
        cursor = fillNumber.encode(data, cursor);
        cursor = fillQuantity.encode(data, cursor);
        cursor = fillPrice.encode(data, cursor);
        cursor = volumeFilledToday.encode(data, cursor);
        cursor = activityType.encode(data, cursor);
        cursor = activityTime.encode(data, cursor);
        cursor = counterTraderOrderNumber.encode(data, cursor);
        cursor = counterBrokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 92) {
            System.arraycopy(buffer, 91, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = token.encode(data, cursor);
        cursor = contractDesc.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = oldOpenClose.encode(data, cursor);
        cursor = bookTypeChar.encode(data, cursor);
        if (buffer != null && buffer.length >= 132) {
            System.arraycopy(buffer, 127, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = oldAccountNumber.encode(data, cursor);
        cursor = participant.encode(data, cursor);
        cursor = oldParticipant.encode(data, cursor);
        cursor = additionalOrderFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 170) {
            System.arraycopy(buffer, 167, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = pan.encode(data, cursor);
        cursor = oldPan.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        if (buffer != null && buffer.length >= 196) {
            System.arraycopy(buffer, 194, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = lastActivityReference.encode(data, cursor);
        if (buffer != null && buffer.length >= 256) {
            System.arraycopy(buffer, 204, data, cursor, 52); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 52, (byte) 0); // padding
        }
        cursor += 52;
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
            case "ResponseOrderNumber" -> Optional.of(responseOrderNumber);
            case "BrokerId" -> Optional.of(brokerId);
            case "TraderNumber" -> Optional.of(traderNumber);
            case "AccountNumber" -> Optional.of(accountNumber);
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "OriginalVolume" -> Optional.of(originalVolume);
            case "DisclosedVolume" -> Optional.of(disclosedVolume);
            case "RemainingVolume" -> Optional.of(remainingVolume);
            case "DisclosedVolumeRemaining" -> Optional.of(disclosedVolumeRemaining);
            case "Price" -> Optional.of(price);
            case "StOrderFlags" -> Optional.of(stOrderFlags);
            case "GoodTillDate" -> Optional.of(goodTillDate);
            case "FillNumber" -> Optional.of(fillNumber);
            case "FillQuantity" -> Optional.of(fillQuantity);
            case "FillPrice" -> Optional.of(fillPrice);
            case "VolumeFilledToday" -> Optional.of(volumeFilledToday);
            case "ActivityType" -> Optional.of(activityType);
            case "ActivityTime" -> Optional.of(activityTime);
            case "CounterTraderOrderNumber" -> Optional.of(counterTraderOrderNumber);
            case "CounterBrokerId" -> Optional.of(counterBrokerId);
            case "Token" -> Optional.of(token);
            case "OpenClose" -> Optional.of(openClose);
            case "OldOpenClose" -> Optional.of(oldOpenClose);
            case "BookTypeChar" -> Optional.of(bookTypeChar);
            case "OldAccountNumber" -> Optional.of(oldAccountNumber);
            case "Participant" -> Optional.of(participant);
            case "OldParticipant" -> Optional.of(oldParticipant);
            case "AdditionalOrderFlags" -> Optional.of(additionalOrderFlags);
            case "Pan" -> Optional.of(pan);
            case "OldPan" -> Optional.of(oldPan);
            case "AlgoId" -> Optional.of(algoId);
            case "LastActivityReference" -> Optional.of(lastActivityReference);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeModifyConfirmMessage message)) {
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
        if (!(other instanceof TradeModifyConfirmMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
