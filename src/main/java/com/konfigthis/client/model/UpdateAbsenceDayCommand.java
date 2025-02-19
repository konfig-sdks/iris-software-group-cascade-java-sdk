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
import com.konfigthis.client.model.DayPart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * UpdateAbsenceDayCommand
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateAbsenceDayCommand {
  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_DURATION_DAYS = "DurationDays";
  @SerializedName(SERIALIZED_NAME_DURATION_DAYS)
  private Double durationDays;

  public static final String SERIALIZED_NAME_DURATION_MINUTES = "DurationMinutes";
  @SerializedName(SERIALIZED_NAME_DURATION_MINUTES)
  private Integer durationMinutes;

  public static final String SERIALIZED_NAME_DAY_PART = "DayPart";
  @SerializedName(SERIALIZED_NAME_DAY_PART)
  private DayPart dayPart;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public UpdateAbsenceDayCommand() {
  }

  public UpdateAbsenceDayCommand date(OffsetDateTime date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * The date of the Absence Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceDates].[StartDate]
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[StartDate]")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    
    
    
    this.date = date;
  }


  public UpdateAbsenceDayCommand durationDays(Double durationDays) {
    
    
    
    
    this.durationDays = durationDays;
    return this;
  }

   /**
   * The duration in days for this Absence Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceDates].[DurationDays]
   * @return durationDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration in days for this Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[DurationDays]")

  public Double getDurationDays() {
    return durationDays;
  }


  public void setDurationDays(Double durationDays) {
    
    
    
    this.durationDays = durationDays;
  }


  public UpdateAbsenceDayCommand durationMinutes(Integer durationMinutes) {
    
    
    
    
    this.durationMinutes = durationMinutes;
    return this;
  }

   /**
   * The duration in minutes for this Absence Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceDates].[Duration]
   * @return durationMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration in minutes for this Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[Duration]")

  public Integer getDurationMinutes() {
    return durationMinutes;
  }


  public void setDurationMinutes(Integer durationMinutes) {
    
    
    
    this.durationMinutes = durationMinutes;
  }


  public UpdateAbsenceDayCommand dayPart(DayPart dayPart) {
    
    
    
    
    this.dayPart = dayPart;
    return this;
  }

   /**
   * Get dayPart
   * @return dayPart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DayPart getDayPart() {
    return dayPart;
  }


  public void setDayPart(DayPart dayPart) {
    
    
    
    this.dayPart = dayPart;
  }


  public UpdateAbsenceDayCommand id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Absence Day. &lt;br /&gt;  Must exist in the Attendance Absence Day Service.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Absence Day. <br />  Must exist in the Attendance Absence Day Service.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
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
   * @return the UpdateAbsenceDayCommand instance itself
   */
  public UpdateAbsenceDayCommand putAdditionalProperty(String key, Object value) {
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
    UpdateAbsenceDayCommand updateAbsenceDayCommand = (UpdateAbsenceDayCommand) o;
    return Objects.equals(this.date, updateAbsenceDayCommand.date) &&
        Objects.equals(this.durationDays, updateAbsenceDayCommand.durationDays) &&
        Objects.equals(this.durationMinutes, updateAbsenceDayCommand.durationMinutes) &&
        Objects.equals(this.dayPart, updateAbsenceDayCommand.dayPart) &&
        Objects.equals(this.id, updateAbsenceDayCommand.id)&&
        Objects.equals(this.additionalProperties, updateAbsenceDayCommand.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, durationDays, durationMinutes, dayPart, id, additionalProperties);
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
    sb.append("class UpdateAbsenceDayCommand {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    durationDays: ").append(toIndentedString(durationDays)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    dayPart: ").append(toIndentedString(dayPart)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("Date");
    openapiFields.add("DurationDays");
    openapiFields.add("DurationMinutes");
    openapiFields.add("DayPart");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateAbsenceDayCommand
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateAbsenceDayCommand.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateAbsenceDayCommand is not found in the empty JSON string", UpdateAbsenceDayCommand.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("Id").isJsonNull() && (jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateAbsenceDayCommand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateAbsenceDayCommand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateAbsenceDayCommand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateAbsenceDayCommand.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateAbsenceDayCommand>() {
           @Override
           public void write(JsonWriter out, UpdateAbsenceDayCommand value) throws IOException {
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
           public UpdateAbsenceDayCommand read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateAbsenceDayCommand instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateAbsenceDayCommand given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateAbsenceDayCommand
  * @throws IOException if the JSON string is invalid with respect to UpdateAbsenceDayCommand
  */
  public static UpdateAbsenceDayCommand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateAbsenceDayCommand.class);
  }

 /**
  * Convert an instance of UpdateAbsenceDayCommand to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

