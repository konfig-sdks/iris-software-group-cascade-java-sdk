/*
 * HR API
 * <a href='swaggerv2.json'>Download Swagger Json in OAS2 Format.</a>
 *
 * The version of the OpenAPI document: 2
 * Contact: hrapi@iris.co.uk
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.PublicHolidayDay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PublicHolidayModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PublicHolidayModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DAYS = "Days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private List<PublicHolidayDay> days = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_ON = "CreatedOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_CREATED_BY = "CreatedBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON = "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public PublicHolidayModel() {
  }

  public PublicHolidayModel description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Public Holiday. &lt;br /&gt;  This is usually the location of the Public Holiday. &lt;br /&gt;  Cascade Source: [ValidBankHolidays].[HolidayLocation]
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the Public Holiday. <br />  This is usually the location of the Public Holiday. <br />  Cascade Source: [ValidBankHolidays].[HolidayLocation]")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PublicHolidayModel days(List<PublicHolidayDay> days) {
    
    
    
    
    this.days = days;
    return this;
  }

  public PublicHolidayModel addDaysItem(PublicHolidayDay daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * A list of Public Holiday Days.
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Public Holiday Days.")

  public List<PublicHolidayDay> getDays() {
    return days;
  }


  public void setDays(List<PublicHolidayDay> days) {
    
    
    
    this.days = days;
  }


  public PublicHolidayModel id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * This ID is generated by the Iris Hr platform and does not relate to the Cascade ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This ID is generated by the Iris Hr platform and does not relate to the Cascade ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public PublicHolidayModel createdOn(OffsetDateTime createdOn) {
    
    
    
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The date when the Public Holiday was created in the Iris HR platform.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the Public Holiday was created in the Iris HR platform.")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    
    
    
    this.createdOn = createdOn;
  }


  public PublicHolidayModel createdBy(String createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Not used as the Iris HR platform has no concept of users.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used as the Iris HR platform has no concept of users.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public PublicHolidayModel lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    
    
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

   /**
   * The date when the Public Holiday was created or last updated.
   * @return lastModifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the Public Holiday was created or last updated.")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }


  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    
    
    this.lastModifiedOn = lastModifiedOn;
  }


  public PublicHolidayModel lastModifiedBy(String lastModifiedBy) {
    
    
    
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Not used as the Iris HR platform has no concept of users.
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used as the Iris HR platform has no concept of users.")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    
    
    
    this.lastModifiedBy = lastModifiedBy;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PublicHolidayModel instance itself
   */
  public PublicHolidayModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicHolidayModel publicHolidayModel = (PublicHolidayModel) o;
    return Objects.equals(this.description, publicHolidayModel.description) &&
        Objects.equals(this.days, publicHolidayModel.days) &&
        Objects.equals(this.id, publicHolidayModel.id) &&
        Objects.equals(this.createdOn, publicHolidayModel.createdOn) &&
        Objects.equals(this.createdBy, publicHolidayModel.createdBy) &&
        Objects.equals(this.lastModifiedOn, publicHolidayModel.lastModifiedOn) &&
        Objects.equals(this.lastModifiedBy, publicHolidayModel.lastModifiedBy)&&
        Objects.equals(this.additionalProperties, publicHolidayModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, days, id, createdOn, createdBy, lastModifiedOn, lastModifiedBy, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHolidayModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Description");
    openapiFields.add("Days");
    openapiFields.add("Id");
    openapiFields.add("CreatedOn");
    openapiFields.add("CreatedBy");
    openapiFields.add("LastModifiedOn");
    openapiFields.add("LastModifiedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublicHolidayModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PublicHolidayModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicHolidayModel is not found in the empty JSON string", PublicHolidayModel.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("Description").isJsonNull() && (jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (jsonObj.get("Days") != null && !jsonObj.get("Days").isJsonNull()) {
        JsonArray jsonArraydays = jsonObj.getAsJsonArray("Days");
        if (jsonArraydays != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Days").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Days` to be an array in the JSON string but got `%s`", jsonObj.get("Days").toString()));
          }

          // validate the optional field `Days` (array)
          for (int i = 0; i < jsonArraydays.size(); i++) {
            PublicHolidayDay.validateJsonObject(jsonArraydays.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("Id").isJsonNull() && (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if (!jsonObj.get("CreatedBy").isJsonNull() && (jsonObj.get("CreatedBy") != null && !jsonObj.get("CreatedBy").isJsonNull()) && !jsonObj.get("CreatedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreatedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreatedBy").toString()));
      }
      if (!jsonObj.get("LastModifiedBy").isJsonNull() && (jsonObj.get("LastModifiedBy") != null && !jsonObj.get("LastModifiedBy").isJsonNull()) && !jsonObj.get("LastModifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LastModifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LastModifiedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicHolidayModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicHolidayModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicHolidayModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicHolidayModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicHolidayModel>() {
           @Override
           public void write(JsonWriter out, PublicHolidayModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicHolidayModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PublicHolidayModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublicHolidayModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicHolidayModel
  * @throws IOException if the JSON string is invalid with respect to PublicHolidayModel
  */
  public static PublicHolidayModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicHolidayModel.class);
  }

 /**
  * Convert an instance of PublicHolidayModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

