package io.swagger.api;

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
public class V2ApiController implements V2Api {

    private static final Logger log = LoggerFactory.getLogger(V2ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V2ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> v2AepsPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "2-Cash;3-Balance;4-Stat" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_type", required = true) Integer serviceType,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Value of customer's mobile number who wants the cash" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer API Docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_code", required = true) String bankCode,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount or 0 for Bal" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe,@NotNull @Parameter(in = ParameterIn.QUERY, description = "1- SMS, Default- 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "notify_customer", required = true) String notifyCustomer,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Encrypted AADHAR number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "aadhar", required = true) String aadhar,@NotNull @Parameter(in = ParameterIn.QUERY, description = "PID Data of the biometric device" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "piddata", required = true) String piddata,@NotNull @Parameter(in = ParameterIn.QUERY, description = "latlon of requesting user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = true) String latlong,@NotNull @Parameter(in = ParameterIn.QUERY, description = "IP of merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "real_source_ip", required = true) String realSourceIp,@Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey,@Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp,@Parameter(in = ParameterIn.HEADER, description = "Refer to API Docs" ,required=true,schema=@Schema()) @RequestHeader(value="request_hash", required=true) String requestHash) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
