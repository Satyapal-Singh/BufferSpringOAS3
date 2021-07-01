package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse4001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-26T11:47:57.236Z[GMT]")


public class InlineResponse4001   {
  @JsonProperty("invalid_params")
  private Object invalidParams = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("response_status_id")
  private Integer responseStatusId = null;

  @JsonProperty("response_type_id")
  private Integer responseTypeId = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("data")
  private Object data = null;

  public InlineResponse4001 invalidParams(Object invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  /**
   * Get invalidParams
   * @return invalidParams
   **/
  @Schema(description = "")
  
    public Object getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(Object invalidParams) {
    this.invalidParams = invalidParams;
  }

  public InlineResponse4001 status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InlineResponse4001 responseStatusId(Integer responseStatusId) {
    this.responseStatusId = responseStatusId;
    return this;
  }

  /**
   * Get responseStatusId
   * @return responseStatusId
   **/
  @Schema(description = "")
  
    public Integer getResponseStatusId() {
    return responseStatusId;
  }

  public void setResponseStatusId(Integer responseStatusId) {
    this.responseStatusId = responseStatusId;
  }

  public InlineResponse4001 responseTypeId(Integer responseTypeId) {
    this.responseTypeId = responseTypeId;
    return this;
  }

  /**
   * Get responseTypeId
   * @return responseTypeId
   **/
  @Schema(description = "")
  
    public Integer getResponseTypeId() {
    return responseTypeId;
  }

  public void setResponseTypeId(Integer responseTypeId) {
    this.responseTypeId = responseTypeId;
  }

  public InlineResponse4001 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse4001 data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4001 inlineResponse4001 = (InlineResponse4001) o;
    return Objects.equals(this.invalidParams, inlineResponse4001.invalidParams) &&
        Objects.equals(this.status, inlineResponse4001.status) &&
        Objects.equals(this.responseStatusId, inlineResponse4001.responseStatusId) &&
        Objects.equals(this.responseTypeId, inlineResponse4001.responseTypeId) &&
        Objects.equals(this.message, inlineResponse4001.message) &&
        Objects.equals(this.data, inlineResponse4001.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidParams, status, responseStatusId, responseTypeId, message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4001 {\n");
    
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    responseStatusId: ").append(toIndentedString(responseStatusId)).append("\n");
    sb.append("    responseTypeId: ").append(toIndentedString(responseTypeId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
