package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-28T13:06:22.037Z")
public class InlineResponse200 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("mobile")
  private String mobile = null;

  @SerializedName("statuscode")
  private String statuscode = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  public InlineResponse200 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "success", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse200 token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "483748394", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InlineResponse200 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Your transaction was successful", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse200 mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(example = "25677777777", value = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public InlineResponse200 statuscode(String statuscode) {
    this.statuscode = statuscode;
    return this;
  }

   /**
   * Get statuscode
   * @return statuscode
  **/
  @ApiModelProperty(example = "0", value = "")
  public String getStatuscode() {
    return statuscode;
  }

  public void setStatuscode(String statuscode) {
    this.statuscode = statuscode;
  }

  public InlineResponse200 transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(example = "debit", value = "")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.status, inlineResponse200.status) &&
        Objects.equals(this.token, inlineResponse200.token) &&
        Objects.equals(this.description, inlineResponse200.description) &&
        Objects.equals(this.mobile, inlineResponse200.mobile) &&
        Objects.equals(this.statuscode, inlineResponse200.statuscode) &&
        Objects.equals(this.transactionType, inlineResponse200.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, token, description, mobile, statuscode, transactionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    statuscode: ").append(toIndentedString(statuscode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

