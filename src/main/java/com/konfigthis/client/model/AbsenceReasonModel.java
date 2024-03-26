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
 * An HR Attendance Absence Reason.
 */
@ApiModel(description = "An HR Attendance Absence Reason.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AbsenceReasonModel {
  public static final String SERIALIZED_NAME_PARENT_ID = "ParentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOLIDAY = "Holiday";
  @SerializedName(SERIALIZED_NAME_HOLIDAY)
  private Boolean holiday;

  public static final String SERIALIZED_NAME_ABSENT = "Absent";
  @SerializedName(SERIALIZED_NAME_ABSENT)
  private Boolean absent;

  public static final String SERIALIZED_NAME_SICK = "Sick";
  @SerializedName(SERIALIZED_NAME_SICK)
  private Boolean sick;

  public static final String SERIALIZED_NAME_STATUTORY_MATERNITY_PAY_APPLICABLE = "StatutoryMaternityPayApplicable";
  @SerializedName(SERIALIZED_NAME_STATUTORY_MATERNITY_PAY_APPLICABLE)
  private Boolean statutoryMaternityPayApplicable;

  public static final String SERIALIZED_NAME_STUDY_EXAM = "StudyExam";
  @SerializedName(SERIALIZED_NAME_STUDY_EXAM)
  private Boolean studyExam;

  public static final String SERIALIZED_NAME_FLEXI_LEAVE = "FlexiLeave";
  @SerializedName(SERIALIZED_NAME_FLEXI_LEAVE)
  private Boolean flexiLeave;

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

  public AbsenceReasonModel() {
  }

  public AbsenceReasonModel parentId(String parentId) {
    
    
    
    
    this.parentId = parentId;
    return this;
  }

   /**
   * The Parent ID of this Absence Reason. &lt;br /&gt;  Cascade Source: [ValidAttendanceTypes].[Key].
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Parent ID of this Absence Reason. <br />  Cascade Source: [ValidAttendanceTypes].[Key].")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    
    
    
    this.parentId = parentId;
  }


  public AbsenceReasonModel name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The Name of this Absence Reason. &lt;br /&gt;  Cascade Source: &lt;br /&gt;  [ValidAttendanceCategory].[Category] when ParentID is null; &lt;br /&gt;  [ValidAttendanceTypes].[Type] when ParentID is not null.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Name of this Absence Reason. <br />  Cascade Source: <br />  [ValidAttendanceCategory].[Category] when ParentID is null; <br />  [ValidAttendanceTypes].[Type] when ParentID is not null.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AbsenceReasonModel holiday(Boolean holiday) {
    
    
    
    
    this.holiday = holiday;
    return this;
  }

   /**
   * This Absence Reason represents a Holiday. &lt;br /&gt;  Cascade Source: [ValidAttendanceCategory].[Holiday]
   * @return holiday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Absence Reason represents a Holiday. <br />  Cascade Source: [ValidAttendanceCategory].[Holiday]")

  public Boolean getHoliday() {
    return holiday;
  }


  public void setHoliday(Boolean holiday) {
    
    
    
    this.holiday = holiday;
  }


  public AbsenceReasonModel absent(Boolean absent) {
    
    
    
    
    this.absent = absent;
    return this;
  }

   /**
   * This Absence Reason represents an Absence. &lt;br /&gt;  Cascade Source: [ValidAttendanceCategory].[Absent]
   * @return absent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Absence Reason represents an Absence. <br />  Cascade Source: [ValidAttendanceCategory].[Absent]")

  public Boolean getAbsent() {
    return absent;
  }


  public void setAbsent(Boolean absent) {
    
    
    
    this.absent = absent;
  }


  public AbsenceReasonModel sick(Boolean sick) {
    
    
    
    
    this.sick = sick;
    return this;
  }

   /**
   * This Absence Reason represents a Sickness. &lt;br /&gt;  Cascade Source: [ValidAttendanceCategory].[Sick]
   * @return sick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Absence Reason represents a Sickness. <br />  Cascade Source: [ValidAttendanceCategory].[Sick]")

  public Boolean getSick() {
    return sick;
  }


  public void setSick(Boolean sick) {
    
    
    
    this.sick = sick;
  }


  public AbsenceReasonModel statutoryMaternityPayApplicable(Boolean statutoryMaternityPayApplicable) {
    
    
    
    
    this.statutoryMaternityPayApplicable = statutoryMaternityPayApplicable;
    return this;
  }

   /**
   * This Absence Reason has Statutory Maternity Pay. &lt;br /&gt;  Cascade Source: [ValidAttendanceCategory].[SMPApplicable]
   * @return statutoryMaternityPayApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Absence Reason has Statutory Maternity Pay. <br />  Cascade Source: [ValidAttendanceCategory].[SMPApplicable]")

  public Boolean getStatutoryMaternityPayApplicable() {
    return statutoryMaternityPayApplicable;
  }


  public void setStatutoryMaternityPayApplicable(Boolean statutoryMaternityPayApplicable) {
    
    
    
    this.statutoryMaternityPayApplicable = statutoryMaternityPayApplicable;
  }


  public AbsenceReasonModel studyExam(Boolean studyExam) {
    
    
    
    
    this.studyExam = studyExam;
    return this;
  }

   /**
   * This Absence Reason represents an absence for Study or Exam. &lt;br /&gt;  Cascade Source: [ValidAttendanceCategory].[Code] &#x3D; 96 or 97
   * @return studyExam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Absence Reason represents an absence for Study or Exam. <br />  Cascade Source: [ValidAttendanceCategory].[Code] = 96 or 97")

  public Boolean getStudyExam() {
    return studyExam;
  }


  public void setStudyExam(Boolean studyExam) {
    
    
    
    this.studyExam = studyExam;
  }


  public AbsenceReasonModel flexiLeave(Boolean flexiLeave) {
    
    
    
    
    this.flexiLeave = flexiLeave;
    return this;
  }

   /**
   * This Absence Reason represents Flexi Leave. &lt;br /&gt;  Cascade Source: [ValidAttendanceCategory].[Code] &#x3D; 11
   * @return flexiLeave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This Absence Reason represents Flexi Leave. <br />  Cascade Source: [ValidAttendanceCategory].[Code] = 11")

  public Boolean getFlexiLeave() {
    return flexiLeave;
  }


  public void setFlexiLeave(Boolean flexiLeave) {
    
    
    
    this.flexiLeave = flexiLeave;
  }


  public AbsenceReasonModel id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Absence Reason. &lt;br /&gt;  This field is generated by Iris HR platform and not related to the Cascade ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Absence Reason. <br />  This field is generated by Iris HR platform and not related to the Cascade ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public AbsenceReasonModel createdOn(OffsetDateTime createdOn) {
    
    
    
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The date time when the Absence Reason was created in the Iris HR platform.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date time when the Absence Reason was created in the Iris HR platform.")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    
    
    
    this.createdOn = createdOn;
  }


  public AbsenceReasonModel createdBy(String createdBy) {
    
    
    
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Not used as the Iris HR platform has no concept of users at the moment.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used as the Iris HR platform has no concept of users at the moment.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    
    
    
    this.createdBy = createdBy;
  }


  public AbsenceReasonModel lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    
    
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

   /**
   * The date time when the Absence Reason was created or last updated.
   * @return lastModifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date time when the Absence Reason was created or last updated.")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }


  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    
    
    this.lastModifiedOn = lastModifiedOn;
  }


  public AbsenceReasonModel lastModifiedBy(String lastModifiedBy) {
    
    
    
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Not used as the Iris HR platform has no concept of users at the moment.
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used as the Iris HR platform has no concept of users at the moment.")

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
   * @return the AbsenceReasonModel instance itself
   */
  public AbsenceReasonModel putAdditionalProperty(String key, Object value) {
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
    AbsenceReasonModel absenceReasonModel = (AbsenceReasonModel) o;
    return Objects.equals(this.parentId, absenceReasonModel.parentId) &&
        Objects.equals(this.name, absenceReasonModel.name) &&
        Objects.equals(this.holiday, absenceReasonModel.holiday) &&
        Objects.equals(this.absent, absenceReasonModel.absent) &&
        Objects.equals(this.sick, absenceReasonModel.sick) &&
        Objects.equals(this.statutoryMaternityPayApplicable, absenceReasonModel.statutoryMaternityPayApplicable) &&
        Objects.equals(this.studyExam, absenceReasonModel.studyExam) &&
        Objects.equals(this.flexiLeave, absenceReasonModel.flexiLeave) &&
        Objects.equals(this.id, absenceReasonModel.id) &&
        Objects.equals(this.createdOn, absenceReasonModel.createdOn) &&
        Objects.equals(this.createdBy, absenceReasonModel.createdBy) &&
        Objects.equals(this.lastModifiedOn, absenceReasonModel.lastModifiedOn) &&
        Objects.equals(this.lastModifiedBy, absenceReasonModel.lastModifiedBy)&&
        Objects.equals(this.additionalProperties, absenceReasonModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, name, holiday, absent, sick, statutoryMaternityPayApplicable, studyExam, flexiLeave, id, createdOn, createdBy, lastModifiedOn, lastModifiedBy, additionalProperties);
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
    sb.append("class AbsenceReasonModel {\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("    absent: ").append(toIndentedString(absent)).append("\n");
    sb.append("    sick: ").append(toIndentedString(sick)).append("\n");
    sb.append("    statutoryMaternityPayApplicable: ").append(toIndentedString(statutoryMaternityPayApplicable)).append("\n");
    sb.append("    studyExam: ").append(toIndentedString(studyExam)).append("\n");
    sb.append("    flexiLeave: ").append(toIndentedString(flexiLeave)).append("\n");
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
    openapiFields.add("ParentId");
    openapiFields.add("Name");
    openapiFields.add("Holiday");
    openapiFields.add("Absent");
    openapiFields.add("Sick");
    openapiFields.add("StatutoryMaternityPayApplicable");
    openapiFields.add("StudyExam");
    openapiFields.add("FlexiLeave");
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
  * @throws IOException if the JSON Object is invalid with respect to AbsenceReasonModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbsenceReasonModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbsenceReasonModel is not found in the empty JSON string", AbsenceReasonModel.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("ParentId").isJsonNull() && (jsonObj.get("ParentId") != null && !jsonObj.get("ParentId").isJsonNull()) && !jsonObj.get("ParentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ParentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ParentId").toString()));
      }
      if (!jsonObj.get("Name").isJsonNull() && (jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
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
       if (!AbsenceReasonModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbsenceReasonModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbsenceReasonModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbsenceReasonModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AbsenceReasonModel>() {
           @Override
           public void write(JsonWriter out, AbsenceReasonModel value) throws IOException {
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
           public AbsenceReasonModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AbsenceReasonModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AbsenceReasonModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbsenceReasonModel
  * @throws IOException if the JSON string is invalid with respect to AbsenceReasonModel
  */
  public static AbsenceReasonModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbsenceReasonModel.class);
  }

 /**
  * Convert an instance of AbsenceReasonModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

