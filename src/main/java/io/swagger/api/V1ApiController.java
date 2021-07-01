package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse400;
import io.swagger.model.InlineResponse4001;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-26T11:47:57.236Z[GMT]")
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

    public ResponseEntity<Object> v1AgentUserCodeSettlementPost(@Parameter(in = ParameterIn.PATH, description = "Your user code in Eko’s system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of the service for fund transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Payment mode you want to use to transfer money" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = true) Integer paymentMode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary name (as in bank records)" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = true) String recipientName,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount to transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Sender's name" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "sender_name", required = true) String senderName,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.QUERY, description = "Payment Purpose" ,schema=@Schema()) @Valid @RequestParam(value = "tag", required = false) String tag,@Parameter(in = ParameterIn.QUERY, description = "Sender’s location information; eg- 28.78123,72.808912" ,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = false) String latlong,@Parameter(in = ParameterIn.QUERY, description = "Beneficiary's bank account type" ,schema=@Schema()) @Valid @RequestParam(value = "beneficiary_account_type", required = false) Integer beneficiaryAccountType) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"response_status_id\" : 9,\n  \"data\" : {\n    \"client_ref_id\" : \"client_ref_id\",\n    \"amount\" : 1.4658129805029452,\n    \"txstatus_desc\" : \"txstatus_desc\",\n    \"balance\" : 5.637376656633329,\n    \"totalfee\" : 2.3021358869347655,\n    \"ifsc\" : \"ifsc\",\n    \"account\" : 6,\n    \"tid\" : 5\n  },\n  \"response_type_id\" : 0,\n  \"message\" : \"message\",\n  \"status\" : 7\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> v1TransactionsTidGet(
    												@Parameter(in = ParameterIn.PATH, description = "tid or client_ref_id",required=true, schema=@Schema()) 
    												@PathVariable("tid") String tid,
    												@NotNull @Parameter(in = ParameterIn.QUERY, description = "Id of the initiator" ,required=true,schema=@Schema()) 
    												@Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId,
    												@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) 
    												@RequestHeader(value="developer_key", required=true) String developerKey,
    												@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) 
    												@RequestHeader(value="secret_key", required=true) String secretKey,
    												@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) 
    												@RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp) 
    {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) 
        {
            try 
            {
            	//BUSINESS LOGIC GOES HERE
                return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"response_status_id\" : "+123+",\n  \"data\" : {\n    \"tx_status\" : "+200+",\n    \"amount\" : "+5000.12+",\n    \"payment_mode\" : 3,\n    \"txstatus_desc\" : "+"\"Success\""+",\n    \"fee\" : 1.4658129805029452,\n    \"gst\" : 5.962133916683182,\n    \"sender_name\" : "+"\"Satya\""+",\n    \"tid\" : "+"\""+tid+"\""+",\n    \"beneficiary_account_type\" : 5,\n    \"client_ref_id\" : "+"\"XYZ123\""+",\n    \"receipient_name\" : "+"\"Akash\""+",\n    \"bank_ref_num\" : "+"\"REF123\""+",\n    \"ifsc\" : "+"\"SBIN000001\""+",\n    \"account\" : 6,\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : "+"\"Transaction In Progress\""+",\n  \"status\" : 2\n}", Object.class), HttpStatus.OK);
            } 
            catch (IOException e) 
            {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        try 
        {
        	//Change this to appropriate error response
			return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"response_status_id\" : "+123+",\n  \"data\" : {\n    \"tx_status\" : "+200+",\n    \"amount\" : "+5000.12+",\n    \"payment_mode\" : 3,\n    \"txstatus_desc\" : "+"\"Success\""+",\n    \"fee\" : 1.4658129805029452,\n    \"gst\" : 5.962133916683182,\n    \"sender_name\" : "+"\"Satya\""+",\n    \"tid\" : "+"\""+tid+"\""+",\n    \"beneficiary_account_type\" : 5,\n    \"client_ref_id\" : "+"\"XYZ123\""+",\n    \"receipient_name\" : "+"\"Akash\""+",\n    \"bank_ref_num\" : "+"\"REF123\""+",\n    \"ifsc\" : "+"\"SBIN000001\""+",\n    \"account\" : 6,\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response_type_id\" : 0,\n  \"message\" : "+"\"Transaction In Progress\""+",\n  \"status\" : 2\n}", Object.class), HttpStatus.OK);
		} 
    	catch (IOException e) {
			log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

}
