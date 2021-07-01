package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse400;
import io.swagger.model.InlineResponse4001;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-01T19:17:39.704Z[GMT]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> v1AgentUserCodeSettlementPost(@Parameter(in = ParameterIn.PATH, description = "Your user code in Eko’s system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of the service for fund transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Payment mode you want to use to transfer money" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = true) Integer paymentMode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary name (as in bank records)" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = true) String recipientName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount to transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Sender's name" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "sender_name", required = true) String senderName,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Payment Purpose" ,schema=@Schema()) @Valid @RequestParam(value = "tag", required = false) String tag,@Parameter(in = ParameterIn.QUERY, description = "Sender’s location information; eg- 28.78123,72.808912" ,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = false) String latlong,@Parameter(in = ParameterIn.QUERY, description = "Beneficiary's bank account type" ,schema=@Schema()) @Valid @RequestParam(value = "beneficiary_account_type", required = false) Integer beneficiaryAccountType) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"response_status_id\" : 9,\n  \"data\" : {\n    \"client_ref_id\" : \"client_ref_id\",\n    \"amount\" : 1.4658129805029452,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"balance\" : 5.637376656633329,\n    \"totalfee\" : 2.3021358869347655,\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"tid\" : 5\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 7\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2005> v1AgentUserCodeSettlementPost(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount to transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "unique recipient_id" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_id", required = true) Integer recipientId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Payment mode you want to use to transfer money" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = true) Integer paymentMode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2005>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"tx_status\" : \"tx_status\",\n    \"amount\" : \"amount\",\n    \"balance\" : \"balance\",\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"totalfee\" : \"totalfee\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : \"account\",\n    \"tid\" : \"tid\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2005.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2005>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2005>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> v1AgentUserCodeSettlementaccountGet(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"unsettled_fund\" : \"unsettled_fund\",\n    \"remaining_limit\" : \"remaining_limit\",\n    \"fund_transfer_list\" : [ {\n      \"name\" : \"name\",\n      \"ifsc\" : \"ifsc\",\n      \"account\" : \"account\",\n      \"recipient_id\" : \"recipient_id\"\n    }, {\n      \"name\" : \"name\",\n      \"ifsc\" : \"ifsc\",\n      \"account\" : \"account\",\n      \"recipient_id\" : \"recipient_id\"\n    } ]\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> v1AgentUserCodeSettlementaccountPut(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique bank ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_id", required = true) Integer bankId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"recipient_id\" : 6\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> v1AgentUserCodeSettlementaccountVerifyPut(@Parameter(in = ParameterIn.PATH, description = "User code in EKOs system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique bank ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_id", required = true) Integer bankId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Name of merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "firm_name", required = true) String firmName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Pass value as 8 which is Bank Statement" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "poa_type", required = true) Integer poaType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Bank image statement" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_statement_image", required = true) Resource bankStatementImage,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"bank_id\" : 6,\n    \"firm_name\" : \"firm_name\",\n    \"service_code\" : \"service_code\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : \"account\"\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> v1TransactionsIdGet(@Parameter(in = ParameterIn.PATH, description = "EKO TID/client_ref_id", required=true, schema=@Schema()) @PathVariable("id") String id,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"response_status_id\" : 4,\n  \"data\" : {\n    \"tx_status\" : 2,\n    \"amount\" : 9.301444243932576,\n    \"payment_mode\" : 3,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"fee\" : 1.4658129805029452,\n    \"gst\" : 5.962133916683182,\n    \"sender_name\" : \"sender_name\",\n    \"tid\" : 7,\n    \"beneficiary_account_type\" : 5,\n    \"client_ref_id\" : \"client_ref_id\",\n    \"receipient_name\" : \"receipient_name\",\n    \"bank_ref_num\" : \"bank_ref_num\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 2\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> v1TransactionsTidGet(@Parameter(in = ParameterIn.PATH, description = "tid or client_ref_id", required=true, schema=@Schema()) @PathVariable("tid") String tid,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Id of the initiator" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"response_status_id\" : 4,\n  \"data\" : {\n    \"tx_status\" : 2,\n    \"amount\" : 9.301444243932576,\n    \"payment_mode\" : 3,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"fee\" : 1.4658129805029452,\n    \"gst\" : 5.962133916683182,\n    \"sender_name\" : \"sender_name\",\n    \"tid\" : 7,\n    \"beneficiary_account_type\" : 5,\n    \"client_ref_id\" : \"client_ref_id\",\n    \"receipient_name\" : \"receipient_name\",\n    \"bank_ref_num\" : \"bank_ref_num\",\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 2\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20011> v1UserCodeGet(@Parameter(in = ParameterIn.PATH, description = "Unique code of the user on the platform", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20011>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"service_status_list\" : [ {\n      \"comments\" : \"comments\",\n      \"status_desc\" : \"status_desc\",\n      \"city\" : \"city\",\n      \"user_name\" : \"user_name\",\n      \"mobile\" : \"mobile\",\n      \"service_provider\" : \"service_provider\",\n      \"verification_status\" : 6,\n      \"createdAt\" : \"createdAt\",\n      \"user_code\" : \"user_code\",\n      \"service_code\" : \"service_code\",\n      \"state\" : \"state\",\n      \"status\" : \"status\",\n      \"updatedAt\" : \"updatedAt\"\n    }, {\n      \"comments\" : \"comments\",\n      \"status_desc\" : \"status_desc\",\n      \"city\" : \"city\",\n      \"user_name\" : \"user_name\",\n      \"mobile\" : \"mobile\",\n      \"service_provider\" : \"service_provider\",\n      \"verification_status\" : 6,\n      \"createdAt\" : \"createdAt\",\n      \"user_code\" : \"user_code\",\n      \"service_code\" : \"service_code\",\n      \"state\" : \"state\",\n      \"status\" : \"status\",\n      \"updatedAt\" : \"updatedAt\"\n    } ]\n  },\n  \"response_type_id\" : 1,\n  \"message\" : \"message\",\n  \"status\" : 5\n}", InlineResponse20011.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20011>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20011>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2009> v1UserOnboardPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Pan card number of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pan_number", required = true) String panNumber,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "mobile", required = true) String mobile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "First name of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "first_name", required = true) String firstName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Middle name of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "middle_name", required = true) String middleName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Last name of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "last_name", required = true) String lastName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Email of user/merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "email", required = true) String email,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Residence address of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "residence_address", required = true) List<String> residenceAddress,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Date of Birth of user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "dob", required = true) String dob,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Shop name of the user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "shop_name", required = true) String shopName,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2009>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2009.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2009>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2009>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2007> v1UserRequestOtpPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "mobile", required = true) Integer mobile,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2007>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"initiator_id\" : \"initiator_id\",\n    \"mobile\" : \"mobile\",\n    \"otp\" : \"otp\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2007.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2007>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2007>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse20010> v1UserServiceActivatePut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code for service" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) String serviceCode,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Model name of biometric device" ,schema=@Schema()) @Valid @RequestParam(value = "modelname", required = false) String modelname,@Parameter(in = ParameterIn.QUERY, description = "Device number of biometric device" ,schema=@Schema()) @Valid @RequestParam(value = "devicenumber", required = false) String devicenumber,@Parameter(in = ParameterIn.QUERY, description = "Office address of the user" ,schema=@Schema()) @Valid @RequestParam(value = "office_address", required = false) List<String> officeAddress,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "pan_card", required = false) Resource panCard,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "aadhar_front", required = false) Resource aadharFront,@Parameter(in = ParameterIn.QUERY, description = "For AePS authentication" ,schema=@Schema()) @Valid @RequestParam(value = "aadhar_back", required = false) Resource aadharBack,@Parameter(in = ParameterIn.QUERY, description = "address of the user" ,schema=@Schema()) @Valid @RequestParam(value = "address_as_per_proof", required = false) List<String> addressAsPerProof) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse20010>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"service_status_desc\" : \"service_status_desc\",\n    \"user_code\" : \"user_code\",\n    \"initiator_id\" : \"initiator_id\",\n    \"service_status\" : \"service_status\",\n    \"service_code\" : \"service_code\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse20010.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse20010>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse20010>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2008> v1UserVerifyPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "mobile", required = true) Integer mobile,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Mobile number of user to be verified" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "otp", required = true) Integer otp,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2008>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"csp_id\" : \"csp_id\"\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2008.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2008>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2008>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2006> v1UsersServicesGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2006>(objectMapper.readValue("{\n  \"response_status_id\" : 0,\n  \"data\" : {\n    \"service_list\" : [ {\n      \"service_name\" : \"service_name\",\n      \"service_code\" : \"service_code\",\n      \"provider_name\" : \"provider_name\"\n    }, {\n      \"service_name\" : \"service_name\",\n      \"service_code\" : \"service_code\",\n      \"provider_name\" : \"provider_name\"\n    } ]\n  },\n  \"response_type_id\" : 6,\n  \"message\" : \"message\",\n  \"status\" : 1\n}", InlineResponse2006.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2006>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2006>(HttpStatus.NOT_IMPLEMENTED);
    }

}
