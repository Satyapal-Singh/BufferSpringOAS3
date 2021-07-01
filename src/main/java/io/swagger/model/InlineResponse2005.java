package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2005
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-01T19:17:39.704Z[GMT]")


public class InlineResponse2005   {
  @JsonProperty("response_status_id")
  private Integer responseStatusId = null;

  @JsonProperty("data")
  private Object data = null;

  @JsonProperty("response_type_id")
  private Integer responseTypeId = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("status")
  private Integer status = null;

  public InlineResponse2005 responseStatusId(Integer responseStatusId) {
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

  public InlineResponse2005 data(Object data) {
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

  public InlineResponse2005 responseTypeId(Integer responseTypeId) {
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

  public InlineResponse2005 message(String message) {
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

  public InlineResponse2005 status(Integer status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.responseStatusId, inlineResponse2005.responseStatusId) &&
        Objects.equals(this.data, inlineResponse2005.data) &&
        Objects.equals(this.responseTypeId, inlineResponse2005.responseTypeId) &&
        Objects.equals(this.message, inlineResponse2005.message) &&
        Objects.equals(this.status, inlineResponse2005.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatusId, data, responseTypeId, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    responseStatusId: ").append(toIndentedString(responseStatusId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    responseTypeId: ").append(toIndentedString(responseTypeId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
