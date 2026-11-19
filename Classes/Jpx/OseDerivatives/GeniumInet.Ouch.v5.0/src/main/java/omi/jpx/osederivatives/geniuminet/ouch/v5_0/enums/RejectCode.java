package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Backend error code. See System Error Messages Reference for more information.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum RejectCode {

    /**
     * The order was rejected or has not been accepted by the exchange yet.
     */
    DE_CAN_NOT_CANCEL(-800014, "The order was rejected or has not been accepted by the exchange yet."),

    /**
     * The token has already been used for this session.
     */
    DE_DUPLICATE_TOKEN(-800002, "The token has already been used for this session."),

    /**
     * Invalid mass cancel scope.
     */
    DE_INVALID_MASS_CANCEL_SCOPE(-800016, "Invalid mass cancel scope."),

    /**
     * The orderbook specified is not available.
     */
    DE_INVALID_ORDERBOOK(-800006, "The orderbook specified is not available."),

    /**
     * This error-code is currently not used by the exchange.
     */
    DE_INVALID_ORDER_NUMBER(-800012, "This error-code is currently not used by the exchange."),

    /**
     * The side specified is invalid.
     */
    DE_INVALID_SIDE(-800008, "The side specified is invalid."),

    /**
     * The time in force specified is invalid.
     */
    DE_INVALID_TIF(-800010, "The time in force specified is invalid."),

    /**
     * The underlying id specified is not available.
     */
    DE_INVALID_UNDERLYING(-800018, "The underlying id specified is not available."),

    /**
     * Throttling limit exceeded.
     */
    DE_THROTTLING(-800015, "Throttling limit exceeded."),

    /**
     * Attempt to use a token that has not been previously sent.
     */
    DE_UNKNOWN_TOKEN(-800004, "Attempt to use a token that has not been previously sent."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_AEX_FULL(-110210, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_ASC_FULL(-110244, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CAC_FULL(-110262, "Too many member entries in the table."),

    /**
     * The combination descriptor is not yet set up.
     */
    GEN_CDC_CBS_NOT_READY(-110235, "The combination descriptor is not yet set up."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CBX_FULL(-110196, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CCR_FULL(-110204, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CIB_FULL(-110186, "Too many member entries in the table."),

    /**
     * The customer has not been configured by the exchange to act in this given instrument type.
     */
    GEN_CDC_CLI_NOTFOU(-110019, "The customer has not been configured by the exchange to act in this given instrument type."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_COG_FULL(-110118, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CPA_FULL(-110242, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CRF_FULL(-110194, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CRO_FULL(-110202, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CRP_FULL(-110274, "Too many member entries in the table."),

    /**
     * The current time plus the time the crossing report is in holding passes the closing time for the market.
     */
    GEN_CDC_CRSCLOSE(-110165, "The current time plus the time the crossing report is in holding passes the closing time for the market."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CSA_FULL(-110212, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CSE_FULL(-110282, "Too many member entries in the table."),

    /**
     * The customer is suspended and given request could not be performed.
     */
    GEN_CDC_CST_SUSP(-110081, "The customer is suspended and given request could not be performed."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CUP_FULL(-110218, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_CUR_FULL(-110264, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_DES_FULL(-110136, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_DGR_FULL(-110146, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_DHB_FULL(-110148, "Too many member entries in the table."),

    /**
     * Too many directed order entries in the table.
     */
    GEN_CDC_DIO_FULL(-110268, "Too many directed order entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_ECB_FULL(-110232, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_EDG_FULL(-110126, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_EDL_FULL(-110222, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_EID_FULL(-110138, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_EXC_FULL(-110142, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_FML_FULL(-110120, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_FOV_FULL(-110132, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_HSE_FULL(-110284, "Too many member entries in the table."),

    /**
     * The customer has not been configured by the exchange to act in this given underlying.
     */
    GEN_CDC_ILL_COMMODITY(-110061, "The customer has not been configured by the exchange to act in this given underlying."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_ING_FULL(-110220, "Too many member entries in the table."),

    /**
     * The given transaction is not allowed at this given time.
     */
    GEN_CDC_INT_CLOSED(-110023, "The given transaction is not allowed at this given time."),

    /**
     * The value specified is not one of Open, Close or Lock.
     */
    GEN_CDC_INVOPENCLOSE(-110167, "The value specified is not one of Open, Close or Lock."),

    /**
     * The user specified in not known by the process.
     */
    GEN_CDC_INVUSER(-110171, "The user specified in not known by the process."),

    /**
     * The given block size is not allowed for this instrument type.
     */
    GEN_CDC_INV_BLOCK(-110157, "The given block size is not allowed for this instrument type."),

    /**
     * The open close request must be either default for the account, open, close or mandatory close.
     */
    GEN_CDC_INV_OPEN_CLOSE_REQ(-110163, "The open close request must be either default for the account, open, close or mandatory close."),

    /**
     * The premium must be aligned at the price ticks for the given instrument.
     */
    GEN_CDC_INV_PREMIUM(-110161, "The premium must be aligned at the price ticks for the given instrument."),

    /**
     * The quantity must be in the interval 1 to 32767.
     */
    GEN_CDC_INV_QUANTITY(-110159, "The quantity must be in the interval 1 to 32767."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_IXV_FULL(-110206, "Too many member entries in the table."),

    /**
     * The customer has not been configured by the exchange to act in this given instrument type.
     */
    GEN_CDC_LIU_NOTFOU(-110011, "The customer has not been configured by the exchange to act in this given instrument type."),

    /**
     * The transaction is not valid for this instrument type.
     */
    GEN_CDC_LTT_NOTFOU(-110013, "The transaction is not valid for this instrument type."),

    /**
     * The time validity given in the order is not valid at the exchange.
     */
    GEN_CDC_MATCH_VALIDITY(-110169, "The time validity given in the order is not valid at the exchange."),

    /**
     * The given quantity is higher than limit in CDB.
     */
    GEN_CDC_MAX_MEM_QUANTITY(-110201, "The given quantity is higher than limit in CDB."),

    /**
     * The given quantity is higher than limit in CDB.
     */
    GEN_CDC_MAX_QUANTITY(-110173, "The given quantity is higher than limit in CDB."),

    /**
     * Too many member entries in the Member table.
     */
    GEN_CDC_MEM_FULL(-110002, "Too many member entries in the Member table."),

    /**
     * The minute of silence is in progress.
     */
    GEN_CDC_MIN_OF_SIL(-110175, "The minute of silence is in progress."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_MPM_FULL(-110278, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_MPR_FULL(-110276, "Too many member entries in the table."),

    /**
     * Too many member entries in the market supervision table.
     */
    GEN_CDC_MSU_FULL(-110116, "Too many member entries in the market supervision table."),

    /**
     * Specified series in not traded.
     */
    GEN_CDC_NOT_TRADED(-110247, "Specified series in not traded."),

    /**
     * There must be a hedge price in the hedge series.
     */
    GEN_CDC_NO_HEDGE_PRICE(-110193, "There must be a hedge price in the hedge series."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_NTD_FULL(-110190, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_OAT_FULL(-110236, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_OBK_FULL(-110122, "Too many member entries in the table."),

    /**
     * Too many member entries in the Member obligation table.
     */
    GEN_CDC_OBL_FULL(-110114, "Too many member entries in the Member obligation table."),

    /**
     * Specified member does not exist in the member obligation table.
     */
    GEN_CDC_OBL_NOTFOU(-110115, "Specified member does not exist in the member obligation table."),

    /**
     * This instrument is valid for the user only in combos with an equity leg.
     */
    GEN_CDC_ONLY_IN_EQ_CBO(-110255, "This instrument is valid for the user only in combos with an equity leg."),

    /**
     * Too many opening parameter entries in the table.
     */
    GEN_CDC_OPP_FULL(-110266, "Too many opening parameter entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_PDP_FULL(-110130, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_PID_FULL(-110252, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_POD_FULL(-110216, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_PRL_FULL(-110152, "Too many member entries in the table."),

    /**
     * Too many report entries in the table.
     */
    GEN_CDC_RPT_FULL(-110270, "Too many report entries in the table."),

    /**
     * Too many report template entries in the table.
     */
    GEN_CDC_RTM_FULL(-110272, "Too many report template entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_SEC_FULL(-110214, "Too many member entries in the table."),

    /**
     * The underlying has been stopped from trading. The series is then also stopped.
     */
    GEN_CDC_SERIES_STOPPED(-110155, "The underlying has been stopped from trading. The series is then also stopped."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_SID_FULL(-110188, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_SPG_FULL(-110128, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_SPL_FULL(-110224, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_SSS_FULL(-110230, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_SST_FULL(-110150, "Too many member entries in the table."),

    /**
     * Trading report class not valid for the instrument.
     */
    GEN_CDC_TRC_INS_NOTFOUND(-110257, "Trading report class not valid for the instrument."),

    /**
     * Trading report class not valid for session state.
     */
    GEN_CDC_TRC_SST_NOTFOUND(-110259, "Trading report class not valid for session state."),

    /**
     * Trading report class not valid for the user.
     */
    GEN_CDC_TRC_UST_NOTFOUND(-110261, "Trading report class not valid for the user."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_TSE_FULL(-110134, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_TSR_FULL(-110124, "Too many member entries in the table."),

    /**
     * The user has been suspended and given action can not be performed.
     */
    GEN_CDC_USR_SUSP(-110077, "The user has been suspended and given action can not be performed."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_UST_FULL(-110140, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_VBS_FULL(-110208, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_VDS_FULL(-110144, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_VSP_FULL(-110226, "Too many member entries in the table."),

    /**
     * Too many member entries in the table.
     */
    GEN_CDC_WKP_FULL(-110198, "Too many member entries in the table."),

    /**
     * Cancelled DVP cannot be cancelled.
     */
    GEN_SHR_DVPCANCELLEDNOCANCEL(-197004, "Cancelled DVP cannot be cancelled."),

    /**
     * Completed DVP cannot be cancelled.
     */
    GEN_SHR_DVPCOMPLETEDNOCANCEL(-197000, "Completed DVP cannot be cancelled."),

    /**
     * Recalled DVP cannot be cancelled.
     */
    GEN_SHR_DVPRECALLEDNOCANCEL(-197002, "Recalled DVP cannot be cancelled."),

    /**
     * Check the API manual for valid fixed income price types.
     */
    GEN_SHR_FIXEDINCOMEPRICETYPE(-197014, "Check the API manual for valid fixed income price types."),

    /**
     * Call help desk for help.
     */
    GEN_SHR_FIXEDINCOMEPRODUCT(-197012, "Call help desk for help."),

    /**
     * Check supplied argument one more time.
     */
    GEN_SHR_ILLEGALARGUMENT(-197008, "Check supplied argument one more time."),

    /**
     * Call technical support.
     */
    GEN_SHR_INTERROR(-197022, "Call technical support."),

    /**
     * Check the API manual for valid fixed income types.
     */
    GEN_SHR_INVFIXEDINCOMETYPE(-197006, "Check the API manual for valid fixed income types."),

    /**
     * Identifier cannot be blank.
     */
    GEN_SHR_INVINSID(-197026, "Identifier cannot be blank."),

    /**
     * Check the API manual for valid premium units.
     */
    GEN_SHR_INVPREMIUMUNIT(-197010, "Check the API manual for valid premium units."),

    /**
     * Check the API manual for valid series.
     */
    GEN_SHR_INVSERIES(-197016, "Check the API manual for valid series."),

    /**
     * Check the API manual for valid values.
     */
    GEN_SHR_NOTTMSERIES(-197020, "Check the API manual for valid values."),

    /**
     * Check the API manual for valid values.
     */
    GEN_SHR_NOTTMTEMPLATE(-197018, "Check the API manual for valid values."),

    /**
     * ASCII series exists but not the binary series.
     */
    GEN_SHR_SERIESMISMATCH(-197024, "ASCII series exists but not the binary series."),

    /**
     * Some broadcast subscriptions failed.
     */
    OC_BRX_NOT_ALL(-140001, "Some broadcast subscriptions failed."),

    /**
     * Internal error.
     */
    OC_ERROR(-140006, "Internal error."),

    /**
     * Fatal internal error.
     */
    OC_FATAL(-140008, "Fatal internal error."),

    /**
     * Invalid call arguments.
     */
    OC_INVARGS(-140010, "Invalid call arguments."),

    /**
     * Invalid transport channel.
     */
    OC_INVCHN_TYPE(-140012, "Invalid transport channel."),

    /**
     * See online explanation of RTR$_NOTSAMECLU.
     */
    OC_TX_NOTSAMCLU(-140074, "See online explanation of RTR$_NOTSAMECLU."),

    /**
     * See online explanation of RTR$_NOTSAMENOD.
     */
    OC_TX_NOTSAMNOD(-140076, "See online explanation of RTR$_NOTSAMENOD."),

    /**
     * See online explanation of RTR$_RTRNOTDECL.
     */
    OC_TX_NOT_OPEN(-140070, "See online explanation of RTR$_RTRNOTDECL."),

    /**
     * See online explanation of RTR$_NRSEGSDIF.
     */
    OC_TX_NRSEGSDIF(-140078, "See online explanation of RTR$_NRSEGSDIF."),

    /**
     * See online explanation of RTR$_OUTSTEVTSDWN.
     */
    OC_TX_OUTST_EVTSDWN(-140080, "See online explanation of RTR$_OUTSTEVTSDWN."),

    /**
     * See online explanation of RTR$_REQABOTX.
     */
    OC_TX_REQABORT(-140082, "See online explanation of RTR$_REQABOTX."),

    /**
     * See online explanation of RTR$_REQCALLUN.
     */
    OC_TX_REQCALLUN(-140084, "See online explanation of RTR$_REQCALLUN."),

    /**
     * See online explanation of RTR$_SHUTCALL.
     */
    OC_TX_SHUTCALL(-140085, "See online explanation of RTR$_SHUTCALL."),

    /**
     * See online explanation of RTR$_SHUTDOWN.
     */
    OC_TX_SHUTDOWN(-140087, "See online explanation of RTR$_SHUTDOWN."),

    /**
     * See online explanation of RTR$_TOOMANSHA.
     */
    OC_TX_TOOMANSHA(-140092, "See online explanation of RTR$_TOOMANSHA."),

    /**
     * See online explanation of RTR$_TRUNCATE.
     */
    OC_TX_TRUNCATE(-140094, "See online explanation of RTR$_TRUNCATE."),

    /**
     * See online explanation of RTR$_UPPLESLOW.
     */
    OC_TX_UPPLESLOW(-140098, "See online explanation of RTR$_UPPLESLOW."),

    /**
     * The operation could not be completed since nothing matched the given search criteria.
     */
    INFO_ABORTNOMATCH(-510192, "The operation could not be completed since nothing matched the given search criteria."),

    /**
     * The operation could not be completed since the data has been subject to a signal ready.
     */
    INFO_ABORTSTATEREADY(-510190, "The operation could not be completed since the data has been subject to a signal ready."),

    /**
     * The operation could not be completed since the data has been subject to an undo signal ready.
     */
    INFO_ABORTSTATEUNDO(-510228, "The operation could not be completed since the data has been subject to an undo signal ready."),

    /**
     * The segment specified in the query cannot have a value of zero.
     */
    INFO_BADSEG(-510080, "The segment specified in the query cannot have a value of zero."),

    /**
     * A message received could not be interpreted.
     */
    INFO_BDCSEM(-510270, "A message received could not be interpreted."),

    /**
     * A message received could not be interpreted.
     */
    INFO_BDCSYN(-510268, "A message received could not be interpreted."),

    /**
     * A calculation rule was given that is not applicable for underlying instruments.
     */
    INFO_CALCRULENOTAPLUND(-510224, "A calculation rule was given that is not applicable for underlying instruments."),

    /**
     * The collection of data failed because the source for data is not available.
     */
    INFO_COLFAILNOSOURCE(-510206, "The collection of data failed because the source for data is not available."),

    /**
     * The operation could not be completed because the data is locked due to a previous Signal Ready operation.
     */
    INFO_DATALCKBYSIGNAL(-510194, "The operation could not be completed because the data is locked due to a previous Signal Ready operation."),

    /**
     * Dirty price can only be sent for Collaterals.
     */
    INFO_DIRTYFUTURE(-510214, "Dirty price can only be sent for Collaterals."),

    /**
     * The series must be defined with premium unit Money.
     */
    INFO_DIRTYMONEY(-510218, "The series must be defined with premium unit Money."),

    /**
     * Dirty price cannot be sent for When Issued series.
     */
    INFO_DIRTYWI(-510216, "Dirty price cannot be sent for When Issued series."),

    /**
     * The Emergency Settlement Price is locked and can't be updated nor recalculated.
     */
    INFO_EMERGSPLOCKED(-510348, "The Emergency Settlement Price is locked and can't be updated nor recalculated."),

    /**
     * A message received had an unknown or unexpected error code.
     */
    INFO_ERRORCODE(-510272, "A message received had an unknown or unexpected error code."),

    /**
     * A function has been requested that is not supported.
     */
    INFO_FUNCNOTSUP(-510186, "A function has been requested that is not supported."),

    /**
     * The operation does not support the use of a historical date.
     */
    INFO_HISDATENOTALWD(-510284, "The operation does not support the use of a historical date."),

    /**
     * Calculation of an index failed.
     */
    INFO_INDEXCALCFAIL(-510308, "Calculation of an index failed."),

    /**
     * Write to INDICES.LOG file failed.
     */
    INFO_INDEXINDICESLOGFAIL(-510312, "Write to INDICES.LOG file failed."),

    /**
     * Write/read to index journal file failed.
     */
    INFO_INDEXJOURNALFAIL(-510310, "Write/read to index journal file failed."),

    /**
     * Validation of the file that specifies the index failed.
     */
    INFO_INDEXVALIDFAIL(-510300, "Validation of the file that specifies the index failed."),

    /**
     * Price Type must be defined as Clean or Dirty.
     */
    INFO_INDICATIVEPRICETYPE(-510220, "Price Type must be defined as Clean or Dirty."),

    /**
     * An instrument has been provided that is invalid to use in this operation.
     */
    INFO_INSNOTALLOWED(-510280, "An instrument has been provided that is invalid to use in this operation."),

    /**
     * A generic error has occured during the Settlement Price calculation or within a function related to the Settlement Price.
     */
    INFO_SPGENERICERROR(-510332, "A generic error has occured during the Settlement Price calculation or within a function related to the Settlement Price."),

    /**
     * The specified Settlement Price calculation algorithm is invalid. No new prices have been calculated or saved.
     */
    INFO_SPINVALGO(-510326, "The specified Settlement Price calculation algorithm is invalid. No new prices have been calculated or saved."),

    /**
     * The Settlement Price calculation algorithm is not valid for the product. No new prices have been calculated or saved.
     */
    INFO_SPINVALGOFORPROD(-510328, "The Settlement Price calculation algorithm is not valid for the product. No new prices have been calculated or saved."),

    /**
     * The parameter to use for the given algorithm is invalid. It could not be validated against its expected syntax.
     */
    INFO_SPINVALGOPARAM(-510346, "The parameter to use for the given algorithm is invalid. It could not be validated against its expected syntax."),

    /**
     * At least one instrument in the request has a locked Settlement Price due to the Signal Ready. No new prices have been calculated or saved.
     */
    INFO_SPINVASLOCKED(-510330, "At least one instrument in the request has a locked Settlement Price due to the Signal Ready. No new prices have been calculated or saved."),

    /**
     * The date given in the request did not match the actual clearing date of the provided instrument. No new prices have been calculated or saved.
     */
    INFO_SPINVCLEARINGDATE(-510340, "The date given in the request did not match the actual clearing date of the provided instrument. No new prices have been calculated or saved."),

    /**
     * At least one instrument in the request was found to be incompatible with the calculation algorithm. No new prices have been calculated or saved.
     */
    INFO_SPINVFORALG(-510322, "At least one instrument in the request was found to be incompatible with the calculation algorithm. No new prices have been calculated or saved."),

    /**
     * At least one instrument in the request was found to be incompatible with the theoretical calculation algorithm. No new prices have been calculated or saved.
     */
    INFO_SPINVFORTHEOALG(-510320, "At least one instrument in the request was found to be incompatible with the theoretical calculation algorithm. No new prices have been calculated or saved."),

    /**
     * The 'manually' flag specified in the request is out of range.
     */
    INFO_SPINVMANUALLYFLAG(-510334, "The 'manually' flag specified in the request is out of range."),

    /**
     * The 'Settlement Price Source' specified in the request is out of range or invalid in this context.
     */
    INFO_SPINVSOURCE(-510350, "The 'Settlement Price Source' specified in the request is out of range or invalid in this context."),

    /**
     * A request was made for both derivatives and their corresponding upper level instrument. This is not allowed. No new prices have been calculated or saved.
     */
    INFO_SPMIXDERUPP(-510352, "A request was made for both derivatives and their corresponding upper level instrument. This is not allowed. No new prices have been calculated or saved."),

    /**
     * A request was made for both options and the corresponding future. This is not allowed. No new prices have been calculated or saved.
     */
    INFO_SPMIXFUTOPT(-510336, "A request was made for both options and the corresponding future. This is not allowed. No new prices have been calculated or saved."),

    /**
     * In the request, all call and put options sharing the same upper level instrument must be provided. At least one option was missing. No new prices have been calculated or saved.
     */
    INFO_SPNOTALLOPT(-510338, "In the request, all call and put options sharing the same upper level instrument must be provided. At least one option was missing. No new prices have been calculated or saved."),

    /**
     * A request was made for a Settlement Price calculation but the calculation failed as no Last Paid was found for an upper level instrument. No new prices have been calculated or saved.
     */
    INFO_SPNOUPPERLP(-510354, "A request was made for a Settlement Price calculation but the calculation failed as no Last Paid was found for an upper level instrument. No new prices have been calculated or saved."),

    /**
     * An attempt was made to expand the option instruments but this exceeded the maximum number of instruments. No new prices have been calculated or saved.
     */
    INFO_SPOPTEXPANDMAXLIMIT(-510344, "An attempt was made to expand the option instruments but this exceeded the maximum number of instruments. No new prices have been calculated or saved."),

    /**
     * The calculation rule of the request is out-of-range. No new prices have been calculated or saved.
     */
    INFO_SPRULEOUTOFRANGE(-510342, "The calculation rule of the request is out-of-range. No new prices have been calculated or saved."),

    /**
     * A request was made to store a new Settlement Price, but required calculations in other products are already in progress. Retry the request later.
     */
    INFO_SPSAVECALCINPROG(-510358, "A request was made to store a new Settlement Price, but required calculations in other products are already in progress. Retry the request later."),

    /**
     * A request was made to store a new Settlement Price, but required products have been subject to a Signal Ready.
     */
    INFO_SPSAVELCK(-510360, "A request was made to store a new Settlement Price, but required products have been subject to a Signal Ready."),

    /**
     * A request was made to store a new Settlement Price, but required products have changed their Clearing Day.
     */
    INFO_SPSAVENEWCDAY(-510362, "A request was made to store a new Settlement Price, but required products have changed their Clearing Day."),

    /**
     * Too many instruments matched the calculation request. No new prices have been calculated or saved.
     */
    INFO_SPTOMANYMATCHES(-510324, "Too many instruments matched the calculation request. No new prices have been calculated or saved."),

    /**
     * A string has been truncated as its length exceeds the maximum length allowed in the context.
     */
    INFO_STRTRUNCATED(-510317, "A string has been truncated as its length exceeds the maximum length allowed in the context."),

    /**
     * A subitem within a VIB or VIT was dropped (not handled).
     */
    INFO_SUBITEMDROPPED(-510234, "A subitem within a VIB or VIT was dropped (not handled)."),

    /**
     * A query request was denied because today's information is not yet available.
     */
    INFO_TODAYNOTAVAIL(-510079, "A query request was denied because today's information is not yet available."),

    /**
     * The transaction included at least one instrument that was given twice. Each instrument shall only be present once.
     */
    INFO_TXDUPITEM(-510370, "The transaction included at least one instrument that was given twice. Each instrument shall only be present once."),

    /**
     * The requested operation is out of range and could not be handled.
     */
    INFO_UNKNOWNOPER(-510144, "The requested operation is out of range and could not be handled."),

    /**
     * The operation requires all children to an upper level instrument to be prepared, but at least one child was in the wrong state for this.
     */
    INFO_WRONGCHILDSTATE(-510368, "The operation requires all children to an upper level instrument to be prepared, but at least one child was in the wrong state for this.");

    private final int wire;

    private final String description;

    RejectCode(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<RejectCode> fromWire(int wire) {
        return switch (wire) {
            case -800014 -> Optional.of(DE_CAN_NOT_CANCEL);
            case -800002 -> Optional.of(DE_DUPLICATE_TOKEN);
            case -800016 -> Optional.of(DE_INVALID_MASS_CANCEL_SCOPE);
            case -800006 -> Optional.of(DE_INVALID_ORDERBOOK);
            case -800012 -> Optional.of(DE_INVALID_ORDER_NUMBER);
            case -800008 -> Optional.of(DE_INVALID_SIDE);
            case -800010 -> Optional.of(DE_INVALID_TIF);
            case -800018 -> Optional.of(DE_INVALID_UNDERLYING);
            case -800015 -> Optional.of(DE_THROTTLING);
            case -800004 -> Optional.of(DE_UNKNOWN_TOKEN);
            case -110210 -> Optional.of(GEN_CDC_AEX_FULL);
            case -110244 -> Optional.of(GEN_CDC_ASC_FULL);
            case -110262 -> Optional.of(GEN_CDC_CAC_FULL);
            case -110235 -> Optional.of(GEN_CDC_CBS_NOT_READY);
            case -110196 -> Optional.of(GEN_CDC_CBX_FULL);
            case -110204 -> Optional.of(GEN_CDC_CCR_FULL);
            case -110186 -> Optional.of(GEN_CDC_CIB_FULL);
            case -110019 -> Optional.of(GEN_CDC_CLI_NOTFOU);
            case -110118 -> Optional.of(GEN_CDC_COG_FULL);
            case -110242 -> Optional.of(GEN_CDC_CPA_FULL);
            case -110194 -> Optional.of(GEN_CDC_CRF_FULL);
            case -110202 -> Optional.of(GEN_CDC_CRO_FULL);
            case -110274 -> Optional.of(GEN_CDC_CRP_FULL);
            case -110165 -> Optional.of(GEN_CDC_CRSCLOSE);
            case -110212 -> Optional.of(GEN_CDC_CSA_FULL);
            case -110282 -> Optional.of(GEN_CDC_CSE_FULL);
            case -110081 -> Optional.of(GEN_CDC_CST_SUSP);
            case -110218 -> Optional.of(GEN_CDC_CUP_FULL);
            case -110264 -> Optional.of(GEN_CDC_CUR_FULL);
            case -110136 -> Optional.of(GEN_CDC_DES_FULL);
            case -110146 -> Optional.of(GEN_CDC_DGR_FULL);
            case -110148 -> Optional.of(GEN_CDC_DHB_FULL);
            case -110268 -> Optional.of(GEN_CDC_DIO_FULL);
            case -110232 -> Optional.of(GEN_CDC_ECB_FULL);
            case -110126 -> Optional.of(GEN_CDC_EDG_FULL);
            case -110222 -> Optional.of(GEN_CDC_EDL_FULL);
            case -110138 -> Optional.of(GEN_CDC_EID_FULL);
            case -110142 -> Optional.of(GEN_CDC_EXC_FULL);
            case -110120 -> Optional.of(GEN_CDC_FML_FULL);
            case -110132 -> Optional.of(GEN_CDC_FOV_FULL);
            case -110284 -> Optional.of(GEN_CDC_HSE_FULL);
            case -110061 -> Optional.of(GEN_CDC_ILL_COMMODITY);
            case -110220 -> Optional.of(GEN_CDC_ING_FULL);
            case -110023 -> Optional.of(GEN_CDC_INT_CLOSED);
            case -110167 -> Optional.of(GEN_CDC_INVOPENCLOSE);
            case -110171 -> Optional.of(GEN_CDC_INVUSER);
            case -110157 -> Optional.of(GEN_CDC_INV_BLOCK);
            case -110163 -> Optional.of(GEN_CDC_INV_OPEN_CLOSE_REQ);
            case -110161 -> Optional.of(GEN_CDC_INV_PREMIUM);
            case -110159 -> Optional.of(GEN_CDC_INV_QUANTITY);
            case -110206 -> Optional.of(GEN_CDC_IXV_FULL);
            case -110011 -> Optional.of(GEN_CDC_LIU_NOTFOU);
            case -110013 -> Optional.of(GEN_CDC_LTT_NOTFOU);
            case -110169 -> Optional.of(GEN_CDC_MATCH_VALIDITY);
            case -110201 -> Optional.of(GEN_CDC_MAX_MEM_QUANTITY);
            case -110173 -> Optional.of(GEN_CDC_MAX_QUANTITY);
            case -110002 -> Optional.of(GEN_CDC_MEM_FULL);
            case -110175 -> Optional.of(GEN_CDC_MIN_OF_SIL);
            case -110278 -> Optional.of(GEN_CDC_MPM_FULL);
            case -110276 -> Optional.of(GEN_CDC_MPR_FULL);
            case -110116 -> Optional.of(GEN_CDC_MSU_FULL);
            case -110247 -> Optional.of(GEN_CDC_NOT_TRADED);
            case -110193 -> Optional.of(GEN_CDC_NO_HEDGE_PRICE);
            case -110190 -> Optional.of(GEN_CDC_NTD_FULL);
            case -110236 -> Optional.of(GEN_CDC_OAT_FULL);
            case -110122 -> Optional.of(GEN_CDC_OBK_FULL);
            case -110114 -> Optional.of(GEN_CDC_OBL_FULL);
            case -110115 -> Optional.of(GEN_CDC_OBL_NOTFOU);
            case -110255 -> Optional.of(GEN_CDC_ONLY_IN_EQ_CBO);
            case -110266 -> Optional.of(GEN_CDC_OPP_FULL);
            case -110130 -> Optional.of(GEN_CDC_PDP_FULL);
            case -110252 -> Optional.of(GEN_CDC_PID_FULL);
            case -110216 -> Optional.of(GEN_CDC_POD_FULL);
            case -110152 -> Optional.of(GEN_CDC_PRL_FULL);
            case -110270 -> Optional.of(GEN_CDC_RPT_FULL);
            case -110272 -> Optional.of(GEN_CDC_RTM_FULL);
            case -110214 -> Optional.of(GEN_CDC_SEC_FULL);
            case -110155 -> Optional.of(GEN_CDC_SERIES_STOPPED);
            case -110188 -> Optional.of(GEN_CDC_SID_FULL);
            case -110128 -> Optional.of(GEN_CDC_SPG_FULL);
            case -110224 -> Optional.of(GEN_CDC_SPL_FULL);
            case -110230 -> Optional.of(GEN_CDC_SSS_FULL);
            case -110150 -> Optional.of(GEN_CDC_SST_FULL);
            case -110257 -> Optional.of(GEN_CDC_TRC_INS_NOTFOUND);
            case -110259 -> Optional.of(GEN_CDC_TRC_SST_NOTFOUND);
            case -110261 -> Optional.of(GEN_CDC_TRC_UST_NOTFOUND);
            case -110134 -> Optional.of(GEN_CDC_TSE_FULL);
            case -110124 -> Optional.of(GEN_CDC_TSR_FULL);
            case -110077 -> Optional.of(GEN_CDC_USR_SUSP);
            case -110140 -> Optional.of(GEN_CDC_UST_FULL);
            case -110208 -> Optional.of(GEN_CDC_VBS_FULL);
            case -110144 -> Optional.of(GEN_CDC_VDS_FULL);
            case -110226 -> Optional.of(GEN_CDC_VSP_FULL);
            case -110198 -> Optional.of(GEN_CDC_WKP_FULL);
            case -197004 -> Optional.of(GEN_SHR_DVPCANCELLEDNOCANCEL);
            case -197000 -> Optional.of(GEN_SHR_DVPCOMPLETEDNOCANCEL);
            case -197002 -> Optional.of(GEN_SHR_DVPRECALLEDNOCANCEL);
            case -197014 -> Optional.of(GEN_SHR_FIXEDINCOMEPRICETYPE);
            case -197012 -> Optional.of(GEN_SHR_FIXEDINCOMEPRODUCT);
            case -197008 -> Optional.of(GEN_SHR_ILLEGALARGUMENT);
            case -197022 -> Optional.of(GEN_SHR_INTERROR);
            case -197006 -> Optional.of(GEN_SHR_INVFIXEDINCOMETYPE);
            case -197026 -> Optional.of(GEN_SHR_INVINSID);
            case -197010 -> Optional.of(GEN_SHR_INVPREMIUMUNIT);
            case -197016 -> Optional.of(GEN_SHR_INVSERIES);
            case -197020 -> Optional.of(GEN_SHR_NOTTMSERIES);
            case -197018 -> Optional.of(GEN_SHR_NOTTMTEMPLATE);
            case -197024 -> Optional.of(GEN_SHR_SERIESMISMATCH);
            case -140001 -> Optional.of(OC_BRX_NOT_ALL);
            case -140006 -> Optional.of(OC_ERROR);
            case -140008 -> Optional.of(OC_FATAL);
            case -140010 -> Optional.of(OC_INVARGS);
            case -140012 -> Optional.of(OC_INVCHN_TYPE);
            case -140074 -> Optional.of(OC_TX_NOTSAMCLU);
            case -140076 -> Optional.of(OC_TX_NOTSAMNOD);
            case -140070 -> Optional.of(OC_TX_NOT_OPEN);
            case -140078 -> Optional.of(OC_TX_NRSEGSDIF);
            case -140080 -> Optional.of(OC_TX_OUTST_EVTSDWN);
            case -140082 -> Optional.of(OC_TX_REQABORT);
            case -140084 -> Optional.of(OC_TX_REQCALLUN);
            case -140085 -> Optional.of(OC_TX_SHUTCALL);
            case -140087 -> Optional.of(OC_TX_SHUTDOWN);
            case -140092 -> Optional.of(OC_TX_TOOMANSHA);
            case -140094 -> Optional.of(OC_TX_TRUNCATE);
            case -140098 -> Optional.of(OC_TX_UPPLESLOW);
            case -510192 -> Optional.of(INFO_ABORTNOMATCH);
            case -510190 -> Optional.of(INFO_ABORTSTATEREADY);
            case -510228 -> Optional.of(INFO_ABORTSTATEUNDO);
            case -510080 -> Optional.of(INFO_BADSEG);
            case -510270 -> Optional.of(INFO_BDCSEM);
            case -510268 -> Optional.of(INFO_BDCSYN);
            case -510224 -> Optional.of(INFO_CALCRULENOTAPLUND);
            case -510206 -> Optional.of(INFO_COLFAILNOSOURCE);
            case -510194 -> Optional.of(INFO_DATALCKBYSIGNAL);
            case -510214 -> Optional.of(INFO_DIRTYFUTURE);
            case -510218 -> Optional.of(INFO_DIRTYMONEY);
            case -510216 -> Optional.of(INFO_DIRTYWI);
            case -510348 -> Optional.of(INFO_EMERGSPLOCKED);
            case -510272 -> Optional.of(INFO_ERRORCODE);
            case -510186 -> Optional.of(INFO_FUNCNOTSUP);
            case -510284 -> Optional.of(INFO_HISDATENOTALWD);
            case -510308 -> Optional.of(INFO_INDEXCALCFAIL);
            case -510312 -> Optional.of(INFO_INDEXINDICESLOGFAIL);
            case -510310 -> Optional.of(INFO_INDEXJOURNALFAIL);
            case -510300 -> Optional.of(INFO_INDEXVALIDFAIL);
            case -510220 -> Optional.of(INFO_INDICATIVEPRICETYPE);
            case -510280 -> Optional.of(INFO_INSNOTALLOWED);
            case -510332 -> Optional.of(INFO_SPGENERICERROR);
            case -510326 -> Optional.of(INFO_SPINVALGO);
            case -510328 -> Optional.of(INFO_SPINVALGOFORPROD);
            case -510346 -> Optional.of(INFO_SPINVALGOPARAM);
            case -510330 -> Optional.of(INFO_SPINVASLOCKED);
            case -510340 -> Optional.of(INFO_SPINVCLEARINGDATE);
            case -510322 -> Optional.of(INFO_SPINVFORALG);
            case -510320 -> Optional.of(INFO_SPINVFORTHEOALG);
            case -510334 -> Optional.of(INFO_SPINVMANUALLYFLAG);
            case -510350 -> Optional.of(INFO_SPINVSOURCE);
            case -510352 -> Optional.of(INFO_SPMIXDERUPP);
            case -510336 -> Optional.of(INFO_SPMIXFUTOPT);
            case -510338 -> Optional.of(INFO_SPNOTALLOPT);
            case -510354 -> Optional.of(INFO_SPNOUPPERLP);
            case -510344 -> Optional.of(INFO_SPOPTEXPANDMAXLIMIT);
            case -510342 -> Optional.of(INFO_SPRULEOUTOFRANGE);
            case -510358 -> Optional.of(INFO_SPSAVECALCINPROG);
            case -510360 -> Optional.of(INFO_SPSAVELCK);
            case -510362 -> Optional.of(INFO_SPSAVENEWCDAY);
            case -510324 -> Optional.of(INFO_SPTOMANYMATCHES);
            case -510317 -> Optional.of(INFO_STRTRUNCATED);
            case -510234 -> Optional.of(INFO_SUBITEMDROPPED);
            case -510079 -> Optional.of(INFO_TODAYNOTAVAIL);
            case -510370 -> Optional.of(INFO_TXDUPITEM);
            case -510144 -> Optional.of(INFO_UNKNOWNOPER);
            case -510368 -> Optional.of(INFO_WRONGCHILDSTATE);
            default -> Optional.empty();
        };
    }
}
